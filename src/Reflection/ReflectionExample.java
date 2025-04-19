package Reflection;

import java.lang.reflect.Method;

public class ReflectionExample {
    public void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        try {
            // Tạo một đối tượng của lớp ReflectionExample
            ReflectionExample example = new ReflectionExample();

            // Lấy thông tin về lớp
            Class<?> clazz = example.getClass();

            // Lấy và gọi phương thức sayHello
            Method method = clazz.getMethod("sayHello");
            method.invoke(example);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}