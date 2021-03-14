/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navios2;

import java.util.ArrayList;

/**
 *
 * @author 8ctia
 */
public class Porto {
    ArrayList<Navio> navios;
    ArrayList<NavioPortaContentores> naviosPortaContentores;
    ArrayList<NavioPetroleiro> naviosPetroleiro;
    
    public boolean newNavio(String matricula, String nome, float comprimento){
        Navio navio = new Navio(matricula, nome, comprimento);
        for(int i = 0; i < navios.size(); i++){
            if(matricula.equals(navios.get(i).getMatricula())){
                System.out.println("Matricula existente");
                return false;
            }
        }
        navios.add(navio);
        return true;
    }
    
    public int ContentoresMaximos(){
        int resultado = 0;
        for(int i = 0; i < naviosPortaContentores.size(); i++){
            resultado += naviosPortaContentores.get(i).getNumMaxContentores();
        }
    }
}
