import java.lang.annotation.Annotation;

public class Main {
    public static void imprimirNomeTabela(Class<?> classe) {
        Annotation annotation = classe.getAnnotation(Tabela.class);

        if (annotation != null) {
            Tabela tabela = (Tabela) annotation;
            System.out.println("Nome da Tabela: " + tabela.nome());
        } else {
            System.out.println("A classe não possui a anotação @Tabela");
        }
    }

    public static void main(String[] args) {
        Class<?> classeCarro = Carro.class;
        imprimirNomeTabela(classeCarro);
    }
}