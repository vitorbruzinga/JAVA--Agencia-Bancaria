package meubanco.investimentos;

public class Investimento{

    //*Declaracao das variaveis
protected float capital_inicial;
protected float porcentagem_lucro;

    //*1 Construtor criado
    public Investimento( float novoCapital, float novaPorcentagemLucro){
capital_inicial=novoCapital;
porcentagem_lucro=novaPorcentagemLucro;
}
    //*2 Construtor criado
    public Investimento(float novoCapital){
capital_inicial=novoCapital;
}
    //*1 Metodo criado
    public float getCapitalInicial(){
   return capital_inicial;    
}
    public void setCapitalInicial(){
capital_inicial=capital_inicial;
}
    //*2 Metodo criado
    public float getPorcentagemlucros(){
return porcentagem_lucro;    
}
    public void setPorcentagemlucros(){
    porcentagem_lucro=porcentagem_lucro;
}
}
