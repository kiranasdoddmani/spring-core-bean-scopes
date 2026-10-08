package org.example;
/*
SingleTon :-
   SingleTon Menas JavaBean ByDefault it is SingleTon and it create only one Object Hence it Show True

Prototype :-
  ProtoType Menas it Create a Different-Object's
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // Singleton
//        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
//         Student singleton1= (Student) context.getBean("Student");
//         Student singleton2=(Student) context.getBean("Student");
//
//        singleton1.setName("Amit");
//        singleton2.ShowName();
//
//        System.out.println("Both Singleton Objects are Same: " + (singleton1 == singleton2));
//         o/p:- true


          // Prototype
        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
        Student Prototype1= (Student) context.getBean("Student");
        Student Prototype2=(Student) context.getBean("Student");

        Prototype1.setName("Amit");
        Prototype2.ShowName();

        System.out.println("Both Singleton Objects are Same: " + (Prototype1 == Prototype2));
//           o/p: False

    }
}
