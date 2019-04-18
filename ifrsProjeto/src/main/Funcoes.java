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


/**
 *
 * @author 05200254
 */
public class Funcoes {
    private static int opcao;
    Curso[] cursos = null;
    Disciplina[] disciplinas = null;

    public static void setorDeEnsino(SetorEnsino ensino) throws IOException {    
        String ppc, nomeDoCursoDoAluno, nomeDoAluno, cursoDoAluno;
        int anoDeIngrssoDoAluno;
        long matriculaAluno;
        
        do{
            
            System.out.println("[1] Matricular aluno\n [2] Cadastrar professor \n   [3] Demitir professor");
            opcao = Integer.parseInt(Main.lerTexto());
            if(opcao == 1){
                System.out.print("PPC do curso: ");
                ppc = Main.lerTexto();
                System.out.print("Nome do curso: ");
                nomeDoCursoDoAluno = Main.lerTexto();
                System.out.print("Nome do Aluno: ");
                nomeDoAluno = Main.lerTexto();
                System.out.print("Matricula: ");
                matriculaAluno = Long.parseLong(Main.lerTexto());
               
            }
            
        }while(2 == 3);  
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
