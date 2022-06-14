package view;

import controller.CalculaEnsinoMedio;
import controller.IPontuacao;
import model.Candidato;

public class Main {
    public static void main(String[] args) {

        Candidato c = new Candidato();
        c.setId(1);
        c.setNome("Pedro Alvares Cabral");
        c.setEnsinoMedioPublico(true);
        c.setEnsinoSuperiorCompleto(true);
        c.setAnosRegistroEntidadeClasse(3);
        c.setAnosExperiencia(2);
        c.setPontosProva(60);

        IPontuacao pontuacao = new CalculaEnsinoMedio();
        pontuacao.proximoCalculo(c);

        System.out.println(c);
    }
}
