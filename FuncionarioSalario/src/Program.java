import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario fun = new Funcionario();
		
		System.out.print("Name : ");
		fun.nome=sc.nextLine();
		System.out.print("Salario Bruto: ");
		fun.salarioBruto = sc.nextDouble();
		System.out.println("Imposto ");
		fun.imposto = sc.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario" + fun);
		System.out.println();
		System.out.println("Qual porcetagem para aumentar o salario ? ");
		System.out.println();
		double porcentagem = sc.nextDouble();
		fun.aumentarSalario(porcentagem);
		
		System.out.println();
		System.out.println("Updated data " + fun);
		
		sc.close();
		
	}

}
