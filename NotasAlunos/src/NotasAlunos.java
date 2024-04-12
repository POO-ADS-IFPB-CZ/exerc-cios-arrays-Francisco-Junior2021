class NotasAlunosLogic {
    public void calcularMediaEContar(double[] notas) {
        // Calculando a média das notas
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;

        // Contando a quantidade de notas acima e abaixo da média
        int acimaDaMedia = 0;
        int abaixoDaMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaDaMedia++;
            } else if (nota < media) {
                abaixoDaMedia++;
            }
        }

        // Imprimindo a média das notas
        System.out.println("A média das notas é: " + media);

        // Imprimindo a quantidade de notas acima e abaixo da média
        System.out.println("Quantidade de notas acima da média: " + acimaDaMedia);
        System.out.println("Quantidade de notas abaixo da média: " + abaixoDaMedia);
    }
}
