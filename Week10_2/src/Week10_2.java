//입력한 문자열을 SrtingTokenizer 클래스를 이용하여 단어로 분리한다.
import java.util.*;
public class Week10_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("5개의 단어 문자열을 입력하세요 : ");
		String s = input.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		String[] buf = new String[5];
		int i = 0;
		
		while(st.hasMoreTokens()) {
			buf[i++] = st.nextToken();
		}
		
		for(String str : buf) {
			System.out.println(str);
		}
		
		Arrays.sort(buf);	
	
		System.out.println("\n배열 정렬");
		for(String str : buf) {
			System.out.println(str);
		}
	}
}