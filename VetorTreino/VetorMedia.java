import java.util.Scanner;
public class VetorMedia {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		final int TAM = 10; 
		int i, a[], m=0;
		
		a = new int[TAM];
		
	
		for(i=0;i<TAM;i++) {
			System.out.println("Entre com o "+(i+1)+"o valor:");
			a[i]=in.nextInt();
			m=m+a[i];
		}
		m=m/TAM;
		
	
		System.out.println("o Resultados dos valores inseridos são : "+m);
		
		in.close();
		
	}

}



