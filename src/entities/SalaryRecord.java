/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author ttay2
 */
public class SalaryRecord {

    int EmpId;
    double deduct;
    int absence;
    Date DateOfSalary;
    double PaidSalary;

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int EmpId) {
        this.EmpId = EmpId;
    }

    public double getDeduct() {
        return deduct;
    }

    public void setDeduct(double deduct) {
        this.deduct = deduct;
    }

    public int getAbsence() {
        return absence;
    }

    public void setAbsence(int absence) {
        this.absence = absence;
    }

    public Date getDateOfSalary() {
        return DateOfSalary;
    }

    public void setDateOfSalary(Date DateOfSalary) {
        this.DateOfSalary = DateOfSalary;
    }

    public double getPaidSalary() {
        return PaidSalary;
    }

    public void setPaidSalary(double PaidSalary) {
        this.PaidSalary = PaidSalary;
    }

    public SalaryRecord(int EmpId, double deduct, int absence, Date DateOfSalary, double PaidSalary) {
        this.EmpId = EmpId;
        this.deduct = deduct;
        this.absence = absence;
        this.DateOfSalary = DateOfSalary;
        this.PaidSalary = PaidSalary;
    }

    public SalaryRecord() {
    }

}
