/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todoApp.util;

/**
 *
 * @author lucas
 */
public class ConnectionFactory {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";//precisa de driver de conexão. Diz ao programa qual banco de dados

    public static final String URL = "jdbc:mysql://localhost/3306/todoapp";//Caminho de conexão até o banco de dados. Porta aparece lá no xamp.
    public static final String USER = "root" ;//mySQL, por padrão usuário root e sem senha
    public static final String PASS = "";
}
