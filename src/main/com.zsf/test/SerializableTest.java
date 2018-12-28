/**
 * @ Author zhangsf
 * @CreateTime 2018/12/5 - 8:32 PM
 */
package test;

import model.FlyPig;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) throws Exception {
        serializeFlyPig();
        FlyPig flyPig = deserializeFlyPig();
        System.out.println(flyPig.toString());

    }

    /**
     * 对flypig对象进行反序列化操作
     * @return
     */
    private static FlyPig deserializeFlyPig() throws Exception {
        //ObjectInputStream代表对象输入流：
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/zhangsf/code/java/JavaTraning/flypig.txt"));
        //它的readObject()方法从一个源输入流中读取字节序列，
        // 再把它们反序列化为一个对象，并将其返回
        FlyPig flypig0= (FlyPig) ois.readObject();
        System.out.println("对flypig对象进行反序列化操作 成功");
        return  flypig0;
    }

    /**
     * 对flypig对象进行序列化操作
     * @throws IOException
     */
    private static void serializeFlyPig() throws IOException {
        FlyPig flyPig = new FlyPig();
        flyPig.setColor("red");
        flyPig.setName("pig");
        // ObjectOutputStream 对象输出流，
        // 将 flyPig 对象存储到/Users/zhangsf/code/java/JavaTraning/flypig.txt文件中，
        // 完成对 flyPig 对象的序列化操作
        //ObjectOutputStream代表对象输出流：
        ObjectOutputStream  oos = new ObjectOutputStream(new FileOutputStream("/Users/zhangsf/code/java/JavaTraning/flypig.txt"));
       //它的writeObject(Object obj)方法可对参数指定的obj对象进行序列化，
        // 把得到的字节序列写到一个目标输出流中。
        oos.writeObject(flyPig);
        System.out.println("对flypig对象进行序列化操作---成功！！！");
        oos.close();
    }
}
