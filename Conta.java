package meubanco.contas;
import meubanco.clientes.Cliente;

public class Conta {

    //*Declaracao das variaveis iniciais
protected double saldo; protected Cliente titular; protected boolean ativa;

//*Construtores de bjetos criados para referenciar outras questoes
    public Conta( double contaOrigem) {}
    public Conta(Object contaOrigem) {
        super();
    }
//*

    //*1 Metodo criado
    void encerrar( ) {
    
     if (saldo >= 0){
          debitar(saldo);
          } else{
         creditar( saldo*(-1) );
     }
     ativa = false;
 }

 //*2 metodo criado
 void creditar( double valor ) { 
     double credito = valor;
     saldo = saldo + credito;
 }

 //*3 metodo criado
 void debitar ( double valor ) { 
double debito = valor; 
saldo = saldo- debito; 
} 

//*Construtor de objetos a partir da classe Conta
public Conta ( ) {
 ativa = true; 
}

//*Tambem um construtor de objetos a partir da classe Conta
public Conta (Cliente cliente, double valor ) {

 ativa = true;
saldo = valor; 
titular = cliente;
    }

    //*4 metodo criado
    public double getSaldo(){

        return saldo;
    }
    public void setSaldo()
    {
        saldo = saldo;
    }

    //*5 metodo criado
    public Cliente getTitular(){

        return titular;
    }
    public void setTitular()
    {
        titular=titular;
    }
}