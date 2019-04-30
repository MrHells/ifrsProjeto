/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import orgaos.Curso;
import orgaos.Disciplina;
import orgaos.SetorEnsino;
import pessoas.Aluno;
import pessoas.Professor;
import programasTeste.CriaProfeOuAluno;

/**
 *
 * @author 05200254
 */
public class Funcoes {
    private static int opcao;
    Curso[] cursos = null;
    Disciplina[] disciplinas = null;

    public static void setorDeEnsino(SetorEnsino ensino) throws IOException {     
        do{
            
            System.out.println("[1] Matricular aluno\n [2] Cadastrar professor \n   [3] Demitir professor");
            opcao = Integer.parseInt(Main.lerTexto());
            switch (opcao) {
                case 1:
                    System.out.print("Nome do curso: ");
                    String nomeDoCursoDoAluno = Main.lerTexto();
                    Aluno aluno = programasTeste.CriaProfeOuAluno.criaAluno();
                    for(Curso curso : ensino.getCursos()){
                        if(curso.getNome().equals(nomeDoCursoDoAluno)){
                            aluno.setCurso(curso);
                            for(Disciplina disciplina : curso.getDisciplinas()){
                                disciplina.novoAluno(aluno);
                            }
                        }
                    }
                    break;
                case 2:
                    Professor prof = programasTeste.CriaProfeOuAluno.criaProfessor();
                    ensino.novoProfessor(prof);
                    break;
                case 3:
                    System.out.println("Nome do professor que deve ser demitido");
                    String nomeDoProf = Main.lerTexto();
                    for(Professor professor : ensino.getProfessores()){
                        if(professor.getNome().equals(nomeDoProf)){
                            ensino.demitirProf(professor);
                        }
                    }
                    break;
                default:
                    break;
            }
            
        }while(opcao != 0);
    }
    
    
    
    public static void professor(Professor professorAtual, SetorEnsino ensino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void aluno(Aluno alunoAtual, SetorEnsino ensino) throws IOException {
        Disciplina disciplinaDoUsuario = null;
        Curso cursoDoUsuario;
        Curso[] cursos;
        
        cursos = ensino.getCursos();
        for(Curso curso : cursos){
            for(Disciplina disciplina : curso.getDisciplinas()){
                System.out.println("1");
                for(Aluno aluno : disciplina.getAlunos()){
                    if(aluno == alunoAtual){
                        cursoDoUsuario = curso;
                        disciplinaDoUsuario = disciplina;
                        break;
                    }
                }
            }
        }
        
        do{
            System.out.println("[1]Ver nota \n [2] consultar ppc"); 
            opcao = (int) Main.lerNumero();
            if(opcao == 1){
                Aluno[] alunos = disciplinaDoUsuario.getAlunos();
                for(int i = 0; alunos.length > i; i++){
                    if(alunos[i] == alunoAtual){
                        System.out.println("sua nota é: " + disciplinaDoUsuario.getNotas()[i]);
                    }
                }
            }
            
            
        }while(opcao != 0 );
    }
}
