/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

// Implementação da classe dos animais
// São armazenados além de suas informações próprias, um ID gerado automaticamente, um recinto no qual está alocado, e os CPFs dos veterinários que tem acesso ao animal

/**
 *
 * @author Vinicius
 */
public class Animal implements Serializable {
    String AnimalId = UUID.randomUUID().toString();
    private String especie;
    private String nome;
    private String sexo;
    private String dataNascimento;
    private String historico;
    private String cuidadosEspeciais;
    private boolean venenoso;
    private String tipoSanguineo;
    
    private Recinto recinto;
    private ArrayList<String> CpfVeterinariosResponsaveis;

    public Animal() {
    }

    public Animal(String especie, String nome, String sexo, String dataNascimento, 
            String historico, String cuidadosEspeciais, boolean venenoso, String tipoSanguineo, Recinto recinto, ArrayList<String> CpfVeterinariosResponsaveis) {
        this.especie = especie;
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.historico = historico;
        this.cuidadosEspeciais = cuidadosEspeciais;
        this.venenoso = venenoso;
        this.tipoSanguineo = tipoSanguineo;
        this.recinto = recinto;
        this.CpfVeterinariosResponsaveis = CpfVeterinariosResponsaveis;
    }

    public String getAnimalId() {
        return AnimalId;
    }

    public ArrayList<String> getVeterinariosResponsaveis() {
        return CpfVeterinariosResponsaveis;
    }

    public void adicionarCpfVeterinario(String cpf) {
        this.CpfVeterinariosResponsaveis.add(cpf);
    }
    
    public void removerCpfVeterinario(String cpf) {
        this.CpfVeterinariosResponsaveis.remove(cpf);
    }

    public Recinto getRecinto() {
        return recinto;
    }

    public void setRecinto(Recinto recinto) {
        this.recinto = recinto;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getCuidadosEspeciais() {
        return cuidadosEspeciais;
    }

    public void setCuidadosEspeciais(String cuidadosEspeciais) {
        this.cuidadosEspeciais = cuidadosEspeciais;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }
    
    
    
    
}
