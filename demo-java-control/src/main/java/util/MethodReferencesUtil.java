package util;

import java.util.Comparator;
import java.util.function.Supplier;

/*
 * 方法引用
 * */
public class MethodReferencesUtil {
    public static void main(String[] args) {
        Refer();
    }

    public static void Refer() {
        Student stu = new Student(1, "sch");
        Supplier<String> sp = () -> stu.getName();
        System.out.println(sp.get());

        Supplier<String> sp2 = stu::getName;
        System.out.println(sp2.get());


        Comparator<Integer> com1=(x,y)->Integer.compare(x,y);
        System.out.println(com1.compare(1,3));

        Comparator<Integer> com2=Integer::compare;
        System.out.println(com2.compare(3,6));
    }
}

class Student {
    private Integer id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
