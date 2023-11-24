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
public class RecintoRepteis extends Recinto{
    private boolean aquatico;
    private float temperatura;
    private float umidade;
    private double areaRecinto;

    public RecintoRepteis(boolean aquatico, float temperatura, float umidade, double areaRecinto, String tipoVegetação, boolean diurno, ArrayList<String> idAnimaisAlocados, String familia) {
        super(tipoVegetação, diurno, idAnimaisAlocados, familia);
        this.aquatico = aquatico;
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.areaRecinto = areaRecinto;
    }

    public RecintoRepteis() {
    }

    public boolean isAquatico() {
        return aquatico;
    }

    public void setAquatico(boolean aquatico) {
        this.aquatico = aquatico;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getUmidade() {
        return umidade;
    }

    public void setUmidade(float umidade) {
        this.umidade = umidade;
    }

    public double getAreaRecinto() {
        return areaRecinto;
    }

    public void setAreaRecinto(double areaRecinto) {
        this.areaRecinto = areaRecinto;
    }
    
    @Override
    public String toString() {
        return "Reptíl";
    }
}
