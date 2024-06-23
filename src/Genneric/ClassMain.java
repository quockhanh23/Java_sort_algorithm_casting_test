package Genneric;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {

    public static void main(String[] args) {
        UserPrinciple userPrinciple = new UserPrinciple();
        List<ClassImpl> listClassImpl = new ArrayList<>();
        List<Test> listSubclass1 = new ArrayList<>();
        List<Test1> listSubclass2 = new ArrayList<>();

        // Class cha
        List<BigOne> listSuperClass1 = new ArrayList<>();

        // Class cha của cha
        List<BigOne2> listSuperClass2 = new ArrayList<>();
        userPrinciple.allImplementClassOfInterface = listClassImpl;
        userPrinciple.subclass = listSubclass1;
        userPrinciple.subclass = listSubclass2;
        userPrinciple.superClass = listSuperClass1;
        userPrinciple.superClass = listSuperClass2;

        InterfaceTest2 interfaceTest2 = new InterfaceTest2() {
            @Override
            public void getTest() {

            }
        };

        List<InterfaceTest2> listSubInterface = new ArrayList<>();

        listSubInterface.add(
                new InterfaceTest2() {
                    @Override
                    public void getTest() {

                    }
                }
        );

        userPrinciple.superInterface = listSubInterface;
        userPrinciple.allImplementClassOfInterface = listSubInterface;
    }
}
