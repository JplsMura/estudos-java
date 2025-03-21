package estruturarepeticao;

public class ChamadaDeClassStaticExample {
    public static void main(String[] args) {
        Integer cpf = 1234654684;

        String cpfConvertido = Utils.transformIntegerToString(cpf);
        System.out.println(cpfConvertido);
    }
}
