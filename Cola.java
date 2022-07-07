import java.util.Scanner;
public class Cola{
  Scanner sc = new Scanner(System.in);
  private Nodo first;
  private Nodo last;
  private int num_deal=4;
  private int idClient;
  private int deal;
  int lugar=1;
  GUI n = new GUI();
  
  public Cola(){
    first= null;
    last= null;
    n.setVisible(true);
    for(int i=0; i<9; i++){
    }
  }
  
  public void Insert(int id_client){
    Nodo new1= new Nodo();
    new1.deal = (int)(Math.random()*8+1); //entre 1- 8 transacciones
    new1.id_client=id_client;
    new1.posicion=id_client;
    switch(posicion){
      case 1:
        n.id1.setText(String.valueOf(new1.id_client));
        n.deal1.setText(String.valueOf(new1.deal));
        break;
      case 2:
        n.id2.setText(String.valueOf(new1.id_client));
        n.deal2.setText(String.valueOf(new1.deal));
        break;
      case 3:
        n.id3.setText(String.valueOf(new1.id_client));
        n.deal3.setText(String.valueOf(new1.deal));
        break;
      case 4:
        n.id4.setText(String.valueOf(new1.id_client));
        n.deal4.setText(String.valueOf(new1.deal));
        break;
      case 5:
        n.id5.setText(String.valueOf(new1.id_client));
        n.deal5.setText(String.valueOf(new1.deal));
        break;
      case 6:
        n.id6.setText(String.valueOf(new1.id_client));
        n.deal6.setText(String.valueOf(new1.deal));
        break;
      case 7:
        n.id7.setText(String.valueOf(new1.id_client));
        n.deal7.setText(String.valueOf(new1.deal));
        break;
      case 8:
        n.id8.setText(String.valueOf(new1.id_client));
        n.deal8.setText(String.valueOf(new1.deal));
        break;
      case 9:
        n.id9.setText(String.valueOf(new1.id_client));
        n.deal9.setText(String.valueOf(new1.deal));
        break;
    }
    if(first == null){
      first= new1;
      last=new1;
      first.next=first;
    }
  else{
    last.next=new1;
    new1.next= first;
    last= new1;
  }
  }

  public void DeployCola(){
    Nodo Actual= new Nodo();
    Actual = first;
    if(first != null){
      do{
        System.out.println(Actual.id_client+" "+Actual.deal);
        Actual= Actual.next;
      }while(Actual != first);
    }else{
      System.out.println("Lista vacia");
    }
  }

  public void Change(){//-4 deals
     Nodo Actual= new Nodo();
    Actual = first;
    boolean find = false;
    
    if(first != null){
      do{
        if(Actual.deal > num_deal ){
          Actual.deal=Actual.deal-num_deal;
           find = true;
        }
        Actual= Actual.next;
      }while(Actual != first);
      if(!find){
        System.out.println("No encontrado");
      }
    }else{
      System.out.println("Lista vacia");
    }
  }

  public void Delete(){
    Nodo Actual= new Nodo();
    Actual = first;
    Nodo Anterior = new Nodo();
    Anterior =null;
    boolean find=false;
    
    if(first != null){
      do{
        if(Actual.deal <= num_deal){
         System.out.println("\n nodo encontrado");
          if(Actual== first){
            first= first.next;
            last.next = first;            
          }else if(Actual == last){
            Anterior.next = first;
            last = Anterior;            
          }else{
            Anterior.next = Actual.next;
          }
          System.out.println("nodo Eliminado");
          find = true;
        }
        Anterior= Actual;
        Actual=Actual.next;
      }while(Actual!= last);
      
      if(!find){
        System.out.println("No encontrado");
      }
    }else{
      System.out.println("Lista vacia");
    }
  }
  
  public void SetIdClient(int idClient){
    this.idClient=idClient;
  }
  public int GetidClient(){
    return idClient;
  }
  public void Setdeal(int deal){
    this.deal=deal;
  }
  public int Getdeal(){
    return deal;
  }
}