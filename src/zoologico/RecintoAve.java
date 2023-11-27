/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import java.util.ArrayList;

// Extensão da classe recinto que apresenta 2 novas características exclusivas

/**
 *
 * @author Vinicius
 */
public class RecintoAve extends Recinto {
    private boolean possuiPoleiro;
    private double volumeAviario;

    public RecintoAve(boolean possuiPoleiro, double volumeAviario, String tipoVegetação, boolean diurno, ArrayList<String> idAnimaisAlocados, String familia, ArrayList<String> cpfBiologosResponsaveis) {
        super(tipoVegetação, diurno, familia, cpfBiologosResponsaveis);
        this.possuiPoleiro = possuiPoleiro;
        this.volumeAviario = volumeAviario;
    }

    public RecintoAve() {
    }

    public boolean isPossuiPoleiro() {
        return possuiPoleiro;
    }

    public void setPossuiPoleiro(boolean possuiPoleiro) {
        this.possuiPoleiro = possuiPoleiro;
    }

    public double getVolumeAviario() {
        return volumeAviario;
    }

    public void setVolumeAviario(double volumeAviario) {
        this.volumeAviario = volumeAviario;
    }
    
    @Override
    public String toString() {
        return "Ave";
    }
    
}
