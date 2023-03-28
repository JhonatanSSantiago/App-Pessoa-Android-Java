package com.jhonssantiago.pessoa;

/* Implementar uma classe Pessoa, com atributos: nome, idade, sexo, escolaridade, peso e altura. */
public class Pessoa {
    private String nome;
    private int idade;
    private Character sexo;
    private String escolaridade;
    private double peso;
    private double altura;

    private String cargo;

    private String eleitor;

    private String IMC;

    public Pessoa(String nome, int idade, Character sexo, String escolaridade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.escolaridade = escolaridade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCargo() {
        if (getSexo().equals('F')&&getIdade()<25&&getEscolaridade().equals("médio"))
            return cargo = "Recepcionista";
        if (getSexo().equals('M')&&getIdade()>40&&getEscolaridade().equals("fundamental"))
            return cargo = "Servente";
        if (getSexo().equals('M')||getSexo().equals('F')&&getIdade()<30&&getEscolaridade().equals("superior"))
            return cargo = "Auxiliar de RH";
        return cargo = "sem cargo";
    }

    public String getEleitor() {
        if (getIdade()<16)
            return eleitor = "Não Eleitor";
        if (getIdade()>=18&&getIdade()<=65)
            return eleitor = "Eleitor Obrigatório";
        if(getIdade()>=16&&getIdade()<=17||getIdade()>65);
            return eleitor = "Eleitor Facultativo";
    }

    public String getIMC() {
        double resultado = getPeso() / (getAltura() * getAltura());
        double imc = (double) (Math.round(resultado * 10.0) / 10.0);
        if (imc < 18.5)
          return  IMC = "Você está abaixo do peso ideal.";
        if (imc >= 18.5 && imc <= 24.9)
           return IMC = "Parabéns, você está em seu peso normal.";
        return IMC = "Você está acima de seu peso (sobrepeso).";
    }

    @Override
    public String toString() {
        return " Nome: "+ nome +"\n Idade: "+idade+"\n Sexo: "+sexo+"\n Escolaridade: "+escolaridade+
                "\n Peso: "+peso+"\n Altura: "+altura+"\n Eleitor: "+getEleitor()+"\n IMC: "+getIMC()+"\n Cargo: "+getCargo();
    }
}
