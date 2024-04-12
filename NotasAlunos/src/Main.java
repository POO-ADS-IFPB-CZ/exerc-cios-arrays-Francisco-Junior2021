import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numAlunos = 10;

        double[] notas = new double[numAlunos];

        System.out.println("Digite as notas dos " + numAlunos + " alunos:");
        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }


        NotasAlunosLogic notasLogic = new NotasAlunosLogic();


        notasLogic.calcularMediaEContar(notas);


        scanner.close();
    }
}
