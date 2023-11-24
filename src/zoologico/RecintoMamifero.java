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
public class RecintoMamifero extends Recinto {
    private boolean possuiPoleiro;
    private boolean aquatico;
    private boolean arboricolas;
    private double areaTotal;

    public RecintoMamifero(boolean possuiPoleiro, boolean aquatico, boolean arboricolas, double areaTotal, String tipoVegetação, boolean diurno, ArrayList<String> idAnimaisAlocados, String familia) {
        super(tipoVegetação, diurno, idAnimaisAlocados, familia);
        this.possuiPoleiro = possuiPoleiro;
        this.aquatico = aquatico;
        this.arboricolas = arboricolas;
        this.areaTotal = areaTotal;
    }

    public RecintoMamifero() {
    }

    public boolean isPossuiPoleiro() {
        return possuiPoleiro;
    }

    public void setPossuiPoleiro(boolean possuiPoleiro) {
        this.possuiPoleiro = possuiPoleiro;
    }

    public boolean isAquatico() {
        return aquatico;
    }

    public void setAquatico(boolean aquatico) {
        this.aquatico = aquatico;
    }

    public boolean isArboricolas() {
        return arboricolas;
    }

    public void setArboricolas(boolean arboricolas) {
        this.arboricolas = arboricolas;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }
    
    @Override
    public String toString() {
        return "Mamífero";
    }
    
}
