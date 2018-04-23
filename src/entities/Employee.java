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
public class Employee {

    int EmpId;
    String FullName;
    String UaeId;
    Date VisaRenew;
    String Cell1;
    String Cell2;
    String Cell3;
    String BankCardNo;
    Date DOB;
    String PassportNo;
    String Salary;
    String WPS;
    Date JoinDate;
    String MMName;
    String Remarks;
    String Designation;

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int EmpId) {
        this.EmpId = EmpId;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getUaeId() {
        return UaeId;
    }

    public void setUaeId(String UaeId) {
        this.UaeId = UaeId;
    }

    public Date getVisaRenew() {
        return VisaRenew;
    }

    public void setVisaRenew(Date VisaRenew) {
        this.VisaRenew = VisaRenew;
    }

    public String getCell1() {
        return Cell1;
    }

    public void setCell1(String Cell1) {
        this.Cell1 = Cell1;
    }

    public String getCell2() {
        return Cell2;
    }

    public void setCell2(String Cell2) {
        this.Cell2 = Cell2;
    }

    public String getCell3() {
        return Cell3;
    }

    public void setCell3(String Cell3) {
        this.Cell3 = Cell3;
    }

    public String getBankCardNo() {
        return BankCardNo;
    }

    public void setBankCardNo(String BankCardNo) {
        this.BankCardNo = BankCardNo;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getPassportNo() {
        return PassportNo;
    }

    public void setPassportNo(String PassportNo) {
        this.PassportNo = PassportNo;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public String getWPS() {
        return WPS;
    }

    public void setWPS(String WPS) {
        this.WPS = WPS;
    }

    public Date getJoinDate() {
        return JoinDate;
    }

    public void setJoinDate(Date JoinDate) {
        this.JoinDate = JoinDate;
    }

    public String getMMName() {
        return MMName;
    }

    public void setMMName(String MMName) {
        this.MMName = MMName;
    }

    public String getRemarks() {
        return Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public Employee(int EmpId, String FullName, String UaeId, Date VisaRenew, String Cell1, String Cell2, String Cell3, String BankCardNo, Date DOB, String PassportNo, String Salary, String WPS, Date JoinDate, String MMName, String Remarks, String Designation) {
        this.EmpId = EmpId;
        this.FullName = FullName;
        this.UaeId = UaeId;
        this.VisaRenew = VisaRenew;
        this.Cell1 = Cell1;
        this.Cell2 = Cell2;
        this.Cell3 = Cell3;
        this.BankCardNo = BankCardNo;
        this.DOB = DOB;
        this.PassportNo = PassportNo;
        this.Salary = Salary;
        this.WPS = WPS;
        this.JoinDate = JoinDate;
        this.MMName = MMName;
        this.Remarks = Remarks;
        this.Designation = Designation;
    }

    public Employee() {
    }

}
