/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solendra.salarysheet.salaryDAOImp;

import com.solendra.salarysheet.entity.Salary;
import com.solendra.salarysheet.salaryDAO.SalaryDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author solendra
 */
public class SalaryDAOImp implements SalaryDAO{
    private List<Salary> salaryList=new ArrayList<>();
    @Override
    public int insert(Salary s) {
      salaryList.add(s);
    return 1;}

    @Override
    public List<Salary> getAll() {
       return  salaryList;
       }

    @Override
    public Salary getById(int id) {
        for(Salary s:salaryList){
        if(s.getId()==id){
            return s;
        }
        }
        return null;
        }
    
}
