package restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant r1=new Restaurant("Fish",45,2,"Threestar","Anything");
        System.out.println("Give me "+ r1.getDishname()+" the amount is "+r1.getAmount()+" the order is "+r1.getOrders()+" and the resturant is "+r1.getType()+" "+r1.getMenu());
    }
}
