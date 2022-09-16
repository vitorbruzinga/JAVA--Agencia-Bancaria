package meubanco.clientes;

public class PessoaFisica extends Cliente {

    //*variavel exclusiva do cliente do tipo pessoa fisica
   protected float cpf;

    //*Construtor referencia da superclasse Cliente
    public PessoaFisica(String newname) {
        super(newname);
    }
}
