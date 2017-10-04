package bank;

import childcare.Child;
import model.DaoChildZoli;

import java.util.List;

public class StartAppZoli {


    public static void main(String ... args){

        // here you create a new dao object
        DaoChildZoli dao = new DaoChildZoli();

        // and invoke the CRUD methods on it
        List<Child> myChildren = dao.getAllKidsd();


        for (Child c : myChildren){
            System.out.println(c.getName());
        }
    }
}
