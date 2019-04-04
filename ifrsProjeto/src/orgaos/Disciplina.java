
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
    Aluno[] alunos;
    Professor tutor;
    String Nome;
    int ano;
    double notas[];
    
    public void registraNota(double notaARegistrar, String nomeDoAluno){
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] != null && alunos[i].getNome().equalsIgnoreCase(nomeDoAluno)){
                notas[i] = notaARegistrar;
            }
        }
    }
    
    public void novoAluno(Aluno aluno){
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] == null){
                alunos[i] = aluno;
            }
        }
    }
    
    public void removerAluno(Aluno alunoASerRemovido){
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] == alunoASerRemovido){
                alunos[i] = null;
            }
        }
    }
    
    public void alterarNota(double novaNota, Aluno alunoDaNota){
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] == alunoDaNota){
                notas[i] = novaNota;
            }
        }
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
