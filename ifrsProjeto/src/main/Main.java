/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import javax.sound.midi.Soundbank;
import orgaos.SetorEnsino;
import pessoas.Aluno;
/**
 *
 * @author 05200254
 */
public class Main {
    
    
    
    public static Scanner s = new Scanner(System.in);
    
    public static double lerNumero(){
        return s.nextDouble();
    }
    
    public static String lerTexto(){
        return s.nextLine();
    }
    
    public static void main(String[] args) {
        SetorEnsino ensino = new SetorEnsino("Pamela", "Vitao");
        int opcao;
        Aluno[] alunos;
        
        do{
            
            System.out.println("[1]Para aluno, [2]Para Professor, [3]Para Setor de Ensino e [0]Para sair");
            opcao = (int) lerNumero();
            
            if(opcao < 0 && opcao > 3){
                System.err.println("Opção inválida");
            }else if(opcao != 0){
                if(opcao == 1){
                    System.out.print("Qual seu nome?");
                    String nome = lerTexto();
                    
                    alunos = ensino.getAlunos();
                    for(Aluno aluno : alunos){
                        if(aluno.getNome().equalsIgnoreCase(nome)){
                            Aluno alunoAtual;
                            alunoAtual = aluno;
                        }
                    }
                    
                }
                
                
            }
            
        }while(opcao != 0);
        
    }
}
