package modulo06;

public class Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salarioBruto = 2000.00f;
		float noturno = 500.00f;
		float extras = 100.00f;
		float descontos = 200.00f;
		
		float salarioLiquido = salarioBruto + noturno + (extras * 5) - descontos;
				
		System.out.printf ("O valor do Salário Líquido é de: " + salarioLiquido);
	}

}
