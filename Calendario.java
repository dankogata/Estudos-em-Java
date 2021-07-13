import java.util.*;
import java.text.*;

class Calendario {
    public static void main(String[] args) throws ParseException {
        //cria data a partir da string
        String dateInString = "15/05/2010 10:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
        System.out.println("Data antiga = " + dateInString);
        Calendar c = Calendar.getInstance();
        c.setTime(sdf.parse(dateInString));

        c.add(Calendar.MONTH,6);
        c.add(Calendar.HOUR,13);
        c.add(Calendar.YEAR,4);

        String novaData = sdf.format(c.getTime());
        System.out.println("Nova data = " + novaData);
    }
}
