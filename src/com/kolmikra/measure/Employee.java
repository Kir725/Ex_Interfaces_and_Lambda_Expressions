package com.kolmikra.measure;

public class Employee implements Measurable {
    private String firstName;
    private double salary;

    public Employee(String firstName, double salary) {
        this.firstName = firstName;
        this.salary = salary;
    }

    public Employee(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }

    public static double average(Measurable[] objects) {
        double sum = 0.0;
        for (Measurable elem : objects) {
            sum += elem.getMeasure();
        }
        return sum / objects.length;
    }

    public static Measurable largest(Measurable[] objects) {
        Measurable max = objects[0];
        for (Measurable current : objects) {
            if (max.getMeasure() <= current.getMeasure()) {
                max = current;
            }
        }
        return max;
    }

    @Override
    public double getMeasure() {
        return salary;
    }
}
