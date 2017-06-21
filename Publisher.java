package observer;


import java.util.ArrayList;
// 발행자 
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Publisher {
	
	// 옵저버 저장소
	List<Observer> observers = new CopyOnWriteArrayList<>(); // 동기화를 내부적으로 지원하는 List
	
	// 옵저버 추가
	public void addObserver(Observer obs){
		observers.add(obs);
	}
	
	public void removeObserver(Observer obs){
		observers.remove(obs);
	}
	
	// 자체 처리 함수
	public void process(){
		while(true){
			notice();

		}
	}

	// 변경사항 알리기
	private void notice(){
		for(Observer observer : observers){
			observer.alarm();
		}
	}
}
