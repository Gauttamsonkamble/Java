package com.Gauttam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientSoc {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		System.out.println("Client Has started");
		Socket s = new Socket("localhost",9001);
		
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter message :");
		
		String msg = sc.nextLine();
		
		dout.writeUTF(msg);
		
		dout.flush();
		dout.close();
		s.close();
		
		
	}

}
