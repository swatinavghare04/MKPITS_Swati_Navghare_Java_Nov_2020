// WAP to demonstrate example, how to add, update, delete and search data from the table.

package com.mkpits.java.jdbcexamples;

import java.sql.*;

public class Employee {
    int empid;
    String empname;
    String empaddress;

    Connection con = null;
    Statement stmt = null;

    public void connect(){
        try{
              Class.forName("org.postgresql.Driver");
              con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mkpits01","postgres","sa");
        } catch(Exception ee){
            System.out.println(ee.toString());
        }
    }

    public String addEmployee(int empid, String empname, String empaddress){
        this.empid = empid;
        this.empname = empname;
        this.empaddress = empaddress;

        try{
            connect();
            String str = "insert into employee values("+empid+",'"+empname+"','"+empaddress+"')";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
            return "Employee added Successfully";
        } catch(Exception ee){
            return ee.toString();
        }
      }

      public String updateEmployee(int empid, String empname, String empaddress){
        this.empid = empid;
          this.empname = empname;
          this.empaddress = empaddress;

          try{
              connect();
              String str = "update employee set empname='"+empname+"',empaddress='"+empaddress+"' where empid="+empid+"";
              stmt = con.createStatement();
              stmt.executeUpdate(str);
              stmt.close();
              con.close();
              return "Employee updated Successfully";
          } catch(Exception ee){
              return ee.toString();
          }
      }

    public String removeEmployee(int empid){
        this.empid = empid;

        try{
            connect();
            String str = "delete from employee where empid="+empid+"";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
            return "Employee remove Successfully";
        } catch(Exception ee){
            return ee.toString();
        }
     }

    public String searchEmployee(int empid){
        this.empid = empid;
        int flag = 0;
        String res = null;
        try {
            connect();
            String str = "search * from employee where empid=" + empid + "";
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(str);

            while (rs.next()) {
                flag = 1;
                this.empname = rs.getString("empname");
                this.empaddress = rs.getString("empaddress");
            }
            rs.close();
            stmt.close();
            con.close();

            if (flag == 0) {

                res = "No record found";
            }
            return res;
        } catch(Exception ee){
            return ee.toString();
          }
       }
    }

