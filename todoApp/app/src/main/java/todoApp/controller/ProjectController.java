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
    
    public void removeById(int projectId) throws SQLException{
        String sql = "DELETE FROM projects WHERE ID = ?";
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = ConnectionFactory.getConnection();
            statement = conn.prepareStatement(sql); 
            statement.setInt(1, projectId); 
            statement.execute(); 
            
            
            
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao deletar tarefa"); //aula 11.e. Tratamento de qualquer exceção que ocorra
        } finally { //bloco sempre executado independete de try e catch
            ConnectionFactory.closeConnection(conn, statement); //fechamento conexão e statement
        }
        
    }
    
   
    public List<Project> getAll(){
        
        String sql = "SELECT * FROM Project"; 
        
        List<Project> projects = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statment = null;
        ResultSet resultset = null;
        
        
        try {
            connection = ConnectionFactory.getConnection();
            statment = connection.prepareStatement(sql);
            resultset = statment.executeQuery();
            
            while(resultset.next()){
                Project project = new Project(); //Já possui construtor mas continua com erro
                
                
                
                
                
                project.setId(resultset.getInt("id"));
               
                project.setName(resultset.getString("name"));
                project.setDescription(resultset.getString("description"));
                project.setCreatedAt(resultset.getDate("createAt"));
                project.setUpdatedAt(resultset.getDate("updatedAt"));
                
                projects.add(project); 
            }
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao inserir tarefa"+ ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statment, resultset); 
           
        }
        
        // busca todas tarefas de um determinado projeto
        return null;
    }
}
