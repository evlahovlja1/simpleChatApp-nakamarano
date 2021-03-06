package ba.unsa.etf.rpr;

import java.io.Serializable;
import java.util.function.Consumer;

public class Server extends NetworkConnection {
    private int port;

    public Server(Consumer<Serializable> onReceiveCallback, int port) {
        super(onReceiveCallback);
        this.port = port;
    }

    @Override
    protected boolean isServer() {
        return true;
    }

    @Override
    protected String getIP() {
        return null;
    }

    @Override
    protected int getPort() {
        return port;
    }
}
