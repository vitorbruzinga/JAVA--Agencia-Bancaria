package meubanco.minhaagencia;

import meubanco.clientes.Cliente;
import meubanco.contas.Conta;
import meubanco.contas.ContaCorrente;
import meubanco.contas.ContaPoupanca;

public class AgenciaBancaria {

    public static void main (String args[]){

        Conta c = new Conta(new Cliente("Henrique"),2000);
        ContaCorrente cc = new ContaCorrente( new Cliente("Francisco") , 2000);
        ContaPoupanca cp = new ContaPoupanca( new Cliente("Felipe") , 2000 , 1.2/100 , 90);

        Conta c2 = new Conta(new Cliente("Flavia"),2000);
        ContaCorrente cc2 = new ContaCorrente(new Cliente("Anita"),2000);
        ContaPoupanca cp2 = new ContaPoupanca(new Cliente("Debora"),2000 , 1.2/100 , 50 );

    }
    public static void exercicio7(){
   
        Conta[] contas=new Conta[10];
    
 contas [0] = new Conta(new Cliente("Henrique"),2000);

contas [1] = new ContaCorrente( new Cliente("Francisco"),2000); 

contas [2] = new ContaPoupanca( new Cliente("Felipe") , 2600 , 1.2/100 , 90); 

contas [3] = new Conta(new Cliente("Flavia"),2000); 

contas [4] = new ContaCorrente(new Cliente("Anita"), 2000); 

contas [5] = new ContaPoupanca(new Cliente("Debora"), 2000 , 1.2/100, 50 ); 

contas [6] = new Conta(new Cliente("carlos"), 2000); 

contas[7] = new ContaCorrente(new Cliente("Matheus"),2000); 

contas [8] = new Conta(new Cliente("Maria"),2000); 

contas [9] = new ContaCorrente(new Cliente("Gabrie1"),2000); 

for (int x = 0; x <contas.length ; x++){ 
        
       System.out.println(contas [x].getSaldo());

}
 }
    public static void exercicio8(){

        int x=0;
        double ttSaldos=0;
         
        Conta[] contas=new Conta[10];
    
 contas [0] = new Conta(new Cliente("Henrique"),2000);

contas [1] = new ContaCorrente( new Cliente("Francisco"),2000); 

contas [2] = new ContaPoupanca( new Cliente("Felipe") , 2600 , 1.2/100 , 90); 

contas [3] = new Conta(new Cliente("Flavia"),2000); 

contas [4] = new ContaCorrente(new Cliente("Anita"), 2000); 

contas [5] = new ContaPoupanca(new Cliente("Debora"), 2000 , 1.2/100, 50 ); 

contas [6] = new Conta(new Cliente("carlos"), 2000); 

contas[7] = new ContaCorrente(new Cliente("Matheus"),2000); 

contas [8] = new Conta(new Cliente("Maria"),2000); 

contas [9] = new ContaCorrente(new Cliente("Gabrie1"),2000); 

while(x < contas.length) {
    ttSaldos += contas[x].getSaldo();
    x++;
}
}
    public static void exercicio9(){

        Cliente[] clientes = new Cliente[5];

        clientes[0] = new Cliente("Cliente1","Endereco1",'M');
        clientes[1] = new Cliente("Cliente2","Endereco2",'M');
        clientes[2] = new Cliente("Cliente3","Endereco3",'M');
        clientes[3] = new Cliente("Cliente4","Endereco4",'M');
        clientes[4] = new Cliente("Cliente5","Endereco5",'M');

        Conta[] contas = new Conta[10];

        int clienteAtual= 0;
        int contadorContas = 0;

        for(int x = 0; x < 10; x++){
            contadorContas++;
            if(contadorContas > 2){
                clienteAtual++;
                contadorContas = 1;
            }
            contas[x] = new Conta( clientes[clienteAtual] , 200 * x );
        }

        for(int y = 0 ; y < contas.length; y++){
            System.out.println(contas[y].getTitular().getNome() +" - "+ contas[y].getSaldo());
        }


    }
    public static void exercicio10(){

            Cliente[] clientes = new Cliente[5];

            clientes[0] = new Cliente("Cliente1","Endereco1",'M');
            clientes[1] = new Cliente("Cliente2","Endereco2",'M');
            clientes[2] = new Cliente("Cliente3","Endereco3",'M');
            clientes[3] = new Cliente("Cliente4","Endereco4",'M');
            clientes[4] = new Cliente("Cliente5","Endereco5",'M');

            Conta[] contas = new Conta[10];

            int clienteAtual= 0;

            for(int x = 0; x < 10; x++){
                contas[x] = new Conta( clientes[clienteAtual] , 200 * x );
                clienteAtual += x%2;
            }

            for(int y = 0 ; y < contas.length; y++){
                System.out.println(contas[y].getTitular().getNome() +" - "+ contas[y].getSaldo());
            }
    }
}




















    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    



  