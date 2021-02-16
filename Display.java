enum house {
    FLAT(30000),HOUSE(1000000),VILLA(6000000),PENTHOUSE(23500000);
    int price;
    house(int price) {
        this.price = price;
    }
    int getPrice() {
        return price;
    }
}
    public class Main{
        public static void main(String[] args) {
            for(house x :house.values()){
                System.out.println(x + " has a price of "+x.getPrice());
            }
        }
    }