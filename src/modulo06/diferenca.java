package modulo06;

public class diferenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1, num2, num3, num4, num5, cálculo1, cálculo2;
		
		num1 = 5.0f;
		num2 = 6.0f;
		num3 = 7.0f;
		num4 = 8.0f;
		num5 = -7.0f;
		
		cálculo1 = (num1 * num2) - (num3 * num4);
		
		System.out.printf("A diferença do produto num1 e num2 pelo produto entre num3 e num4 é igual a " + cálculo1 + ".");
		
		cálculo2 = (num1 * num2) - (num5 * num4);
		
		System.out.printf("\nA diferença do produto num1 e num2 pelo produto entre num5 e num4 é igual a " + cálculo2 + ".");
	}

}
