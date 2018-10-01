/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan20_targetsaldotabungan;

/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan perhitungan
* lama tabungan sampai mencapai saldo target 
*/
public class PBO3_10117082_Latihan20_TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int saldoAwal = 3500000;
        int bunga = 8;
        int jumlahBunga;
        int saldoTarget = 6000000 ;
        
      
       int i = 1;
        while (saldoAwal <= saldoTarget) {
            jumlahBunga = saldoAwal*bunga/100;
            saldoAwal += jumlahBunga;
            
            String mataUang = String.format("Rp.%,3d",saldoAwal).replaceAll(","
            +"",".");
                 
            System.out.printf("Saldo dibulan ke-"+i+" %s%n",mataUang);
            i++;
        }
    }
    
}
