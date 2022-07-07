
class Main {
  public static void main(String[] args) {
    Cola i = new Cola();
    //colocar boton que devuelva bolean y colocar en l<=4
    for(int l=1; l<=4; l++){
      i.Insert(l);
    }
    System.out.println("Nodo ingresado");
    i.DeployCola();
    //i.Serch();
    //i.Change();
    //System.out.println("Nodo change");
    //i.DeployCola();
    i.Delete();
    System.out.println("Nodo delete");
    i.DeployCola();
    
  }
}