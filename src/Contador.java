import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Usando try-with-resources para garantir fechamento do Scanner
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminal.nextInt();


            try {
                // Chamada do método de contagem
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException exception) {
                // Tratamento da exceção customizada
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }

        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validação da regra de negócio
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
