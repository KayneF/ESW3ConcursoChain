package controller;

import model.Candidato;

public class CalculaEnsinoSuperior implements IPontuacao{
    @Override
    public int calculaPontuacao(Candidato c) {
        int pontos = 0;
        if (c.isEnsinoSuperiorCompleto()) {
            pontos += 10;
        }
        return c.getPontosProva() + pontos;
    }

    @Override
    public void proximoCalculo(Candidato c) {
        c.setPontosProva((int) calculaPontuacao(c));

        CalculaRegistroEntidade registroEntidade = new CalculaRegistroEntidade();
        registroEntidade.proximoCalculo(c);
    }
}
