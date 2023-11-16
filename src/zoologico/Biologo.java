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
public class Biologo extends Funcionario {
    private String crbio;
    private ArrayList<Recinto> recintosResponsavel;

    public Biologo(String crbio, ArrayList<Recinto> recintos, String nome, String cpf, String dataNascimento, String sexo, String senha) {
        super(nome, cpf, dataNascimento, sexo, senha);
        this.crbio = crbio;
        this.recintosResponsavel = recintos;
    }
    
    public Biologo() {
    }

    
    
    public void adicionarRecinto(Recinto recinto) {
        recintosResponsavel.add(recinto);
    }
    
    public void removerRecinto(Recinto recinto) {
        recintosResponsavel.remove(recinto);
    }

    public String getCrbio() {
        return crbio;
    }

    public void setCrbio(String crbio) {
        this.crbio = crbio;
    }
    
    @Override
    public String getCr() {
        return crbio;
    }
    
}
