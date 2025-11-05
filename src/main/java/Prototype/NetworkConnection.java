package Prototype;

public class NetworkConnection implements Cloneable{

    private String ip;
    private String port;

    public NetworkConnection(String ip, String port) {
        this.ip = ip;
        this.port = port;
    }

    public NetworkConnection() {

    }
    public void printConnectionDetails() {
        System.out.println("IP: " + ip + ", Port: " + port);
    }

    public String getIp() {
        return ip;
    }
    public String getPort() {
        return port;
    }

    @Override public NetworkConnection clone() throws CloneNotSupportedException
    {
        return (NetworkConnection) super.clone();
    }
}
