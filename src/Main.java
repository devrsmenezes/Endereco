public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Flores", 123, "São Paulo");
        Cliente cliente = new Cliente("João Silva", endereco);

        cliente.exibirDados();
    }
}
