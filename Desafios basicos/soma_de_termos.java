import java.util.Scanner;
public class soma_de_termos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double h = 0;

        for (int i = 1; i <= n; i++) {
            h += 1.0/i;
        }

        System.out.printf("%.0f\n", h); // imprimir sem casas decimais
    }
}
