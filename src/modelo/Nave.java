
package modelo;

//se crea la clase Nave 

public class Nave {
    //definimos atributos deacuerdo con la tabla de la base de datos
    private int idNave;
    private String clave;
    private String nombre;
    private double pesoTonelada;
    private String combustible;
    private double velocidadKmHora;
    private double potenciaHp;
    private double propulsionTonelada;
    private int cantidadPersona;
    private double orbitaKm;
    private double transportaTonelada;
    private int idTipo;
    private int idAgencia;
    private String tipo;
    private String agencia;
    private String funcion;
    
    //Se crean los metodos getters and setters para llamarlos en el crud 
    
    public int getIdNave() {
        return idNave;
    }

    public void setIdNave(int idNave) {
        this.idNave = idNave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPesoTonelada() {
        return pesoTonelada;
    }

    public void setPesoTonelada(double pesoTonelada) {
        this.pesoTonelada = pesoTonelada;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public double getVelocidadKmHora() {
        return velocidadKmHora;
    }

    public void setVelocidadKmHora(double velocidadKmHora) {
        this.velocidadKmHora = velocidadKmHora;
    }

    public double getPotenciaHp() {
        return potenciaHp;
    }

    public void setPotenciaHp(double potenciaHp) {
        this.potenciaHp = potenciaHp;
    }

    public double getPropulsionTonelada() {
        return propulsionTonelada;
    }

    public void setPropulsionTonelada(double propulsionTonelada) {
        this.propulsionTonelada = propulsionTonelada;
    }

    public int getCantidadPersona() {
        return cantidadPersona;
    }

    public void setCantidadPersona(int cantidadPersona) {
        this.cantidadPersona = cantidadPersona;
    }

    public double getOrbitaKm() {
        return orbitaKm;
    }

    public void setOrbitaKm(double orbitaKm) {
        this.orbitaKm = orbitaKm;
    }

    public double getTransportaTonelada() {
        return transportaTonelada;
    }

    public void setTransportaTonelada(double transportaTonelada) {
        this.transportaTonelada = transportaTonelada;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }

       public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    
}
