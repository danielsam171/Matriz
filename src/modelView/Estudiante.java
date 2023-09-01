package modelView;

public class Estudiante {
   
    String nombre;
    int cedula;
   
    public String registrarAsistencia(int cedula){
        this.cedula = cedula;
        System.out.println("cedula = " + cedula);
   
        return "Registro exitoso";
    }
    public void Registro_Estudiante(){
   
    }
    public Estudiante (){
   
    }

    public Estudiante(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
//      System.out.println(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
   
}