import java.util.Scanner;
public class MediaInteiro {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A[], M=0, i;
		
		A = new int[10];
		
		
		for(i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+" o valor do vetor A: ");
			A[i] = in.nextInt();
			M = M + A[i];
		}
		M = M/10;
		
		System.out.println("A MÉDIA É: "+M);
		
		in.close();

	}

}
