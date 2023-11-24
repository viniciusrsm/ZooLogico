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
    private ArrayList<Animal> animaisResponsavel;

    public Veterinario() {
    }

    public Veterinario(String crmv, ArrayList<Animal> animais, String nome, String cpf, String dataNascimento, String sexo, String senha) {
        super(nome, cpf, dataNascimento, sexo, senha);
        this.crmv = crmv;
        this.animaisResponsavel = animais;
    }
    
    public void criarAnimal(Animal animal) {
        animaisResponsavel.add(animal);
    }
    
    public void removerAnimal(Animal animal) {
        animaisResponsavel.remove(animal);
    }
    
    @Override
    public String getCr() {
        return crmv;
    }
    
    public void setCr(String cr) {
        this.crmv = cr;
    };
}
