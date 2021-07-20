package rail_fence;

import java.util.Scanner;
public class Rail_fence {

    public static void main(String[] args) {
        
        
        String rf; 
       String s=""; 
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter a string: "); 
       rf=sc.nextLine();  
       int i; 
        
       System.out.println("\n---\nFirst half: "); 
       for(i=0;i<rf.length();i=i+2){ 
           char c=rf.charAt(i); 
           s=s+c; 
           System.out.print(c); 
       } 
        
       System.out.println("\nSecond half: "); 
       for(int j=1;j<rf.length();j=j+2){ 
           char c=rf.charAt(j); 
           s=s+c; 
           System.out.print(c); 
       } 
       System.out.println("\n---\nCipher text: "+s);

        
        
    }

}







/*def encrypt(message, depth):
array = []
for i in range(depth):
array.append("")
mod = 2*(depth-1)
for i in range(len(message)):
array[min(i%mod, mod-i%mod)] += message[i]
return "".join(array)
def decrypt(cipher, depth):
array = []
for i in range(depth):
array.append([])
mod = 2*(depth-1)
index = 0
for i in range(depth+1):
for j in range(0,len(cipher)):
if(min(j%mod, mod-j%mod) == i):
array[i].append(cipher[index])
index += 1
message = ""
for i in range(len(cipher)):
message += array[min(i%mod,mod-i%mod)].pop(0)
return message
message = input("Enter Message\n")
depth = int(input("Enter Depth\n"))
cipher = encrypt(message,depth)
print("encrypt('" + message + "',", depth, "): " + cipher)
print("decrypt('" + cipher + "',", depth, "): " + decrypt(cipher,depth))

          =======================================================




import java.util.Scanner; 
public class P4 { 
    public static void main(String[] args) { 
       String rf; 
       String s=""; 
       Scanner sc=new Scanner(System.in); 
       System.out.println("Enter a string: "); 
       rf=sc.nextLine();  
       int i; 
        
       System.out.println("\n---\nFirst half: "); 
       for(i=0;i<rf.length();i=i+2){ 
           char c=rf.charAt(i); 
           s=s+c; 
           System.out.print(c); 
       } 
        
       System.out.println("\nSecond half: "); 
       for(int j=1;j<rf.length();j=j+2){ 
           char c=rf.charAt(j); 
           s=s+c; 
           System.out.print(c); 
       } 
       System.out.println("\n---\nCipher text: "+s); 
    } 
} 

==================================================

  int depth = 2;
        String plainText = ("hellowelcometohell");
        //String plainText = ("hloecmthlelwloeoel");
        String cipherText = "";
        int len = plainText.length();

           
     //  int s1= plainText.length()/2;
     //  String halfString=plainText.substring(0,s1);
      // System.out.println(s1);
      // System.out.println(halfString);
         
        
    
        System.out.println("Entered Plain text is : " + plainText);
        
        for (int i = 0; i < len; i = i + 2) {
            cipherText += plainText.charAt(i);
        }
        for (int i = 1; i < len; i = i + 2) {
            cipherText += plainText.charAt(i);
        }
        System.out.println("Your Encrypted Text is : " + cipherText);

        

*/