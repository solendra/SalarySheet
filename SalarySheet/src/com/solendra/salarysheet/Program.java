/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solendra.salarysheet;

import com.solendra.salarysheet.entity.Salary;
import com.solendra.salarysheet.salaryDAO.SalaryDAO;
import com.solendra.salarysheet.salaryDAOImp.SalaryDAOImp;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author solendra
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            SalaryDAO salaryDAO = new SalaryDAOImp();

            BufferedReader reader = new BufferedReader(new FileReader("f:/salarysheet.csv"));
            String line;
            StringBuilder builder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
               
            //System.out.println(line);

           

            String[] tokens = line.split(",");
            //System.out.println(tokens.length);

            Salary salary = new Salary();
           if(tokens.length>=7) {
                salary.setId(Integer.parseInt(tokens[0]));
                salary.setFirstName(tokens[1]);
                salary.setLastName(tokens[2]);
                salary.setEmail(tokens[3]);
                salary.setContact(tokens[4]);
                salary.setSalary(Integer.parseInt(tokens[5]));
                salary.setSalaryStatus(Boolean.parseBoolean(tokens[6]));

                salaryDAO.insert(salary);
                //System.out.println(salary);
            }
            }
            //System.out.println(salaryDAO.getAll());
            salaryDAO.getAll().forEach(s -> {
                System.out.println(s);
            });
            reader.close();
            
           
            

        } 
        catch (IOException ioe) {
            System.out.println("File not FOund: "+ioe.getMessage());
        }

    }

}
