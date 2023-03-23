import java.text.SimpleDateFormat;

public class estore {

    /*
    Fauzi Ramadhani - 4B RPL - 2100654
    JAVA OOP
     */ 
    
    class jajan{

        String kodeBayar = "RPL-666";
        String namaBarang = "GeForce RTX 4090 OC Edition 24GB GDDR6X";
        String namaPembeli = "Huda";
        int harga = 36718100;
        int jumlah = 1;
        String Metode;
        double promo, cashback;
        
        String waktuPembelian = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(new java.util.Date());

        void setMetode(String Metode) {
            this.Metode = Metode;
        }

        void setPromo(double promo) {
            this.promo = promo;
        }

        void setCashback(double cashback) {
            this.cashback = cashback;
        }
    }

    class OVO extends jajan{
        private OVO(){
            setMetode("OVO");
            setPromo(0.3);
            setCashback(0.02);
        }
    }

    class DANA extends jajan{
        DANA(){
            setMetode("DANA");
            setPromo(0.25);
            setCashback(0.03);
        }
    }

    class cash extends jajan{
        cash(){
            setMetode("CASH");
            setPromo(0.0);
            setCashback(0.05);
        }
    }

    void biayaMetode() {
        OVO ovo = new OVO();
        DANA dana = new DANA();
        cash cash = new cash();
    
        int hargaOvo = ovo.harga * ovo.jumlah;
        hargaOvo = (int) (hargaOvo - (hargaOvo * ovo.promo));
        int cashbackOvo = (int) (hargaOvo * ovo.cashback);
        int totalBayarOvo = hargaOvo - cashbackOvo;
    
        int hargaDana = dana.harga * dana.jumlah;
        hargaDana = (int) (hargaDana - (hargaDana * dana.promo));
        int cashbackDana = (int) (hargaDana * dana.cashback);
        int totalBayarDana = hargaDana - cashbackDana;
    
        int hargaCash = cash.harga * cash.jumlah;
        hargaCash = (int) (hargaCash - (hargaCash * cash.promo));
        int cashbackCash = (int) (hargaCash * cash.cashback);
        int totalBayarCash = hargaCash - cashbackCash;
        
        System.out.println("\n---------");
        System.out.println("OVO");
        System.out.println("---------");
        System.out.println("Harga: " + hargaOvo);
        System.out.println("Promo: " + (int) (hargaOvo * ovo.promo));
        System.out.println("Cashback: " + cashbackOvo);
        System.out.println("Total Bayar: " + totalBayarOvo);
    
        System.out.println("\n---------");
        System.out.println("DANA");
        System.out.println("---------");
        System.out.println("Harga: " + hargaDana);
        System.out.println("Promo: " + (int) (hargaDana * dana.promo));
        System.out.println("Cashback: " + cashbackDana);
        System.out.println("Total Bayar: " + totalBayarDana);
    
        System.out.println("---------");
        System.out.println("CASH");
        System.out.println("---------");
        System.out.println("Harga: " + hargaCash);
        System.out.println("Promo: " + (int) (hargaCash * cash.promo));
        System.out.println("Cashback: " + cashbackCash);
        System.out.println("Total Bayar: " + totalBayarCash);
    }

    void print() {
        jajan barang = new jajan();
        System.out.println("/-/-/-/------------------/-/-/-/");
        System.out.println("        Jajan eRPL Store        ");
        System.out.println("/-/-/-/------------------/-/-/-/\n");
        System.out.println("Kode Bayar     : " + barang.kodeBayar);
        System.out.println("Nama Barang    : " + barang.namaBarang);
        System.out.println("Nama Pembeli   : " + barang.namaPembeli);
        System.out.println("Harga Barang   : " + barang.harga);
        System.out.println("Jumlah Barang  : " + barang.jumlah);
        System.out.println("Waktu Pembelian: " + barang.waktuPembelian);
        System.out.println("\n/-/-/-/------------------/-/-/-/");
        System.out.println("       Detail Pembayaran         ");
        System.out.println("/-/-/-/------------------/-/-/-/");
        biayaMetode();
    }    

    public static void main(String[] args) {
        estore rpl = new estore();
        rpl.print();
    }
}