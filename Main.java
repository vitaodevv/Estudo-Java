package DF4;

public class Main {
    public static void main(String[] args) {

    Ninja Naruto = new NinjaBasico("Naruto", 15, "Rasengan", TipoHabilidades.NINJUTSU);
    Naruto.mostrarInformacoes();
    Naruto.executarHabilidade();
        System.out.println("\n");
    Ninja Sasuke = new NinjaAvancado("Sasuke", 16, "Sharingan", TipoHabilidades.GENJUTSU, "Susanoo");
    Sasuke.mostrarInformacoes();
    Sasuke.executarHabilidade();

    }
}
