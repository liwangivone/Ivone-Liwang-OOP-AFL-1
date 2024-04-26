import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("========== Selamat Datang di Perpustakaan ==========");
            System.out.println("1. Login sebagai Pustakawan");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu: ");

            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        // Create Pustakawan object
                        Pustakawan pustakawan = createPustakawan(scanner);
                        // Do something with pustakawan object, for example, login
                        // For now, just print the created pustakawan object
                        System.out.println("Pustakawan baru berhasil dibuat:");
                        System.out.println("ID: " + pustakawan.getIdPustakawan());
                        System.out.println("Nama: " + pustakawan.getNama());
                        System.out.println("Alamat: " + pustakawan.getAlamat());
                        System.out.println("Gender: " + pustakawan.getGender());
                        System.out.println("Nomor Telepon: " + pustakawan.getNomorTelp());
                        System.out.println("Email: " + pustakawan.getEmail());
                        System.out.println("Password: " + pustakawan.getPassword());
                        break;
                    case 2:
                        System.out.println("Terima kasih telah menggunakan sistem manajemen perpustakaan!");
                        return;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                        continue; // Kembali ke awal loop
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.nextLine(); // clear the buffer
            }
        }
    }

    private static Pustakawan createPustakawan(Scanner scanner) {
        scanner.nextLine(); // clear the buffer

        String idPustakawan = "";
        String nama = "";
        String alamat = "";
        String gender = "";
        String nomorTelp = "";
        String email = "";
        String password = "";

        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.println("Masukkan ID Pustakawan:");
                idPustakawan = scanner.nextLine();

                System.out.println("Masukkan Nama:");
                nama = scanner.nextLine();
                if (!nama.matches("[a-zA-Z]+")) {
                    throw new Exception("Tipe data tidak valid. Masukkan hanya huruf.");
                }

                System.out.println("Masukkan Alamat:");
                alamat = scanner.nextLine();

                System.out.println("Masukkan Gender:");
                gender = scanner.nextLine();

                System.out.println("Masukkan Nomor Telepon:");
                nomorTelp = scanner.nextLine();
                if (!nomorTelp.matches("\\d+")) {
                    throw new Exception("Tipe data tidak valid. Masukkan hanya angka.");
                }

                System.out.println("Masukkan Email:");
                email = scanner.nextLine();

                System.out.println("Masukkan Password:");
                password = scanner.nextLine();

                // Jika semua input berhasil, set validInput menjadi true untuk keluar dari loop
                validInput = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        return new Pustakawan(idPustakawan, nama, alamat, gender, nomorTelp, email, password);
    }
}
