import java.io.*;
import java.net.*;
public class HalfDuplexServer
{
 public static void main(String args[])throws IOException
 {
  ServerSocket ss=new ServerSocket(6666);
  System.out.println("Server started.....");
  Socket s=ss.accept();
  DataInputStream in=new DataInputStream(s.getInputStream());
  DataOutputStream out=new DataOutputStream(s.getOutputStream());
  String str=(String)in.readUTF();
  System.out.println(str);
  out.writeUTF("PONG");
  ss.close();
 }
}
