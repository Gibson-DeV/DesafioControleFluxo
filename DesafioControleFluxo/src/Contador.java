import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;

        System.out.println("Informe o primeiro numero:");
        primeiroNumero = scanner.nextInt();
        System.out.println("Informe o segundo número:");
        segundoNumero = scanner.nextInt();

        try {
            contar(primeiroNumero, segundoNumero);
        }catch (ParametrosInvalidosException exception){
            System.out.println("O segundo numero deve ser maior que o primeiro");
        }
    }
    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
        if (primeiroNumero > segundoNumero) {
            throw new ParametrosInvalidosException();
        }
        int contagem = segundoNumero - primeiroNumero;

        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o numero " + i);
        }
    }
}