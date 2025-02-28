package listid;

import java.util.ArrayList;
import java.util.List;

public class GroceryList {

    private List<String> grocerylist = new ArrayList<>();
    //noolte vahel andmetüüp, mida listis hoitakse
    //Peab olema objekt, ei tohi olla primitiivne tüüp (int, boolean, double, jne)
    //nr-t, pikkust/suurust ei määra

    public void addItem(String item) {
        //myArray[i] = item;
        grocerylist.add(item);
    }
    public void printGroceryList() {
        System.out.println("Sul on listis " + grocerylist.size() + " asja");
        for(int i = 0; i<grocerylist.size(); i++) {
            System.out.println((i+1) +  ". " + grocerylist.get(i));
            //myArray[i]
        }
    }
    private void modifyItem(int position, String newItem) {
        grocerylist.set(position,newItem);
    }
    public void modifyItem(String oldItem, String newItem) {
        int position = findItem(oldItem);
        if(position >= 0) {
            modifyItem(position, newItem);
        }
    }

    private void removeItem(int position) {
        grocerylist.remove(position);
    }

    public void removeItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeItem(position);
        }
    }

    private int findItem(String item) {
        return grocerylist.indexOf(item);
        //kui ei eksisteeri, siis returnitakse -1
    }

    public boolean onFile(String item) {
        int position = findItem(item);
        return position >= 0; //annab true või false
        //int puhul "error" on -1
        //Kui item listis pole, tuleb position väärtuseks -1 ja returnitakse false
        //(kuna -1 ei ole >= 0)
    }

}
