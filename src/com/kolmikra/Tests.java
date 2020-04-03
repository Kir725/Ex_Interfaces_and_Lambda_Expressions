package com.kolmikra;

import com.kolmikra.measure.Employee;
import com.kolmikra.measure.Measurable;
import com.kolmikra.threads.Greeter;

public class Tests {

    public static void main(String[] args) {
        Measurable[] measurableList = new Measurable[]{new Employee("Alex", 10000),
                new Employee("Bred", 15000),
                new Employee("Stiven", 25000)};
        System.out.println(((Employee) Employee.largest(measurableList)).getFirstName());

        Runnable first = new Greeter(100, "FIRST");
        Runnable second = new Greeter(150, "SECOND");
        Thread threadFirst = new Thread(first);
        Thread threadSecond = new Thread(second);
        threadFirst.start();
        threadSecond.start();


    }
}
