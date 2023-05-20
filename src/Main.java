public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("kevin");
        persona.setEdad(5);
        persona.setTelegono(12345678);

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelegono());




    }
}
class Persona {
    private int edad;
    private String nombre;
    private int telegono;

    public void setEdad (int edad) {
        this.edad = edad;
    }
    public int getEdad (){
    return this.edad;
    }
    public void setNombre ( String nombre ){
        this.nombre = nombre;
    }
    public String getNombre (){
        return this.nombre;
    }
    public void setTelegono (int telegono){
        this.telegono = telegono;
    }
    public int getTelegono (){
        return this.telegono;
    }

}