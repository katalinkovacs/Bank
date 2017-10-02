package childcare;


import model.Dao;
import model.DaoChild;

public class StartApp02 {

    public static void main(String[] args) {

        //ChildCare childcare1 = new ChildCare("One Tree", "Altona Meadows");

        //DaoChild dao = new DaoChild();

       //Child c1 = new Child(15, "Sebike", 3);

        //dao.insertRecord(c1);

        //Child c2 = new Child(16, "Katika", 42);

        //dao.insertRecord(c2);
       //System.out.println("--------LIST: ");
        //dao.getAllKidsd();

        Dao dao = new Dao();
        dao.checkDbConnection();
        //dao.insertData();
        dao.selectEverythingFromDb();


    }
}
