import java.util.Scanner;
public class IdadeAluno {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=1, maior=0, menor=0, id;
		
		while(i<=10) {
			System.out.println("Insira a Idade:");
			id=in.nextInt();
			if(id<18) {
			menor++;
		}else {
			maior++;
		}
		i++;
	
		System.out.println(maior+" Pessoas s�o maiores de idade e "+menor+" pessoas s�o menorres de idade.");
		in.close();
	} 
	} 
	
}
