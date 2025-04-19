public class Saudacao {

    // Método que retorna uma string
    public String getMensagem() {
        return "Olá, mundo!";
    }

    // Método principal para testar
    public static void main(String[] args) {
        Saudacao saudacao = new Saudacao();
        String mensagem = saudacao.getMensagem();
        System.out.println(mensagem);
    }
}
