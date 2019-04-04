/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programasTeste;

import pessoas.Professor;
import pessoas.Aluno;

import java.util.Scanner;

/**
 *
 * @author coelho
 */
public class ProgramaTeste3 {
    public static Scanner s = new Scanner(System.in);
    
    public static void escolheuProfessor() {
        Professor professor;
        String nome;
        int quantAreas;
        long siape;
        
        System.out.print("Nome:");
        nome = s.nextLine();
        System.out.print("SIAPE:");
        siape = s.nextLong();
        System.out.print("Quantas áreas?");
        quantAreas = s.nextInt(); 
        String[] areas = new String[quantAreas];
        System.out.print("Informe as áreas:");
        for (int i = 0; i < quantAreas; i++) {
            areas[i] = s.nextLine();
        }
        
        professor = new Professor(nome, siape, areas);
    }
    
    public static void escolheuAluno(){
        String nome, curso;
        int anoIngresso;
        long matricula;
        System.out.print("Nome:");
        nome = s.nextLine();
        System.out.print("Curso:");
        curso = s.nextLine();
        System.out.print("Matricula:");
        matricula = s.nextLong();
        System.out.print("Ingresso:");
        anoIngresso = s.nextInt();    
        Aluno aluno = new Aluno(nome, curso, anoIngresso, false, matricula);
        
    }
    
    public static void main(String[] args) {
        
        System.out.println("Escolha [1] para professor e [2] para aluno:");
        int opcao = s.nextInt();
        s.nextLine();
        
        if (opcao == 1) {
            escolheuProfessor();
        } else {
            escolheuAluno();
        }
        
    }
    
    
}

