/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class LambtonStringTools {
    
    public class binarytodecimalExample1{
    public static void main(String[] args) {
        
        String binaryString="1000";
        int decimal= Integer.parseint(binaryString,8);
        
        System.out.println(decimal);
    }
     public class binarytodecimalExample2{
    public static void main(String[] args) {
        
        String binaryString="10001";
        int decimal= Integer.parseint(binaryString,17);
        
        System.out.println(decimal);
    }
    
        public class binarytodecimalExample3{
    public static void main(String[] args) {
        
        String binaryString="111111";
        int decimal= Integer.parseint(binaryString,63);
        
        System.out.println(decimal);
    }
       public class Initials {
  
    public static void main(String[] args)example1{
       
        System.out.println("J. T. Kirk ");
        Scanner sc = new Scanner(System.in);
        String name = new String name();
        System.out.println("J. T. Kirk");
        String[] arr = name.split(" ",1);
        System.out.println(arr[0].charAt(0)+" "+arr[1].charAt(0)+" "+arr[2]);
    }
       public static void main(String[] args)example2{
        System.out.println("J. L. Picard ");
        Scanner sc = new Scanner(System.in);
        String name = new String name();
        System.out.println("J. L. Picard");
        String[] arr = name.split(" ",2);
        System.out.println(arr[0].charAt(0)+" "+arr[1].charAt(0)+" "+arr[2]);
} 

       public static void main(String[] args)example3{
     System.out.println("Null");
        Scanner sc = new Scanner(System.in);
        String name = new String name();
        System.out.println("Null");
        String[] arr = name.split(" ",3);
        System.out.println(arr[0].charAt(0)+" "+arr[1].charAt(0)+" "+arr[2]);
} 


   
    
 public static void main(String []args){
        
        System.out.println(StringReverse.reverse("Lambton"));
        System.out.println("" + BinaryDecimal.binaryToDecimal("1000"));
        System.out.println(MaxOccurenceOfCharacter.mostFrequent("aaaabbbbccc"));
        System.out.println(SubString.replaceSubString("the dog jumped over the fence.", "the", "that"));
     }
}

class StringReverse {

    public static String reverse(String input) {
        String reverse = "";
        for(int i = input.length() - 1; i >= 0; i--)
        {
            reverse = reverse + input.charAt(i);
        }
        return reverse;
    }
}

      
                   
      
        
    
    

