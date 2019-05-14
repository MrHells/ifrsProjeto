/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orgaos;

import java.io.Serializable;
import pessoas.Aluno;
import pessoas.Professor;

/**
 *
 * @author 05200254
 */
public class SetorEnsino implements Serializable{
    private Curso[] cursos;
    private Professor[] professores;
    private Aluno[] alunos;
    private String diretor;
    private String coordenador;

    public SetorEnsino(Curso[] cursos, Professor[] professores, String diretor, String coordenador) {
        this.cursos = cursos;
        this.professores = professores;
        this.diretor = diretor;
        this.coordenador = coordenador;
    }
    public SetorEnsino(String diretor, String coordenador) {
        cursos = new Curso[5];
        professores = new Professor[60];
        alunos = new Aluno[30];
        this.diretor = diretor;
        this.coordenador = coordenador;
    }
    public SetorEnsino(String diretor, String coordenador, Aluno[] alunos) {
        cursos = new Curso[5];
        professores = new Professor[60];
        this.alunos = alunos;
        this.diretor = diretor;
        this.coordenador = coordenador;
    }
    public boolean novoProfessor(Professor novoProfessor){
        for(int i = 0; i < professores.length; i++){
            if(professores[i] == null){
                professores[i] = novoProfessor;
                return true;
            }
            
        }
        return true;
    }
    
    public boolean novoCurso(Curso novoCurso){
        for(int i = 0; i < cursos.length; i++){
            if(cursos[i] == null){
                cursos[i] = novoCurso;
                return true;
            }
        }
        return false;  
    }
    
    public boolean removerCurso(Curso cursoParaRemover){
        for(int i = 0; i < cursos.length; i++){
            if(cursos[i] == cursoParaRemover){
                cursos[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public boolean demitirProf(Professor professorParaDemitir){
        for(int i = 0; i < professores.length; i++){
            if(professores[i] == professorParaDemitir){
                professores[i] = null;
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
    
    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }   
}
