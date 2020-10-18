package pboif2_10119065_latihan5_kambingglobal;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan jumlah kambing sebelum 
 *                        dan sesudah dijumlahkan
 *
 */
public class PBOIF2_10119065_Latihan5_KambingGlobal {
    
    int jumlahKambing = 88;
    public void getJumlahKambing(){
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " +jumlahKambing);
    }
    
    public static void main(String[] args) {
        PBOIF2_10119065_Latihan5_KambingGlobal kambingSusu = new PBOIF2_10119065_Latihan5_KambingGlobal();
        
        // menampilkan jumlah kambing pertama kali program dijalankan
        kambingSusu.getJumlahKambing();
        
        // tambah 5 kambing 
        kambingSusu.tambahKambing();
        
        // menampilkan total kambing setelah ditambah
        kambingSusu.getJumlahKambing();
        
    }
    
}
