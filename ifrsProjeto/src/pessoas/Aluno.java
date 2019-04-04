/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoas;

/**
 *
 * @author coelho
 */
public class Aluno {

    private String nome;
    private String curso;
    private int anoIngresso;
    private boolean ehFormado;
    private long matricula;

    public Aluno(String nome, String curso, int anoIngresso, boolean ehFormado, long matricula) {
        this.nome = nome;
        this.curso = curso;
        this.anoIngresso = anoIngresso;
        this.ehFormado = ehFormado;
        this.matricula = matricula;
    }

    public Aluno(String nome, long matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    
    
    public String verificaStatus() {
        if (ehFormado) {
            return "O aluno ainda não completou os créditos";
        }
        return "O aluno entrou no ano" + anoIngresso + "e se formou";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public boolean isEhFormado() {
        return ehFormado;
    }

    public void setEhFormado(boolean ehFormado) {
        this.ehFormado = ehFormado;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
}

