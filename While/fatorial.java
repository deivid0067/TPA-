import java.util.Scanner;

public class fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=1, n, r=1
				
				System.out.println("coloque um número inteiro: ");
		n=in.nextInt();
		
		while(i<=n) {
			r=r*i;
			i++;
		}
		
		System.out.println("O fatorial do número "+n+" é: "+r);
		in.close();
	}

}
