import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.SocketHandler;


public class Server {
	
	public static void main(String[] args) throws IOException
	{
		ServerSocket ss=new ServerSocket(52273);
		SocketHandle handler=null;
		Socket ssoc;
		System.out.println("���� : Ŭ���̾�Ʈ�� ������ ��ٸ�");
		//
		while(true){
			ssoc=ss.accept(); //Ŭ���̾�Ʈ�� ����� �� ���� ���
			System.out.println("Server Accept!");
			handler=new SocketHandle(ssoc);
			handler.start();
		}
		
}

}