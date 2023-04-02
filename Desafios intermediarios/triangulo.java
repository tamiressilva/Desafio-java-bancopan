import java.io.IOException;
import java.util.*;

public class triangulo {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		double maior;
		double soma;
		boolean triangulo;
		
		if (A < B + C && B < A + C && C < A + B) {
		    triangulo = true;
		    soma = A + B + C;
		    System.out.println(String.format("Perimetro = %.1f", soma));
		} else {
		    triangulo = false;
		    soma = ((A + B) * C) / 2;
		    System.out.println(String.format("Area = %.1f", soma));
		}
		
	}
}
