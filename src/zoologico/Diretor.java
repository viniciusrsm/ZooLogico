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
public class Diretor extends Funcionario{
    private final ArrayList<Funcionario> funcionarios;
    private final ArrayList<Animal> animaisGeral;
    private final ArrayList<Recinto> recintosGeral;

    public Diretor() {
        this.funcionarios = new ArrayList();
        this.animaisGeral = new ArrayList();
        this.recintosGeral = new ArrayList();
    }

    public Diretor(String nome, String cpf, String dataNascimento, String sexo, String senha) {
        super(nome, cpf, dataNascimento, sexo, senha);
        this.funcionarios = new ArrayList();
        this.animaisGeral = new ArrayList();
        this.recintosGeral = new ArrayList();
    }
    
    public void contratarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
    
    public void demitirFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }
    
    public void adicionarAnimal(Animal animal) {
        animaisGeral.add(animal);
    }
    
    public void removerAnimal(Animal animal) {
        animaisGeral.remove(animal);
    }
    
    public void adicionarRecinto(Recinto recinto) {
        recintosGeral.add(recinto);
    }
    
    public void removerRecinto(Recinto recinto) {
        recintosGeral.remove(recinto);
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public ArrayList<Animal> getAnimais() {
        return animaisGeral;
    }

    public ArrayList<Recinto> getRecintos() {
        return recintosGeral;
    }
    
    
    @Override
    public String getCr() {
        return "";
    }
    public void setCr(String cr) {};
}
