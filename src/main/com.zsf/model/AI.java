/**
 * @ Author zhangsf
 * @CreateTime 2018/12/19 - 4:42 PM
 */
package model;

import java.util.Scanner;

public class AI {
    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            String  nextLine=scanner.nextLine();
            String s =nextLine.
                    replaceAll("嘛","")
                    .replaceAll("吗","")
                    .replaceAll("？","！");
            System.out.println(s);
        }
    }
}
