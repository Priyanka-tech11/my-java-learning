
class Employee {
    double salary = 30000;  

   
    public void work() {
        System.out.println("Employee is working");
    }

    public double getSalary() {
        return salary;
    }
}


class HRManager extends Employee {

   
    public void work() {
        System.out.println("HR Manager is managing employee relations");
    }

   
    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee");
    }
}

 class Main {
    public static void main(String[] args) {
       
        Employee emp = new Employee();
        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());

       
        HRManager hr = new HRManager();
        hr.salary = 50000; 
        hr.work();         
        System.out.println("HR Manager salary: " + hr.getSalary());
        hr.addEmployee(); 

    }
}
