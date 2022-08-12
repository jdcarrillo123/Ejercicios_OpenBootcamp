public class Main {
    public static void main(String[] args) {

        System.out.println("*******ESTRUCTURAS DE CONTROL*******");
        System.out.println();
        System.out.println("-----Condicional IF-----");
        Condicional_if();
        System.out.println();
        System.out.println((char)27 +"[0m-----Bucle While-----");
        Bucle_while();
        System.out.println();
        System.out.println("-----Bucle Do While-----");
        Bucle_do_while();
        System.out.println();
        System.out.println("-----Bucle For-----");
        Bucle_For();
        System.out.println();
        System.out.println("-----Interruptor Case-----");
        Condicion_switch();


    }
    public static void Condicional_if(){
        int numeroIf=1;
        if (numeroIf==0){
            System.out.println("El numero ingresado es cero");
        }else if (numeroIf>0){
            System.out.println((char)27 +"[32mEl numero es positivo");
        }else {
            System.out.println((char)27 +"[31mEl numero es negativo");
        }

    }
    public static void Bucle_while(){
        int numeroWhile=3;
        while (numeroWhile>0){
            System.out.println(numeroWhile);
            numeroWhile--;
        }
    }

    public static void Bucle_do_while(){
        int numeroWhile=3;
        do{
            System.out.println(numeroWhile);
            numeroWhile--;
        } while (numeroWhile<0);

    }
    public static void Bucle_For(){
        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
    }
    public static void Condicion_switch(){
        String estacion="Primavera";
        switch (estacion){
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("El valor no es una estacion del año");

        }
    }
}