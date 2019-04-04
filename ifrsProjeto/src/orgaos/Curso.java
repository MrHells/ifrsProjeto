/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orgaos;

/**
 *
 * @author 05200254
 */
public class Curso {
    private String nome;
    private Disciplina[] disciplinas;
    private int ppc;
    
    public Curso(String nome, Disciplina disciplinas[], int ppc){
        this.nome = nome;
        this.disciplinas = disciplinas;
        this.ppc = ppc;
    }
    
    public void novaDisciplina(Disciplina disciplina){
        for(int i = 0; i < disciplinas.length; i++){
            if(disciplinas[i] != null){
                disciplinas[i] = disciplina;
                break;
            }
        }
    }
    
    public void removerDisc(Disciplina disciplinaParaRemover){
        for(int i = 0; i < disciplinas.length; i++){
            if(disciplinaParaRemover == disciplinas[i]){
                disciplinas[i] = null;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public int getPpc() {
        return ppc;
    }

    public void setPpc(int ppc) {
        this.ppc = ppc;
    }
    
    
}
