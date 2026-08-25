package DF4;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String habilidade;
    TipoHabilidades tipo;

    public NinjaBasico(String nome, int idade, String habilidade, TipoHabilidades tipo) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipo = tipo;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Tipo de Habilidade: " + tipo);
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Ativar: " + habilidade);
    }


}

