package lab5_angelponce;

public class PersonalConsejoAcademico extends PERSONAS{
    private String nombre, numeroregistro,
    apellido, cargo, puesto, cantidaddebecados, numeropersonascargo, lugarsegundotrabajo, cargosegundotrabajo,
    nombreacuerdo; //nombre del acuerdo que tiene con la universidad

    public PersonalConsejoAcademico() {
    }

    public PersonalConsejoAcademico(String nombre, String numeroregistro, String apellido, String cargo, String puesto, String cantidaddebecados, String numeropersonascargo, String lugarsegundotrabajo, String cargosegundotrabajo, String nombreacuerdo, String usuario, String pass) {
        super(usuario, pass);
        this.nombre = nombre;
        this.numeroregistro = numeroregistro;
        this.apellido = apellido;
        this.cargo = cargo;
        this.puesto = puesto;
        this.cantidaddebecados = cantidaddebecados;
        this.numeropersonascargo = numeropersonascargo;
        this.lugarsegundotrabajo = lugarsegundotrabajo;
        this.cargosegundotrabajo = cargosegundotrabajo;
        this.nombreacuerdo = nombreacuerdo;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroregistro() {
        return numeroregistro;
    }

    public void setNumeroregistro(String numeroregistro) {
        this.numeroregistro = numeroregistro;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCantidaddebecados() {
        return cantidaddebecados;
    }

    public void setCantidaddebecados(String cantidaddebecados) {
        this.cantidaddebecados = cantidaddebecados;
    }

    public String getNumeropersonascargo() {
        return numeropersonascargo;
    }

    public void setNumeropersonascargo(String numeropersonascargo) {
        this.numeropersonascargo = numeropersonascargo;
    }

    public String getLugarsegundotrabajo() {
        return lugarsegundotrabajo;
    }

    public void setLugarsegundotrabajo(String lugarsegundotrabajo) {
        this.lugarsegundotrabajo = lugarsegundotrabajo;
    }

    public String getCargosegundotrabajo() {
        return cargosegundotrabajo;
    }

    public void setCargosegundotrabajo(String cargosegundotrabajo) {
        this.cargosegundotrabajo = cargosegundotrabajo;
    }

    public String getNombreacuerdo() {
        return nombreacuerdo;
    }

    public void setNombreacuerdo(String nombreacuerdo) {
        this.nombreacuerdo = nombreacuerdo;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
}
