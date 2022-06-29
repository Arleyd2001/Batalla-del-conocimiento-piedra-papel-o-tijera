package trabajo;

public class Usuario {

    private String nombre;

    private int[] puntajes = new int[5];
    
    private int puntosext = 0; 

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(int[] puntajes) {
        this.puntajes = puntajes;
    }
    
    
    public Usuario(int puntosext) {
        this.puntosext = puntosext;
    }

    public int getpuntosext(int puntosext ) {
        return puntosext;
    }

    public void setpuntosext(int puntosext) {
        this.puntosext = puntosext;
    }
    
}
