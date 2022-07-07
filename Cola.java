import java.util.Scanner;
public class Cola{
  Scanner sc = new Scanner(System.in);
  Nodo first;
  Nodo last;
  private int num_deal=4;
  
  public Cola(){
    first= null;
    last= null;
  }
  
  public void Insert(int id_client){
    Nodo new1= new Nodo();
    new1.deal = (int)(Math.random()*8+1); //entre 1- 8 transacciones
    new1.id_client=id_client;
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
        System.out.println(Actual.id_client +" "+ Actual.deal);
        Actual= Actual.next;
      }while(Actual != first);
    }else{
      System.out.println("Lista vacia");
    }
  }

  public void Serch(){
    Nodo Actual= new Nodo();
    Actual = first;
    boolean find = false;
    
    System.out.println("Ingrese el dato del nodo a buscar:");
    int serch= sc.nextInt();
    
    if(first != null){
      do{
        if(Actual.id_client == serch){
         System.out.println("\n nodo encontrado");
          find = true;
        }
        System.out.println(Actual.id_client);
        Actual= Actual.next;
      }while(Actual != first && find != true);
      if(!find){
        System.out.println("No encontrado");
      }
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
    boolean find = false;

    System.out.println("Ingrese el dato del nodo eliminar:");
    int serch= sc.nextInt();

    if(first != null){
      do{
        if(Actual.id_client == serch){
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
      }while(Actual != first && find != true);
      if(!find){
        System.out.println("No encontrado");
      }
    }else{
      System.out.println("Lista vacia");
    }
  }
}