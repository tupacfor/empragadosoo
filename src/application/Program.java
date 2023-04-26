package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Departament;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String name = sc.next();
		
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Telefone: ");
		String phone = sc.next();
		
		Address address = new Address(email, phone);
		
		Departament departament = new Departament(name, payDay, address);
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionário " + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String employeeName = sc.nextLine();
			System.out.println("Salário: ");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(employeeName, salary);
			
			departament.addEmployee(employee);
			
		}
		System.out.println();
		
		System.out.println(departament);
		
		
		
		sc.close();
	}

}
