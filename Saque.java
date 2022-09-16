package meubanco.operacoes;

import meubanco.contas.Conta;
import java.util.Scanner;

public class Saque extends OperacaoMesmoBanco {

    //*Declaracao de variaveis e criacao de objetos pedidos no comando do exercicio 14
    protected double valor;
    protected String confirmacao;
    Conta contaOrigem=new Conta("contaOrigem");

    //*Criacao do objeto ler da classe Scanner para receber dados do teclado(do usuario)
    Scanner ler= new Scanner(System.in);

    public void realizar() {

        //*Apresentação no caixa eletronico
        System.out.println("Realize aqui sua opcao de Saque:\n");

        //*Entrada e saida dos dados necessarios para o Saque
        System.out.println("Primeiramente, informe o numero da Conta de origem do Saque:\n");

        System.out.println("Agora, digite o valor que deseja sacar:\n");
        valor=ler.nextDouble();

        //*Confirmacao do valor do saque na tela do caixa
        System.out.println("Por favor confirme(Se a reposta for que o valor esta correto, tecle s, se estiver errado, tecle n), o valor que deseja sacar e de:"+valor+"?\n");

        //*estrutura condicional que depende da confirmacao do cliente quanto ao valor do saque e fim do programa
        if(confirmacao=="s"){
            System.out.println("Esta feito! Retire na boca do caixa o seu valor de: "+valor+" Reais \n");
        }
       else{
           System.out.println("Por favor, reinicie o programa e inicie outra operacao de Saque. \n");
        }
    }
}
