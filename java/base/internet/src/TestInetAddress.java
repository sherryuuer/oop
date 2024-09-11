package internet.src;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1);
        System.out.println("hostAddress: " + ip1.getHostAddress());
        System.out.println("hostName: " + ip1.getHostName());

        InetAddress ip2 = InetAddress.getByName("www.google.com");
        System.out.println(ip2);
        System.out.println("hostAddress: " + ip2.getHostAddress());
        System.out.println("hostName: " + ip2.getHostName());

        byte[] ip = { (byte) 222, (byte) 222, 88, 102 };
        InetAddress ip3 = InetAddress.getByAddress(ip);
        System.out.println(ip3);
        System.out.println("hostAddress: " + ip3.getHostAddress());
        System.out.println("hostName: " + ip3.getHostName());
    }
}
