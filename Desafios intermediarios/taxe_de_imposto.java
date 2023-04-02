import java.util.Scanner;

public class taxe_de_imposto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double salario = leitor.nextDouble();
        double imposto;

        if (salario <= 2000.0) {
            imposto = 0.0;
            System.out.println("Isento");
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        } else if (salario <= 4500.0) {
            imposto = 1000.0 * 0.08 + (salario - 3000.0) * 0.18;
        } else {
            imposto = 1000.0 * 0.08 + 1500.0 * 0.18 + (salario - 4500.0) * 0.28;
        }

        if (imposto > 0.0) {
            System.out.printf("R$ %.2f\n", imposto);
        }
    }

}
