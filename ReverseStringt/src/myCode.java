/* package whatever; // don't place package name! */

import java.io.*;
import java.util.*;

class myCode
{
  public static int order;
  public static void main (String[] args) throws java.lang.Exception
  {
    Scanner s = new Scanner(System.in);
    int cases = s.nextInt();
    s.nextLine();
    while(cases!=0){
      cases--;
      String str = s.nextLine();
      String [] ArrayStr = str.split(" ");
      order = ArrayStr.length;
      System.out.println(reverseString(ArrayStr));
    }
  }
  
  public static String reverseString(String[] _Array){
    
    String str = new String();
    if(--order>-1){
      str = _Array[order];
    
      return  str + " " + reverseString(_Array);
    }
    else
      return str;
    
  }
}
