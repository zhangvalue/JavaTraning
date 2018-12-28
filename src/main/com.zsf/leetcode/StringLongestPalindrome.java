/**
 * @ Author zhangsf
 * @CreateTime 2018/12/28 - 8:48 PM
 */
package leetcode;

import java.util.Scanner;

public class StringLongestPalindrome {
    /**
     *  回文数问题
     *  给定的一个定长的字符串来 ，返回字符串A中最长回文串的长度
     *  O(n^2)时间复杂度方法——从中心向外扩散
     */
public String  getlongstPalindrome(String A){

    return "";}

    public int getLongestPalindrome(String A){
        char[] arrayA = A.toCharArray();
        int max = 0;
        int tempMax = 0;
        if(A.equals("") || A.equals(null))
            return 0;
        for(int i = 0;i < arrayA.length;i++){  //i为回文串的中心位置
            //当回文串位数为奇数时
            for(int j = 0;(i-j) >= 0 && (i+j) < arrayA.length;j++){
                if(arrayA[i-j] != arrayA[i+j])
                    break;
                tempMax = 2*j + 1;
            }
            if(tempMax > max)
                max = tempMax;
            //当回文串位数为偶数时
            for(int j = 0;(i-j) >= 0 && (i+j+1) < arrayA.length;j++){
                if(arrayA[i-j] != arrayA[i+j+1])
                    break;
                tempMax = 2*j + 2;
            }
            if(tempMax > max)
                max = tempMax;
        }
        return max;
    }

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();//获取当前时间
        //doSomeThing();   //要运行的java程序
        StringLongestPalindrome test = new StringLongestPalindrome();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String A = in.nextLine();
        int maxA = test.getLongestPalindrome(A);
        System.out.println("输入目标字符串中最长回文串的长度为："+maxA);
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间："+(endTime-startTime)+"ms");
    }
}
