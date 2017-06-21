
public class Singleton {
	
	// 3 자기 자신을 담아두는 저장공간을 만들고
	private static Singleton instance = new Singleton();

	// 1 생성자를 private으로 만들어 외부에서 생성할 수 있도록 제한 
	private Singleton(){
		
	}
	
	// 2 외부에서 생성할 수 없으므로 내부에서 생성한 후 사용할 수 있도록 인터페이스 제공 
	// 외부에서 new가 안되므로 함수는 static으로구성해야 함 
	public static Singleton getInstance(){
		// 4 저장공간에 인스턴스가 있으면 인스턴스를 리턴
		
		return instance;
	}
}
