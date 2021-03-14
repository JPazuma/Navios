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
public class NavioPetroleiro extends Navio {
    float capCarga;
    
    public NavioPetroleiro(String matricula, String nome, float comprimento, float capCarga){
        super(matricula, nome, comprimento);
        this.capCarga = capCarga;
    }

    public float getCapCarga() {
        return capCarga;
    }

    public void setCapCarga(float capCarga) {
        this.capCarga = capCarga;
    }    
}
