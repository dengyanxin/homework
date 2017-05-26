package com.yanxin;
//toCharArray();
//µÚËÄÌâ
public class Demo4 {  
    public static void main(String[] args) {  
        String str = "1234abcdeabcdabcaba";  
        int index = lastIndexOf(str, '3');  
        System.out.println(index);  
    }  
    public static int lastIndexOf(String s, char c)  
    {  
        char[] cArray = s.toCharArray();  
        int len = cArray.length;  
        for(int i = len - 1; i >= 0; i--)  
        {  
            if(c == cArray[i])  
            {  
                return i;  
            }  
  
        }  
        return -1;  
    }  
}  
