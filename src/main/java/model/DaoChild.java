package model;

import childcare.Child;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoChild {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/katidb";

    //  Database credentials
    static final String USER = "admin";
    static final String PASS = "admin";


    public DaoChild() {
    }


    // this method gets invoked from every CRUD operation
    public static Connection getDBConnection() {

        Connection dbConnection = null;

        try {

            Class.forName(JDBC_DRIVER);

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());

        }

        try {

            dbConnection = DriverManager.getConnection(
                    DB_URL, USER, PASS);


        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return dbConnection;

    }


    // first CRUD operation
        //public void insertRecord(int idOfChild, String nameOfChild, int ageOfChild) {

        public void insertRecord(Child c) {


        System.out.println("--------INSERTRECORD Method STARTED----------");

        // here you getting the connection from the method above
        Connection conn = getDBConnection();
        Statement stmt = null;
        try {

            //STEP 4: Execute a query
            System.out.println("Inserting record into the table...");
            stmt = conn.createStatement();

            //String sql = "INSERT INTO Child (id, Name, Age)" +
               //     "VALUES (int idOfChild, String nameOfChild, int ageOfChild)";

            String sql = "INSERT INTO Child (id, Name, Age) VALUES (" + c.getId() + ", \"" + c.getName() + "\"," + c.getAge() + ")";

            System.out.println(sql);
            stmt.executeUpdate(sql);

            System.out.println("Inserted records with METHOD into the table...");

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }// do nothing
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try

    }


    //Another CRUD operation/method for example to get all kids
    public List<Child> getAllKidsd() {

        System.out.println("--------getAllKids Method STARTED----------");

        // here you getting the connection from the method above
        Connection conn = getDBConnection();
        Statement stmt = null;

        ArrayList<Child> childrenList = new ArrayList<Child>();
        try {

            //STEP 4: Execute a query
            System.out.println("select * from child...");
            stmt = conn.createStatement();

            String sql = "SELECT * FROM Child";
            System.out.println("SELECT * FROM Child");
            ResultSet rs = stmt.executeQuery(sql);  // RECORD LIST to rs



            // Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("Id");
                String name = rs.getString("Name");
                int age = rs.getInt("Age");

                Child currentChildRecord = new Child(id, name, age);
                System.out.println("currentChild created--------------------");
                System.out.println("Name is: " + currentChildRecord.getName());
                childrenList.add(currentChildRecord);
                //Display values
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    conn.close();
            } catch (SQLException se) {
            }// do nothing
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try

        // method returns all children
        return childrenList;

    }
}
