package design_pattern;

public class FactoryDP {
    public static void main(String args[] ){
        String args1 = "Bakery";
        String args2 = "Vagitable";

        SuperMarket superMarket = FoodCreatingShop.getFood("Bakery");
        superMarket.foo();
        SuperMarket superMarket2 = FoodCreatingShop.getFood("Vagitable");
        superMarket2.foo();
    }
}

class FoodCreatingShop{
    public static SuperMarket getFood(String args){
        SuperMarket superMarket;
        if(args.equals("Bakery")){
            superMarket = new Bakery();
        }else if(args.equals("Vagitable")){
            superMarket = new Vagitable();
        }else {
            superMarket = new Meat();
        }
        return superMarket;
    }
}

class SuperMarket {
    public void foo(){
        System.out.println("Keells");
    }
}

class Bakery extends SuperMarket{
    public void foo(){
        System.out.println("Bakery");
    }
}
class Vagitable extends SuperMarket{
    public void foo(){
        System.out.println("Vagitable");
    }
}

class Meat extends  SuperMarket{
    public void foo(){
        System.out.println("Meat");
    }
}