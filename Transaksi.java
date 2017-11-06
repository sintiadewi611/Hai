class Transaki {
	public String no_transaksi;
	public String tgl_transaksi;


	public void membuat_transaksi() {
		System.out.print("Masukan nomor transaksi   :");
		no_transaksi = input.nextLine();
		System.out.print("Masukan tanggal transaksi :");
		tgl_transaksi = input.nextLine();
 
	}

	public void ubah_transaksi() {
		System.out.print("Silahkan masukan nomor transaksi yang akan anda ubah :");
		no_transaksi = input.nextLine();

	}

	public void hapus_transaksi() {
		System.out.print("Silahkan masukan nomor transaksi yang akan anda hapus :");
		no_transaksi = input.nextLine();
		
	}
	
}