package xyz.xkrivzooh.xextension.utils;


import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetUtils {

    /**
     * @param hostName
     * @return ip address or hostName if UnknownHostException
     */
    public static String getIpByHost(String hostName) {
        try {
            return InetAddress.getByName(hostName).getHostAddress();
        }
        catch (UnknownHostException e) {
            return hostName;
        }
    }

}
