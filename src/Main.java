import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double porHora;
        double horasPorMes;
        double total;

        System.out.print("Digite quantos voce ganha por hora: R$");
        porHora = sc.nextDouble();

        System.out.print("Digite quantas horas você trabalha por mes: ");
        horasPorMes = sc.nextDouble();

        total = porHora * horasPorMes;

        System.out.printf("Voce ganha R$ %.2f", total, " por mes");

    }
}