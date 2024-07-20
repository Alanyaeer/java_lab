package org.example;

public class Main {
    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.setG(0.02);
        Origin origin = new Origin("1", 3, inner);
        Origin copy = origin.clone();

        // 这里解释一下 为什么 String 类型 不需要去做特殊处理
        // 我们需要理解为什么要去深拷贝，因为还把一个引用变量指向的对象的属性的修改，对另外一个对象造成影响
        // 但是String 对象是 final 类型 所以是不可变的。
        System.out.println(System.identityHashCode(origin.getA()));
        System.out.println(System.identityHashCode(copy.getA()));
        System.out.println(System.identityHashCode(origin.getC().getG()));
        System.out.println(System.identityHashCode(copy.getC().getG()));

    }
}