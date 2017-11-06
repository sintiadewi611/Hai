class Admin {
	public String id_admin;
	public String nama_admin;
	public String password;



	public void input_admin() {
		System.out.print("Masukan id            :");
		id_admin = input.nextLine();
		System.out.print("Masukan nama          :");
		nama_admin = input.nextLine();
		System.out.print("Masukan Password      :");
		password = input.nextLine();
	}

	public void update_admin() {
		System.out.print("Silahkan masukan nomor transaksi yang akan anda ubah :");
		id_admin = input.nextLine();

	}	

	public void hapus_admin() {
		System.out.print("Silahkan masukan nomor transaksi yang akan anda hapus :");
		id_admin = input.nextLine();
	}
}