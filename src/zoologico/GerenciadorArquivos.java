/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Vinicius
 */
public class GerenciadorArquivos {
    private static ArrayList<Animal> animais = new ArrayList<Animal>();
    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private static ArrayList<Recinto> recintos = new ArrayList<Recinto>();
    
    private static ObjectOutputStream outputFileAnimal;
    private static ObjectInputStream  inputFileAnimal;
    private static ObjectOutputStream outputFileFuncionario;
    private static ObjectInputStream  inputFileFuncionario;
    private static ObjectOutputStream outputFileRecinto;
    private static ObjectInputStream  inputFileRecinto;

    public GerenciadorArquivos(ObjectInputStream  inputFileAnimal, ObjectInputStream  inputFileFuncionario, ObjectInputStream  inputFileRecinto){
        GerenciadorArquivos.inputFileAnimal = inputFileAnimal;
        GerenciadorArquivos.inputFileFuncionario = inputFileFuncionario;
        GerenciadorArquivos.inputFileRecinto = inputFileRecinto;
    }
    
    
    
    public void adicionarObjeto(int escolheFile, Object obj) {
        switch (escolheFile) {
            case 0:
                animais.add((Animal) obj);
                break;
            case 1:
                funcionarios.add((Funcionario) obj);
                break;
            case 2:
                recintos.add((Recinto) obj);
                break;
        }
        
    }
    
    public void removerObjeto(int escolheFile, Object obj) {
        switch (escolheFile) {
            case 0:
                animais.remove((Animal) obj);
                break;
            case 1:
                funcionarios.remove((Funcionario) obj);
                break;
            case 2:
                recintos.remove((Recinto) obj);
                break;
        }
    }
    
    public void editarObjeto(String path, String id) {
        
    }
    
    public void importarArquivos() {
        
       // FileInputStream fis = new FileInputStream("outputFile");
        //ObjectInputStream input = new ObjectInputStream(new FileInputStream("outputFile"));
        
        //input = new FileInputStream("./arquivos/animais.txt");
        Object obj1 = null;
        
        
        try {
            while((obj1 = inputFileAnimal.readObject()) != null){
                Animal animal = (Animal) obj1;
                animais.add(animal);
            }
        }
        catch (FileNotFoundException e) {} 
        catch (IOException | ClassNotFoundException e) {}
        
        Object obj2 = null;
        try {
            while((obj2 = inputFileFuncionario.readObject()) != null){
                Funcionario funcionario = (Funcionario) obj2;
                funcionarios.add(funcionario);
            }
        }
        catch (FileNotFoundException e) {} 
        catch (IOException | ClassNotFoundException e) {}
        
        Object obj3 = null;
        try {
            while((obj3 = inputFileRecinto.readObject()) != null){
                Recinto recinto = (Recinto) obj3;
                recintos.add(recinto);
            }
        }
        catch (FileNotFoundException e) {} 
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try {
            outputFileAnimal = new ObjectOutputStream(new FileOutputStream("./arquivos/animais.txt"));
            outputFileFuncionario = new ObjectOutputStream(new FileOutputStream("./arquivos/funcionarios.txt"));
            outputFileRecinto = new ObjectOutputStream(new FileOutputStream("./arquivos/recintos.txt"));
        } catch (IOException e) {}
        
        System.out.println(animais);
        System.out.println(funcionarios);
        System.out.println(recintos);
    }
    
    public void exportarArquivos() throws Exception {
        for (int i = 0; i < animais.size(); i++) {
            //ObjectOutputStream outputFileAnimal = new ObjectOutputStream(new FileOutputStream("./arquivos/animais.txt"));
            outputFileAnimal.writeObject(animais.get(i));
        }
        for (int j = 0; j < funcionarios.size(); j++) {
            //ObjectOutputStream outputFileAnimal = new ObjectOutputStream(new FileOutputStream("./arquivos/funcionarios.txt"));
            outputFileFuncionario.writeObject(funcionarios.get(j));
        }
        for (int k = 0; k < recintos.size(); k++) {
            //ObjectOutputStream outputFileAnimal = new ObjectOutputStream(new FileOutputStream("./arquivos/recintos.txt"));
            outputFileRecinto.writeObject(recintos.get(k));
        }
    }

    public static ArrayList<Animal> getAnimais() {
        return animais;
    }

    public static ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public static ArrayList<Recinto> getRecintos() {
        return recintos;
    }
    
    
    
    
}
