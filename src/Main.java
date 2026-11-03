import javax.swing.plaf.DesktopIconUI;
import java.util.ArrayList;
import java.util.List;

import java.util.Map;
import java.util.HashMap;

import java.util.HashSet;
import java.util.Set;

import java.util.stream.Collectors;


void main() {

    Dog d1 = new Dog();
    Dog d2 = new Dog();
    d1.setName("Late");
    d1.setBreed("Siberain Husky");
    d1.setAge(3);
    IO.print(String.format("Hello my name's " + d1.getName()));
    IO.print(String.format(" my breed is " + d1.getBreed()));
    IO.print(String.format(" i'm " + d1.getAge() + " years old "));
    d1.run();
    d1.bark(3);
    Bicycle bike1 = new Bicycle();
    bike1.move();
    bike1.stop();
    MotoBike moto1 = new MotoBike();
    moto1.pushStart();
    moto1.move();
    moto1.stop();
    CreditPayment man1 = new CreditPayment();
    PromprPay man2 = new PromprPay();

//    man1.pay(120);
//    man2.pay(120);

    List<String> feuits = new ArrayList<>();
    feuits.add("apple");
    feuits.add("banana");
    feuits.add("orange");
    feuits.add("kiwi");
    feuits.add("pieApple");
    IO.println(String.format(feuits.get(0)));
    feuits.set(1, "Mango");
    IO.println(String.format(feuits.get(1)));
    feuits.remove("orange");
    IO.println(String.format(feuits.get(2)));
    System.out.println("จำนวนผลไม้: " + feuits.size());
    for (String fruit : feuits) {
        System.out.println(fruit);
    }
    Map<Integer, String> employees = new HashMap<>();
    employees.put(101, "สมชาย");
    employees.put(102, "สมหญิง");
    employees.put(103, "ประชาย");
    employees.put(101, "สมชาย ใจดี");

    System.out.println("พนักงานรหัส 102 คือ: " + employees.get(102));
    System.out.println("พนักงานรหัส 101 คือ: " + employees.get(101));
    System.out.println("มีรหัส 103 ไหม? : " + employees.get(103));
    employees.remove(103);
    System.out.println("จำนวนพนักงานทั้งหมด : " + employees.size());
    for (Map.Entry<Integer, String> entry : employees.entrySet()) {
        System.out.println("รหัส: " + entry.getKey() + ", ชื่อ: " + entry.getValue());
    }

    Set<String> colors = new HashSet<>();
    colors.add("Red");
    colors.add("Green");
    colors.add("Blue");
    colors.add("Red");

    System.out.println("จำนวนสีทั้งหมด: " + colors.size());
    System.out.println("มีสี Green ไหม? " + colors.contains("Green"));
    colors.remove("Blue");
    for (String color : colors) {
        System.out.println("สี: " + color);
    }

//    List<String> filtedName = employees.strem()
//            .filter(e -> e.getSalary() > 20000)
//            .map(e -> e.getName().t)

}


