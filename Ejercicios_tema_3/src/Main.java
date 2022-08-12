public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("+++++++++Funcion con tres parametros que se suman entre si+++++++++++");
        int resultado;
        resultado=suma(30,10,15);
        System.out.println();
        System.out.println("La suma de los tres numeros es: "+resultado);
        System.out.println();
        System.out.println("*****************************************");
        System.out.println("Objeto de la clase coche");
        Coche miCoche= new Coche();
        miCoche.IncrementarPuertas();
        miCoche.IncrementarPuertas();
        miCoche.IncrementarPuertas();
        System.out.println();
        System.out.println("El Objeto coche tiene: "+miCoche.puertas+" puertas");

    }
    public static int suma(int a, int b,int c){
        return a+b+c;
    }
    public static class Coche{
        public  int puertas=0;
        public void IncrementarPuertas(){
            this.puertas++;
        }
    }
}