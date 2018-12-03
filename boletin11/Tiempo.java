package boletin11;

import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Tiempo {

    private Date fechaIni;
    private Date fechaFin;
    
    private String frase;

    public Tiempo() {

        do {
            fechaIni = new Date();
            frase = JOptionPane.showInputDialog("ESCRIBE A SEGUINTE FRASE: \n"
                + "   A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática");

            fechaFin = new Date();

            long transcurrido = fechaFin.getTime() - fechaIni.getTime();
            long segundos = (transcurrido / 1000) % 60;
            long minutos = (transcurrido / (60 * 1000)) % 60;
            long horas = (transcurrido / (3600 * 1000)) % 60;

            DecimalFormat formato = new DecimalFormat("00");

            JOptionPane.showMessageDialog(null, "TARDACHES " + formato.format(horas) + "-" + formato.format(minutos) + "-" + formato.format(segundos) + " TEMPO EN ESCRIBIR A FRASE");

        } while (!"fin".equalsIgnoreCase(frase));
    }
}
