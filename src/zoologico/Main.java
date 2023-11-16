/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Vinicius
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, Exception {
        Animal animal = new Animal();
        animal.setNome("wallison");
        animal.setDataNascimento("20/11/2003");
        
        Animal animal2 = new Animal();
        animal2.setNome("jones");
        animal2.setDataNascimento("20/11/2004");
        
        
        
        //ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("./arquivos/animais.txt"));
        
        
        
        
        //arquivo.adicionarArquivo("./arquivos/animais.txt", animal2);
        
        //System.out.println(a.size());
        
        //ArrayList<Animal> animais = arquivo.getAnimais();
        //System.out.println(animais);
        
        
        
        //arquivo.lerArquivo("./arquivos/animais.txt", args);
    }
}
