package meubanco.funcionarios;

public class Funcionario{

    //*Declaracao das variaveis
    protected String nome;
    protected String cpf;

    //*1 Construtor de objetos criado
    public Funcionario(String nomeDoNovoFuncionario, String novoCpf){
        
    nome=nomeDoNovoFuncionario; 
    cpf=novoCpf;
}
    //*2 Construtor de objetos criado
    public Funcionario(String nomeDoNovoFuncionario){
nome=nomeDoNovoFuncionario;        
}
    //*1 Metodo criado
    public String getNome(){
return nome;    
}
    public void setNome(){
nome = nome;    
}
    //*2 Metodo criado
    public String getCpf(){
return cpf;    
}
    public void setCpf(){
cpf=cpf;    
}
}
