import java.io.*; 
import java.net.*; 
class TCPClient { 

    public static void main(String argv[]) throws Exception 
    { 
        String numbersentence; 
        String modifiednumberSentence; 

        BufferedReader inFromUser = 
          new BufferedReader(new InputStreamReader(System.in)); 

        Socket clientSocket = new Socket("localhost", 6789); 

        DataOutputStream outToServer = 
          new DataOutputStream(clientSocket.getOutputStream()); 

        BufferedReader inFromServer = 
          new BufferedReader(new
          InputStreamReader(clientSocket.getInputStream())); 

        numbersentence = inFromUser.readLine(); 

        outToServer.writeBytes(numbersentence + '\n'); 

        modifiednumberSentence = inFromServer.readLine(); 

        System.out.println("FROM SERVER: " + modifiednumberSentence); 

        clientSocket.close(); 
                   
    } 
} 
