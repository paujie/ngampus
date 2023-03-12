public class rplstudio {

    /*
    Fauzi Ramadhani - 4B RPL - 2100654
    JAVA OOP
     */ 

     class auditorium {
        private int harga, kursi;
        private String nama, kode;

        public void setHarga(int harga) {
            this.harga = harga;
        }
    
        public int getHarga() {
            return harga;
        }
    
        public void setKursi(int kursi) {
            this.kursi = kursi;
        }
    
        public int getKursi() {
            return kursi;
        }
    
        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public String getNama() {
            return nama;
        }
    
        public void setKode(String kode) {
            this.kode = kode;
        }
    
        public String getKode() {
            return kode;
        }
    }
    
    class tipe1 extends auditorium {
        private tipe1() {
            setNama("Regular 2D");
            setKode("Audi");
            setHarga(30000);
            setKursi(200);
        }
    }
    
    class tipe2 extends auditorium {
        private tipe2() {
            setNama("Regular 3D");
            setKode("3DX");
            setHarga(50000);
            setKursi(175);
        }
    }
    
    class tipe3 extends auditorium {
        private tipe3() {
            setNama("Velvet");
            setKode("V");
            setHarga(100000);
            setKursi(200);
        }
    }
    
    public void printJumlah() {
        tipe1 regular2D = new tipe1();
        tipe2 regular3D = new tipe2();
        tipe3 velvet = new tipe3();
        
        
        int profit2D = regular2D.getHarga() * regular2D.getKursi();
        int profit3D = regular3D.getHarga() * regular3D.getKursi();
        int profitVelvet = velvet.getHarga() * velvet.getKursi();
        int totalKursi = regular2D.getKursi() + regular3D.getKursi() + velvet.getKursi();
        int totalProfit = profit2D + profit3D + profitVelvet;

        System.out.println("Informasi Tiket Auditorium Bioskop RPL Studio Cibiru \n");

        System.out.println("[1] Regular 2D (" + regular2D.getKode() + "): \n Tiket: " + regular2D.getKursi() + " Kursi \n Harga: " + String.format("Rp %,d", regular2D.getHarga()));
        System.out.println("Profit: " + String.format("Rp %,d", profit2D) + "\n");

        System.out.println("[2] Regular 3D (" + regular3D.getKode() + "): \n Tiket: " + regular3D.getKursi() + " Kursi \n Harga: " + String.format("Rp %,d", regular3D.getHarga()));
        System.out.println("Profit: " + String.format("Rp %,d", profit3D) + "\n");

        System.out.println("[3] Velvet (" + velvet.getKode() + "): \n Tiket: " + velvet.getKursi() + " Kursi \n Harga: " + String.format("Rp %,d", velvet.getHarga()));
        System.out.println("Profit: " + String.format("Rp %,d", profitVelvet) + "\n");

        System.out.println("Total Tiket: " + totalKursi + " Kursi \nProfit: " + String.format("Rp %,d", totalProfit));
    }
    public static void main(String[] args) {
        rplstudio studio = new rplstudio();
        studio.printJumlah();
    }
}