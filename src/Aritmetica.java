import javax.sql.rowset.serial.SQLOutputImpl;
import javax.swing.*;
import java.sql.SQLOutput;

public class Aritmetica implements ICalcMedia {

    @Override
    public double CalculaMedia(double A, double B) {
        double answer = (A+B)/2;
        return answer;
    }

    @Override
    public String Situacao(double media) {
        String resultado;
        if(media>5)
        {
            resultado = "Aprovado";
        } else resultado  = "Reprovado";

        return resultado;
    }


}






