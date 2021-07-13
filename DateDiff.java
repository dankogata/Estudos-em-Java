import java.util.Date;

class DateDiff{
   public static void main (String[] args){
      //data nascimento
      @Deprecated
         Date nascimento = new Date(1995, 2,13);
      Long nascMillis = nascimento.getTime();
      //Data comparativa
      @Deprecated
         Date anterior = new Date(2010,4,15);
      Long antMillis = anterior.getTime();
      //Comparativos com saidas
      boolean isAfter = nascimento.after(anterior);
      System.out.println("Depois da data: " +isAfter);
      boolean isBefore = nascimento.before(anterior);
      System.out.println("Antes da data: "+ isBefore);
   }
}
