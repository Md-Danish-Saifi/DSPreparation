package org.example.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStream {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        howManyMaleFemale(employeeList);
        printAllDepartmentName(employeeList);
        averageAgeOfEmployees(employeeList);
        highestPaidEmployee(employeeList);
        nameEmployeeJoinedAfter(employeeList);
        countEmployeeDepartmentWise(employeeList);
        averageSalaryOfDepartment(employeeList);
        youngestEmployeeInDepartment(employeeList);
        mostExperiencedEmployee(employeeList);
        genderInDepartment(employeeList);
        avarageSalaryOfGender(employeeList);
        nameEmployeeInDepartments(employeeList);
        avarageAndTotalSalary(employeeList);
        olderAndYoungerEmployee(employeeList);
    }

    private static void olderAndYoungerEmployee(List<Employee> employeeList) {
        Map<Boolean,List<Employee>> emps = employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge()>25));
        for(Map.Entry<Boolean,List<Employee>> emp : emps.entrySet()){

            if(emp.getKey()){
            System.out.println("===Older=== ");
            } else {
                System.out.println("===Younger=== ");
            }
            for (Employee e: emp.getValue()){
                System.out.println(e.getName());
            }
        }
    }

    private static void avarageAndTotalSalary(List<Employee> employeeList) {
        DoubleSummaryStatistics dbs = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Salary "+dbs.getAverage());
        System.out.println("Total Salary "+dbs.getSum());

    }

    private static void nameEmployeeInDepartments(List<Employee> employeeList) {
        Map<String,List<Employee>> emps = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        for(Map.Entry<String,List<Employee>> emp : emps.entrySet()){
            System.out.println("====== ");
            System.out.println(emp.getKey());
            System.out.println("====== ");
            for (Employee e: emp.getValue()){
                System.out.println(e.getName());
            }
        }
    }

    private static void avarageSalaryOfGender(List<Employee> employeeList) {
        Map<String,Double> emps = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(emps);
    }

    private static void genderInDepartment(List<Employee> employeeList) {
        Map<String,Long> emps = employeeList.stream().filter(e-> e.department.equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(emps);
    }

    private static void mostExperiencedEmployee(List<Employee> employeeList) {
        Employee emp = employeeList.stream().min(Comparator.comparing(Employee::getYearOfJoining)).get();
        System.out.println(emp.toString());
    }

    private static void youngestEmployeeInDepartment(List<Employee> employeeList) {
        Employee emp = employeeList.stream().filter(e-> e.getDepartment().equals("Product Development") && e.gender.equals("Male")).min(Comparator.comparing(Employee::getAge)).get();
        System.out.println(emp.toString());

    }

    private static void averageSalaryOfDepartment(List<Employee> employeeList) {
        Map<String, Double> avarageSalaryOfDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(avarageSalaryOfDepartment);
    }

    private static void countEmployeeDepartmentWise(List<Employee> employeeList) {
        Map<String, Long> countEmployeeDepartmentWise = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        System.out.println(countEmployeeDepartmentWise);
    }

    private static void nameEmployeeJoinedAfter(List<Employee> employeeList) {
        List<String> emps = employeeList.stream().filter(e-> e.yearOfJoining > 2015).map(Employee::getName).toList();
        emps.forEach(System.out::println);
    }

    private static void highestPaidEmployee(List<Employee> employeeList) {
        Optional<Employee> highestPaidEmployeeWrapper= employeeList.stream().max(Comparator.comparing(Employee::getSalary));
        Employee emp = highestPaidEmployeeWrapper.get();
        System.out.println(emp.toString());
    }

    private static void averageAgeOfEmployees(List<Employee> employeeList) {
        Map<String, Double> noOfMaleAndFemaleEmployees= employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(noOfMaleAndFemaleEmployees);
    }

    private static void printAllDepartmentName(List<Employee> employeeList) {
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out  :: println);
    }

    private static void howManyMaleFemale(List<Employee> employeeList) {
        Map<String, Long> noOfMaleAndFemaleEmployees= employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);
    }

}
