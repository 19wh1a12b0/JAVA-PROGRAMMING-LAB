class CharArrayToString
{
   public static void main(String args[])
   {
      // Method 1: Using String object
      char[] ch = {'j', 'a', 'v', 'a', ' ', 'p', 'r', 'o', 'g', 'r', 'a', 'm'};
      String str = new String(ch);
      System.out.println(str);
 
      // Method 2: Using valueOf method
      String str2 = String.valueOf(ch);
      System.out.println(str2);
   }
}