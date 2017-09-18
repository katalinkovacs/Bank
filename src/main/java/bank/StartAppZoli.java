package bank;

import childcare.Child;
import model.DaoChild;

import java.util.List;

public class StartAppZoli {


    public static void main(String ... args){

        // here you create a new dao object
        DaoChild dao = new DaoChild();

        // and invoke the CRUD methods on it
        List<Child> myChildren = dao.getAllKidsd();


        for (Child c : myChildren){
            System.out.println(c.getName());
        }
    }
}
