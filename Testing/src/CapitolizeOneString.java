

import java.util.Scanner;

public class CapitolizeOneString {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
   String line;  // Line of text entered by user.
   System.out.println("Enter a line of text.");
   line = input.nextLine();
  /* String st =new String();
   st += Character.toUpperCase(line.charAt(0));
   
   for(int i=1;i<line.length();i++){
	   if(Character.isWhitespace(line.charAt(i-1))){
		   st += Character.toUpperCase(line.charAt(i));
	   }
	   else
		   st += line.charAt(i);
   }
   
   System.out.println(st);*/
   
  /* 
   String[] st = line.split(" ");
   for(int i=0;i<st.length;i++){
	   st[i] = st[i].replace(st[i].charAt(0), Character.toUpperCase(st[i].charAt(0)));
	   System.out.println(st[i]+" ");
   }*/
   System.out.println("Capitalized version:");
   printCapitalized( line );
}  // end main()

static void printCapitalized( String str ) {
     String st = "abc";
     st = "bcd";
   char ch;      
   char prevCh;  
   int i;        
   prevCh = '.'; 
   for ( i = 0;  i < str.length();  i++ ) {
      ch = str.charAt(i);
      if ( Character.isLetter(ch)  &&  ! Character.isLetter(prevCh) )
         System.out.print( Character.toUpperCase(ch) );
      else
         System.out.print( ch );
      prevCh = ch;  // prevCh for next iteration is ch.
   }
   System.out.println();
}

}
