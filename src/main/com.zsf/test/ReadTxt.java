/**
 * @ Author zhangsf
 * @CreateTime 2019/11/27 - 11:44
 */
package Advanced;
import java.io.*;
public class ReadTxt {
    public static void main(String args[]) {
        readFile();
        writeFile();
    }
    /**
     * 读入TXT文件
     */
    public static void readFile() {
        String pathname = "E:\\python_file\\web_spider\\input.txt";
        // 绝对路径或相对路径都可以，写入文件时演示相对路径,
        // 读取以上路径的input.txt文件
        //防止文件建立或读取失败，用catch捕捉错误并打印，也可以throw;
        //不关闭文件会导致资源的泄露，读写文件都同理
        //Java7的try-with-resources可以优雅关闭文件，异常时自动关闭文件；详细解读https://stackoverflow.com/a/12665271
        try (FileReader reader = new FileReader(pathname);
             BufferedReader br = new BufferedReader(reader)
             // 建立一个对象，它把文件内容转成计算机能读懂的语言
        ) {
            String line;
            //推荐更加简洁的写法
            while ((line = br.readLine()) != null) {
                // 一次读入一行数据
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 写入TXT文件
     */
    public static void writeFile() {
        try {
            File writeName = new File("E:\\python_file\\web_spider\\output2.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
            writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            try (FileWriter writer = new FileWriter(writeName);
                 BufferedWriter out = new BufferedWriter(writer)
            ) {
                out.write("我开始写入文件啦1\r\n"); // \r\n即为换行
                out.write("我开始写入文件啦2\r\n"); // \r\n即为换行
                out.flush(); // 把缓存区内容压入文件
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



