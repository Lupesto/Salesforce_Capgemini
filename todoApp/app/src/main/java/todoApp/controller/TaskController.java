/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todoApp.controller;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import todoApp.model.tasks;
import todoApp.util.ConnectionFactory;
/**
 *
 * @author lucas
 * AULA 11
 * escreveremos dentro dos m�todos o comando SQL para cada tarefa
 */
public class TaskController {
    
    public void  save (tasks task){ //Assinatura de um m�todo 
        //AULA 11C
        String sql = "INSERT INTO task (idProject,"
                + "name,"
                + "completed,"
                + "notes,"
                + "deadline,"
                + "createdAt,"
                + "updateAt) VALUES (?,?,?,?,?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement =  null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, task.getIdProject()); // substitui��o de cada interroga��o
            statement.setString(2,task.getName());
            statement.setString(3,task.getDescription());
            //statement.setBoolean(4, task.isIsCompleted()); // N�o informado antes sobre a exist�ncia deste m�todo
            statement.setString(5, task.getNotes());
            
            //11.d
            statement.setDate(6, new Date(task.getDeadline().getTime())); //Data do tipo sql, convertendo o date do util
            statement.setDate(7, new Date(task.getCreateAt().getTime()));
            statement.setDate(8, new Date(task.getUpgradeAt().getTime()));
            statement.execute(); 
            
            
            
            ConnectionFactory.closeConnection(connection);
            
            
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar tarefa " 
            + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
            //* Fechando statement
            /*if(statement != null){ //sempre fechar o statement aula 11.e
            /*    statement.close();
            /*}
            */
        }
        
        
        
    }
    //aula 11.f
    public void update(tasks task){
            String sql = "UPDATE task SET "
                + "idProject = ?,"
                + "name = ?,"
                + "description = ?,"
                + "notes = ?,"
                + "completed = ?,"
                + "deadline = ?,"
                + "createdAt = ?,"
                + "updateAt = ?,"
                    + "WHERE id = ?";
        
            Connection connection = null;
            PreparedStatement statement = null;
            
            
            try {
                connection = ConnectionFactory.getConnection();
                statement = connection.prepareStatement(sql);
                
                statement.setInt(1, task.getIdProject());
                statement.setString(2, task.getName());
                statement.setString(3, task.getDescription());
                statement.setString(4, task.getNotes());
                //statement.setBoolean(5, task.isIsCompleted());
                statement.setDate (6, new Date(task.getDeadline().getTime()));
                statement.setDate (7, new Date(task.getCreateAt().getTime()));
                statement.setDate (8, new Date(task.getUpgradeAt().getTime()));
                statement.setInt(9, task.getId()); //Aula 11.i
                statement.execute();
                
                
                
            } catch (Exception ex) {
                throw new RuntimeException("Erro ao atualizar tarefa");
            } finally {
                ConnectionFactory.closeConnection(connection, statement);
            }
        
    }
    
    public void removeById(int tasksId) throws SQLException{
        //AULA 11.b
        //receber� o Id da tarefa que queremos deletar.
        // ponto de interroga��o ser� substituido por tasksId
        String sql = "DELETE FROM tasks WHERE ID = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection(); //pedindo conex�o com banco de dados
            statement = conn.prepareStatement(sql); // objeto para preparar o comando SQL inputado no banco
            statement.setInt(1, tasksId); //Substituindo a interroga��o pelo tasksId
            statement.execute(); //executa o comando no SQL 
            
            
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar tarefa"); //aula 11.e. Tratamento de qualquer exce��o que ocorra
        } finally { //bloco sempre executado independete de try e catch
            ConnectionFactory.closeConnection(conn, statement); //fechamento conex�o e statement
        }
        
    }
    
    //aula 11.g.
    public List<tasks> getAll(int idProject){
        //Criar uma classe para guardar as respostas do banco de dados
        String sql = "SELECT * FROM tasks WHERE idproject = ?"; //Query SQL
        
        Connection connection = null;
        PreparedStatement statment = null;
        ResultSet resultset = null; //Vari�vel para guardar a resposta do banco de dados
        
        //Lista de tarefas 
        List<tasks> task = new ArrayList<tasks>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statment = connection.prepareStatement(sql);
            statment.setInt(1, idProject); //id do projeto que queremos buscar inputado na query
            resultset = statment.executeQuery();
            
            while(resultset.next()){ //enquanto houver tarefa no resultset, fazer:
                tasks taskA = new tasks();
                taskA.setId(resultset.getInt("id"));
                taskA.setIdProject(resultset.getInt("idProject"));
                taskA.setName(resultset.getString("name"));
                taskA.setDescription(resultset.getString("description"));
                taskA.setNotes(resultset.getString("notes"));
                taskA.isIsCompleted(resultset.getBoolean("completed")); //N�o mostrou o  m�todo em aula
                taskA.setDeadline(resultset.getDate("deadline"));
                taskA.setCreateAt(resultset.getDate("createAt"));
                taskA.setUpgradeAt(resultset.getDate("updatedAt"));
                //Aula 11.h
                task.add(taskA); //Colocando tarefa na lista de tarefas
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao inserir tarefa"+ ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statment, resultset); 
            //Erro, sendo que eu j� possuo o m�todo de fechamento
        }
        
        // busca todas tarefas de um determinado projeto
        return null;
    }
    
}

