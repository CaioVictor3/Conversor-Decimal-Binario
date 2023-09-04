import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1 - Converter de Decimal para Binário");
            System.out.println("2 - Converter de Binário para Decimal");
            System.out.println("3 - Sair");
            System.out.println("Qual opção você deseja?");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite um número");
                    int num = scanner.nextInt();
                    int quociente, resto;
                    String binario = "";
                    do {
                        quociente = num / 2;
                        resto = num % 2;
                        num = quociente;
                        binario += resto;

                        if (num == 1) {
                            binario += num;
                        }
                    } while (num != 1);
                    String binarioInvertido = new StringBuilder(binario).reverse().toString();
                    System.out.println("O número binário é: " + binarioInvertido);
                    break;

                case 2:
                    int decimal = 0;
                    int potencia = 0;
                    System.out.println("Digite um número binário");
                    String binarioStr = scanner.next();
                    for (int i = binarioStr.length() - 1; i >= 0; i--) {
                        int digito = Character.getNumericValue(binarioStr.charAt(i));
                        decimal += digito * Math.pow(2, potencia);
                        potencia++;
                    }
                    System.out.println("O número decimal é: " + decimal);
                    break;
            }
        } while (opcao != 3);
    }
}