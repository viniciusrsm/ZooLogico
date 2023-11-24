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

    public Veterinario(String crmv, ArrayList<String> idAnimaisResponsavel, String nome, String cpf, String dataNascimento, String sexo, String senha) {
        super(nome, cpf, dataNascimento, sexo, senha);
        this.crmv = crmv;
        this.idAnimaisResponsavel = idAnimaisResponsavel != null ? idAnimaisResponsavel : new ArrayList<String>();
    }
    
    public void adicionarIdAnimal(String animalId) {
        System.out.println(this.idAnimaisResponsavel);
        this.idAnimaisResponsavel.add(animalId);
    }
    
    public void removerIdAnimal(String animalId) {
        this.idAnimaisResponsavel.remove(animalId);
    }
    
    public ArrayList<String> getIdAnimaisResponsavel() {
        return this.idAnimaisResponsavel;
    }
    
    @Override
    public String getCr() {
        return this.crmv;
    }
    
    @Override
     public void setCr(String cr) {
        this.crmv = cr;
    };
    
    
    
   
}
