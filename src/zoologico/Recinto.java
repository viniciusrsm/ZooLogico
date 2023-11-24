/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author Vinicius
 */
public abstract class Recinto implements Serializable {
    String recintoId = UUID.randomUUID().toString();
    protected String familia;
    protected String tipoVegetação;
    protected boolean diurno;
    
    protected ArrayList<String> idAnimaisAlocados;
    
    public Recinto() {}

    public Recinto(String tipoVegetação, boolean diurno) {
        this.tipoVegetação = tipoVegetação;
        this.diurno = diurno;
    }
    
    public Recinto(String tipoVegetação, boolean diurno, ArrayList<String> idAnimaisAlocados, String familia) {
        this.tipoVegetação = tipoVegetação;
        this.diurno = diurno;
        this.idAnimaisAlocados = idAnimaisAlocados;
        this.familia = familia;
    }

    public String getRecintoId() {
        return recintoId;
    }

    public ArrayList<String> getAnimaisAlocados() {
        return idAnimaisAlocados;
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
    
    public void alocarAnimal(String idAnimal) {
        idAnimaisAlocados.add(idAnimal);
    }
    
    public void desalocarAnimal(String idAnimal) {
        idAnimaisAlocados.remove(idAnimal);
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }
    
    
    
}
