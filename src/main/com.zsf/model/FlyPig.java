/**
 * @ Author zhangsf
 * @CreateTime 2018/12/5 - 8:28 PM
 */
package model;

import java.io.Serializable;

public class FlyPig implements Serializable {
    //public static final long serialVersionUID=1L;
    /**
     * pig的age属性
     */
     private int age;

    /**
     * pig的name属性
     */
     private String name;
     /**
      * pig的color属性 
      */
      private String color;
    private static String AGE1 = "2345";
    transient private String birthday;

    @Override
    public String toString() {
        return "FlyPig{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + ", AGE1='" + AGE1 +'}';

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
