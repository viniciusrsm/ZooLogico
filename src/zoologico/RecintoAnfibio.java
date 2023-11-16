/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import java.util.ArrayList;

/**
 *
 * @author Vinicius
 */
public class RecintoAnfibio extends Recinto {
    private float umidade;
    private double volumeTerrario;
    private float temperaturaTerrario;

    public RecintoAnfibio() {
    }

    public RecintoAnfibio(float umidade, double volumeTerrario, float temperaturaTerrario, String tipoVegetação, boolean diurno, ArrayList<Animal> animais, String familia) {
        super(tipoVegetação, diurno, animais, familia);
        this.umidade = umidade;
        this.volumeTerrario = volumeTerrario;
        this.temperaturaTerrario = temperaturaTerrario;
    }

    public float getUmidade() {
        return umidade;
    }

    public void setUmidade(float umidade) {
        this.umidade = umidade;
    }

    public double getVolumeTerrario() {
        return volumeTerrario;
    }

    public void setVolumeTerrario(double volumeTerrario) {
        this.volumeTerrario = volumeTerrario;
    }

    public float getTemperaturaTerrario() {
        return temperaturaTerrario;
    }

    public void setTemperaturaTerrario(float temperaturaTerrario) {
        this.temperaturaTerrario = temperaturaTerrario;
    }

    @Override
    public String toString() {
        return "Anfíbio";
    }
    
    
}
