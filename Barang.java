class Barang {
	public String kode_barang;
	public String nama_barang;
	public String harga_barang;
	public Integer jumlah_barang;
	public String supplier;


	public void tambah_barang() {
		System.out.print("Masukan kode barang     :");
		kode_barang= input.nextLine();
		System.out.print("Masukan nama barang     :");
		nama_barang= input.nextLine();
		System.out.print("Masukan harga barang    :");
		harga_barang = input.nextLine();
		System.out.print("Masukan jumlah barang   :");
		jumlah_barang = input.nextLine();
		System.out.print("Nama Suplier            :");
		supplier = input.nextLine();
	}

	public void ubah_barang() {
		System.out.print("Silahkan masukan kode barang yang akan anda ubah     :");
		kode_barang= input.nextLine();
	}

	public void hapus_barang() {
		System.out.print("Silahkan masukan kode barang yang akan anda hapus     :");
		kode_barang= input.nextLine();
	}

	public void return () {
		System.out.print("Silahkan masukan kode barang yang akan anda return     :");
		kode_barang= input.nextLine();
		
	}
	
	
}