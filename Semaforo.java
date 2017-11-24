import java.rmi.*;
import java.net.*;

public class Semaforo{


  //Método que registra un request de un proceso remoto
  public void request(int id,int seq)
  {

  }

  //Método que indica a un proceso remoto que debe esperar por el token para
  //realizar la SC
  public void waitToken()
  {

  }
  //Método que toma posesión del token en el proceso.
  public void takeToken(Token token)
  {

  }

  //Método que mata el proceso remoto.
  //Debe usar este método para detener el algoritmo de S-K una vez que el token
  //haya pasado por todos los nodos del sistema.
  public void kill()
  {

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
