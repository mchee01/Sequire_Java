package collection.day13;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;
        try {
            server = new ServerSocket();

            server.bind(new InetSocketAddress("192.168.0.254",5050));
            System.out.println("서버 프로그램 시작: 연결 요청을 기다리는 중입니다.");
            socket =  server.accept();//입출력 스트림을 만들 소켓
            System.out.println("연결 수락.");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
                server.close();
                socket.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            
        }
    }
}
