class MesinCuci
{
		String warna;
		String merek;
		String kapasitas;
		String model;

		public void tunjukkan(){
		System.out.println("warna \t:"+warna);
		System.out.println("merek \t:"+merek);
		System.out.println("kapasitas \t:"+kapasitas);
		System.out.println("model \t:"+model);
		}
}
public class WashingMachine{
	public static void main(String args[]){
	MesinCuci baru = new MesinCuci () ;
		baru.warna="Putih";
		baru.merek="LG";
		baru.kapasitas="7 kg";
		baru.model="TS75VM";
	baru.tunjukkan();
	}
}		
	
	