import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class Servidor extends UnicastRemoteObject{

  private String ServerName;

  public Servidor ( String s ) throws RemoteException{
    ServerName = s;
   }

  public static void main(String argv[]){
    Servidor  server;
    try{
      server = new Servidor ( " Servidor " );
    }catch (Exception e){
      System.out.println("Error succeeded:" + e.getMessage());
      e.printStackTrace();
    }
  }
}
