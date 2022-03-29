/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrome.check;

import java.util.Scanner;

/**
 *
 * @author alexandrosaristeridis
 */
public class PalindromeCheck {
    public boolean isPalindrome(String word) {
        boolean b = false;
       String rvst=new String();
        for (int i=word.length()-1;i>=0;i--) {
       
           rvst+= word.charAt(i);
        }
          for (int i = 0; i<word.length(); i++) {
              if (word.charAt(i)==rvst.charAt(i)) {
                  b=true;
              }else{
                  b=false;}
            
        }

            return b;
        }
                
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
         System.out.println("dose word");
          String n=s.nextLine();
          PalindromeCheck pd =new PalindromeCheck();
        System.out.println(pd.isPalindrome(n));
    }
    
}
