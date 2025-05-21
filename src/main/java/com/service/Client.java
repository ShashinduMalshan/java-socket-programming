package com.service;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * A simple chat client that connects to a server and sends messages.
 * The client reads user input from the console and sends it to the server.
 * Type 'exit' to disconnect from the server.
 * shasidu malshan
 */
public class Client {
    // Server connection details
    private static final String HOST = "localhost";
    private static final int PORT = 5000;

    public static void main(String[] args) {
        // Using try-with-resources to automatically close socket, output stream, and scanner
        try (Socket socket = new Socket(HOST, PORT);
             DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
             Scanner scanner = new Scanner(System.in)) {

            // Display connection information
            System.out.println("Connected to server at " + HOST + ":" + PORT);
            System.out.println("Type your messages (type 'exit' to quit):");

            // Main message sending loop
            while (true) {
                // Read user input and trim whitespace
                String message = scanner.nextLine().trim();
                
                // Skip empty messages
                if (message.isEmpty()) {
                    continue;
                }

                // Send message to server
                outputStream.writeUTF(message);
                outputStream.flush();

                // Check if user wants to exit
                if ("exit".equalsIgnoreCase(message)) {
                    System.out.println("Disconnecting from server...");
                    break;
                }
            }
        } catch (IOException e) {
            // Handle connection and communication errors
            System.err.println("Client error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
//assertThat