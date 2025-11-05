import java.io.*;
import java.net.*;
public class HalfDuplexClient
{
 public static void main(String args[])throws IOException
 {
  Socket s =new Socket("localhost",6666);
  System.out.println("Client started...");
  DataInputStream in=new DataInputStream(s.getInputStream());
  DataOutputStream out=new DataOutputStream(s.getOutputStream());
  out.writeUTF("PING");
  String str=(String)in.readUTF();
  System.out.println(str);
  out.flush();
  out.close();
  s.close();
  
 }
}
