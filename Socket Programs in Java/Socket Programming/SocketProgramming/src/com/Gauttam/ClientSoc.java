package com.Gauttam;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSoc {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		System.out.println("Client Has started");
		Socket s = new Socket("localhost",9001);
	}

}
