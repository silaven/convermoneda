import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        float cantidad = 0;
        int opcion = 0;
        var fecha = new Date();
        String menu = """
                ╔═════════════════════════════════════════════════════╗
                ║       C O N V E R S O R   D E   M O N E D A S       ║
                ╚═════════════════════════════════════════════════════╝
                Bienvenido(a) al conversor de monedas en tiempo real
                *******************************
                1. Dólar ══>> Peso argentino
                2. Peso argentino ══>> Dólar
                3. Dólar ══>> Real brasileño
                4. Real brasileño ══>> Dólar
                5. Dólar ══>> Peso colombiano
                6. Peso colombiano ══>> Dólar
                7. Dólar ══>> Peso chileno
                8. Peso chileno ══>> Dólar
                9. Salir
                *******************************
                Elija una opción válida:
                """;

        do {
            try {
                System.out.println(menu);
                opcion = lectura.nextInt();
                if (opcion > 0 && opcion < 9) {
                    System.out.println("Escriba el monto a convertir: ");
                    cantidad = lectura.nextFloat();
                }
                switch (opcion) {
                    case 1:
                        Moneda moneda1 = consulta.buscaMoneda("USD", "ARS", cantidad);
                        System.out.println("El valor " + cantidad + " [USD] dólares corresponde a " + moneda1.conversion_result() + " [ARS] pesos argentinos");
                        break;
                    case 2:
                        Moneda moneda2 = consulta.buscaMoneda("ARS", "USD", cantidad);
                        System.out.println("El valor " + cantidad + " [ARS] pesos argentinos corresponde a " + moneda2.conversion_result() + " [USD] dólares");
                        break;
                    case 3:
                        Moneda moneda3 = consulta.buscaMoneda("USD", "BRL", cantidad);
                        System.out.println("El valor " + cantidad + " [USD] dólares corresponde a " + moneda3.conversion_result() + " [BRL] reales brasileños");
                        break;
                    case 4:
                        Moneda moneda4 = consulta.buscaMoneda("BRL", "USD", cantidad);
                        System.out.println("El valor " + cantidad + " [BRL] reales brasileños  corresponde a " + moneda4.conversion_result() + " [USD] dólares");
                        break;
                    case 5:
                        Moneda moneda5 = consulta.buscaMoneda("USD", "COP", cantidad);
                        System.out.println("El valor " + cantidad + " [USD] dólares corresponde a " + moneda5.conversion_result() + " [COP] pesos colombianos");
                        break;
                    case 6:
                        Moneda moneda6 = consulta.buscaMoneda("COP", "USD", cantidad);
                        System.out.println("El valor " + cantidad + " [COP] pesos colombianos corresponde a " + moneda6.conversion_result() + " [USD] dólares");
                        break;
                    case 7:
                        Moneda moneda7 = consulta.buscaMoneda("USD", "CLP", cantidad);
                        System.out.println("El valor " + cantidad + " [USD] dólares corresponde a " + moneda7.conversion_result() + " [CLP] pesos chilenos");
                        break;
                    case 8:
                        Moneda moneda8 = consulta.buscaMoneda("CLP", "USD", cantidad);
                        System.out.println("El valor " + cantidad + " [CLP] pesos chilenos corresponde a " + moneda8.conversion_result() + " [USD] dólares");
                        break;
                    case 9:
                        System.out.println("Saliendo de la aplicación, gracias por utilizar nuestros servicios.");
                        break;
                    default:
                        System.out.println("Opción no válida, verifique");
                }
            } catch (Exception e) {
                System.out.println("Ingrese un número entero válido");
                lectura.nextLine();
            }
            System.out.println("Consulta realizada el "  +fecha);
        }
            while (opcion != 9);
    }
}






