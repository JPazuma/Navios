/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navios2;

/**
 *
 * @author 8ctia
 */
public class NavioPortaContentores extends Navio {
    
    int numMaxContentores;
    
    public NavioPortaContentores(String matricula, String nome, float comprimento, int numMaxContentores){
        super(matricula, nome, comprimento);
        this.numMaxContentores = numMaxContentores;
    }

    public int getNumMaxContentores() {
        return numMaxContentores;
    }

    public void setNumMaxContentores(int numMaxContentores) {
        this.numMaxContentores = numMaxContentores;
    }
}
