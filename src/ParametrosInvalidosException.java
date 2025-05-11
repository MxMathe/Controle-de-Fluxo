public class ParametrosInvalidosException extends Exception {
    // Construtor padrão
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
