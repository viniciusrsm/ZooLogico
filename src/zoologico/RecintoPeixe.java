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
public class RecintoPeixe extends Recinto {
    private double volumeAquario;
    private float temperaturaAgua;
    private float phAgua;
    private boolean osseo;

    public RecintoPeixe(double volumeAquario, float temperaturaAgua, float phAgua, boolean osseo, String tipoVegetação, boolean diurno, ArrayList<String> idAnimaisAlocados, String familia) {
        super(tipoVegetação, diurno, idAnimaisAlocados, familia);
        this.volumeAquario = volumeAquario;
        this.temperaturaAgua = temperaturaAgua;
        this.phAgua = phAgua;
        this.osseo = osseo;
    }

    public RecintoPeixe() {
    }

    public double getVolumeAquario() {
        return volumeAquario;
    }

    public void setVolumeAquario(double volumeAquario) {
        this.volumeAquario = volumeAquario;
    }

    public float getTemperaturaAgua() {
        return temperaturaAgua;
    }public void setTemperaturaAgua(float temperaturaAgua) {
        this.temperaturaAgua = temperaturaAgua;
    }

    public float getPhAgua() {
        return phAgua;
    }

    public void setPhAgua(float phAgua) {
        this.phAgua = phAgua;
    }

    public boolean isOsseo() {
        return osseo;
    }

    public void setOsseo(boolean osseo) {
        this.osseo = osseo;
    }
    
    @Override
    public String toString() {
        return "Peixe";
    }
}
