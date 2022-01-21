package leetcode;

import java.util.Scanner;

public class Solution {
	
	public static String[] reverseString(String[] str){
        int left = 0;
        int right = str.length-1;
        while(left < right){
//        	System.out.println("print");
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
//        System.out.println("print");
        System.out.println(str);
            return str;
    }
    
    
    public static void main(String []args){
        
//    Solution solution = new Solution();
    Scanner scanner = new Scanner(System.in);
    int arrayLength = scanner.nextInt();
    String str [] = new String[arrayLength];
    for(int i = 0; i < arrayLength; i++){
        
         str[i] = scanner.nextLine();
    }
//    scanner.close();
//    
//    String str [] = {"h","e","l","l","o"};
   String s[] = Solution.reverseString(str);
   
   for(int i = 0; i < s.length; i++) {
	   System.out.print(s[i]);
   }
    }
}
