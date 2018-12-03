package boletin11;

import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Tiempo {

    private Date fechaIni;
    private Date fechaFin;
    private final String fraseCorrecta = "A documentación e todo aquel conxunto de manuais impresos ou en formato dixital que explica unha aplicacion informatica";
    private String frase;

    public Tiempo() {
        String[] opciones = {"INICIAR"};
        int opcion = JOptionPane.showOptionDialog(
                null,
                "DESEA INICIAR?",
                null,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                null
        );
        switch (opcion) {
            case 0:
                do {
                    fechaIni = new Date();
                    frase = JOptionPane.showInputDialog("ESCRIBE A SEGUINTE FRASE: \n" + fraseCorrecta);

                    fechaFin = new Date();
                } while (!frase.equalsIgnoreCase(fraseCorrecta));

        }


            long transcurrido = fechaFin.getTime() - fechaIni.getTime();
            long segundos = (transcurrido / 1000) % 60;
            long minutos = (transcurrido / (60 * 1000)) % 60;
            long horas = (transcurrido / (3600 * 1000)) % 60;

            DecimalFormat formato = new DecimalFormat("00");

            JOptionPane.showMessageDialog(null, "TARDACHES " + formato.format(horas) + "-" + formato.format(minutos) + "-" + formato.format(segundos) + " TEMPO EN ESCRIBIR A FRASE");

    }
}
