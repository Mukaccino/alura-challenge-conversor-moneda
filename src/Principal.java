import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        String[] monedasElegir = {"ARS - Peso argentino", "BOB - Boliviano boliviano", "BRL - Real brasileño",
                "CLP - Peso chileno", "COP - Peso colombiano", "USD - Dólar estadounidense", "SALIR"};

        while (true){

            ConsultaMoneda consulta = new ConsultaMoneda();

            System.out.println("Seleccione la Moneda de Origen");
            for (int i = 0; i < monedasElegir.length; i++) {
                System.out.println(monedasElegir[i]);
            }
            System.out.println("*********************************************");
            var monedaOrigen = lectura.nextLine().trim().toUpperCase();

            if (monedaOrigen.isEmpty()) {
                System.out.println("Entrada vacía.");
                break;
            }

            if (!existeMoneda(monedaOrigen.toUpperCase(), monedasElegir)) {
                System.out.println("Moneda incorrecta.");
                break;
            }

            if(monedaOrigen.equalsIgnoreCase("salir")){
                break;
            }

            System.out.println("Ingresa la cantidad a convertir: ");
            var cantidadMoneda = lectura.nextInt();
            lectura.nextLine();
            System.out.println("Seleccione la Moneda a Convertir ");
            for (int i = 0; i < monedasElegir.length; i++) {
                System.out.println(monedasElegir[i]);
            }
            System.out.println("*********************************************");

            var monedaConvertida = lectura.nextLine().trim().toUpperCase();

            if (monedaConvertida.isEmpty()) {
                System.out.println("Entrada vacía.");
                break;
            }

            if (!existeMoneda(monedaConvertida.toUpperCase(), monedasElegir)) {
                System.out.println("Moneda incorrecta.");
                break;
            }
            if(monedaConvertida.equalsIgnoreCase("salir")){
                break;
            }
            try {
                Moneda moneda = consulta.consultarConversion(monedaOrigen);
                var valorConversion = moneda.conversion_rates().get(monedaConvertida);

                System.out.println();
                System.out.println("********************************************");
                System.out.println();
                System.out.println("moneda original: " + monedaOrigen);
                System.out.println("moneda conversion: " + monedaConvertida);
                System.out.println("Valor moneda: " + valorConversion );
                System.out.println("cantidad: " + cantidadMoneda);
                System.out.println("Valor de conversion: " + (valorConversion * cantidadMoneda) );
                System.out.println();
                System.out.println();
                System.out.println("********************************************");
                System.out.println();



            }catch (RuntimeException e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
        }

        System.out.println("PROGRAMA FINALIZADO");
        System.out.println("***********************************");



    }
    private static boolean existeMoneda(String moneda, String[] monedasElegir) {
        for (String m : monedasElegir) {
            if (m.toUpperCase().startsWith(moneda)) {
                return true;
            }
        }
        return false;
    }
}
