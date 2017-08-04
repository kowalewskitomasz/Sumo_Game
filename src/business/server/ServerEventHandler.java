package business.server;


public abstract class ServerEventHandler {

    public abstract void dataReceived(ClientInfo clientInfo, byte[] data);

    public abstract void clientConnected(ClientInfo clientInfo);
}
