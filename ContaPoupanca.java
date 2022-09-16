package meubanco.contas;

import meubanco.clientes.Cliente;

public class ContaPoupanca extends Conta{

    //*Declaracao das variaveis
   protected double renda;
   protected int carenciaDias;

   //*Metodo debitar criado p/conta poupanca com estrutura condicional determinante
    void debitar ( double valor ) {
        double debito = valor;

    if (carenciaDias<90){
            saldo = (saldo*0.0038) - debito;
        }
    else{
            saldo = saldo- debito;
        }
    }

    //*Construtores referencia da superclasse Conta
   public ContaPoupanca(Cliente cliente, double valor) {

    }
    public ContaPoupanca(Cliente cliente, double valor, double v, int i) {
    }
}

