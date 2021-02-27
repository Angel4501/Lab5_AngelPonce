package lab5_angelponce;

public class Estudiante extends PERSONAS{
    private String nombre, numeroregistro, apellido, carreraestudia, 
            equipodeporte, //si pertenece o no en un equipo de deporte
            facultadpertenece, cantidadclasesporcursar, beca, automovil; //beca SI o NO, automovil SI o NO

    public Estudiante() {
    }

    public Estudiante(String nombre, String numeroregistro, String apellido, String carreraestudia, String equipodeporte, String facultadpertenece, String cantidadclasesporcursar, String beca, String automovil, String usuario, String pass) {
        super(usuario, pass);
        this.nombre = nombre;
        this.numeroregistro = numeroregistro;
        this.apellido = apellido;
        this.carreraestudia = carreraestudia;
        this.equipodeporte = equipodeporte;
        this.facultadpertenece = facultadpertenece;
        this.cantidadclasesporcursar = cantidadclasesporcursar;
        this.beca = beca;
        this.automovil = automovil;
    }
    
    

    public Estudiante(String nombre, String numeroregistro, 
            String apellido, String carreraestudia, 
            String equipodeporte, String facultadpertenece, 
            String cantidadclasesporcursar, String beca, String automovil) {
        this.nombre = nombre;
        this.numeroregistro = numeroregistro;
        this.apellido = apellido;
        this.carreraestudia = carreraestudia;
        this.equipodeporte = equipodeporte;
        this.facultadpertenece = facultadpertenece;
        this.cantidadclasesporcursar = cantidadclasesporcursar;
        this.beca = beca;
        this.automovil = automovil;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
