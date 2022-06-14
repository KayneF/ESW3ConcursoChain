package controller;

import model.Candidato;

public class CalculaEnsinoMedio implements IPontuacao{
    @Override
    public int calculaPontuacao(Candidato c) {
        int pontos = 0;
        if (c.isEnsinoMedioPublico()) {
            pontos += 5;
        }
        return c.getPontosProva() + pontos;
    }

    @Override
    public void proximoCalculo(Candidato c) {
        c.setPontosProva((int) calculaPontuacao(c));

        CalculaEnsinoSuperior ensinoSuperior = new CalculaEnsinoSuperior();
        ensinoSuperior.proximoCalculo(c);
    }
}
