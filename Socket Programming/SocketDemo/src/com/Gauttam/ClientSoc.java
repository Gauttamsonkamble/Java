package com.Gauttam;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientSoc {

	public static void main(String[] args) throws IOException {

		System.out.println("Client has Started");
		Socket s = new Socket("localhost", 9000);

	}

}
