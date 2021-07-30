/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansoalukl1;

/**
 *
 * @author maylany hellena
 */
public class LatihanSoalUkl1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int a, b;
  //sebagai inisialisasi variabel dengan tipe data integer 
  a = 3; 
//variabel a sebagai milai pertama dengan nilai 3 
System.out.println("Nilai suku pertama = " + a);
//untuk menampilkan nilai pertama pada output 
b = 5; 
//variabel b sebagai beda setiap-setiap sukunya dengan nilai 5 
System.out.println ("Nilai beda setiap suku  = " + b);
// untuk menampilkan nilai beda pada output 

for (int n =1; n <= 10; n++ ) {
    //sebagai perulangan angka 1 sampai 10 
    
    int Un = a + (n - 1) * b ;
    //sebagai operator dengan rumus mencari suku ke-n
    System.out.println("Nilai suku ke-" + n + "adalah = " + Un);
    //untuk menampilkan hasil suku ke-n sesuai perulangan dengan rumus tersebut 
    
    int Sn = (a + Un) * n / 2; 
    //sebagai operator dengan rumus mencari jumlah ke-n suku 
    
   }
    }
}
     
   

