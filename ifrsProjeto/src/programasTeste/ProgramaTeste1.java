/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programasTeste;

import pessoas.Aluno;
/**
 *
 * @author coelho
 */
public class ProgramaTeste1 {

    public static void main(String[] args) {
        String nome, curso;
        int anoIngresso;
        boolean ehFormado;
        long matricula;
        nome = "Maria da Graça Souza";
        curso = "Análise e Desenvolvimento de Sistemas (ADS)";
        anoIngresso = 2013;
        ehFormado = true;
        matricula = 154090;
        Aluno maria = new Aluno(nome, curso, anoIngresso, ehFormado, matricula);
    }
}
