import java.util.Scanner;
public class INSS {
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			double qtdaulas,valoraula,salario;
			
			System.out.println("Insira a Quantidade de Aulas");
			qtdaulas=in.nextDouble();
			System.out.println("Insira o valor da hora aula");
			valoraula=in.nextDouble();
			salario=qtdaulas*valoraula;
			System.out.println(+salario);
			
			
			
		}

	}


