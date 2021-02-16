abstract class Bank{
    abstract String getDetails();
}
class SBI extends Bank{
    String getDetails(){
        return "SBI home rate of interest 8%" ; 
    }
}
class ICICI extends Bank{
    String getDetails(){
        return "ICICI home rate of interest 15%" ;
    }     
}
class BOI extends Bank{
    String getDetails(){
        return "BOI home rate of interest 5%" ;
    }
}
class Employee{
    public static void main(String[] args){
        Bank bank = new SBI();
        System.out.println(bank.getDetails());
        bank = new ICICI();
        System.out.println(bank.getDetails());
        bank = new BOI();
        System.out.println(bank.getDetails());
    }
}

