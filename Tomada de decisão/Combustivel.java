import java.util.Scanner;
public class Combustivel {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		
		double km, litro, kmlitro;
		
		System.out.println("Insira a distancia de Km:");
		km=in.nextDouble();
		System.out.println("Insira a capacidade do tanque:");
		litro= in.nextDouble();
		kmlitro=km/litro;
		if(kmlitro<=10) {
			System.out.println("Econ�mico");
		}else {
			System.out.println("N�o econ�mico");
		}
		in.close();
		
		}
	
}
