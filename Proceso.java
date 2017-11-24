import java.rmi.*;
import java.net.*;


public class Proceso{

  public int id;
  public int n;//numero de procesos totales
  public long initialDelay;//el tiempo (en ms) que el proceso esperará para intentar entrar a la SC
  public boolean bearer;//si el nodo es el portador inicial del token
  public Semaforo semaforo;/

  public Proceso( int id, int n, long initialDelay, boolean bearer, Semaforo s){
    this.id=id;
    this.n=n;
    this.initialDelay = initialDelay;
    this.bearer = false;
    this.semaforo =s;
   }

  public static void main(String argv[]){
      try{

    }
    catch (Exception e){
      System.out.println("Sorry, error succeeded:" + e.getMessage());
      e.printStackTrace();
    }
  }
}
