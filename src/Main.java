import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite 1 para calular a área de um quadrado");
            System.out.println("Digite 2 para calcular a área de um circulo");

            int escolha = leitura.nextInt();

            if(escolha == 1) {
                System.out.println("Digite o lado do quadrado: ");
                int ladoQuadrado = leitura.nextInt();
                int area = ladoQuadrado * ladoQuadrado;

                System.out.println("A área do quadrado é: " + area);
            } else if (escolha == 2) {
                System.out.println("Digite o raio do circulo: ");
                int raioDoCirculo = leitura.nextInt();
                double area = 3.14 * (raioDoCirculo * raioDoCirculo);

                System.out.println("A área do circulo é: " + area);
            } else  {
                System.out.println("Opção não disponível.");
            }
        }
    }
