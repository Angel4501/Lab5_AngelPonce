package lab5_angelponce;

public class Docente extends PERSONAS{
    private String nombre, numeroregistro, apellido, claseasignado,
    facultadasignado, facultadesSioNO, //si trabaja o no en distintas facultadoes
    areaconocimiento, //area de conocimiento a la cual pertenece
    poseelab; //si posee laboratorio o no 

    public Docente() {
    }
    
    

    public Docente(String nombre, String numeroregistro, String apellido, String claseasignado, String facultadasignado, String facultadesSioNO, String areaconocimiento, String poseelab, String usuario, String pass) {
        super(usuario, pass);
        this.nombre = nombre;
        this.numeroregistro = numeroregistro;
        this.apellido = apellido;
        this.claseasignado = claseasignado;
        this.facultadasignado = facultadasignado;
        this.facultadesSioNO = facultadesSioNO;
        this.areaconocimiento = areaconocimiento;
        this.poseelab = poseelab;
    }
    
    

    public Docente(String nombre, String numeroregistro, String apellido, String claseasignado, 
            String facultadasignado, String facultadesSioNO, String areaconocimiento, String poseelab) {
        this.nombre = nombre;
        this.numeroregistro = numeroregistro;
        this.apellido = apellido;
        this.claseasignado = claseasignado;
        this.facultadasignado = facultadasignado;
        this.facultadesSioNO = facultadesSioNO;
        this.areaconocimiento = areaconocimiento;
        this.poseelab = poseelab;
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

    public String getClaseasignado() {
        return claseasignado;
    }

    public void setClaseasignado(String claseasignado) {
        this.claseasignado = claseasignado;
    }

    public String getFacultadasignado() {
        return facultadasignado;
    }

    public void setFacultadasignado(String facultadasignado) {
        this.facultadasignado = facultadasignado;
    }

    public String getFacultadesSioNO() {
        return facultadesSioNO;
    }

    public void setFacultadesSioNO(String facultadesSioNO) {
        this.facultadesSioNO = facultadesSioNO;
    }

    public String getAreaconocimiento() {
        return areaconocimiento;
    }

    public void setAreaconocimiento(String areaconocimiento) {
        this.areaconocimiento = areaconocimiento;
    }

    public String getPoseelab() {
        return poseelab;
    }

    public void setPoseelab(String poseelab) {
        this.poseelab = poseelab;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
