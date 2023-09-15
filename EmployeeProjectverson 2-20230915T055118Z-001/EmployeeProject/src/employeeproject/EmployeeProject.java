/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproject;

/**
 *
 * @author User
 */
public class EmployeeProject {
    public static void main(String[] args) {
       //The salary for all Employee classes is found in the display method
       //The computeSalary method is called in their display methods
       
       Date emp1Bday = new Date(27, 02, 2003);
       Date emp1HireDate = new Date(15, 12, 2022); 
       HourlyEmployee emp1 = new HourlyEmployee(123, "Jamal", emp1HireDate, emp1Bday, 40, 1000);
       emp1.displayInfo();
       
       Date emp2Bday = new Date(29, 03, 1999); 
       Date emp2HireDate = new Date(16, 04, 2021);
       PieceWorkerEmployee emp2 = new PieceWorkerEmployee(999, "Pat", emp2HireDate, emp2Bday, 200, 50);
       emp2.displayInfo();
       
       Date emp3Bday = new Date(218, 02, 1995); 
       Date emp3HireDate = new Date(20, 07, 2016);
       CommissionEmployee emp3 = new CommissionEmployee(696, "Sean", emp3HireDate, emp3Bday, 175000); 
       emp3.displayInfo();
       
       Date emp4Bday = new Date(18, 06, 2000); 
       Date emp4HireDate = new Date(20, 12, 2018);
       BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee(420, "BettleJuice", emp4HireDate, emp4Bday, 250000, 50000); 
       emp4.displayInfo();
       
    }
    
}
