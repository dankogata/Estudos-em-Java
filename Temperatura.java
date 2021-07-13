import java.util.*;

class Temperatura{
   public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      int i;
      ArrayList<Double> temperaturas = new ArrayList<>();
      for (i = 0;i<6;i++){
         {
            System.out.println("Qual a temperatura: ");
            double temp = input.nextDouble();
            temperaturas.add(temp);
         }
      }
   
      //Verificar os itens dentro da lista
      System.out.println("Tempeturas: "+temperaturas);
   
      //soma dos itens da lista
      Iterator <Double> iterator = temperaturas.iterator();
      Double soma = 0d;
      while(iterator.hasNext()){
         Double next = iterator.next();
         soma += next;
      }
   
      System.out.println("Soma: "+soma);
      double media = soma/ temperaturas.size();
      System.out.println("Media: "+media);
   
      for (Double temp : temperaturas) {
         if(temp > media) {
            int index = temperaturas.indexOf(temp);
            switch (index) {
               case 0:
                  System.out.println((index + 1) + " - JANEIRO: " + temp + " oC");
                  break;
               case 1:
                  System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " oC");
                  break;
               case 2:
                  System.out.println((index + 1) + " - MARCO: " + temp+ " oC");
                  break;
               case 3:
                  System.out.println((index + 1) + " - ABRIL: " + temp+ " oC");
                  break;
               case 4:
                  System.out.println((index + 1) + " - MAIO: " + temp+ " oC");
                  break;
               case 5:
                  System.out.println((index + 1) + " - JUNHO: " + temp+ " oC");
                  break;
               default:
                  break;
            }
         }
      }
   
   }
}