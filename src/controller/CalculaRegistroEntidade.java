package controller;

import model.Candidato;

public class CalculaRegistroEntidade implements IPontuacao{
    @Override
    public int calculaPontuacao(Candidato c) {
        int pontos = 0;
        for (int i = 0; i < c.getAnosRegistroEntidadeClasse(); i++) {
            pontos += 1;
        }
        return c.getPontosProva() + pontos;
    }

    @Override
    public void proximoCalculo(Candidato c) {
        c.setPontosProva((int) calculaPontuacao(c));

        CalculaExperiencia experiencia = new CalculaExperiencia();
        experiencia.proximoCalculo(c);
    }
}
