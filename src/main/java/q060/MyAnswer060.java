package q060;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

import static java.util.Objects.nonNull;

/**
 * 解答。
 */
public class MyAnswer060 {
    /**
     * メインメソッド。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        try {
//            InetAddress google = InetAddress.getByName("google.com");
//            System.out.println(google.getCanonicalHostName());
//            System.out.println(google.getHostName());
//            System.out.println(google.getHostAddress());

            InetAddress address = InetAddress.getLocalHost();
            System.out.printf("%s: %s%n", "FQDN", address.getHostName());
            System.out.printf("%s: %s%n", "IP アドレス", address.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        // TODO: stream があるので書き直す
        try {
            Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaceEnumeration.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaceEnumeration.nextElement();
                StringBuilder macAdress = new StringBuilder();
                byte[] hardwareAddresses = networkInterface.getHardwareAddress();
                if (nonNull(hardwareAddresses)) {
                    for (byte hardwareAddress : hardwareAddresses) {
                        macAdress.append(String.format("%02X ", hardwareAddress));
                    }
                }
                System.out.printf(
                        "%s: %s - %s%n",
                        networkInterface.getName(),
                        networkInterface.getDisplayName(),
                        macAdress
                );
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
