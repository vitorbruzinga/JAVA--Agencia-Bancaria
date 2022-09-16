package meubanco.clientes;

public class PessoaJuridica extends Cliente {
    //*variavel exclusiva do cliente do tipo pessoa juridica
    protected float cnpj;

    //*Construtor referencia da superclasse Cliente
    public PessoaJuridica(String newname) {
        super(newname);
    }
}
