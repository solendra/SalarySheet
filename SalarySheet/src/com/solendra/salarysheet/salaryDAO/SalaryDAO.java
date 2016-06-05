/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solendra.salarysheet.salaryDAO;

import com.solendra.salarysheet.entity.Salary;
import java.util.List;

/**
 *
 * @author solendra
 */
public interface SalaryDAO {
    int insert(Salary s);
    List<Salary> getAll();
    Salary getById(int id);
    
}
