//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
            public static void main(String[] args) {
                int numeroInteiro = 22;
                float numeroReal = 3.14f;
                char letra = 'f';
                boolean terminou = false;

                System.out.println("Inteiro: " + numeroInteiro);
                System.out.println("Float: " + numeroReal);
                System.out.println("Char: " + letra);
                System.out.println("Lógico: " + terminou);
                System.out.println("================================");

                System.out.printf("O valor do float: %.4f \n", numeroReal);

                System.out.println("================================");
                String nome = "Java";
                float media = 8.9f;
                System.out.printf("A nota de %s é %.3f \n", nome, media);
                System.out.format("A nota de %s é %.3f \n", nome, media);

            }
        }
