import java.util.Scanner;

public class quitanda_do_ze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        double precoMorango = (morangos <= 5) ? 2.5 : 2.2;
        double precoMaca = (macas <= 5) ? 1.8 : 1.5;

        double custoTotal = (morangos * precoMorango) + (macas * precoMaca);

        if ((morangos + macas > 8) || (custoTotal > 25.0)) {
            custoTotal *= 0.9;
            System.out.printf("%.2f\n", custoTotal);
        }
        else {
          System.out.printf("%.1f\n", custoTotal); }
        
    }
}
