public class binary {
   public static void main(String[] args) {
       //pendeklarasian variabel
       int B[] = {2, 3, 4, 8, 10, 13};
       int cari = 8;
       int IndeksAwal = 0;
       int IndeksAkhir = B.length-1;
       int ketemu = 0;
       int point = 0;
       
       //menampilkan data dalam array
       System.out.println("isi data adalah ");
       for (int i = 0; i < B.length; i++) {
           
           System.out.print(B[i] + " ");
       }
       System.out.println("");
       System.out.println("");
       
       while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)) {
       point = (IndeksAwal + IndeksAkhir) / 2;
       System.out.println("Indeks pointer :"+ point );
            if (cari == B[point] ) {
                ketemu = 1;
                System.out.println("Data " +
                cari + " Telah ditemukan pada indeks ke " + point);
            }
       
            else if (cari < B[point] ) {
                System.out.println("Cari di kiri ");
                IndeksAkhir = point-1;
            }
            
            else {
                IndeksAwal = point+1;
                System.out.println("Cari di kanan ");
            }
       }
       
       
      if (ketemu == 1)
          System.out.println("Kesimpulan: data ditemukan ");
      else
          System.out.println("Kesimpulan: data tidak ditemukan ");
   }
}
