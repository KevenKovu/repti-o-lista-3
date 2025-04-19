public class ClasseExterna {
    public String retornaString() {
        return "Olá, mundo!";
    }
}

public class Main {
    public static void main(String[] args) {
        ClasseExterna objeto = new ClasseExterna();
        String mensagem = objeto.retornaString();
        System.out.println(mensagem);
    }
}