
package modelo;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

//hereda de la clase conexion
public class ConsultasNave extends Conexion{
    PreparedStatement ps = null;//variable para hacer las diferentes consultas
    ResultSet rs = null;//para obtener datos de la base de datos
    
    //metodo para agregar registros a base de datos, le pasamos nave
    public boolean insertar(Nave nave){
        Connection conexion = getConnection();// la utilizamos o llamamos para establecer la conexion con la base de datos
        
        try{//para evitar excepciones
            //con prepareStatement escribimos codigo mysql para insertar los datos tipo nave
            ps = conexion.prepareStatement("insert into nave (clave,nombre,pesoTonelada,combustible,velocidadKmHora,potenciaHp,PropulsionTonelada,cantidadPersona,orbitaKm,transportaTonelada,idTipo,idAgencia) values (?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, nave.getClave());//1 para el primer campo de values?
            ps.setString(2, nave.getNombre());
            ps.setDouble(3, nave.getPesoTonelada());
            ps.setString(4, nave.getCombustible());
            ps.setDouble(5, nave.getVelocidadKmHora());
            ps.setDouble(6, nave.getPotenciaHp());
            ps.setDouble(7, nave.getPropulsionTonelada());
            ps.setInt(8, nave.getCantidadPersona());
            ps.setDouble(9, nave.getOrbitaKm());
            ps.setDouble(10, nave.getTransportaTonelada());
            ps.setInt(11, nave.getIdTipo());
            ps.setInt(12, nave.getIdAgencia());

            int resultado = ps.executeUpdate();//para ejecutar la insercion en la base de datos esta retorna a entero
            
            if(resultado>0){ //Ejecucion correcta
                return true; 
            }
            else{ //si no no retorna nada 
                return false;
            }
            
        }catch(Exception ex){//captura las excepciones generales
            System.err.println("Error, "+ex);
            return false;
        }finally{ //para que siempre se ejecute
            try{
                conexion.close(); //cerramos la conexion a la bd
            }catch(Exception ex){ //si ocurre una excepcion la captura
                System.err.println("Error, "+ex);
            }
        }
    }
    
    //Metodo para buscar un registro
    public boolean buscar(Nave nave){//le pasamos nave
        Connection conexion = getConnection();//establecemos la conexion
        
        try{//prepareStatement para utilizar mysql para buscar por la clave
            ps = conexion.prepareStatement("select n.idNave,n.clave,n.nombre,n.pesoTonelada,n.combustible,n.velocidadKmHora,n.PotenciaHp,n.PropulsionTonelada,n.cantidadPersona,n.orbitaKm,n.transportaTonelada,n.cantidadPersona, t.tipo, f.funcion, a.agencia from nave as n inner join tipo as t on n.idTipo=t.idTipo inner join funcion as f on t.idFuncion=f.idFuncion inner join agencia as a on n.idAgencia=a.idAgencia where clave=?");
            ps.setString(1, nave.getClave());//seleccionamos la nave por su clave
            
            rs = ps.executeQuery();//ejecutamos query y guardamos en rs
            
            if(rs.next()){// si encuentra el registro
                //obtenemos los datos de nave r
                nave.setIdNave(rs.getInt("idNave"));
                nave.setClave(rs.getString("clave"));
                nave.setNombre(rs.getString("nombre"));
                nave.setPesoTonelada(rs.getDouble("pesoTonelada"));
                nave.setCombustible(rs.getString("combustible"));
                nave.setVelocidadKmHora(rs.getDouble("velocidadKmHora"));
                nave.setPotenciaHp(rs.getDouble("PotenciaHp"));//
                nave.setPropulsionTonelada(rs.getDouble("PropulsionTonelada"));
                nave.setCantidadPersona(rs.getInt("cantidadPersona"));
                nave.setOrbitaKm(rs.getDouble("orbitaKm"));//
                nave.setTransportaTonelada(rs.getDouble("transportaTonelada"));
                nave.setTipo(rs.getString("tipo"));
                nave.setAgencia(rs.getString("agencia"));
                nave.setFuncion(rs.getString("funcion"));
                
               // nave.setIdTipo(rs.getInt("idTipo"));// falta llamar a el tipo desde clase tipo
              //  nave.setIdAgencia(rs.getInt("idAgencia"));
                return true;//retornamos verdadero
            }
            else{//si no false
                return false;
            }
            
        }catch(Exception ex){//captura loas posibles excepciones
            System.err.println("Error, "+ex);
            return false;
        }finally{//para que se ejecute si o si
            try{
                conexion.close();//se cierra la conexion a la base de datos
            }catch(Exception ex){//captura excepciones
                System.err.println("Error, "+ex);
            }
        }
    }
    
    //Metodo para modificar 
    public boolean modificar(Nave nave){
        Connection conexion = getConnection();//establecemos coneccion creando objeto conexion
        
        try{
            //.prepareStatement para llamar a la base de datos y utilizar query de modificar
            ps = conexion.prepareStatement("update nave set clave=?,nombre=?,pesoTonelada=?,combustible=?,velocidadKmHora=?,potenciaHp=?,propulsionTonelada=?,cantidadPersona=?,orbitaKm=?,transportaTonelada=?,idTipo=?,idAgencia=? where idNave=?");
            ps.setString(1, nave.getClave());// //obtenemos la clave y guardamos en primer valor
            ps.setString(2, nave.getNombre());
            ps.setDouble(3, nave.getPesoTonelada());
            ps.setString(4, nave.getCombustible());
            ps.setDouble(5, nave.getVelocidadKmHora());
            ps.setDouble(6, nave.getPotenciaHp());
            ps.setDouble(7, nave.getPropulsionTonelada());
            ps.setInt(8, nave.getCantidadPersona());
            ps.setDouble(9, nave.getOrbitaKm());
            ps.setDouble(10, nave.getTransportaTonelada());
            ps.setInt(11, nave.getIdTipo());
            ps.setInt(12, nave.getIdAgencia());
            ps.setInt(13, nave.getIdNave());
            
            int resultado = ps.executeUpdate(); //creamos var intera resultado y la igualamos con la ejecucion de la modificacion de registro
            
            if(resultado>0){ //Ejecucion correcta de la modificacion
                return true; 
            }
            else{
                return false;
            }
            
        }catch(Exception ex){//captura excepciones
            System.err.println("Error, "+ex);
            return false;
        }finally{//se ejecuta
            try{
                conexion.close();//cerrar conexion
            }catch(Exception ex){//captura excepciones
                System.err.println("Error, "+ex);
            }
        }
    }
    
    //Metodo para eliminar, le pasamos la nave a eliminar
    public boolean eliminar(Nave nave){
        Connection conexion = getConnection();//establecemos conexion bd
        
        try{
            //prepareStatement para eliminar a la nave con id
            ps = conexion.prepareStatement("delete from nave where idNave=?");
            ps.setInt(1, nave.getIdNave());//le pasamos el id de la nave
            
            int resultado = ps.executeUpdate();//ejecutamos eliminar y guardamos en resultado
            
            if(resultado>0){ //Ejecucion correcta
                return true; 
            }
            else{
                return false;
            }
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
            return false;
        }finally{
            try{
                conexion.close();//cerramos conexion
            }catch(Exception ex){//captura excepcion
                System.err.println("Error, "+ex);
            }
        }
    }
}
