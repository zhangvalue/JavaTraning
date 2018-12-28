/**
 * @ Author zhangsf
 * @CreateTime 2018/12/28 - 9:10 PM
 */
package leetcode;

import java.util.Scanner;

public class StringLongestPalindrome1{
    /**
     *  回文数问题
     *  给定的一个定长的字符串来 ，返回字符串A中最长回文串的长度
     *  O(n^3)时间复杂度方法——暴力求解
     *  思想：
     *     1）从最长的子串开始，遍历所有该原字符串的子串；
     *
     *     2）每找出一个字符串，就判断该字符串是否为回文；
     *
     *     3）子串为回文时，则找到了最长的回文子串，因此结束；反之，则继续遍历。
     *     在这种情况之下因为需要使用三个for循环需要进行三次
     */
    public static String getLongestPalindrome(String s){
        if (s.length()<=1) return s;
        for (int i=s.length();i>0;i--){ //子串长度
            for (int j=0;j<=(s.length()-i);j++){
                String sub=s.substring(j,i+j);//子串位置
                System.out.println("j的位置"+j+"------"+"i的位置"+i+"---------"+"sub字符串"+sub);
                int count =0;//计数，用来判断是否对称
                for(int k=0;k<sub.length()/2;k++){//判断左右是否对称
                    if (sub.charAt(k)==sub.charAt(sub.length()-k-1))
                        count++;
                    System.out.println("count的值"+count);
                }
                if (count==sub.length()/2){
                    return sub;
                }
            }
        }
        return "字符串中没有回文字符串";//表示字符串中没有回文字符串
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();//获取当前时间
        //doSomeThing();   //要运行的java程序
        StringLongestPalindrome1 test = new StringLongestPalindrome1();
        Scanner in =new Scanner(System.in);
        System.out.println("请你输入一个字符串：");
        String A =in.nextLine();
        String TrueString = getLongestPalindrome(A);
        System.out.println("回文字符串为"+TrueString);
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间："+(endTime-startTime)+"ms");

    }
}


