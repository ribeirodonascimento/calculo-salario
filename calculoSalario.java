import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int func = s.nextInt();
        int horas = s.nextInt();
        double valorHora = s.nextDouble();
        double salario = horas * valorHora;
        System.out.println("NUMBER = "+func);
        System.out.printf("SALARY = U$ %.2f%n",salario);

    }
}
