
package crud_mvc;

import controlador.ControladorNave;
import modelo.ConsultasNave;
import modelo.Nave;
import vista.VistaNave;

public class Principal {

    public static void main(String[] args) {
//Creamos objetos vistaPersona, Nave, ConsultaPersona Y ControladorNave para utilizarlos y llamarlos
        VistaNave vista = new VistaNave();//instanciamos o creamos
        Nave nave = new Nave();
        ConsultasNave modelo = new ConsultasNave();
        ControladorNave controlador = new ControladorNave(vista, nave, modelo);//se envia al constructor vista,nave y modelo
        
        controlador.iniciar();//iniciamos el controlador
        vista.setVisible(true);//que se vea visible la vista
    }
    
}
