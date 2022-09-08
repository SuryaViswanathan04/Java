import java.io.*;
import java.util.Scanner;
public class Alphabet 
{
    public static void main(String[] args) 
    {
       char character='z';
       switch(character)
       {
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
            System.out.println("This is a Vowel"+character);
            break;
           default:
               System.out.println("This is a Consonant:"+character);
           
       }
       
    }
}
