
class Main {
  public static void main(String[] args) {
    Cola c = new Cola();
    
    for(int l=1; l<4; l++){
      c.Insert(l);
    }
    //System.out.println("Nodo ingresado");
    c.DeployCola();
     for(int i=1; true; i++){
       int num = (int)(Math.random()*4+2); //2-4
       for(int l=1; l<num; l++){
        c.Insert(l);
      }
    }
    //i.Serch();
    //i.Change();
    //System.out.println("Nodo change");
    //i.DeployCola();
    i.Delete();
    System.out.println("Nodo delete");
    i.DeployCola();
    
  }
}