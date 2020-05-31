
/**
 *
 * @author Nih Latulia Rohmah Tiyas
 */
public class Queue {
    
    //menambahkan sifat static pada variabel
    static int ekor=-1;
    static int maxEkor=6;
    
    public static void addQueue(String Queue[],String data){
        if(ekor>=maxEkor)//jika kondisi ekor lebih dari sama dengan 6
            System.out.println("Maaf, Antrian Sudah Penuh"); //maka akan menampilkan hasil bahwa antrian sudah penuh
        else{ //jika tidak maka akan menampilkan hasil dari data queue
            System.out.println("Tambah Queue:"+data);
            ekor++; //memanggil data paling akhir
            Queue[ekor]=data;
            } 
        }
    
    //deQueue berfungsi untuk mengeluarkan data kedalam antrian
    public static String deQueue(String Queue[]){
        String hasil="";
        if(ekor<0) //pernyataan kondisi dimana jika ekor kurang dari 0 maka hasilnya kosong
            hasil="Maaf, Antrian Kosong";
        else{ 
            hasil=Queue[0];
            Queue[0]=null;
            for(int i=1;i<=ekor;i++){
                Queue[i-1]=Queue[i];
                Queue[i]=null;
        }
        ekor--;    
        }
        return(hasil);
        }
     
    //memanggil data static pada method string queue
    public static void bacaQueue(String Queue[]){
        System.out.println("Kondisi Antrian:"); //menampilkan hasil dari kondisi antrian
        for(int i=0;i<=maxEkor;i++) 
        {
            if(i==ekor)
                System.out.println(i+"."+Queue[i]+" ekor ");
            else if(Queue[i]==null)
                System.out.println(i+".");
            else
                System.out.println(i+"."+Queue[i]);
        }
    }
    
    //membuat objek dari class Queue
    public static void main(String[] args){
        String Antrian[]=new String[16];
             System.out.println("UD.INDAH MAKMUR"); //menampilkan identitas pemilik data queue
        
        //menambahkan data antrian
        addQueue(Antrian,"Customer Alwi");
        addQueue(Antrian,"Customer Bening");
        addQueue(Antrian,"Customer Citra");
        addQueue(Antrian,"Customer Dani");
        addQueue(Antrian,"Customer Erni");
        addQueue(Antrian,"Customer Fatma");
        addQueue(Antrian,"Customer Gracia");
        
            //menampilkan output dari proses queue
            System.out.println("\n");
            System.out.println("");
            bacaQueue(Antrian);
            System.out.println("\n\nURUTAN KELUAR\nQueue:"+deQueue(Antrian));
            System.out.println("Queue:"+deQueue(Antrian));
            System.out.println("Queue:"+deQueue(Antrian));
            System.out.println("Queue:"+deQueue(Antrian));
            System.out.println("Queue:"+deQueue(Antrian));
            System.out.println("\n\nSedangkan Customer Fatma masih mengantri");
                
    }
}

//pada program queue diatas merupakan prinsip antrian dimana yang masuk terlebih dahulu
//maka dialah yang akan keluar terlebih dahulu 
//pada program diatas, saya membuat 7 antrian yaitu Customer Alwi, Bening, Citra, Dani, Erni, Fatma, dan Gracia
//maka yang akan keluar terlebih dahulu adalah yang mengantri pertama
//seperti pada program diatas, hanya dikeluarkan 6 Motor saja dalam satu pemanggilan
//maka Customer Fatma akan tetap menunggu. karena Customer Fatma adalah yang terakhir dan mengantri