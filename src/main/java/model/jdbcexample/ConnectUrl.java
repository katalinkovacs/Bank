package model.jdbcexample;

import childcare.Child;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ConnectUrl {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/katidb";

    //  Database credentials
    static final String USER = "admin";
    static final String PASS = "admin";

    public static void main(String[] args) {

        System.out.println("--------MAIN STARTED----------");

        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to katidb database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            System.out.println("Creating a SELECT statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM Child";
            System.out.println("SELECT * FROM Child");
            ResultSet rs = stmt.executeQuery(sql);  // RECORD LIST to rs


            ArrayList<Child> childrenList  = new ArrayList<Child>();
            //List childrenList  = new ArrayList<String>();


            //STEP 5: Extract data from result set
            while(rs.next()){


                //Retrieve by column name
                int id  = rs.getInt("Id");
                String name = rs.getString("Name");
                int age = rs.getInt("Age");

                Child currentChildRecord = new Child(id, name, age);
                System.out.println("currentChild created--------------------");
                System.out.println("Name is: " +currentChildRecord.getName());

                childrenList.add(currentChildRecord);


                //Display values
                System.out.println("ID: " + id +", Name: " + name +", Age: " + age);



            }

            System.out.println(childrenList.size());




            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye my friend!");
    }//end main





}
