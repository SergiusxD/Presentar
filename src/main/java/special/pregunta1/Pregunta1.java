package special.pregunta1;

public class Pregunta1 {
    private String nombre;
    private int nacimiento;

    public Pregunta1(String nombre, int nacimiento){
        this.nombre=nombre;
        this.nacimiento=nacimiento;
    }

    public int getEdad(){
        return 2020-this.nacimiento;
    }

    public String getId(){
        return this.nombre.length()+""+this.nacimiento;
    }

    public void clean(){
        this.nombre="";
        this.nacimiento=0;
    }
}
