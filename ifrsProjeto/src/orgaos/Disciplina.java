
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orgaos;

import pessoas.*;

/**
 *
 * @author 05200254
 */
public class Disciplina {
    private Aluno[] alunos = new Aluno[30];
    private Professor tutor;
    private String Nome;
    private int ano;
    private double notas[];
    
    public boolean registraNota(double notaARegistrar, String nomeDoAluno){
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] != null && alunos[i].getNome().equalsIgnoreCase(nomeDoAluno)){
                notas[i] = notaARegistrar;
                return true;
            }
        }
        return false;
    }
    
    public boolean novoAluno(Aluno aluno){
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] == null){
                alunos[i] = aluno;
                return true;
            }
        }
        return false;
    }
    
    public boolean removerAluno(Aluno alunoASerRemovido){
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] == alunoASerRemovido){
                alunos[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public boolean alterarNota(double novaNota, Aluno alunoDaNota){
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] == alunoDaNota){
                notas[i] = novaNota;
                return true;
            }
        }
        return false;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getTutor() {
        return tutor;
    }

    public void setTutor(Professor tutor) {
        this.tutor = tutor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    
    
}
