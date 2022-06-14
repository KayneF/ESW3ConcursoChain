package controller;

import model.Candidato;

public interface IPontuacao {

    int calculaPontuacao(Candidato c);
    void proximoCalculo(Candidato c);

}