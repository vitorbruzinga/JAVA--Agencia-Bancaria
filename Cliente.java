package meubanco.clientes;

public class Cliente {

    //*Declaracao das variaveis iniciais
    protected String nome;
   protected String endereco;
   protected char sexo;

   //*Construtor 1 de objeto a partir da classe cliente
   public Cliente (String newname, String newend, char s){
   nome=newname;
   endereco=newend;
   sexo=s;
 }
    //*Construtor 2 de objeto a partir da classe cliente
   public Cliente (String newname){

       nome=newname;

       //*1 metodo criado a partir da classe cliente
 }   
   public String getNome(){

       return nome;
 }
     public void setNome()
     {
     nome = nome;

     //*2 metodo criado a partir da classe cliente
 }
    public String getEndereco(){
    return endereco;
 }
     public void setEndereco(){
    endereco = endereco;
 }

    //*3 metodo criado a partir da classe cliente
    public char getSexo(){
return sexo;    
}
    public void setSexo(){
sexo=sexo;    
}
}
