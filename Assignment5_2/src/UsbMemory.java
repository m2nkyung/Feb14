public class UsbMemory extends Device{
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println(name + "USB 메모리를 연결합니다.");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("USB 메모리입니다");		
	}
}