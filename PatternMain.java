import mail.IProxy;
import mail.Mail;
import mail.Proxy;
import mail.Server;
import observer.Publisher;
import observer.SubScribe;

public class PatternMain {

	public static void main(String[] args) {
		
		// 메일 대행자 생성 
		IProxy mailProxy = new Proxy();
		
		// 편지글 작성
		Mail mail = new Mail();
		
		// 발송
		mailProxy.sender(mail);
		
		
		// 발행자 생성
		Publisher publisher = new Publisher();
		
		new SubScribe("홍길동", publisher);
		new SubScribe("이순신", publisher);
		
		publisher.process();
	}

}
