
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class client1 {
public static void main(String args[]) throws IOException {
//Open your connection to a server, at 	//port 2992
Socket s1 = new Socket("localhost",2992);

//ei2lineExtra
int localPort = s1.getLocalPort();
System.out.println("Client connected on local port: " + localPort);


//Get an input file handle from the socket and read the input

OutputStream s1out = s1.getOutputStream();
DataOutputStream dos = new DataOutputStream (s1out);

System.out.println("Write Your Message...");// take message from console
Scanner sc=new Scanner(System.in);
String msg=sc.nextLine();

dos.writeUTF(msg); //transfer to server and turn into upper case


InputStream s1In = s1.getInputStream();
DataInputStream dis = new DataInputStream(s1In);
String st = new String (dis.readUTF());
System.out.println("Output:");
System.out.println(st);

s1.close();
}
}

