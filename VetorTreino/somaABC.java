import java.util.Scanner;
public class somaABC {
	
	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int A[], B[], C[], i;
	
	A = new int[10];
	B = new int[10];
	C = new int[10];
	
	for(i=0;i<10; i++) {
		System.out.println("digite o "+(i+1)+"o valor do vetor A:");
		A[i] = in.nextInt();
	}
	System.out.println(" ");
	for(i=0; i<10; i++) {
		System.out.println("Digite o "+(i+1)+"o valor do vetor b:");
		B[i] = in.nextInt();
		C[i] = A[i] + B[i];
	}
	System.out.println(" ");
	for(i=0; i<10; i++) {
		System.out.println("Apresente "+(i+1)+"o valor do vetor C:"+C[i]);
	}
	
}

}
