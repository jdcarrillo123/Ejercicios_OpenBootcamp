import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Jose Luis Gonzales");
        cliente.setEdad(25);
        cliente.setTelefono("671-145-36-78");
        cliente.setCredito(1245.56);
        System.out.println("*********Datos del objeto Cliente***********");
        System.out.println("Nombre: "+cliente.getNombre());
        System.out.println("Edad: "+cliente.getEdad());
        System.out.println("Telefono: "+cliente.getTelefono());
        System.out.println("Credito: $"+cliente.getCredito());
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Jorge Armando Solis");
        trabajador.setEdad(39);
        trabajador.setTelefono("971-136-65-89");
        trabajador.setSalario(3645.59);
        System.out.println();
        System.out.println("*********Datos del objeto Trabajador***********");
        System.out.println("Nombre: "+trabajador.getNombre());
        System.out.println("Edad: "+trabajador.getEdad());
        System.out.println("Telefono: "+trabajador.getTelefono());
        System.out.println("Salario: $"+trabajador.getSalario());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }
}
class Cliente extends Persona{
    private double credito;
    public void setCredito(double credito){
        this.credito=credito;
    }
    public double getCredito(){
        return this.credito;
    }
}
class Trabajador extends Persona{
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
}