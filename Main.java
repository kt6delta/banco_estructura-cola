class Main {
  public static void main(String[] args) {
    Cola c = new Cola();
    int l=1;
    for(l=1; l<6; l++){//4
      c.Insert(l);
      //c.DeployCola();
    }
    c.DeployCola();
    System.out.println("");
    c.Change();
    
    /*
    System.out.println("");
    for(int i=1; true; i++){
      int num = (int)(Math.random()*4+2); //2-4
      for(int n=1; n<num; n++){
        c.Insert(l);
        l++;
        //c.DeployCola();
      }
    }
   */ 
  }
}