package com.Gauttam;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerSoc {

	public static void main(String[] args) throws UnknownHostException, IOException {

		System.out.println("Server waiting to client");

		ServerSocket ss = new ServerSocket(9000);

		Socket s = ss.accept();

		System.out.println("Connection Established");
	}

}
