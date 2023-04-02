
import java.util.Scanner;
public class espaco_e_vogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
   
         for (String item : strSplit) {
             for (int i = 0; i < item.length(); i++) {
                 char letra = Character.toLowerCase(item.charAt(i));
                 if (letra == ' ') {
                     espacosEmBranco++;
                 } else if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                     quantVogais++;
                 }
             }
         }
         
         System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
   
     }
}
