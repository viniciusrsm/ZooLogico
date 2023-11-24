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
public class Veterinario extends Funcionario {
    private String crmv;
    private ArrayList<String> idAnimaisResponsavel;

    public Veterinario() {
    }

    public Veterinario(String crmv, ArrayList<String> animais, String nome, String cpf, String dataNascimento, String sexo, String senha) {
        super(nome, cpf, dataNascimento, sexo, senha);
        this.crmv = crmv;
        this.idAnimaisResponsavel = animais;
    }
    
    public void criarAnimal(String animalId) {
        idAnimaisResponsavel.add(animalId);
    }
    
    public void removerAnimal(String animalId) {
        idAnimaisResponsavel.remove(animalId);
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }
    
    @Override
    public String getCr() {
        return crmv;
    }

    public ArrayList<String> getIdAnimaisResponsavel() {
        return idAnimaisResponsavel;
    }

    public void setIdAnimaisResponsavel(ArrayList<String> idAnimaisResponsavel) {
        this.idAnimaisResponsavel = idAnimaisResponsavel;
    }
    
    
}
