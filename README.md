# Java Socket Chat Application

A simple client-server chat application implemented using Java Sockets. This project demonstrates basic network programming concepts and provides a foundation for building more complex networked applications.

## 🚀 Features

- Simple client-server architecture
- Real-time message exchange
- Clean connection handling
- Proper resource management
- Error handling and validation
- Console-based interface

## 📋 Prerequisites

- Java Development Kit (JDK) 17 or higher
- Maven (for dependency management)
- Basic understanding of Java programming
- Terminal or command prompt

## 🛠️ Installation

1. Clone the repository:
```bash
git clone https://github.com/yourusername/java-socket-chat.git
cd java-socket-chat
```

2. Build the project:
```bash
mvn clean install
```

## 🎮 Usage

### Starting the Server

1. Navigate to the project directory
2. Run the Server class:
```bash
java -cp target/classes com.service.Server
```
The server will start and listen on port 5000.

### Starting the Client

1. Open a new terminal window
2. Run the Client class:
```bash
java -cp target/classes com.service.Client
```
The client will connect to the server running on localhost:5000.

### Using the Chat

1. Type messages in the client console
2. Press Enter to send
3. Type "exit" to quit the client
4. The server will display received messages

## 📁 Project Structure

```
java-socket-chat/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── service/
│                   ├── Client.java
│                   └── Server.java
├── documentation.html
├── pom.xml
└── README.md
```

## 💻 Code Examples

### Server Code
```java
public class Server {
    private static final int PORT = 5000;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server started on port " + PORT);
            // ... server implementation
        }
    }
}
```

### Client Code
```java
public class Client {
    private static final String HOST = "localhost";
    private static final int PORT = 5000;

    public static void main(String[] args) {
        try (Socket socket = new Socket(HOST, PORT)) {
            System.out.println("Connected to server");
            // ... client implementation
        }
    }
}
```

## ⚠️ Common Issues and Solutions

1. **Port Already in Use**
   - Error: `java.net.BindException: Address already in use`
   - Solution: Close the previous server instance or use a different port

2. **Connection Refused**
   - Error: `java.net.ConnectException: Connection refused`
   - Solution: Ensure the server is running before starting the client

3. **Message Not Received**
   - Issue: Messages not appearing on the server
   - Solution: Always call `flush()` after `writeUTF()`

## 🔧 Development

### Adding New Features

1. Fork the repository
2. Create a new branch
3. Make your changes
4. Submit a pull request

### Suggested Improvements

- Add GUI interface
- Implement multiple client support
- Add message encryption
- Include file transfer capability
- Add user authentication

## 📚 Learning Resources

- [Java Socket Programming Tutorial](https://docs.oracle.com/javase/tutorial/networking/sockets/)
- [Java Networking](https://docs.oracle.com/javase/tutorial/networking/index.html)
- [Java IO Streams](https://docs.oracle.com/javase/tutorial/essential/io/streams.html)

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👥 Authors

- Your Name - Initial work

## 🙏 Acknowledgments

- Java Documentation
- Stack Overflow Community
- Open Source Community

## 📞 Support

If you encounter any issues or have questions, please:
1. Check the [Common Issues](#common-issues-and-solutions) section
2. Open an issue in the repository
3. Contact the maintainers

---

⭐ Star this repository if you find it helpful! # java-socket-programming
# java-socket-programming
# java-socket-programming
