import javax.swing.JOptionPane;

class Gato
  {
    String name;
    String color;
    float peso;

    Gato()
    {
      System.out.println("hola amigos, he nacido!!!");
    }
    
    void maullar()
    {
      JOptionPane.showMessageDialog(null, "Miau miauuuuu");       }
    void saltar()
    {
      JOptionPane.showMessageDialog(null, "The cat is jumping");       
    }
    void mostrar()
    {
      System.out.println("Los datos de "+ this.name+ " son:" );
      System.out.println("color:" + this.color );
      System.out.println("peso:" + this.peso );
    }
    
  }