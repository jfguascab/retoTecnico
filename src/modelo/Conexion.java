
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    //creamos atributos para conectar que son la url a la base de datos, el usuario root y la contraseña
    public static final String URL = "jdbc:mysql://localhost:3360/naves?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "1234";
    
    //utilizamos metodo Connection y establecemos la conexion
    public Connection getConnection(){
        Connection conexion=null; //iniciamos en nul el nuevo objeto conexion
        
        try{ //para las excepciones
            Class.forName("com.mysql.jdbc.Driver");//para la libreria
            conexion = (Connection) DriverManager.getConnection(URL,usuario,contraseña);// pasamos la url,usuario y contraseña para realizar la 
            
        }catch(Exception ex){//capturamos exepcion
            System.err.println("Error, "+ex);
        }
        
        return conexion;
    }
}
