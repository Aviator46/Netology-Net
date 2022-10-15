package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static final int PORT = 8080;
    public static final String LOCALHOST = "127.0.0.1";

    public static void main(String[] args) {
        try (Socket clientSocket = new Socket(LOCALHOST, PORT);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            out.println("Evgeny");
            System.out.println(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}