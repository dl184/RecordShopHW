import Interfaces.ISell;

import java.util.ArrayList;

public class Shop implements ISell {

    /* below we create an empty array using ISell Inferface calling it "stock" */

    private String name;
    private ArrayList<ISell> stock;
    private double money;

    /* below we initialize an empty array which is going to be used with the assigned name "stock" which is the
       declaration and the line below that is the assignment */
    public Shop(String name) {
        this.name = name;
        ArrayList<ISell> stock;
        stock = new ArrayList<ISell>();
    }

    public int getStockCount() {
        return stock.size();
    }


    /* below we pass in ISell which is the type and a placeholder name of item and add that item to stock which
    is an empty arrayList that we created  */
    public void addToStock(ISell item) {
        stock.add(item);
    }


    /* below we pass in ISell and an item which is a placeholder name, we use an IF statement and .contains method which
    checks to see the boolean value (true or false) and pass in the item we created to see if there is stock  and use
    stock.remove(item) which means remove that item from stock */
    public void removeFromStock(ISell item) {
        if (stock.contains(item)) {
            stock.remove(item);
        }
    }


    /* below we initialize "totalProfit" to start at 0,
       we then loop through "stock" which is an array list we created to find "item" (a name we created within the method)
       within that stock array,
       we then add totalProfit (which we set as 0) and use the .markUp method we created in the "ISell" on the
       items found in the array,
       we then return totalProfit which will now have an INT added to it*/

    public double markUp() {
        int totalProfit = 0;
        for (ISell item : stock) {
            totalProfit += item.markUp();
        }
        return totalProfit;

    }
}






