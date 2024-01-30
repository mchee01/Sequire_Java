package test;

public class Electronics extends Product{
    private double kwh;
   
    public Electronics(){}
    public Electronics(int price, String prdName){
        super.price= price;
        super.prdName = prdName;
        
    }
    public double getKwh() {
        return kwh;
    }
    public void setKwh(double kwh) {
        this.kwh = kwh;
    }
    public double power(){
        return kwh/24;
    }
    @Override
    public String sell(Object a) {
        return String.format("[%s] 증정 -%s", prdName, a);
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Field value kwh \n"+kwh+"prdName\n"+prdName+"price\n"+price;
    }
}
