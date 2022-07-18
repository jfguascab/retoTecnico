
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//para relacinarse con la vista
import javax.swing.JOptionPane;
import modelo.ConsultasNave;
import modelo.Nave;
import vista.VistaNave;


//para relacionar directamente con la vista implementamos ActionListener
public class ControladorNave implements ActionListener{
    //creamos atributos objetos de VistaNave,Nave y ConsultaPersona los importamos
    private VistaNave vista;
    private Nave nave;
    private ConsultasNave modelo; 

    //Creamos constructor
    public ControladorNave(VistaNave vista, Nave persona, ConsultasNave modelo) {
        this.vista = vista;
        this.nave = persona;
        this.modelo = modelo;
        //llamamos a vista el objeto y utilizamos el addActionListener para relacionar
        vista.botonInsertar.addActionListener(this);//para que funcione el boton insertar
        vista.botonBuscar.addActionListener(this);//para el boton buscar
        vista.botonModificar.addActionListener(this);//para el boton modificar
        vista.botonEliminar.addActionListener(this);//para el boton eliminar
        vista.botonLimpiar.addActionListener(this);//para el boton limpiar
    }
    
    //creamos metodo iniciar
    public void iniciar(){
        vista.setTitle("Administrador DE Naves Espaciales");//Colocamos titulo a la vista
        vista.setLocationRelativeTo(null);//centrar
        vista.cajaID.setVisible(false);// que la caja del id no se muestre
    }

    @Override//se sobreescribe metodo implementamos los abstractos y actionPerformed(ActionEvent ae) para insertar eventos a los botones
    public void actionPerformed(ActionEvent ae) {
        
        //para usar boton insertar registros
        if(ae.getSource() == vista.botonInsertar){//si precionamos el boton insertar ae.getSource()
            nave.setClave(vista.cajaClave.getText());//obtenemos de la caja clave y guadamos
            nave.setNombre(vista.cajaNombre.getText());
            nave.setPesoTonelada(Double.valueOf(vista.cajaPeso.getText()));
            nave.setCombustible(vista.cajaCombustible.getText());
            nave.setVelocidadKmHora(Double.valueOf(vista.cajaVelocidad.getText()));
            nave.setPotenciaHp(Double.valueOf((vista.cajaPotencia.getText())));
            nave.setPropulsionTonelada(Double.valueOf((vista.cajaPropulsion.getText())));
            nave.setCantidadPersona(Integer.parseInt(vista.cajaCantidad.getText()));
            nave.setOrbitaKm(Double.valueOf((vista.cajaOrbita.getText())));
            nave.setTransportaTonelada(Double.valueOf((vista.cajaTransporta.getText())));

            nave.setIdTipo(Integer.parseInt(vista.cajaIdTipo.getText()));
            nave.setIdAgencia(Integer.parseInt(vista.cajaIdAgencia.getText()));
            
          
            
            if(modelo.insertar(nave)){//llamamos al modelo para usar metodo para insertarle los datos de la nave
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                limpiarCajas();
            }
            else{//s no sale que no se pudo insertar
                JOptionPane.showMessageDialog(null, "No se pudo insertar el registro");
                limpiarCajas();//utilizamos metodo limpiar cajas
            }
        }
        
      //para usar boton buscar registros
        if(ae.getSource() == vista.botonBuscar){//si presionamos el boton buscar
            nave.setClave(vista.cajaBuscar.getText());
            
            if(modelo.buscar(nave)){//si el usuario presiona boton buscar llamamos a vista y pasamos los datos de la nave encontrada en la cajas de vista
                vista.cajaID.setText(String.valueOf(nave.getIdNave()));//Convertimos a string un entero
                vista.cajaClave.setText(nave.getClave());
                vista.cajaNombre.setText(nave.getNombre());
                vista.cajaPeso.setText(String.valueOf(nave.getPesoTonelada()));
                vista.cajaCombustible.setText(nave.getCombustible());
                vista.cajaVelocidad.setText(String.valueOf(nave.getVelocidadKmHora()));
                vista.cajaPotencia.setText(String.valueOf(nave.getPotenciaHp()));//convertimos a strin el date
                vista.cajaPropulsion.setText(String.valueOf(nave.getPropulsionTonelada()));
                vista.cajaCantidad.setText(String.valueOf(nave.getCantidadPersona()));
                vista.cajaOrbita.setText(String.valueOf(nave.getOrbitaKm()));
                vista.cajaTransporta.setText(String.valueOf(nave.getTransportaTonelada()));
                vista.cajaTipo.setText(nave.getTipo());
                vista.cajaAgencia.setText(nave.getAgencia());
                vista.cajaFuncion.setText(nave.getFuncion());
                
                vista.cajaIdTipo.setText(String.valueOf(nave.getIdTipo()));
                vista.cajaIdAgencia.setText(String.valueOf(nave.getIdAgencia()));
                
                
            }
            else{//si no no existe
                JOptionPane.showMessageDialog(null, "No existe una persona con esa clave");
                limpiarCajas();
            }
        }
        
        //Para usar boton modificar un registro
          if(ae.getSource() == vista.botonModificar){//si presionamos el boton modificar
            nave.setIdNave(Integer.parseInt(vista.cajaID.getText()));
            nave.setClave(vista.cajaClave.getText());//obtenemos el texto de la caja modificado para enviarlo a la base de datos
            nave.setNombre(vista.cajaNombre.getText());
            nave.setPesoTonelada(Double.valueOf(vista.cajaPeso.getText()));
            nave.setCombustible(vista.cajaCombustible.getText());
            nave.setVelocidadKmHora(Double.valueOf(vista.cajaVelocidad.getText()));
            nave.setPotenciaHp(Double.valueOf((vista.cajaPotencia.getText())));
            nave.setPropulsionTonelada(Double.valueOf((vista.cajaPropulsion.getText())));
            nave.setCantidadPersona(Integer.parseInt(vista.cajaCantidad.getText()));
            nave.setOrbitaKm(Double.valueOf((vista.cajaOrbita.getText())));
            nave.setTransportaTonelada(Double.valueOf((vista.cajaTransporta.getText())));
            
            nave.setIdTipo(Integer.parseInt(vista.cajaIdTipo.getText()));
            nave.setIdAgencia(Integer.parseInt(vista.cajaIdAgencia.getText()));
            
          
            
            if(modelo.modificar(nave)){//llamamos a modificar del modelo le pasamos datos a modificar de nave
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                limpiarCajas();//limpiamos la cajas de texto
            }
            else{//si no no lo puede modificar
                JOptionPane.showMessageDialog(null, "No se pudo modificar el registro");
                limpiarCajas();//limpia cajas
            }
        }
        
        //Para usar boton eliminar un registro
        if(ae.getSource() == vista.botonEliminar){//si presiona boton eliminar
            nave.setIdNave(Integer.parseInt(vista.cajaID.getText()));//obtenemos el id de la nave a eliminar
            
            if(modelo.eliminar(nave)){//llamamos metodo eliminar de modelo y pasamos a la nave por id
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                limpiarCajas();//limpia textfield
            }
            else{
                JOptionPane.showMessageDialog(null, "No se pudo eliminar el registro");
                limpiarCajas();
            }   
        }
        
        //Para usar boto limpiar
        if(ae.getSource() == vista.botonLimpiar){ //si el usuario pulsa el boton limpiar se ejecuta
            limpiarCajas();//se ejecuta el metodo limpiar cajas
        }
    }
    
    //metodo para limpiar las cajas para volver a escribir registros
    public void limpiarCajas(){
        vista.cajaBuscar.setText(null);
        vista.cajaClave.setText(null);
        vista.cajaNombre.setText(null);
        vista.cajaPeso.setText(null);
        vista.cajaCombustible.setText(null);
        vista.cajaVelocidad.setText(null);
        vista.cajaPotencia.setText(null);
        vista.cajaTipo.setText(null);
        vista.cajaCantidad.setText(null);
        vista.cajaOrbita.setText(null);
        vista.cajaTransporta.setText(null);
        vista.cajaIdTipo.setText(null);
        vista.cajaIdAgencia.setText(null);
        vista.cajaAgencia.setText(null);
        vista.cajaPropulsion.setText(null);
        vista.cajaFuncion.setText(null);
        //vista.comboGenero.setSelectedIndex(0);
    }
    
}
