package controller;

import model.Candidato;

public class CalculaExperiencia implements IPontuacao{
    @Override
    public int calculaPontuacao(Candidato c) {
        int pontos = 0;
        for (int i = 0; i < c.getAnosExperiencia(); i++) {
            pontos += 2;
        }
        return c.getPontosProva() + pontos;
    }

    @Override
    public void proximoCalculo(Candidato c) {
        c.setPontosProva((int) calculaPontuacao(c));
    }
}
