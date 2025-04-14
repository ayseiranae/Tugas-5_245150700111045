import java.util.Scanner;

public class ProduksiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produksi p = new Produksi();

        System.out.println("Please enter the product:");
        System.out.println("1. Jacket A\n2. Jacket B\n3. Jacket C");
        int productName = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter product quantity:");
        int productQuantity = sc.nextInt();
        sc.nextLine();

        if (productName == 1) {
            p.jacket_aCost(productQuantity);
        } else if (productName == 2) {
            p.jacket_bCost(productQuantity);
        } else if (productName == 3) {
            p.jacket_cCost(productQuantity);
        }
        sc.close();
    }
}