package meubanco.operacoes;

import meubanco.contas.Conta;
import java.util.Scanner;

public class Deposito extends OperacaoMesmoBanco {

    //*Declaracao de variaveis e criacao de objetos pedidos no comando do exercicio 14
    protected double valor;
    protected String confirmacao;
    Conta contaDestino=new Conta(new String("contadeDestino"));

    //*Criacao do objeto ler da classe Scanner para receber dados do teclado(do usuario)
    Scanner ler=new Scanner(System.in);

    public void realizar() {

        //*Apresentação no caixa eletronico
        System.out.println("Realize aqui sua opcao de Deposito:\n");

        //*Entrada e saida dos dados necessarios para o deposito
        System.out.println("Insira os dados da Conta de Destino:\n");

        System.out.println("Informe o valor que deseja depositar: \n ");
        valor=ler.nextDouble();
        System.out.println("Observacao: Utilize somente notas de 20, 50 e 100 reais, e lembre de conferir se estao desdobradas.\n");

        //*Confirmacao do valor do deposito na tela do caixa
        System.out.println("Confirme(Caso o valor esteja correto, tecle s, caso nao esteja, tecle n), o valor que deseja depositar e de:"+valor+"?");
        confirmacao=ler.next();

        //*estrutura condicional que depende da confirmacao do cliente quanto ao valor do deposito e fim do programa
        if(confirmacao == "s"){
            System.out.println("Pronto! Foi depositado um valor de:"+valor+"em sua conta!\n");
        }
        else{
            System.out.println("Por favor, reinicie o programa e tente realizar outra operacao de deposito. \n");
        }
    }
}
