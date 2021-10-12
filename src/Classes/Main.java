package Classes;

public class Main {
    //CLASSES --templates for creating Java objects ^^
    public static void main(String[] args){
        // //creating local variable, calling on object by initializing it
        // Car nissan = new Car();

        // System.out.println(nissan.getModel());
        // nissan.setModel("Toyota");
        // System.out.println(nissan.getModel()); 
        // nissan.setModel("Altima");
        // System.out.println(nissan.getModel());
        
        // BankAccount kenyon = new BankAccount();
        BankAccount kenyon = new BankAccount(1234, 1000, "Kenyon Luce", "kenyon@email.com", 2102102100);

        System.out.println(kenyon.getAccount());
        System.out.println(kenyon.getBalance());
        System.out.println(kenyon.getName());
        System.out.println(kenyon.getEmail());
        System.out.println(kenyon.getPhone());
    }
}
