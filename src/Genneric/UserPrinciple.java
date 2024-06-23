package Genneric;

import java.util.Collection;


public class UserPrinciple {

    public Long id;
    public String username;
    public String password;

    // Các triển khai của InterfaceTest hoặc các interface con InterfaceTest
    public Collection<? extends InterfaceTest> allImplementClassOfInterface;

    // Các class con của lớp Test và chính nó
    public Collection<? extends Test> subclass;

    // Các class cha của lớp test
    public Collection<? super Test> superClass;

    // Các lớp cha của interface đó

    public Collection<? super InterfaceTest2> superInterface;


    // Giải thích:
    // superInterface là 1 Collection chứa các đối tượng tham số đầu vào không xác định ? của các lớp cha của lớp InterfaceTest2
}
