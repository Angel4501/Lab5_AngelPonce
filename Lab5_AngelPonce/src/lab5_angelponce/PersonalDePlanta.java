package lab5_angelponce;

public class PersonalDePlanta extends PERSONAS{
    private String nombre, numeroregistro, apellido, cargo, facultadpertenece, 
            carreraasignado, claseasignado; //clase a la que esté asignado

    public PersonalDePlanta() {
    }

    public PersonalDePlanta(String nombre, String numeroregistro, String apellido, String cargo, String facultadpertenece, String carreraasignado, String claseasignado, String usuario, String pass) {
        super(usuario, pass);
        this.nombre = nombre;
        this.numeroregistro = numeroregistro;
        this.apellido = apellido;
        this.cargo = cargo;
        this.facultadpertenece = facultadpertenece;
        this.carreraasignado = carreraasignado;
        this.claseasignado = claseasignado;
    }

    public PersonalDePlanta(String nombre, String numeroregistro, String apellido, String cargo, String facultadpertenece, String carreraasignado, String claseasignado) {
        this.nombre = nombre;
        this.numeroregistro = numeroregistro;
        this.apellido = apellido;
        this.cargo = cargo;
        this.facultadpertenece = facultadpertenece;
        this.carreraasignado = carreraasignado;
        this.claseasignado = claseasignado;
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

    public String getFacultadpertenece() {
        return facultadpertenece;
    }

    public void setFacultadpertenece(String facultadpertenece) {
        this.facultadpertenece = facultadpertenece;
    }

    public String getCarreraasignado() {
        return carreraasignado;
    }

    public void setCarreraasignado(String carreraasignado) {
        this.carreraasignado = carreraasignado;
    }

    public String getClaseasignado() {
        return claseasignado;
    }

    public void setClaseasignado(String claseasignado) {
        this.claseasignado = claseasignado;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
}
