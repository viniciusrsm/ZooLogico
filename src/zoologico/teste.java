/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoologico;

/**
 *
 * @author Vinicius
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class teste {
  public static void main(String[] args) throws Exception {
    ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("./arquivos/animais.txt", true));
    ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("./arquivos/animais.txt"));

    Object obj = null;
    
    Person fds = new Person();
    fds.setFirstName("cu");
    
    o.writeObject(fds);

    while ((obj = inputStream.readObject()) != null) {
      if (obj instanceof Person) {
        System.out.println(((Person) obj).toString());
      }
    }
    inputStream.close();
  }
}

class Person implements Serializable {

  private String firstName;

  private String lastName;

  private int age;

  public Person() {
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String toString() {
    StringBuffer buffer = new StringBuffer();
    buffer.append(firstName);
    buffer.append("\n");
    buffer.append(lastName);
    buffer.append("\n");
    buffer.append(age);
    buffer.append("\n");

    return buffer.toString();
  }
}