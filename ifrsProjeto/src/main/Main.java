/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

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
    
    public static boolean opcaoNaoValida(int opcao, int minimo, int maximo){
        return opcao < minimo || opcao > maximo;
    }
    
    public static void escreveBinario(Object escrito, String fileName){
        List<Aluno> alunos = new ArrayList();
        try{
            File f = new File(fileName);
            if(!f.exists()){
                f.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(f); ObjectOutputStream oos = new ObjectOutputStream(fos)){
                oos.writeObject(escrito);
            } catch(IOException e){
                System.out.println(e);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) throws IOException {
        Aluno[] alunos = new Aluno[5];
        Professor[] professores = new Professor[5];
        
        /*System.out.println("1 para colocar alunos");
        for(int i = 0; i < 5; i++){
            alunos[i] = new Aluno(lerTexto(), 222);
        }*/
        SetorEnsino ensino = new SetorEnsino("Pamela", "Vitao", alunos);
        String nome;
        Professor professorAtual = null;
        Aluno alunoAtual = null;
        boolean emConta = false;
        int opcao = 0;
        
        do{
            if(!emConta){        
                System.out.println("[1]Para aluno, [2]Para Professor, [3]Para Setor de Ensino e [0]Para sair");
                opcao = (int) lerNumero();
                if(opcaoNaoValida(opcao, 0, 3)){
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
                                        Funcoes.aluno(alunoAtual, ensino);
                                        break;
                                    }}}
                            break;
                        case 2:
                            System.out.println("Qual seu nome?");
                            nome = pedeNome();
                            professores = ensino.getProfessores();
                            for(Professor professor : professores){
                                if(professor != null){
                                    System.out.println(professor.getNome().equalsIgnoreCase(nome));
                                    if(professor.getNome().equalsIgnoreCase(nome)){
                                        professorAtual = professor;
                                        System.out.println("Nome válido");
                                        Funcoes.professor(professorAtual, ensino);
                                        break;
                                    }}}
                            
                            break;
                        case 3:
                            System.out.println("informe o nome do coordenador ou diretor: ");
                            nome = lerTexto();
                            if(nome.equalsIgnoreCase(ensino.getCoordenador()) || nome.equalsIgnoreCase(ensino.getDiretor())){
                                Funcoes.setorDeEnsino(ensino);
                            }
                            break;
                    }
                }
            }
        }while(opcao != 0);
        escreveBinario(ensino, "ensino.bin");
        
    
}

}