import entities.Employee;
import services.BrazilTaxService;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("nome: ");
        String name = sc.nextLine();
        System.out.print("Salario Bruto: ");
        double grossSalary = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary);

        TaxService taxService = new BrazilTaxService();
        PensionService pensionService = new PensionService();

        SalaryService salaryService = new SalaryService(taxService, pensionService);

        double netSalary = salaryService.netSalary(employee);

        System.out.print(netSalary);

        sc.close();


    }
}