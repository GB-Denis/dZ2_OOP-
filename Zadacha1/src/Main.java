import Vending.VendingMachineModel1;
import Vending.Product;
public class Main {
    public static void main(String[] args) {
        VendingMachineModel1 vendingMachine = new VendingMachineModel1("Мега", 1, 100);
        System.out.println(vendingMachine);
        vendingMachine.putProduct(new Product("Snickers", 5), 50);
        vendingMachine.putProduct(new Product("Mars", 5), 50);
        System.out.println(vendingMachine);
        vendingMachine.getProduct(new Product("Snickers", 5));
        System.out.println(vendingMachine);
    }
}
