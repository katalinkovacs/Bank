package model;

import childcare.Child;

import java.sql.*;
import java.util.ArrayList;


public class Dao {


    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/katidb";

    //  Database credentials
    static final String USER = "admin";
    static final String PASS = "admin";


    //CHECK DATABASE CONNECTION METHOD   -->     this method gets invoked from every CRUD operation
    public static Connection getDataBaseConnection() {

        Connection dbConnection = null;

        try {

            Class.forName(JDBC_DRIVER);

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());
            System.out.println("ClassNotFoundException-----------What e message??????????????");

        }

        try {

            dbConnection = DriverManager.getConnection(
                    DB_URL, USER, PASS);


        } catch (SQLException e) {

            System.out.println(e.getMessage());
            System.out.println("SQLException------------Wrong DBname OR user/pw credentials");

        }
        System.out.println("------------------Connected to DB??????????????????-----------------------");
        return dbConnection;

    }

/*
    public void insertData() {

        System.out.println("--------insertData Method STARTED----------");

        Connection conn = null;
        Statement stmt = null;

            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to katidb database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating a SELECT statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM Child";
            System.out.println("SELECT * FROM Child");
            ResultSet rs = stmt.executeQuery(sql);  // RECORD LIST to rs


            ArrayList<Child> childrenList = new ArrayList<Child>();
            //List childrenList  = new ArrayList<String>();


            //STEP 5: Extract data from result set
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

            System.out.println(childrenList.size());


    }

*/
}
