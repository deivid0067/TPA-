import java.util.Scanner;
public class Anobissexto {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int Inicial, Final, bissextos=0;
		
		System.out.println("Entre com o ano Inicial:");
		Inicial=in.nextInt();
		
		System.out.println("Entre com o ano Final:");
		Final=in.nextInt();
		
		do {
			if(Inicial % 4 == 0) {
				bissextos++;
				System.out.println(Inicial+"O ano é bissexto");
			}
			
			Inicial++;
		}while(Inicial<=Final);
		System.out.println("O total de anos bissesxtos: "+bissextos);
		
		
	}

}
