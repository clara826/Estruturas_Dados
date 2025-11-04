package dao;

/**
 * ExceÃ§Ã£o lanÃ§ada quando uma operaÃ§Ã£o tenta acessar ou remeover
 * elementos em uma estrutura de dados que estÃ¡ vazia
 *
 * @author Ana Clara Costa Sousa
 * @version 1.0
 * @since 20/10/2025
 */
public class UnderflowException extends RuntimeException {
    /**
     * Construtor que cria uma exceÃ§Ã£o com a mensagem especificada
     *
     * @param mensagem a mensagem de erro
     */
    public UnderflowException(String mensagem) {
        super(mensagem);
    }
}