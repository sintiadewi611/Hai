import java.util.Scanner;

public class InputOutput4 {
	public static void main (String[] args){
	
	Scanner input = new Scanner (System.in);
		String nama;
		char jenisKelamin;
		int tinggiBadan;
		boolean menikah;

	System.out.print("Masukkan Nama : ");
	nama = input.nextLine();

	System.out.print("Masukkan JenisKelamin : ");
	jenisKelamin = input.next().charAt(0);

	System.out.print("Masukkan Tinggi Badan :");
	tinggiBadan = input.nextInt();

	System.out.print("Masukkan Status Menikah :");
	menikah = input.nextBoolean();

    System.out.print("nama : ");
	System.out.println(nama);
	System.out.print("jenis elamin : ");
	System.out.println(jenisKelamin);
	System.out.print("tinggi badan : ");
	System.out.println(tinggiBadan);
	System.out.print("menikah : ");
	System.out.println(menikah);
	}
}