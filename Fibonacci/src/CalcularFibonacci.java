class CalcularFibonacci {
    public void printFibonacciSeries(int n) {
        int a = 1; // Primeiro elemento
        int b = 1; // Segundo elemento

        System.out.println("Os " + n + " primeiros elementos da série Fibonacci são:");
        System.out.print(a + ", " + b); // Imprime os dois primeiros elementos

        // Calcula e imprime os próximos elementos da série
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
    }
}
