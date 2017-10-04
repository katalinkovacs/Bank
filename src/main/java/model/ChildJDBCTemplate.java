package model;

import childcare.Child;
import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.util.List;


//This class must be declared as abstract or implement abstract method????????????????????????????????

public class ChildJDBCTemplate implements ChildDAO{

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {

        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void insertRecord(int id, String name, int age) {

        String SQL = "insert into Child (id, name, age) values (55, Piroska, 12)";
        jdbcTemplateObject.update( SQL, id, name, age);   //???????????????????????????????????????
        System.out.println("Created Record ID is = " +id +" Name is: " + name + " Age = " + age);
        return;

    }

    public Child findChildById(int id) {

        String SQL = "select * from Child where id = 1";
        Child child = (Child) jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new ChildMapper());   // CAST To Childcare.Child????????????

        return child;

    }

    public List<Child> listAllChildren() {

        String SQL = "select * from Child";
        List <Child> children = jdbcTemplateObject.query(SQL, new ChildMapper());

        return children;
    }

    public void deleteRecord(int id) {

        String SQL = "delete from Child where id = 2";
        jdbcTemplateObject.update(SQL, id);             //????????????????????????????????????????
        System.out.println("Deleted Record with ID = " + id );
        return;

    }

    public void update(int id, int age){

        String SQL = "update Child set age = 11 where id = 16";
        jdbcTemplateObject.update(SQL, age, id);                    //????????????????????????????????????????
        System.out.println("Updated Record with ID = " + id );

        return;
    }

}
