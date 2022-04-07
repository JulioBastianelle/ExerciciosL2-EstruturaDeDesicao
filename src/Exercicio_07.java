import java.util.Scanner;

public class Exercicio_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("informe o Primeiro Numero: ");
        int primeiroNumero = Integer.parseInt(scanner.nextLine());
        System.out.print("informe o Segundo Numero: ");
        int segundoNumero = Integer.parseInt(scanner.nextLine());
        System.out.print("Informe o Terceiro Numero: ");
        int terceiroNumero = Integer.parseInt(scanner.nextLine());
        System.out.println("\n=========RESULTADO=========");
        System.out.println("--------------------------------");
        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
            System.out.println("o Numero " + primeiroNumero + " é o maior dentre todos");
        } else  if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
            System.out.println("o Numero " + segundoNumero + " é o maior dentre todos");
        } else  if (terceiroNumero > segundoNumero && terceiroNumero > primeiroNumero) {
            System.out.println("o Numero " + terceiroNumero + " é o maior dentre todos");
        }
        System.out.println("--------------------------------");
        if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero) {
            System.out.print("o Numero " + primeiroNumero + " é o menor dentre todos\n");
        } else  if (segundoNumero < primeiroNumero && segundoNumero < terceiroNumero) {
            System.out.print("o Numero " + segundoNumero + " é o menor dentre todos\n");
        } else  if (terceiroNumero < segundoNumero && terceiroNumero < primeiroNumero) {
            System.out.print("o Numero " + terceiroNumero + " é o menor dentre todos\n");
        }
        scanner.close();
    }
}


