import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorTiempo {
    public static String duracionDelAlbum() {
        Scanner teclado = new Scanner(System.in);

        int minRestantes = 0;
        String horasAprox = "0";
        int horas = 0;
        int min = 0;
        int segRestantes = 0;
        int minutosTotales = 0;
        String minAprox = "0";

        System.out.println("Ingrese los minutos del album:");
        int minutos = teclado.nextInt();
        System.out.println("Ingrese los segundos:");
        int segundos = teclado.nextInt();

        if (minutos > 60) {
            horas = minutos / 60;
            String p = "#";
            DecimalFormat decimalFormat = new DecimalFormat(p);
            horasAprox = decimalFormat.format(horas);
            minRestantes = minutos % 60;
        } else if (minutos == 60) {
            horasAprox = "1";
        } else if (minutos < 60) {
            minRestantes = minutos;
        }

        if (segundos == 60) {
            minAprox = "1";
        } else if (segundos > 60) {
            min = segundos / 60;
            segRestantes = segundos % 60;
        } else if (segundos < 60) {
            segRestantes = segundos;
        }

        //suma de minutos:
        minutosTotales = minRestantes + min;

        String cadenaHoras = String.valueOf(horasAprox);
        String cadenaMin = String.valueOf(minutosTotales);
        String cadenaSeg = String.valueOf(segRestantes);

        String duracion = cadenaHoras + " hr " + cadenaMin + " min " + cadenaSeg + " s";
        return duracion;
    }
}
