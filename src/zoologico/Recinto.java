/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Vinicius
 */
public abstract class Recinto implements Serializable {
    protected String familia;
    protected String tipoVegetação;
    protected boolean diurno;
    
    protected ArrayList<Animal> animaisAlocados;

    public Recinto(String tipoVegetação, boolean diurno) {
        this.tipoVegetação = tipoVegetação;
        this.diurno = diurno;
    }
    
    public Recinto(String tipoVegetação, boolean diurno, ArrayList<Animal> animais, String familia) {
        this.tipoVegetação = tipoVegetação;
        this.diurno = diurno;
        this.animaisAlocados = animais;
        this.familia = familia;
    }

    public Recinto() {
    }

    public String getTipoVegetação() {
        return tipoVegetação;
    }

    public void setTipoVegetação(String tipoVegetação) {
        this.tipoVegetação = tipoVegetação;
    }

    public boolean isDiurno() {
        return diurno;
    }

    public void setDiurno(boolean diurno) {
        this.diurno = diurno;
    }

    public ArrayList<Animal> getAnimais() {
        return animaisAlocados;
    }

    public void setAnimaisAlocados(ArrayList<Animal> animaisAlocados) {
        this.animaisAlocados = animaisAlocados;
    }
    
    
    public void alocarAnimal(Animal animal) {
        animaisAlocados.add(animal);
    }
    
    public void desalocarAnimal(Animal animal) {
        animaisAlocados.add(animal);
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }
    
    
    
}
