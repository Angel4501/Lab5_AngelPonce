package lab5_angelponce;

public class PERSONAS {
    
    private String usuario, pass;

    public PERSONAS() {
    }

    public PERSONAS(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    

    @Override
    public String toString() {
        return usuario;
    }
    
    
    
}
