import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {

    System.out.println("Instanciación en JAVA");
    Gato benito = new Gato();
    
    benito.color="Brown";
    benito.peso = 3.45f;
    benito.name ="Benito Bodoque";
    benito.maullar();
    benito.saltar();
    benito.mostrar();
    
    
  }
}