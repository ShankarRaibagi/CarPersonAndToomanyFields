package restaurant;

public class Restaurant {
    String dishname;
    int amount;
    int orders;
    String type;
    String menu;

    public Restaurant(String dishname, int amount, int orders, String type, String menu) {
        this.dishname = dishname;
        this.amount = amount;
        this.orders = orders;
        this.type = type;
        this.menu = menu;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getOrders() {
        return orders;
    }

    public void setOrders(int orders) {
        this.orders = orders;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }


}
