package MODUL1;
import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    List<Menu> listMenu = new ArrayList<Menu>();

    // TODO Create Method to Insert Menu to Database
    public void insertMenu(Menu menu){
        listMenu.add(menu);
    }

    // TODO Create Method to Show Menu from Database
    public void showMenu(){
        for (int i = 0; i < listMenu.size(); i++){
            System.out.println((i + 1) + "." + listMenu.get(i).Menu + listMenu.get(i).Category + listMenu.get(i).Price);
    
        }
    }


    // TODO Create Method to Search Menu from Database


}
