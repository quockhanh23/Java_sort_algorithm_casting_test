package Genneric;

import Genneric.allclass.Grandchildren;
import Genneric.allclass.Grandchildren1;
import Genneric.allclass.ParentClass;
import Genneric.allclass.Subclass;

import java.util.ArrayList;
import java.util.List;

public class ClassMain {

    public static void main(String[] args) {
        GenericClass genericClass = new GenericClass();
        List<ClassImpl> listClassImpl = new ArrayList<>();
        List<Grandchildren> listSubclass1 = new ArrayList<>();
        List<Grandchildren1> listSubclass2 = new ArrayList<>();

        // Class cha
        List<Subclass> listSuperClass1 = new ArrayList<>();

        // Class cha của cha
        List<ParentClass> listSuperClass2 = new ArrayList<>();
        genericClass.allImplementClassOfInterface = listClassImpl;
        genericClass.subclass = listSubclass1;
        genericClass.subclass = listSubclass2;
        genericClass.superClass = listSuperClass1;
        genericClass.superClass = listSuperClass2;

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

        genericClass.superInterface = listSubInterface;
        genericClass.allImplementClassOfInterface = listSubInterface;
    }
}
