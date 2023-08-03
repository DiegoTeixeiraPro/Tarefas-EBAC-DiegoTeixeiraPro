package Program;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String dataAbertura;

    public PessoaJuridica(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.dataAbertura = dataAbertura;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
