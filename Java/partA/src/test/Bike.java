package test;

public class Bike extends Product {
    private int speed;
    public Bike(){}
    public Bike(int price, String prdName, int speed){
        super.price= price;
        super.prdName = prdName;
        this.speed = speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
    public String ride(){
        return "당신은 이것을 시속 "+speed+"km 로 탈 수 있습니다.";
    }
    @Override
    public String sell(Object a) {
        // TODO Auto-generated method stub
        return String.format("[%s]행사 - %d %%인하",prdName, a);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Field value "+"speed \n"+speed+"prdName\n"+prdName+"price\n"+price;
    }
}

    
