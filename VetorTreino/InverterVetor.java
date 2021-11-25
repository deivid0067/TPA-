import java.util.Scanner;
public class InverterVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A[], B[], i;
		
		A = new int[10];
		B = new int[10];
		
		for(i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A:");
			A[i] = in.nextInt();
			B[9-i] = A[i];
		}
		System.out.println(" ");
		for(i=0; i<10; i++) {
			System.out.print(B[i]+" ");
			
		}
	}

}
