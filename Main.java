
class Main {
  public static void main(String[] args) {
    Cola i = new Cola();
    i.DeployCola();//colocar boton que devuelva bolean y colocar en l<=4
    for(int l=1; l<=4; l++){
      i.Insert(l);
    }
    System.out.println("\n Nodo ingresado");
    i.DeployCola();
    //i.Serch();
    i.Change();
    i.DeployCola();
    //i.Delete();
    
  }
}