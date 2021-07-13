import java.util.*;

public class MinhaClasse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valores = sc.nextInt();

        //criar HashMap
        Map<Integer,Integer> numeros = new HashMap<>();
        for(int i=0;i<valores;i++){
            int numero = sc.nextInt();
            if (numeros.containsKey(numero)){
                var qtd = numeros.get(numero);
                numeros.put(numero,++qtd);
            }
            else{
                numeros.put(numero,1);
            }
        }

        numeros.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e->System.out.println(e.getKey()+" aparece "+e.getValue()+" vez(es)"));
    }
}
