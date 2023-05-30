import java.io.*;
import java.net.InetAddress;

public class partical6_InetAddress {

	public static void main(String [] args) {
		
		try {
			InetAddress ip = InetAddress.getByName("www.sinhgad.edu");
			System.out.println("Host Name: " + ip.getHostName());
			System.out.println("IP Address: " + ip.getHostAddress());
			}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
	
