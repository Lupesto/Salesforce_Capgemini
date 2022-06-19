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
import todoApp.model.Project;
import todoApp.util.ConnectionFactory;

/**
 *
 * @author lucas
 * AULA 11.j
 */
public class ProjectController {
    
    
    
public void  save (Project project){ 
      
        String sql = "INSERT INTO projects (name,"
                + "description,"
                + "createdAt,"
                + "updateAt) VALUES (?,?,?,?)";
        
        Connection connection = null;
        PreparedStatement statement =  null;
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, project.getName()); 
            statement.setString(2,project.getDescription());
            statement.setDate(3, new Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new Date(project.getUpdatedAt().getTime())); 
            
            statement.execute(); 
            
            
            
         
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar projeto " 
            + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);

        }
        
        
        
    }
    //aula 11.f
    public void update(Project project){
            String sql = "UPDATE projects SET "
    
                + "name = ?,"
                + "description = ?,"
                + "createdAt = ?,"
                + "updateAt = ?,"
                + "WHERE id = ?";
        
            Connection connection = null;
            PreparedStatement statement = null;
            
            
            try {
                connection = ConnectionFactory.getConnection();
                statement = connection.prepareStatement(sql);
                
                statement.setString(1, project.getName());
                statement.setString(2, project.getDescription());
                statement.setDate (3, new Date(project.getCreatedAt().getTime()));
                statement.setDate (4, new Date(project.getUpdatedAt().getTime()));
                statement.setInt(5, project.getId());
                statement.execute();
                
                
                
            } catch (Exception ex) {
                throw new RuntimeException("Erro ao atualizar projeto ");
            } finally {
                ConnectionFactory.closeConnection(connection, statement);
            }
        
    }
    
    public void removeById(int tasksId) throws SQLException{
        //AULA 11.b
        //receberá o Id da tarefa que queremos deletar.
        // ponto de interrogação será substituido por tasksId
        String sql = "DELETE FROM tasks WHERE ID = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection(); //pedindo conexão com banco de dados
            statement = conn.prepareStatement(sql); // objeto para preparar o comando SQL inputado no banco
            statement.setInt(1, tasksId); //Substituindo a interrogação pelo tasksId
            statement.execute(); //executa o comando no SQL 
            
            
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar tarefa"); //aula 11.e. Tratamento de qualquer exceção que ocorra
        } finally { //bloco sempre executado independete de try e catch
            ConnectionFactory.closeConnection(conn, statement); //fechamento conexão e statement
        }
        
    }
    
    //aula 11.g.
    public List<tasks> getAll(int idProject){
        //Criar uma classe para guardar as respostas do banco de dados
        String sql = "SELECT * FROM tasks WHERE idproject = ?"; //Query SQL
        
        Connection connection = null;
        PreparedStatement statment = null;
        ResultSet resultset = null; //Variável para guardar a resposta do banco de dados
        
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
                taskA.isIsCompleted(resultset.getBoolean("completed")); //Não mostrou o  método em aula
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
            //Erro, sendo que eu já possuo o método de fechamento
        }
        
        // busca todas tarefas de um determinado projeto
        return null;
    }
}
