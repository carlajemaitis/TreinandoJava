package modulo06;

import java.util.Scanner;

public class fluxograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float salário, abono, novosalário;
		
		System.out.printf("Digite o Salário: ");
		salário = leia.nextFloat();
		
		
		System.out.printf("Digite o Abono: ");
		abono = leia.nextFloat();
		
		novosalário = salário + abono;
		System.out.printf("Seu novo salário é de : " + novosalário);

	}

}
