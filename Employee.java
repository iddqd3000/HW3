package com.company;

public class Employee {
    private String name;
    private double hoursWorked;
    private double salaryPerHour;
    private double workingRate;

    public Employee() {
    }

    public Employee(String name, double hoursWorked, double salaryPerHour) {
        this.hoursWorked = hoursWorked;
        this.name = name;
        this.salaryPerHour = salaryPerHour;
    }

    public double weeklyPay(int hoursWorked) {
        double pay = hoursWorked * workingRate;
        return pay;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



class HourlyEmployee extends Employee {
    private double hourlyWage;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, double wage) {
    }

    public double weeklyPay(int hoursWorked) {
        double pay = hoursWorked * hourlyWage;
        if (hoursWorked > 40) {
            // Add overtime
            pay = pay + ((hoursWorked - 40) * 0.5) * hourlyWage;
        }
        return pay;
    }


    class SalariedEmployee extends Employee {
        private double annualSalary;
        private double hourlyWage;

        public SalariedEmployee() {
        }

        public SalariedEmployee(String name, double salary) {
            setName(name);
            annualSalary = salary;

        }

        public double weeklyPay(int hoursWorked) {
            final int WEEKS_PER_YEAR = 52;
            return annualSalary / WEEKS_PER_YEAR;
        }

    }

    class Manager extends SalariedEmployee {
        private double weeklyBonus;


        public Manager() {
        }

        public Manager(String name, double salary, double bonus) {
            super(name, salary);
            weeklyBonus = bonus;
        }

        public double weeklyPay(int hours) {
            return super.weeklyPay(hours) + weeklyBonus;
        }

    }
}

