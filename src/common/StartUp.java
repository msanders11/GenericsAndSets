package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author msanders11
 */
public class StartUp {
    
    public static void main(String[] args) {
        
        //Lab #2 : List of employees without generics
        
        List employees = new ArrayList();
        employees.add(new Employee("James", "Rick", "123-45-6789"));
        employees.add(new Employee("Smith", "John", "234-56-7891"));
        employees.add(new Employee("Jones", "Sally", "345-67-8912"));
        employees.add(new Employee("Doe", "Jane", "456-78-9123"));
        
        
        for(Object e: employees){
            Employee employee = (Employee)e;
            System.out.println(e);
        }
        
        //Lab #3 : List of employees with generics
        
        List<Employee> employees2 = new ArrayList<>();
        employees2.add(new Employee("Rodgers", "Aaron", "123-45-6789"));
        employees2.add(new Employee("Brogdon", "Malcom", "234-56-7891"));
        employees2.add(new Employee("Thames", "Eric", "345-67-8912"));
        employees2.add(new Employee("Jackson", "Jefferson", "456-78-9123"));
        
        for(Object e1 : employees2){
            System.out.println(e1);
        }
        
        
        //Lab #4 : Create Dog objects then place them into a set
        List<Dog> dogs = new ArrayList<>();
        
        dogs.add(new Dog("Max", 01));
        dogs.add(new Dog("Rosco", 02));
        dogs.add(new Dog("Lizzy", 03));
        dogs.add(new Dog("Rocky", 04));
        dogs.add(new Dog("Oddy", 03));
        
        Set<Dog> noDupes = new HashSet<Dog>(dogs);
        dogs = new ArrayList(noDupes);
        
        for(Dog d: dogs){
            System.out.println(d);
        }
        
        
    }
}
