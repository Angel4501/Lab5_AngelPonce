package lab5_angelponce;

public class Administrativos extends PERSONAS{
    private String nombre, numeroderegistro, apellido, cargo, areaasignada
    ,cantidaddesubordinados, nombreasistente, nombrejefe; //Nomre del jefe asigando

    public Administrativos() {
    }

    public Administrativos(String nombre, String numeroderegistro, String apellido, String cargo, String areaasignada, String cantidaddesubordinados, String nombreasistente, String nombrejefe, String usuario, String pass) {
        super(usuario, pass);
        this.nombre = nombre;
        this.numeroderegistro = numeroderegistro;
        this.apellido = apellido;
        this.cargo = cargo;
        this.areaasignada = areaasignada;
        this.cantidaddesubordinados = cantidaddesubordinados;
        this.nombreasistente = nombreasistente;
        this.nombrejefe = nombrejefe;
    }
    
    

    public Administrativos(String nombre, String numeroderegistro, String apellido, String cargo, String areaasignada, String cantidaddesubordinados, String nombreasistente, String nombrejefe) {
        this.nombre = nombre;
        this.numeroderegistro = numeroderegistro;
        this.apellido = apellido;
        this.cargo = cargo;
        this.areaasignada = areaasignada;
        this.cantidaddesubordinados = cantidaddesubordinados;
        this.nombreasistente = nombreasistente;
        this.nombrejefe = nombrejefe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroderegistro() {
        return numeroderegistro;
    }

    public void setNumeroderegistro(String numeroderegistro) {
        this.numeroderegistro = numeroderegistro;
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

    public String getAreaasignada() {
        return areaasignada;
    }

    public void setAreaasignada(String areaasignada) {
        this.areaasignada = areaasignada;
    }

    public String getCantidaddesubordinados() {
        return cantidaddesubordinados;
    }

    public void setCantidaddesubordinados(String cantidaddesubordinados) {
        this.cantidaddesubordinados = cantidaddesubordinados;
    }

    public String getNombreasistente() {
        return nombreasistente;
    }

    public void setNombreasistente(String nombreasistente) {
        this.nombreasistente = nombreasistente;
    }

    public String getNombrejefe() {
        return nombrejefe;
    }

    public void setNombrejefe(String nombrejefe) {
        this.nombrejefe = nombrejefe;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
    
}
