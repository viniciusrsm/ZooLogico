/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

// Classe abstrata que dá origem e base para os diferentes tipos de recintos

/**
 *
 * @author Vinicius
 */
public abstract class Recinto implements Serializable {
    String recintoId = UUID.randomUUID().toString();
    protected String familia;
    protected String tipoVegetação;
    protected boolean diurno;
    
    protected ArrayList<String> cpfBiologosResponsaveis;
    
    public Recinto() {}

    public Recinto(String tipoVegetação, boolean diurno) {
        this.tipoVegetação = tipoVegetação;
        this.diurno = diurno;
    }
    
    public Recinto(String tipoVegetação, boolean diurno, String familia, ArrayList<String> cpfBiologosResponsaveis) {
        this.tipoVegetação = tipoVegetação;
        this.diurno = diurno;
        this.familia = familia;
        this.cpfBiologosResponsaveis = cpfBiologosResponsaveis;
    }

    public String getRecintoId() {
        return recintoId;
    }

   

    public ArrayList<String> getBiologosResponsaveis() {
        return cpfBiologosResponsaveis;
    }

    public void adicionarCpfBiologo(String cpf) {
        this.cpfBiologosResponsaveis.add(cpf);
    }
    
    public void removerCpfBiologo(String cpf) {
        this.cpfBiologosResponsaveis.remove(cpf);
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
    
    

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }
    
    
    
}
