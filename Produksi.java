import java.text.NumberFormat;
import java.util.Locale;

class Produksi {
    public final int jacket_a = 100000;
    public final int jacket_b = 125000;
    public final int jacket_c = 175000;

    public int totalCost;

    Locale rupiah = new Locale.Builder().setLanguage("id").setRegion("ID").build();
    NumberFormat ind = NumberFormat.getCurrencyInstance(rupiah);

    public void jacket_aCost(int total) {
        int cost = (total > 100) ? 95000 : jacket_a;
        int total_a = cost * total;
        System.out.println("Total amount for Jacket A: " + ind.format(total_a));
        totalCost += total_a;
    }
    public void jacket_bCost(int total) {
        int cost = (total > 100) ? 95000 : jacket_a;
        int total_b = cost * total;
        System.out.println("Total amount for Jacket A: " + ind.format(total_b));
        totalCost += total_b;
    }
    public void jacket_cCost(int total) {
        int cost = (total > 100) ? 95000 : jacket_a;
        int total_c = cost * total;
        System.out.println("Total amount for Jacket A: " + ind.format(total_c));
        totalCost += total_c;
    }
    public int getTotalCost() {
        return totalCost;
    }
}