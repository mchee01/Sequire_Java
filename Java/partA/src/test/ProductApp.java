package test;

public class ProductApp {

    public static void main(String[] args) {
        Product []cart = new Product[10];
        
        Bike bike = new Bike();
        cart[0] = new Bike(123000, "MTB", 25);
        cart[3] = new Bike(99000, "삼천리", 15);
        
        //end
        cart[1] = new Electronics(35000, "USB" );
        cart[5] = new Electronics(527000,"스마트TV");
        Electronics ele = new Electronics();
        ele.setKwh(0.9);
        cart[7] = new Electronics(2250000,"LG냉장고");
        
        System.out.println("kwh:"+ele.power()); // 24시간 당 전력소비량 kwh / 24
        
        for(int i=0; i < cart.length; i++){
            try {
                if(cart[i].price == 100000){
                    System.out.println(cart[i].toString());
                }
                if(cart[i].getClass().getName() == "Bike"){
                    System.out.println(bike.ride());
                }
            } catch (NullPointerException e) {
                // TODO: handle exception
            }
            }
           
        
        System.out.println(cart[3].sell(20));
        System.out.println(cart[5].sell("사운드바"));
    }
}
