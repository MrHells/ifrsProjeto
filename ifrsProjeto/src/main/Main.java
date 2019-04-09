/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import orgaos.Curso;
import orgaos.Disciplina;

import orgaos.SetorEnsino;
import pessoas.Aluno;
import pessoas.Professor;
/**
 *
 * @author 05200254
 */
public class Main {
    
    
    static BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
    
    //public static Scanner s = new Scanner(System.in);
    
    public static double lerNumero() throws IOException{
        return Double.parseDouble(lerTexto());
    }
    
    public static String lerTexto() throws IOException{
        return s.readLine();
    }
    public static String pedeNome() throws IOException{        
        System.out.print("Qual seu nome?");
        return lerTexto();

    }
    public static void main(String[] args) throws IOException {
        Aluno[] alunos = new Aluno[5];
        Professor[] professores = new Professor[5];
        for(int i = 0; i < 5; i++){
            alunos[i] = new Aluno(lerTexto(), 222);
        }
        SetorEnsino ensino = new SetorEnsino("Pamela", "Vitao", alunos);
        String nome;
        Aluno alunoAtual;
        boolean emConta = false;
        int opcao = 0, tipoDeUsuario = opcao;
        
        do{
            if(!emConta){
                System.out.println("[1]Para aluno, [2]Para Professor, [3]Para Setor de Ensino e [0]Para sair");
                opcao = (int) lerNumero();
                if(opcao < 0 || opcao > 3){
                    System.err.println("Opção inválida");
                }else if(opcao != 0){
                    switch (opcao) {
                        case 1:
                            nome = pedeNome();
                            alunos = ensino.getAlunos();
                            for(Aluno aluno : alunos){
                                if(aluno != null){
                                    System.out.println(aluno.getNome().equalsIgnoreCase(nome));
                                    if(aluno.getNome().equalsIgnoreCase(nome)){
                                        
                                        alunoAtual = aluno;
                                        System.out.println("Nome válido");
                                        emConta = true;
                                        break;
                                    }}}
                            break;
                        case 2:
                            System.out.println("Qual seu nome?");
                            nome = pedeNome();
                            professores = ensino.getProfessores();
                            for(Aluno aluno : alunos){
                                if(aluno != null){
                                    System.out.println(aluno.getNome().equalsIgnoreCase(nome));
                                    if(aluno.getNome().equalsIgnoreCase(nome)){
                                        
                                        alunoAtual = aluno;
                                        System.out.println("Nome válido");
                                        emConta = true;
                                        break;
                                    }}}
                            
                            break;
                        default:
                            System.out.println("informe o nome do coordenador ou diretor: ");
                            nome = lerTexto();
                            nome = lerTexto();
                            break;
                    }
                }
            }else{
                tipoDeUsuario = opcao;
                System.out.println("[0]Sair do usuário\n[1]verSuaNota\n[2]receberBomDia");
                opcao = (int) lerNumero();
                
            }
        }while(opcao != 0);
        
    
}
}