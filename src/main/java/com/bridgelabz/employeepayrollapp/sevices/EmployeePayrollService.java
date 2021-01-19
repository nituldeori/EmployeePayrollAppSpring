package com.bridgelabz.employeepayrollapp.sevices;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

import org.springframework.stereotype.Service;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {
    
    @Override
    public List<EmployeePayrollData> getEmployeePayrollData(){
        List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        employeePayrollList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Pankaj", 3000)));
        return employeePayrollList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId){
        return null;
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO){
        return null;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO){
        return null;
    }

    @Override
    public void deleteEmployeePayrollData(int empId){
        
    }
    
}
