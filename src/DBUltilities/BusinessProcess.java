/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBUltilities;

import entities.Employee;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ttay2
 */
public class BusinessProcess {

    public static Employee getEmpById(int id) {
        Connection con = DBUltilities.loadDb();
        Employee emp = null;
        if (con != null) {
            try {
                Statement stm = con.createStatement();
                ResultSet rs = stm.executeQuery("select * from employees where Emp_ID=" + id);
                if (rs != null) {
                    while (rs.next()) {
                        emp = new Employee();
                        emp.setEmpId(rs.getInt("Emp_ID"));
                        emp.setFullName(rs.getString("FullName"));
                        emp.setUaeId(rs.getString("UaeID"));
                        emp.setVisaRenew(rs.getTimestamp("VisaRenew"));
                        emp.setCell1(rs.getString("Cell_1"));
                        emp.setCell2(rs.getString("Cell_2"));
                        emp.setCell3(rs.getString("Cell_3"));
                        emp.setBankCardNo(rs.getString("CardNo"));
                        emp.setDOB(rs.getTimestamp("DOB"));
                        emp.setPassportNo(rs.getString("PassportNo"));
                        emp.setSalary(rs.getString("Salary"));
                        emp.setWPS(rs.getString("WPS"));
                        emp.setJoinDate(rs.getTimestamp("JoiningDate"));
                        emp.setMMName(rs.getString("MMname"));
                        emp.setRemarks(rs.getString("Remarks"));
                        emp.setDesignation(rs.getString("Designation"));
                    }
                }
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(BusinessProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return emp;
    }

    public static boolean addEmp(Employee emp) {
        Connection con = DBUltilities.loadDb();
        boolean rs = false;
        if (con != null) {
            try {
                String query = "insert into employees (Emp_ID,FullName,UaeId,VisaRenew,Cell_1,Cell_2,Cell_3,CardNo,DOB,PassportNo,Salary,WPS,JoiningDate,MMname,Remarks,Designation)"
                        + " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement stm = con.prepareStatement(query);
                stm.setInt(1, emp.getEmpId());
                stm.setString(2, emp.getFullName());
                stm.setString(3, emp.getUaeId());
                stm.setDate(4, new Date(emp.getVisaRenew().getTime()));
                stm.setString(5, emp.getCell1());
                stm.setString(6, emp.getCell2());
                stm.setString(7, emp.getCell3());
                stm.setString(8, emp.getBankCardNo());
                stm.setDate(9, new Date(emp.getDOB().getTime()));
                stm.setString(10, emp.getPassportNo());
                stm.setString(11, emp.getSalary());
                stm.setString(12, emp.getWPS());
                stm.setDate(13, new Date(emp.getJoinDate().getTime()));
                stm.setString(14, emp.getMMName());
                stm.setString(15, emp.getRemarks());
                stm.setString(16, emp.getDesignation());
                rs = stm.execute();
                con.close();

            } catch (SQLException ex) {
                Logger.getLogger(BusinessProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return rs;
    }
}
