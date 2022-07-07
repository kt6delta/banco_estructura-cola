import java.util.Scanner;
public class Cola{
  Scanner sc = new Scanner(System.in);
  Nodo first;
  Nodo last;

  public Cola(){
    first= null;
    last= null;
  }
  
  public void Insert(){
    Nodo new1= new Nodo();

    if(first == null){
      new1.id_client=0;
      first= new1;
      last=new1;
      first.next=first;
    }
  else{
    last.next=new1;
    new1.next= first;
    last= new1;
  }
    System.out.println("\n Nodo ingresado");
  }

  public void DeployCola(){
    Nodo Actual= new Nodo();
    Actual = first;
    if(first != null){
      do{
        System.out.println(Actual.id_client);
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

  public void Change(){
     Nodo Actual= new Nodo();
    Actual = first;
    boolean find = false;
    
    System.out.println("Ingrese id del nodo a modificar");
    int serch= sc.nextInt();
    
    if(first != null){
      do{
        if(Actual.id_client == serch){
         System.out.println("\n nodo encontrado");
          System.out.println("Nuevo dato para el nodo");
          Actual.id_client =sc.nextInt();
          find = true;
        }
        Actual= Actual.next;
      }while(Actual != first && find != true);
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
}