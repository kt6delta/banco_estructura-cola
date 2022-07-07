
import java.awt.EventQueue;
class Main {
  public static void main(String[] args) {
    Cola i = new Cola();
    for(int l=1; l<6 ; l++){//frame.Getstart()
      i.Insert(l);
   }
    //System.out.println("Nodo ingresado");
    i.DeployCola();
    //i.Serch();
    //i.Change();
    //System.out.println("Nodo change");
    //i.DeployCola();
    //i.Delete();
    //i.DeployCola();
  }
}