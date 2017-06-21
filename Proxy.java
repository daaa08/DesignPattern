package mail;

import java.util.List;
import java.util.ArrayList;

public class Proxy implements IProxy{
	
	// 메일 서버 생성
	Server mailServer = null;

	@Override
	public void sender(Mail mail) {
		if(mailServer == null){
			mailServer = new Server();
			
			mailServer.sender(mail);
		}
		
	}

	@Override
	public Mail get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
