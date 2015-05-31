package Data;

import java.util.Scanner;
class DataPenyakit
{
	public static int O;
	public static void memasukanData(String nama[], String gejala[], String obat[], int jumlah[])
	{
		Scanner masukanTeks  = new Scanner(System.in);
		Scanner masukanAngka = new Scanner(System.in);
		int masukanKarakter  = 0 ;
		String Tambah;
		int t = -1;
		do
		{
			t++;
			System.out.print("Nama Penyakit = ");
			nama[t] = masukanTeks.next();
			
                System.out.print("Gejala = ");
			gejala[t] = masukanTeks.next();

			System.out.print("Obat = ");
			obat[t] = masukanTeks.next();

			System.out.print("Jumlah Kasus = ");
			jumlah[t] = masukanAngka.nextInt();

			System.out.print("Mau nambah Data lagi ? (Iya [1] /Tidak [0] ) = ");
			Tambah = masukanAngka.next();
		}
		while(Tambah.equals("1"));
		O = t + 1;
        System.out.println("Anda Telah Menambah Data Sebanyak : "+O+"\t"+"buah");
	}

public static void menampilkanData(String nama[], String gejala[],String obat[], int jumlah[])
	{
		System.out.println("-------------------------------------------------");
		System.out.println("Nama Penyakit	Gejala	  Obat   Jumlah  Kasus"   );
		System.out.println("-------------------------------------------------");
		for (int t=0; t<=O-1; t++)
		{
		  System.out.println(nama[t] +"       \t"+ gejala[t] +"\t  " + obat[t]+"\t    "+jumlah[t]);
		}
		System.out.println("------------------------------------------------");
	}

public static void menampilkanDataTertentu(String nama[], String gejala[],String obat[], int jumlah[])
   {
	 System.out.println("-------------------------------------------------");
   	 System.out.println("Nama Penyakit	Gejala	  Obat   Jumlah  Kasus"    );
	 System.out.println("-------------------------------------------------");
     	 for (int t=0; t<=O-1; t++)
     	 {
		   if (gejala[t].equals("Demam"))
		   System.out.println(nama[t] +"       \t"+ gejala[t]+"\t  " + obat[t]+"\t    "+jumlah[t]);
		 }
	 System.out.println("-------------------------------------------------");
	}

public static void menampilkanDataCacah(String nama[], String gejala[],String obat[], int jumlah[])
	{
 	     int jumlahGejalaD=0;
 	     int jumlahGejalaP=0;
   	    int jumlahGejalaPP=0;

 	    System.out.println("-------------------------------------------------");
 	    System.out.println("Nama Penyakit	Gejala	  Obat   Jumlah  Kasus"     );
 	    System.out.println("-------------------------------------------------");
	    for (int t=0; t<=O-1; t++)
	         {
	            System.out.println(nama[t] +"       \t"+ gejala[t] +"\t  "+ obat[t]+"\t    "+jumlah[t]);
	             if
	            (gejala[t].equals("Demam"))jumlahGejalaD++;
	            else if
	            (gejala[t].equals("Pusing"))jumlahGejalaP++;
	            else if
	            (gejala[t].equals("Panas"))jumlahGejalaPP++;
	      }
	  System.out.println("-------------------------------------------------"   );
	  System.out.println("Jumlah Gejala Demam  :    "+jumlahGejalaD+" " +"Buah");
	  System.out.println("Jumlah Gejala Pusing :    "+jumlahGejalaP+" " +"Buah");
	  System.out.println("Jumlah Gejala Panas  :    "+jumlahGejalaPP+" "+"Buah");
    }

public static void menambahDataBelakang(String nama[], String gejala[], String obat[], int jumlah[])
	{
		Scanner masukanTeks = new Scanner(System.in);
		Scanner masukanAngka = new Scanner(System.in);
		int masukanKarakter = 0 ;
			System.out.print("Nama Penyakit = ");
			nama[O] = masukanTeks.next();

			System.out.print("Gejala = ");
			gejala[O] = masukanTeks.next();

			System.out.print("Obat = ");
			obat[O] = masukanTeks.next();

			System.out.print("Jumlah Kasus = ");
			jumlah[O] = masukanAngka.nextInt();
       		O++;
         System.out.println("");
        System.out.println("Data Sudah Ditambahkan. . . .");
	}

public static void menambahDataDepan(String nama[], String gejala[],String obat[], int jumlah[])
	{
		Scanner masukanTeks  = new Scanner(System.in);
		Scanner masukanAngka = new Scanner(System.in);
		int masukanKarakter  = 0 ;

		for (int t=O; t>=1; t--)
		{  nama  [t]  =nama  [t-1];
		   gejala[t]  =gejala[t-1];
		   obat  [t]  =obat  [t-1];
		   jumlah[t]  =jumlah[t-1];
		}
		    System.out.print("Nama Penyakit = ");
			nama[0] = masukanTeks.next();

			System.out.print("Gejala = ");
			gejala[0] = masukanTeks.next();

			System.out.print("Obat = ");
			obat[0] = masukanTeks.next();

			System.out.print("Jumlah Kasus = ");
			jumlah[0] = masukanAngka.nextInt();

       		O++;
        System.out.println("");
        System.out.println("Data Sudah ditambahkan. . . .");
   	}

public static void menambahDataTengah(String nama[], String gejala[],String obat[], int jumlah[])
	{
		Scanner masukanTeks = new Scanner(System.in);
		Scanner masukanAngka = new Scanner(System.in);
		int masukanKarakter = 0 ;

        System.out.print("Tentukan Index dimana anda akan menyisipkan :");
        int B = masukanAngka.nextInt();

  		for (int t=O; t>B; t--)
		   {
	                    nama  [t]  =nama  [t-1];
		       gejala[t]  =gejala[t-1];
		       obat  [t]  =obat  [t-1];
		       jumlah[t]  =jumlah[t-1];
		   }
		System.out.print("Nama Penyakit = ");
		nama[B] = masukanTeks.next();

		System.out.print("Gejala = ");
		gejala[B] = masukanTeks.next();

		System.out.print("Obat = ");
		obat[B] = masukanTeks.next();

		System.out.print("Jumlah Kasus = ");
		jumlah[B] = masukanAngka.nextInt();

       	O++;
         System.out.println("");
        System.out.println("Data Sudah Ditambahkan. . . .");
   	}

public static void mencariData(String nama[], String gejala[],String obat[], int jumlah[])
	{
		Scanner masukanTeks = new Scanner(System.in);
		boolean statusKetemu = false;
		int t=0;
		int lokasi = 0;

        System.out.print("Silahkan Masukkan NAMA PENYAKIT yang ingin di cari :");
		String kataKunci = masukanTeks.next();
		while ((statusKetemu == false) && (t<O))
		{
			if (nama[t].equals(kataKunci))
			{
			  statusKetemu = true;
			  lokasi = t;
			  System.out.println("Data Yang dicari Berhasil Ditemukan !!");
			  System.out.println("Nama Penyakit : "+nama[lokasi]);
			  System.out.println("Gejala : "       +gejala[lokasi]);
			  System.out.println("Obat : "         +obat[lokasi]);
			  System.out.println("Jumlah Kasus : " +jumlah[lokasi]);
		              }
		    t++;
		}
		if (statusKetemu==true)
		    System.out.println("Nama Penyakit:"+"\t"+kataKunci+"\t"+"ditemukan pada indeks ke-"+"\t"+lokasi);
	   	else
			System.out.println("Mohon maaf,Nama Penyakit yang Anda cari Tidak ada pada LIST kami.");
   	}

public static void mengeditData(String nama[], String gejala[],String obat[], int jumlah[])
	{
		Scanner masukanTeks  = new Scanner(System.in);
		Scanner masukanAngka = new Scanner(System.in);
		int masukanKarakter  = 0;
		boolean statusKetemu = false;
		int t=0;
		int lokasi = 0;

        System.out.print("Silahkan masukkan Nama Penyakit yang ingin Di Edit :");
		String kataKunci = masukanTeks.next();
		while ((statusKetemu == false) && (t<O))
		{
			if (nama[t].equals(kataKunci))
			{
			  statusKetemu = true;
			  lokasi = t;
		               }
		    t++;
		}

		if (statusKetemu==true)
		{
			System.out.println("Nama Penyakit : " +nama[lokasi]);
			System.out.println("Gejala :      " +gejala[lokasi]);
			System.out.println("Obat : "          +obat[lokasi]);
			System.out.println("Jumlah Kasus : "+jumlah[lokasi]);

			System.out.println("Silahkan masukkan DATA baru ?");
			System.out.print("");
			System.out.print("Nama Penyakit:");
			nama[lokasi] = masukanTeks.next();

			System.out.print("Gejala:");
			gejala[lokasi] = masukanTeks.next();

			System.out.print("Obat:");
			obat[lokasi] = masukanTeks.next();

			System.out.print("Jumlah Kasus :");
			jumlah[lokasi] = masukanAngka.nextInt();
			System.out.println("Data Sudah Berhasil diEdit. . . .");
		}
		else
			System.out.println("Mohon maaf,Nama yang Anda cari tidak ada dalam LIST kami.");
   	}

public static void menghapusData(String nama[], String gejala[],String obat[], int jumlah[])
	{
		Scanner masukanTeks = new Scanner(System.in);

		boolean statusKetemu = false;
		int t=0;
		int lokasi = 0;

		System.out.print("Silahkan masukkan Record NAMA PENYAKIT yang ingin Dihapus :");
		String kataKunci = masukanTeks.next();

		while ((statusKetemu == false) && (t<O))
		{
			if (nama[t].equals(kataKunci))
			{
			  statusKetemu = true;
			  lokasi = t;
		             }
		    t++;
		}

		if (statusKetemu==true)
		{
			for (t=lokasi; t<=O-2; t++)
			{
				nama  [t] = nama  [t+1];
				gejala[t] = gejala[t+1];
				obat  [t] = obat  [t+1];
				jumlah[t] = jumlah[t+1];
		                }
		    O--;
		    System.out.println("Data Sudah Berhasil Dihapus. . . .");
		}

		else
			System.out.println("Mohon maaf,Nama yang Anda cari tidak ada dalam LIST kami.");
   	}

public static void mengurutkanDataBubble(String nama[], String gejala[], String obat[], int jumlah[])
	{
		String NAMA;
		String GEJALA;
		String OBAT;
		int JUMLAH;

		for (int s=0; s<=O-2; s++)
		{
			for (int t=0; t<=(O-2)-s; t++)
			{
				if(nama[t].compareTo (nama[t+1]) > 0 )
				{
					NAMA        = nama[t];
					nama[t]     = nama[t+1];
					nama[t+1]   = NAMA;

					GEJALA      = gejala[t];
					gejala[t]   = gejala[t+1];
					gejala[t+1] = GEJALA;

					OBAT        = obat[t];
					obat[t]     = obat[t+1];
					obat[t+1]   = OBAT;

					JUMLAH      = jumlah[t];
					jumlah[t]   = jumlah[t+1];
					jumlah[t+1] = JUMLAH;
				}
			}
		}
	    System.out.println("Data Sudah Berhasil Diurutkan . . .");
   	}

public static void main(String args[])
	{
		Scanner masukanAngka = new Scanner(System.in);
		int pilihan;

		String nama  [] = new String[10];
		String gejala[] = new String[10];
		String obat  [] = new String[10];
		int jumlah   [] = new int   [10];

	  //BAGIAAN INI MEMASUKKAN DATA LANGSUNG KEDALAM LARIK :
	  //-------------------------------------------------------------------------
	  //String nama  [] = new String[] {"Flu","DBD","Batuk", "Demam","Campak"};
      //String gejala[] = new String[] {"Pusing","Demam","Pusing","Panas","Demam"};
      //String obat  [] = new String[] {"Procold","Fimestan","Bodrex","Antagin","Aspirin"};
      //int    jumlah[] = new int   [] {4,3,1,2,5} ;
     //O = 5;
		System.out.println("Selamat Datang Dalam Program Saya ");
		System.out.println("Silahkan Pilih MENU Program yang ada dibawah ini:");
		do
		{     System.out.println("");
		      System.out.println("Menu:");
		      System.out.println("1. Memasukkan Data Baru :");
		      System.out.println("2. Memampilkan Data :");
		      System.out.println("3. Menambah Data Baru :");
		      System.out.println("4. Mencari Data:");
		      System.out.println("5. Mengedit Data:");
		      System.out.println("6. Menghapus Data:");
		      System.out.println("7. Mengurutkan Data:");
		      System.out.println("8. Keluar !!!!:");
		      System.out.print("Pilihan Anda (1-8)..... :   ");
		      pilihan = masukanAngka.nextInt();
		      if (pilihan == 1)
		      	  memasukanData(nama, gejala, obat,jumlah);
		      else if (pilihan == 2)
		         {
			  	  System.out.println("");
			  	  System.out.println("Ini Adalah sub.Menu [2.Menampilkan Data.]");
			  	  System.out.println("Silahkan Pilih Menu yang ada dibawah Ini :");
			  		do
			  		 {
			  		  System.out.println("");
			  		  System.out.println("Menu:");
			  		  System.out.println("1. Memampilkan Semua Data :");
			  		  System.out.println("2. Memampilkan Berdasarkan Gejala Demam:");
			  		  System.out.println("3. Menampilkan Data Jumlah Gejala:");
			  		  System.out.println("4. Kembali ke menu utama");
			  		  System.out.print("Pilihan Anda (1-4)..... :   ");
			  		  pilihan = masukanAngka.nextInt();
			  		  if (pilihan == 1)
			  		      menampilkanData(nama, gejala, obat, jumlah);
			  		  else if (pilihan == 2)
			  			  menampilkanDataTertentu(nama, gejala, obat, jumlah);
			  		  else if (pilihan == 3)
			  		      menampilkanDataCacah(nama, gejala, obat, jumlah);
			                           }while (pilihan !=4);
			 }

		      else if (pilihan == 3)
		     	 {
			  	  System.out.println("");
			  	  System.out.println("Ini Adalah sub.Menu [3.Menambah Data]");
			  	  System.out.println("Silahkan Pilih Menu yang ada dibawah Ini :");
			  		do
			  		 {
			  		  System.out.println("");
			  		  System.out.println("Menu:");
			  		  System.out.println("1. Menambah Data Baru diBelakang::");
			  	      System.out.println("2. Menambah Data Baru diDepan:");
			  		  System.out.println("3. Menambah Data Baru diTengah:");
			  		  System.out.println("4. Kembali ke menu utama");
			  		  System.out.print("Pilihan Anda (1-4)..... :   ");
			  		  pilihan = masukanAngka.nextInt();

			  		  if (pilihan == 1)
			  			menambahDataBelakang(nama, gejala, obat, jumlah);
			  		  else if (pilihan == 2)
			  		    menambahDataDepan(nama, gejala, obat, jumlah);
			  	      else if (pilihan == 3)
			  			menambahDataTengah(nama, gejala, obat, jumlah);
			  		 }while   (pilihan !=4);
		                    }

		      else if (pilihan == 4)
		      		mencariData(nama, gejala, obat, jumlah);
		      else if (pilihan == 5)
		      		mengeditData(nama, gejala, obat, jumlah);
		      else if (pilihan == 6)
		      		menghapusData(nama, gejala, obat, jumlah);
		      else if (pilihan == 7)
		      		mengurutkanDataBubble(nama, gejala, obat, jumlah);
		  }while (pilihan !=8);
		System.out.println("");
		System.out.println("Terima kasih.....");
		System.out.println("Telah Menggunakan Program saya ....");
		System.out.println("");
         }
}