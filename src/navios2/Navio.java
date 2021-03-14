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
public class Navio {
    
    String matricula, nome;
    float comprimento;
    
    public Navio(String matricula, String nome, float comprimento){
        this.matricula = matricula;
        this.nome = nome;
        this.comprimento = comprimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }  

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }   
    
}
