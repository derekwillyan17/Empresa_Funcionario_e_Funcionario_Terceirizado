import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		List <Funcionarios> lista_employees = new ArrayList <Funcionarios>();
		
		System.out.print("Enter the number of employees: ");
		int num = input.nextInt();
		
		System.out.println();
		
		Funcionarios[] func = new Funcionarios[num];
		
		for(int cont = 0; cont < func.length; cont++) {

			System.out.printf("Employee #%d data:\n", cont+1);
			System.out.print("Outsourced (y/n)? ");
			char y_n = input.next().charAt(0); input.nextLine();
			
			if (y_n == 'y') {
				
				System.out.print("Name: ");
				String name = input.nextLine();
				System.out.print("Hours: ");
				int hour = input.nextInt();
				System.out.print("Value per hour: ");
				double val_ph = input.nextDouble();
				System.out.print("Additional charge: ");
				double add = input.nextDouble();
				func[cont] = new Funcionarios_Terceirizados(name, hour, val_ph, add);
				
			} else if (y_n == 'n') {
				
				System.out.print("Name: ");
				String name = input.nextLine();
				System.out.print("Hours: ");
				int hour = input.nextInt();
				System.out.print("Value per hour: ");
				double val_ph = input.nextDouble();
				func[cont] = new Funcionarios(name, hour, val_ph);
				
			}
			
			System.out.println();
			lista_employees.add(func[cont]);
			
		}
		
		System.out.printf("PAYMENTS:\n");
		
		for (Funcionarios fun : lista_employees) {
			
			System.out.printf("%s - $ %.2f\n", fun.getNome(), fun.getPagamento());
			
		}
		
		
		input.close();

	}

}
