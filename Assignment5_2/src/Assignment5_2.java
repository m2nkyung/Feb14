public class Assignment5_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Device[] d = new Device[2];
		d[0] = new Printer();
		d[0].print();
		d[0].connect();

		
		d[1] = new UsbMemory();
		d[1].print();
		d[1].connect();
	}
}