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
public class ProgramaTeste {
    
    public static void main(String[] args) {
        String nome = "Jorge Adão de Albuquerque";
        String curso = "Técnico em Informática Integrado ao Ensino Médio";
        int anoIngresso = 2019;
        boolean ehFormado = false;
        long matricula = 164090;
        Aluno aluno = new Aluno(nome, curso, anoIngresso, ehFormado, matricula);
    }
}
