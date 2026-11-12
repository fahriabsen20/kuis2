import java.util.Scanner;

public class Kuis12Fakhri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nim2 = 18;
        int k = (nim2 % 3) + 3;
        int porsi;
        int total = 0;
        int jumlahTransaksi = 0;

        System.out.print("Jumlah porsi (0 = selesai): ");
        porsi = sc.nextInt();

        int diskon;
        diskon = (k * 1000)

        while (porsi != 0) {
            if (porsi < 1 || porsi > 10) {
                System.out.println("Input tidak valid.");
                jumlahTransaksi++;
                System.out.print("Jumlah porsi (0 = selesai): ");
                porsi = sc.nextInt();
                continue;
            }
            // Harga: porsi pertama Rp 15000, porsi berikutnya Rp 12000 per porsi
            int biaya = 15000 + (porsi - 1) * 12000;
            total += biaya;
            System.out.println("Biaya: Rp " + biaya);

            System.out.print("Jumlah porsi (0 = selesai): ");
            porsi = sc.nextInt();
            jumlahTransaksi++;
        }

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah transaksi : " + jumlahTransaksi);
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("Porsi terbanyak  : " + (jumlahTransaksi > 0 ? total / jumlahTransaksi : 0));
        System.out.println("Jumlah transaksi (membeli lebih dari 2 porsi): " + (jumlahTransaksi > 0 ? (total / jumlahTransaksi > 2 ? jumlahTransaksi : 0) : 0));
        System.out.println("Total diskon = " + diskon);

        sc.close();
    }
}