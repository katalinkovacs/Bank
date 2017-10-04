package model;

import java.sql.*;


public class DaoChild {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/katidb";

    //  Database credentials
    static final String USER = "admin";
    static final String PASS = "admin";


    // CONSTRUCTOR
    public DaoChild() {

    }


    // METHOD - CHECK DB CONNECTION
    public Connection checkDbConnection() {

        Connection connection = null;
        //Statement stmt = null;

        try {

            //   Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //   Open a connection
            System.out.println("Connecting to katidb database...");
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException e --> Something wih JDBC DRIVER --------- OR ????????? -----------------------");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQLException e --> wrong username or password or db name-----------------------------");
            e.printStackTrace();
        }

        return connection;
    }

    // METHOD - INSERT DATA
    public void insertData() {

        Connection conn = checkDbConnection();
        Statement stmt = null;
        try {

            //Execute a query
            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();

            //String sql = "INSERT INTO Child (id, Name, Age)" +
            //       "VALUES (1, 'Oliver', 11), (2, 'Kornel', 9), (3, 'Bulcsu', 39)";
            String sql = "INSERT INTO Child (id, Name, Age)" +"VALUES (1, 'Oliver', 11)";

            stmt.executeUpdate(sql);

            System.out.println("Inserted records into the table...");

        } catch (SQLException se) {
            //Handle errors for JDBC
            System.out.println("SQLException se --> Handle errors for JDBC");
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            System.out.println("Exception e --> Handle errors for Class.forName");
            e.printStackTrace();

        }

    }

    public void insertData2(int id, String name, int age) {



        Connection conn = checkDbConnection();
        Statement stmt = null;
        try {

            //Execute a query
            System.out.println("Inserting records into the table...");
            stmt = conn.createStatement();

            //String sql = "INSERT INTO Child (id, Name, Age) VALUES (" + c.getId() + ", \"" + c.getName() + "\"," + c.getAge() + ")";
            String sql = "INSERT INTO Child (id, Name, Age) VALUES (" + id + ", \"" + name + "\"," + age + ")";

            stmt.executeUpdate(sql);

            System.out.println("Inserted records into the table...");

        } catch (SQLException se) {
            //Handle errors for JDBC
            System.out.println("SQLException se --> Handle errors for JDBC");
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            System.out.println("Exception e --> Handle errors for Class.forName");
            e.printStackTrace();

        }

    }


    public  void selectEverythingFromChild(){

        System.out.println("-----------METHOD selectEverythingFromDb STARTS-----------");

        Connection conn = checkDbConnection();
        Statement stmt = null;

        try{

            System.out.println("-----------TRY STARTS-----------");
            stmt = conn.createStatement();
            String sql = "SELECT * FROM Child";
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(rs);

            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Name: " + name);
                System.out.println(", Age: " + age);
            }
            rs.close();
        }
        catch(SQLException se){
            //Handle errors for JDBC
            System.out.println("SQLException se --> Handle errors for JDBC ");
            se.printStackTrace();
        }
        catch(Exception e){
            //Handle errors for Class.forName
            System.out.println("Exception e --> Handle errors for Class.forName");
            e.printStackTrace();

        }
    }




}