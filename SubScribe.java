package observer;


// 구독자
public class SubScribe implements Observer{
	
	Publisher publisher;
	String name;
	
	public SubScribe(String name, Publisher publisher){
		this.name = name;
		this.publisher = publisher;
		publisher.addObserver(this);
	}

	@Override
	public void alarm() {
		showEvent();
	}
	
	public void showEvent(){
		System.out.println(name + " : 변경 사항이 있습니다");
	}
	
	private void finish(){
		publisher.removeObserver(this);
	}
	

}
