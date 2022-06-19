/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todoApp.controller;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import todoApp.model.tasks;
import todoApp.util.ConnectionFactory;
/**
 *
 * @author lucas
 * AULA 11
 * escreveremos dentro dos métodos o comando SQL para cada tarefa
 */
public class TaskController {
    
    public void  save (tasks task){ //Assinatura de um método 
        //AULA 11C
        String sql = "INSERT INTO tasks (idProject,"
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
            statement.setInt(1, task.getIdProject()); // substituição de cada interrogação
            statement.setString(2,task.getName());
            statement.setString(3,task.getDescription());
            statement.setBoolean(4, task.isIsCompleted()); // Não informado antes sobre a existência deste método
            statement.setString(5, task.getNotes());
            
            //11.d
            statement.setDate(6, new Date(task.getDeadline().getTime())); //Data do tipo sql, convertendo o date do util
            statement.setDate(7, new Date(task.getCreateAt().getTime()));
            statement.setDate(8, new Date(task.getUpgradeAt().getTime()));
            statement.execute(); 
            
            
            
            ConnectionFactory.closeConnection(connection);
            
            
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao salvar tarefa" 
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
    
    public void update(tasks task){
        
    }
    
    public void removeById(int tasksId) throws SQLException{
        //AULA 11.b
        //receberá o Id da tarefa que queremos deletar.
        // ponto de interrogação será substituido por tasksId
        String sql = "DELETE FROM tasks WHERE ID = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection(); //pedindo conexão
            statement = conn.prepareStatement(sql); // objeto para preparar o comando SQL inputado no banco
            statement.setInt(1, tasksId); //Substituindo a interrogação pelo tasksId
            statement.execute(); //executa o comando no SQL 
            
            
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar tarefa"); //aula 11.e. Tratamento de qualquer exceção que ocorra
        } finally { //bloco sempre executado independete de try e catch
            ConnectionFactory.closeConnection(conn, statement); //fechamento conexão e statement
        }
        
    }
    
    public List<tasks> getAll(int idProject){
        // busca todas tarefas de um determinado projeto
        return null;
    }
    
}

