package geral;

import java.util.Locale;
import java.util.Scanner;
import entities.employee;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        employee money = new employee();

        System.out.println("Nome: ");
        money.name = sc.nextLine();
        System.out.println("Salário bruto: ");
        money.grossSalary = sc.nextDouble();
        System.out.println("Imposto: ");
        money.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário: " + money);
        System.out.println();
        System.out.println("Quanto de porcentagem deseja adicionar: ");
        double percentage = sc.nextDouble();
        money.addSalary(percentage);

        System.out.println();
        System.out.println("Informação atualizada: " + money);
        sc.close();
    }
}
