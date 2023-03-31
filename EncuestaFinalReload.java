import javax.swing.*;
import java.util.ArrayList;

public class EncuestaFinalReload {
    public static void main(String[] args) {


        ArrayList<String> arrayTotal = new ArrayList<>();
        ArrayList<String> arrayM = new ArrayList<>();
        ArrayList<String> arrayP = new ArrayList<>();
        ArrayList<String> arrayK = new ArrayList<>();
        String ingreso = "";

        for (int i = 0; !ingreso.equals("0"); i++) {

            ingreso = JOptionPane.showInputDialog("Que candidato elegirías como presidente en las elecciones de octubre 2023?  " + " \n "
                    + " 1. Horacio Rodriguez Ladreta (PRO)" + " \n " + " 2. Máximo Vago (K)" + " \n " + " 3. Javier Milei (PL)" + " \n "
                    + "Presione 0 para finalizar la encuesta. ");

            while (!ingreso.matches("[0123]{1}")) {
                JOptionPane.showMessageDialog(null, "Error ingreo un caracter invalido, vuelva a intentarlo!! ");
                ingreso = JOptionPane.showInputDialog("Que candidato elegirías como presidente en las elecciones de octubre 2023?  " + " \n "
                        + " 1. Horacio Rodriguez Ladreta (PRO)" + " \n " + " 2. Máximo Vago (K)" + " \n " + " 3. Javier Milei (PL)" + " \n "
                        + "Presione 0 para finalizar la encuesta. ");
            }
            arrayTotal.add(ingreso);
        }

        for (int i = 0; i < arrayTotal.size(); i++) {
            String temp = arrayTotal.get(i);

            if (temp.equalsIgnoreCase("1")){
                arrayP.add(String.valueOf(i));
            }
           else if (temp.equalsIgnoreCase("2")){
                arrayK.add(String.valueOf(i));
            }
           else  if (temp.equalsIgnoreCase("3")){
                arrayM.add(String.valueOf(i));
            }
        }
            if (arrayP.size() >= arrayK.size() && arrayK.size() >= arrayM.size() && arrayP.size() >= arrayM.size()){
                JOptionPane.showMessageDialog(null,"Horacio Rodriguez Ladreta (PRO)" + " \n "+ "Total de votos : " + arrayP.size() + " \n " +
                        "Id de los votantes de este candidato : " + " \n "+ arrayP+ " \n " +"----------------------"+ " \n "+
                        "Máximo Vago (K)" + " \n "+ "Total de votos : " + arrayK.size() + " \n " +
                        "Id de los votantes de este candidato : " + " \n "+ arrayK+ " \n " +"----------------------"+ " \n "+
                        "Javier Milei (PL)" + " \n "+ "Total de votos : " + arrayM.size() + " \n " +
                        "Id de los votantes de este candidato : " + " \n "+ arrayM + " \n "+" ----------------------"+ " \n "+
                        "Gracias por participar de esta Encuesta.");
            }
        else if (arrayP.size() >= arrayK.size() && arrayM.size() >= arrayK.size()&& arrayP.size() >= arrayM.size()){
            JOptionPane.showMessageDialog(null,"Horacio Rodriguez Ladreta (PRO)" + " \n "+ "Total de votos : " + arrayP.size() + " \n " +
                    "Id de los votantes de este candidato : " + " \n "+ arrayP+ " \n " +"----------------------"+ " \n "+
                    "Javier Milei (PL)" + " \n "+ "Total de votos : " + arrayM.size() + " \n " +
                    "Id de los votantes de este candidato : " + " \n "+ arrayM+ " \n " +"----------------------"+ " \n "+
                    "Máximo Vago (K)" + " \n "+ "Total de votos : " + arrayK.size() + " \n " +
                    "Id de los votantes de este candidato : " + " \n "+ arrayK+ " \n "+" ----------------------"+ " \n "+
                    "Gracias por participar de esta Encuesta.");;
        }
        else if (arrayK.size() >= arrayP.size() && arrayP.size() >= arrayM.size()&& arrayK.size() >= arrayM.size()){
            JOptionPane.showMessageDialog(null,  "Máximo Vago (K)" + " \n "+ "Total de votos : " + arrayK.size() + " \n " +
                    "Id de los votantes de este candidato : " + " \n "+ arrayK+ " \n " +"----------------------"+ " \n "+
                    "Horacio Rodriguez Ladreta (PRO)" + " \n "+ "Total de votos : " + arrayP.size() + " \n " +
                    "Id de los votantes de este candidato : " + " \n "+ arrayP+ " \n " +"----------------------"+ " \n "+
                    "Javier Milei (PL)" + " \n "+ "Total de votos : " + arrayM.size() + " \n " +
                    "Id de los votantes de este candidato : " + " \n "+ arrayM+ " \n "+" ----------------------"+ " \n "+
                    "Gracias por participar de esta Encuesta.");
        }
            else if (arrayK.size() >= arrayP.size() && arrayM.size() >= arrayP.size()&& arrayK.size() >= arrayM.size()){
                JOptionPane.showMessageDialog(null,  "Máximo Vago (K)" + " \n "+ "Total de votos : " + arrayK.size() + " \n " +
                        "Id de los votantes de este candidato : " + " \n "+ arrayK+ " \n " +"----------------------"+ " \n "+
                        "Javier Milei (PL)" + " \n "+ "Total de votos : " + arrayM.size() + " \n " +
                        "Id de los votantes de este candidato : " + " \n "+ arrayM+ " \n " +"----------------------"+ " \n "+
                        "Horacio Rodriguez Ladreta (PRO)" + " \n "+ "Total de votos : " + arrayP.size() + " \n " +
                        "Id de los votantes de este candidato : " + " \n "+ arrayP+ " \n "+" ----------------------"+ " \n "+
                        "Gracias por participar de esta Encuesta.");
            }
            else if (arrayM.size() >= arrayP.size() && arrayP.size() >= arrayK.size()&& arrayM.size() >= arrayK.size()){
                JOptionPane.showMessageDialog(null,  "Javier Milei (PL)" + " \n "+ "Total de votos : " + arrayM.size() + " \n " +
                        "Id de los votantes de este candidato : " + " \n "+ arrayM+ " \n " +"----------------------"+ " \n "+
                        "Horacio Rodriguez Ladreta (PRO)" + " \n "+ "Total de votos : " + arrayP.size() + " \n " +
                        "Id de los votantes de este candidato : " + " \n "+ arrayP+ " \n " +"----------------------"+ " \n "+
                        "Máximo Vago (K)" + " \n "+ "Total de votos : " + arrayK.size() + " \n " +
                        "Id de los votantes de este candidato : " + " \n "+ arrayK+ " \n "+" ----------------------"+ " \n "+
                        "Gracias por participar de esta Encuesta.");

            }
            else if (arrayM.size() >= arrayP.size() && arrayK.size() >= arrayP.size()&& arrayK.size() >= arrayP.size()){
                JOptionPane.showMessageDialog(null,  "Javier Milei (PL)" + " \n "+ "Total de votos : " + arrayM.size() + " \n " +
                        "Id de los votantes de este candidato : " + " \n "+ arrayM+ " \n " +"----------------------"+ " \n "+
                        "Máximo Vago (K)" + " \n "+ "Total de votos : " + arrayK.size() + " \n " +
                        "Id de los votantes de este candidato : " + " \n "+ arrayK+ " \n " +"----------------------"+ " \n "+
                        "Horacio Rodriguez Ladreta (PRO)" + " \n "+ "Total de votos : " + arrayP.size() + " \n " +
                        "Id de los votantes de este candidato : " + " \n "+ arrayP + " \n "+" ----------------------"+ " \n "+
                        "Gracias por participar de esta Encuesta.");
            }
    }
}

