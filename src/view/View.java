package view;

import db.EmployeeDB;
import models.Employee;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

    private static final Scanner scanner = new Scanner(System.in);
    private static EmployeeDB db = new EmployeeDB();
    List<Employee> mockData = new ArrayList<>();

    /**
     * Show the interface to add a employee to the db
     */
    public void showAddEmployee() throws ParseException {
        System.out.println("Please Type a Prename: ");
        String preName = scanner.nextLine();
        System.out.println("Your prename: "+preName+" has been noted, please type a sirName");
        String sirName = scanner.nextLine();
        System.out.println("Your sirName: "+sirName+" has been noted, please type a jobDescribtion");
        String jobDescribtion = scanner.nextLine();
        System.out.println("Your jobDescribtion: "+jobDescribtion+" has been noted, please type a birthdate");
        String source = scanner.nextLine();
        System.out.println("Your birthdate: "+source+" has been noted, please type a salary");
        Double salary = scanner.nextDouble();
        System.out.println("Your person has been noted, those are his details:");

        mockData.add(new Employee(preName, sirName, jobDescribtion, util.HRManagerUtil.formatter.parse(source), salary, util.HRManagerUtil.formatter.parse(source)));
        System.out.println("your prename: "+preName+"\n your sirname: "+ sirName+"\n your jobDescribtion: "+ jobDescribtion+"\n your birthday: " +source+"\n your salary: "+ salary);

    }

    /**
     * Show the interface to edit a employee to the db
     */
    public void showEditEmployee() throws ParseException {
        System.out.println("Please type the ID of the User wich you want to edit: ");
        String editID = scanner.nextLine();
        int updateRow =0;
        boolean IdGibtEs = false;
        for(Employee employee : db.getEmployees()) {
            if (employee.getId().equals(editID)){
                System.out.println("The User with this data has been removed");
                System.out.println("Prename: "+employee.getPrename());
                System.out.println("Surname: "+employee.getSurname());
                System.out.println("JobDescription: "+employee.getJobDescription());
                System.out.println("Birthdate: "+employee.getBirthdate());
                System.out.println("Salary: "+employee.getSalary());
                System.out.println("EmploymentDate: "+employee.getEmploymentDate());
                EmployeeDB.updateEmployee(employee, updateRow);
                System.out.println();
                System.out.println("please type the new data for the user:");
                System.out.println();
                showAddEmployee();
                IdGibtEs = true;
            }
            updateRow++;
        }
        if (IdGibtEs==false){
            System.out.println("diesen User gibt es leider nicht!");
        }
    }

    /**
     * Show the list of all employees from the db
     */
    public void showListEmployees() {
        for(Employee employee : db.getEmployees()) {

            System.out.println("Prename: "+employee.getPrename());
            System.out.println("Surname: "+employee.getSurname());
            System.out.println("JobDescription: "+employee.getJobDescription());
            System.out.println("Birthdate: "+employee.getBirthdate());
            System.out.println("Salary: "+employee.getSalary());
            System.out.println("EmploymentDate: "+employee.getEmploymentDate());
            System.out.println("ID: "+employee.getId());
        }

    }

    /**
     * Show the interface to delete a employee
     */
    public void showDeleteEmployee() {
        System.out.println("Please type the ID of the User wich you want to delete: ");
        String deleteID = scanner.nextLine();
        int deleteRow =0;
        boolean IdGibtEs = false;
        for(Employee employee : db.getEmployees()) {
            if (employee.getId().equals(deleteID)){
                System.out.println("The User with this data has been removed");
                System.out.println("Prename: "+employee.getPrename());
                System.out.println("Surname: "+employee.getSurname());
                System.out.println("JobDescription: "+employee.getJobDescription());
                System.out.println("Birthdate: "+employee.getBirthdate());
                System.out.println("Salary: "+employee.getSalary());
                System.out.println("EmploymentDate: "+employee.getEmploymentDate());
                EmployeeDB.deleteEmployee(employee, deleteRow);
                IdGibtEs = true;
            }
            deleteRow++;
        }
        if (IdGibtEs==false){
            System.out.println("diesen User gibt es leider nicht!");
        }
    }

    /**
     * Internal method to print out a employee
     *
     * @param employee to show
     */
    private void showEmployee(Employee employee) {
        System.out.println("Please type the ID of the User wich you want to delete: ");
        String showID = scanner.nextLine();
        boolean IdGibtEs = false;
        for(Employee employees : db.getEmployees()) {
            if (employee.getId().equals(showID)){
                System.out.println("The User with this data has been removed");
                System.out.println("Prename: "+employee.getPrename());
                System.out.println("Surname: "+employee.getSurname());
                System.out.println("JobDescription: "+employee.getJobDescription());
                System.out.println("Birthdate: "+employee.getBirthdate());
                System.out.println("Salary: "+employee.getSalary());
                System.out.println("EmploymentDate: "+employee.getEmploymentDate());
                IdGibtEs = true;
            }
        }
        if (IdGibtEs==false){
            System.out.println("diesen User gibt es leider nicht!");
        }
    }
}
