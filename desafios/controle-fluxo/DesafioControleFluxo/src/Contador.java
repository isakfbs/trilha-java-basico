import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();

        try {
            contar(firstNumber,secondNumber);
        }catch (Exception e){
            System.out.println("O segundo número deve ser maior que o primeiro.");
        }
}

    static void contar(int firstNumber, int secondNumber) throws ParametrosInvalidosException{
        if (firstNumber > secondNumber ){
            throw new ParametrosInvalidosException();
        }
        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}