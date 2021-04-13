package com.Gauttam;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSoc {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("Server is waiting to client");
		ServerSocket ss = new ServerSocket(9001);
		
		Socket s = ss.accept();
		
		System.out.println("Connection Established");
		
		DataInputStream dis = new DataInputStream(s.getInputStream());
		String str = dis.readUTF();
		
		System.out.println("Message :"+str);
		ss.close();
	}

}
