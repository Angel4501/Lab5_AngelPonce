package lab5_angelponce;

public class CEO extends PERSONAS{
    private String Nombre, numeroregistro, apellido,
    nacionalidad, títulouniversitario, edad, añosexperiencia, 
    anioslaborando; //cantidad de anios que lleva laborando

    public CEO() {
    }

    public CEO(String Nombre, String numeroregistro, String apellido, String nacionalidad, 
            String títulouniversitario, String edad, String añosexperiencia, String anioslaborando, 
            String usuario, String pass) {
        super(usuario, pass);
        this.Nombre = Nombre;
        this.numeroregistro = numeroregistro;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.títulouniversitario = títulouniversitario;
        this.edad = edad;
        this.añosexperiencia = añosexperiencia;
        this.anioslaborando = anioslaborando;
    }
    
    
    
    public CEO(String Nombre, String numeroregistro, String apellido, String nacionalidad, String títulouniversitario, String edad, String añosexperiencia, String anioslaborando) {
        this.Nombre = Nombre;
        this.numeroregistro = numeroregistro;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.títulouniversitario = títulouniversitario;
        this.edad = edad;
        this.añosexperiencia = añosexperiencia;
        this.anioslaborando = anioslaborando;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTítulouniversitario() {
        return títulouniversitario;
    }

    public void setTítulouniversitario(String títulouniversitario) {
        this.títulouniversitario = títulouniversitario;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getAñosexperiencia() {
        return añosexperiencia;
    }

    public void setAñosexperiencia(String añosexperiencia) {
        this.añosexperiencia = añosexperiencia;
    }

    public String getAnioslaborando() {
        return anioslaborando;
    }

    public void setAnioslaborando(String anioslaborando) {
        this.anioslaborando = anioslaborando;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
    
    
}
