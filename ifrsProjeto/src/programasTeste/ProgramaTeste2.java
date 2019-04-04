/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programasTeste;

import pessoas.Professor;
/**
 *
 * @author coelho
 */
public class ProgramaTeste2 {

    public static void main(String[] args) {
        Professor coelho;
        String nome;
        long siape;
        String[] areas;
        
        nome = "Rafael Vieira Coelho";
        siape = 1804250;
        areas = new String[3];
        
        areas[0] = "Programação de Computadores";
        areas[1] = "Redes de Computadores";
        areas[2] = "Segurança de Sistemas";
        
        
        coelho = new Professor(nome, siape, areas);
    }
}
