import java.util.Scanner;
public class Idade {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int nasc, atual, id;
		System.out.println("Insira o ano de Nascimento:");
		nasc=in.nextInt();
		System.out.println("Insira o ano atual:");
		id=atual-nasc;
		System.out.println("Sua idade é de: "+id);
		if(id<1) {
			System.out.println("Criança");
		}else if(id<10) {
			System.out.println("Adolescente");
		}else if (id<18) {
			System.out.println("Adulto");
		}else if(id<60) {
			System.out.println("Idoso");	
 		
	}

}
in.close();