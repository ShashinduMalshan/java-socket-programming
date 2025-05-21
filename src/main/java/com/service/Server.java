package com.service;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * A simple chat server that accepts client connections and receives messages.
 * The server runs continuously and can handle one client at a time.
 * When a client disconnects, the server waits for the next client connection.
 */
public class Server {
    // Port number on which the server will listen for client connections
    private static final int PORT = 5000;

    public static void main(String[] args) {
        // Using try-with-resources to automatically close the ServerSocket when done
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started on port " + PORT);
            System.out.println("Waiting for client connection...");

            // Main server loop - keeps running to accept multiple clients
            while (true) {
                // Accept and handle client connection s
                // Using try-with-resources to automatically close client socket and input stream
                try (Socket clientSocket = serverSocket.accept();
                     DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream())) {
                    
                    // Display client connection information
                    System.out.println("Client connected from: " + clientSocket.getInetAddress());
                    
                    // Message handling loop for the current client
                    while (true) {
                        // Read message from client
                        String message = inputStream.readUTF();
                        System.out.println("Received: " + message);
                        
                        // Check if client wants to exit
                        if ("exit".equalsIgnoreCase(message)) {
                            System.out.println("Client requested exit");
                            break;
                        }
                    }
                } catch (IOException e) {
                    // Handle errors for individual client connections
                    System.err.println("Error handling client: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            // Handle server startup errors
            System.err.println("Server error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}