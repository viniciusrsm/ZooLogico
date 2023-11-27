/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import java.util.ArrayList;

// Implementação da classe dos biólogos
// Possui uma CRBio e os IDs dos recintos que ele é responsável e tem acesso

/**
 *
 * @author Vinicius
 */
public class Biologo extends Funcionario {
    private String crbio;
    private ArrayList<String> idRecintosResponsavel;

    public Biologo() {
    }
    
    public Biologo(String crbio, ArrayList<String> idRecintosResponsavel, String nome, String cpf, String dataNascimento, String sexo, String senha) {
        super(nome, cpf, dataNascimento, sexo, senha);
        this.crbio = crbio;
        this.idRecintosResponsavel = idRecintosResponsavel != null ? idRecintosResponsavel : new ArrayList<String>();
    }
    
    public void adicionarIdRecinto(String idRecinto) {
        idRecintosResponsavel.add(idRecinto);
    }
    
    public void removerIdRecinto(String idRecinto) {
        idRecintosResponsavel.remove(idRecinto);
    }
    
    public ArrayList<String> getIdRecintosResponsavel() {
        return this.idRecintosResponsavel;
    }

    public void setIdRecintosResponsavel(ArrayList<String> idRecintosResponsavel) {
        this.idRecintosResponsavel = idRecintosResponsavel;
    }
    
    @Override
    public String getCr() {
        return crbio;
    }
    
    public void setCr(String cr) {
        this.crbio = cr;
    };
    
}
