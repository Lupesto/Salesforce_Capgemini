/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todoApp.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author lucas
 * AULA 10.D
 */
public class ConnectionFactory {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";//precisa de driver de conex�o. Diz ao programa qual banco de dados
    public static final String URL = "jdbc:mysql://localhost/3306/todoapp";//Caminho de conex�o at� o banco de dados. Porta aparece l� no xamp.
    public static final String USER = "root" ;//mySQL, por padr�o usu�rio root e sem senha
    public static final String PASS = "";
    
    public static Connection getConnection() {
    	try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,PASS); //exige 3 parametros para conex�o
	} catch(Exception ex){
            throw new RuntimeException("Erro conex�o banco de dados", ex);
	}
    }
    
    public static void closeConnection(Connection connection){
	try{
            if(connection != null) //identificar se conex�o existe.
            connection.close();
        }
	catch (Exception ex){
		throw new RuntimeException("Erro ao fechar conex�o com banco de dados");
	}

        
    }


    //aula 11.e fechando o statement
    public static void closeConnection(Connection connection, PreparedStatement statement){
	try{
            if(connection != null) //identificar se conex�o existe.
                connection.close();
            if(statement != null)
                statement.close();
        }
        
        
	catch (Exception ex){
		throw new RuntimeException("Erro ao fechar conex�o com banco de dados");
	}

        
    }
    

    
    public static void closeConnection(Connection connection, 
            PreparedStatement statement, ResultSet resultset){
	try{
            if(connection != null) //identificar se conex�o existe.
                connection.close();
            if(statement != null)
                statement.close();
            
            if(resultset != null)
                resultset.close();
        }
        
        
	catch (Exception ex){
		throw new RuntimeException("Erro ao fechar conex�o com banco de dados");
	}

        
    }
    
    
    
}
