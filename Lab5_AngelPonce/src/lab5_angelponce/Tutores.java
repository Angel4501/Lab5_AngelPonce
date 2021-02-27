package lab5_angelponce;

public class Tutores extends Estudiante{
    
    private String clasetutorias, // en qué clase dan tutorias
    tutoresdelaboratorios; //SI o NO

    public Tutores() {
    }
    

    public Tutores(String clasetutorias, String tutoresdelaboratorios, String nombre, String numeroregistro, 
            String apellido, String carreraestudia, String equipodeporte, String facultadpertenece, 
            String cantidadclasesporcursar, String beca, String automovil, String usuario, String pass) {
        super(nombre, numeroregistro, apellido, carreraestudia, equipodeporte, facultadpertenece, cantidadclasesporcursar, beca, automovil, usuario, pass);
        this.clasetutorias = clasetutorias;
        this.tutoresdelaboratorios = tutoresdelaboratorios;
    }
    
    

    public String getClasetutorias() {
        return clasetutorias;
    }

    public void setClasetutorias(String clasetutorias) {
        this.clasetutorias = clasetutorias;
    }

    public String getTutoresdelaboratorios() {
        return tutoresdelaboratorios;
    }

    public void setTutoresdelaboratorios(String tutoresdelaboratorios) {
        this.tutoresdelaboratorios = tutoresdelaboratorios;
    }

    
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
    
}
