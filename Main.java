public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana");
        pessoa.identificacao();

        PessoaFisica pessoaFisica = new PessoaFisica("Gisele", "123.456.789.00");
        pessoaFisica.identificacao();

        PessoaFisica pessoaFisica2 = new PessoaFisica("Fábio", "222.444.555.88");
        pessoaFisica2.identificacao("99384939349");

    }
}