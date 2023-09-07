// Program berikut berisikan jawaban dari soal di bawah:

// Ali pergi dari Kota A ke Kota B dengan kecepatan 60km/jam. 
// Sedangkan Budi pergi dari Kota A ke Kota B dengan kecepatan 90km/jam. 
// Jika Budi pergi 30 menit setelah Ali pergi, 
// berapa lama waktu yang dibutuhkan Budi untuk dapat menyusul Ali?"

public class BudiMenyusulAli {
    public static int budiMenyusulAli(int delayTime, int kecepatanAliperJam, int kecepatanBudiperJam){

        int x = delayTime;
        int y = kecepatanAliperJam;
        int z = kecepatanBudiperJam;

        int kecepatanAli = x/60;
        int kecepatanBudi = z/60;

        int tempuhAli = 0;
        int tempuhBudi = 0;

        for (; tempuhAli >= 0 ; tempuhAli++) {
            if (tempuhAli == x) {
                for (; tempuhBudi >= 0;){
                    tempuhBudi += kecepatanBudi;
                    x++;
                    if (tempuhAli == tempuhBudi){
                        break;
                    }
                }
                break;
            }
        }
        return x;
    }

    public static void main(String[] args) {

        System.out.println(String.format("Di menit ke: %d", budiMenyusulAli(30, 60, 90)));

    }
}
