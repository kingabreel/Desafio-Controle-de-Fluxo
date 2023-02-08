import java.util.Scanner;

public class DesafioDoControleFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numeroUm = scanner.nextInt();
        System.out.println("Digite mais um número, sendo este maior que o priomeiro: ");
        int numeroDois = scanner.nextInt();

        try {
            contarDiferenca(numeroUm, numeroDois);
        } catch (NumerosInvalidosException e){
            System.out.println("O segundo número deve ser maior que o primeiro");
        }
    }

    static void contarDiferenca(int numeroUm, int numeroDois)throws NumerosInvalidosException{
        if(numeroUm > numeroDois){
            throw new NumerosInvalidosException();
        }
        int contagem = numeroDois - numeroUm;
        for (int i = 0; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
        System.out.println("A diferença entre " + numeroUm + " e " + numeroDois + " é de " + contagem + " números");

    }
    static class NumerosInvalidosException extends Exception{}
}
