import java.util.Scanner;
public class Cola{
  Scanner sc = new Scanner(System.in);
  private Nodo first;
  private Nodo last;
  private int num_deal=4;
  int lugar=1;
  GUI n = new GUI();
  
  public Cola(){
    first= null;
    last= null;
    n.setVisible(true);
  }
  
  public void Insert(int id_client){
    Nodo new1= new Nodo();
    new1.deal = (int)(Math.random()*8+1); //entre 1- 8 transacciones
    new1.id_client=id_client;
    new1.posicion=id_client;
    //System.out.println(new1.id_client+" "+new1.deal);
    switch(new1.posicion){
      case 1:
        n.id1.setText(String.valueOf("id:"+new1.id_client));
        n.deal1.setText(String.valueOf("tr:"+new1.deal));
        break;
      case 2:
        n.id2.setText(String.valueOf("id:"+new1.id_client));
        n.deal2.setText(String.valueOf("tr:"+new1.deal));
        break;
      case 3:
        n.id3.setText(String.valueOf("id:"+new1.id_client));
        n.deal3.setText(String.valueOf("tr:"+new1.deal));
        break;
      case 4:
        n.id4.setText(String.valueOf("id:"+new1.id_client));
        n.deal4.setText(String.valueOf("tr:"+new1.deal));
        break;
      case 5:
        n.id5.setText(String.valueOf("id:"+new1.id_client));
        n.deal5.setText(String.valueOf("tr:"+new1.deal));
        break;
      case 6:
        n.id6.setText(String.valueOf("id:"+new1.id_client));
        n.deal6.setText(String.valueOf("tr:"+new1.deal));
        break;
      case 7:
        n.id7.setText(String.valueOf("id:"+new1.id_client));
        n.deal7.setText(String.valueOf("tr:"+new1.deal));
        break;
      case 8:
        n.id8.setText(String.valueOf("id:"+new1.id_client));
        n.deal8.setText(String.valueOf("tr:"+new1.deal));
        break;
      case 9:
        n.id9.setText(String.valueOf("id:"+new1.id_client));
        n.deal9.setText(String.valueOf("tr:"+new1.deal));
        break;
       case 10:
        n.id10.setText(String.valueOf("id:"+new1.id_client));
        n.deal10.setText(String.valueOf("tr:"+new1.deal));
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

  public void DeployCola(){ //ir corriendo la fila
    Nodo Actual= new Nodo();
    Nodo Anterior = new Nodo();
    Anterior =null;
    Actual = first;
    boolean find = false;
    
    if(first != null){
      do{
        //
        switch(Actual.posicion){
          case 0:
            if(Actual.deal > num_deal ){ //modifica
              Actual.deal=Actual.deal-num_deal;
              Actual.posicion= last.posicion;
              find = true;
            }
            else{ //elimina
              if(Actual== first){
                first= first.next;
                last.next = first;            
              }
              else if(Actual == last){
                  Anterior.next = first;
                  last = Anterior;            
                }
              else{
                  Anterior.next = Actual.next;
                }
              find = true;
            }
            break;
          case 1:
            n.id1.setText(String.valueOf("id:"+Actual.id_client));
            n.deal1.setText(String.valueOf("tr:"+Actual.deal));
            break;
          case 2:
            n.id2.setText(String.valueOf("id:"+Actual.id_client));
            n.deal2.setText(String.valueOf("tr:"+Actual.deal));
            break;
          case 3:
            n.id3.setText(String.valueOf("id:"+Actual.id_client));
            n.deal3.setText(String.valueOf("tr:"+Actual.deal));
            break;
          case 4:
            n.id4.setText(String.valueOf("id:"+Actual.id_client));
            n.deal4.setText(String.valueOf("tr:"+Actual.deal));
            break;
          case 5:
            n.id5.setText(String.valueOf("id:"+Actual.id_client));
            n.deal5.setText(String.valueOf("tr:"+Actual.deal));
            break;
          case 6:
            n.id6.setText(String.valueOf("id:"+Actual.id_client));
            n.deal6.setText(String.valueOf("tr:"+Actual.deal));
            break;
          case 7:
            n.id7.setText(String.valueOf("id:"+Actual.id_client));
            n.deal7.setText(String.valueOf("tr:"+Actual.deal));
            break;
          case 8:
            n.id8.setText(String.valueOf("id:"+Actual.id_client));
            n.deal8.setText(String.valueOf("tr:"+Actual.deal));
            break;
          case 9:
            n.id9.setText(String.valueOf("id:"+Actual.id_client));
            n.deal9.setText(String.valueOf("tr:"+Actual.deal));
            break;
      }
        Anterior= Actual;
        //Anterior.posicion=Actual.posicion--;
        Actual= Actual.next;
        System.out.println(Actual.next+""+Actual.id_client+" "+Actual.deal +" "+Actual.posicion);
        try{
          Thread.sleep(500);
        }catch(InterruptedException e ) {}
      }while(Actual != first);
      if(!find){
        System.out.println("No encontrado");
      }
    }
    else{
      System.out.println("Lista vacia");
    }
  }
  
}