import java.io.*; 
import java.net.*; 

class TCPServer { 

  public static void main(String argv[]) throws Exception 
    { 
      String clientnumberSentence; 
      String capitalizednumberSentence;
      int n1,n2;

      ServerSocket welcomeSocket = new ServerSocket(6789); 
  
      while(true) { 
  
           Socket connectionSocket = welcomeSocket.accept(); 

           BufferedReader inFromClient = 
              new BufferedReader(new
              InputStreamReader(connectionSocket.getInputStream())); 

           DataOutputStream  outToClient = 
             new DataOutputStream(connectionSocket.getOutputStream()); 

           clientnumberSentence = inFromClient.readLine();

	   n1 = Integer.parseInt(clientnumberSentence);

	   n2 = n1 * n1;

           capitalizednumberSentence = "" + n2 + '\n'; 

           outToClient.writeBytes(capitalizednumberSentence); 
        } 
    } 
} 
 
