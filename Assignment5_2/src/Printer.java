public class Printer extends Device {
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println(name + "프린터를 연결합니다.");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("프린터입니다");		
	}
}