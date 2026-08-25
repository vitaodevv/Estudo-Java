package DF4;

public class NinjaAvancado extends NinjaBasico implements Ninja{

    String especialidade;

    public NinjaAvancado(String nome, int idade, String habilidade, TipoHabilidades tipo, String especialidade) {
        super(nome, idade, habilidade, tipo);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Tipo de Habilidade: " + tipo);
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Ativei " + habilidade);
    }
}
