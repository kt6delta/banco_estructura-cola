import java.awt.EventQueue;
class Main {
  public static void main(String[] args) {
    Cola c = new Cola();
    
    //for(int i=0; i<4; i++){ 
      int num= (int)(Math.random()*3+1);
      for(int l=1; l<11 ; l++){
        c.Insert(l);
        try{
          Thread.sleep(500);
        }catch(InterruptedException e ) {}
      }
      c.DeployCola();
    //}
    
  }
}