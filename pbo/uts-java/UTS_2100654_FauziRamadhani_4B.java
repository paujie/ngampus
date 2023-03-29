class Discount {
    
    
    private double hrg_awal;
    private double discount;
    private double hrg_akhir;

    public void setHrgAwal(double hrg_awal) {
        this.hrg_awal = hrg_awal;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getHrgAwal() {
        return hrg_awal;
    }

    public double getDiscount() {
        return discount;
    }

    public double getHrgAkhir() {
        hrg_akhir = hrg_awal - (hrg_awal * discount / 100);
        return hrg_akhir;
    }

    public void checkoutku() {
        System.out.println("x[Diskon Produk Baju]x \n");
    }
}

class Merchant {
    private String gift;
    private String nama_merchant;

    public void setGift(String gift) {
        this.gift = gift;
    }

    public void setNamaMerchant(String nama_merchant) {
        this.nama_merchant = nama_merchant;
    }

    public String getGift() {
        return gift;
    }

    public String getNamaMerchant() {
        return nama_merchant;
    }

    public void print_invoice() {
        System.out.println("x[Invoice Pembayaran]x \n");
    }

    public void print_gift() {
        System.out.println("Gift");
    }
}

class Dana extends Merchant {
    protected double discount = 25;
    protected String gift = "Payung";
    protected String nama_merchant = "DANA";

    public Dana() {
        setGift(gift);
        setNamaMerchant(nama_merchant);
    }

    public double total_dana(double hrg_awal) {
        return hrg_awal - (hrg_awal * discount / 100);
    }

    public void invoice_dana(double hrg_awal) {
        System.out.printf("Harga Awal: Rp %,.0f%n", hrg_awal);
        System.out.println("Diskon: " + discount + "%");
        System.out.printf("Harga Akhir: Rp %,.0f%n", total_dana(hrg_awal));
        System.out.println("Gift: " + getGift());
    }
}

class Gopay extends Merchant {
    protected double discount = 30;
    protected String gift = "Voucher Gratis Ongkir";
    protected String nama_merchant = "GOPAY";

    public double total_gopay(double hrg_awal) {
        return hrg_awal - (hrg_awal * discount / 100);
    }

    public void invoice_gopay(double hrg_awal) {
        System.out.printf("Pembayaran Menggunakan GOPAY %n");
        System.out.printf("Harga Awal: Rp %,.0f%n", hrg_awal);
        System.out.println("Diskon: " + discount + "%");
        System.out.printf("Harga Akhir: Rp %,.0f%n", total_gopay(hrg_awal));
        System.out.println("Gift: " + gift);
    }
}

public class UTS_2100654_FauziRamadhani_4B {
    public static void main(String[] args) {
        Discount diskon = new Discount();
        diskon.setHrgAwal(556550);
        diskon.setDiscount(10);
        double hrg_akhir = diskon.getHrgAwal() - diskon.getHrgAwal() * diskon.getDiscount() / 100;

        diskon.checkoutku();
        System.out.printf("Harga Awal: Rp %,.0f%n", diskon.getHrgAwal());
        System.out.println("Diskon: " + diskon.getDiscount() + "%");
        System.out.printf("Harga Akhir: Rp %,.0f%n", hrg_akhir);
        System.out.println();

        Gopay gopay = new Gopay();
        gopay.setGift("Voucher Gratis Ongkir");
        gopay.setNamaMerchant("GOPAY");
        gopay.print_invoice();
        gopay.invoice_gopay(diskon.getHrgAwal());
    }
}

