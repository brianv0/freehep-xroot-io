package hep.io.root.daemon.xrootd;

import java.io.IOException;


/**
 * Obtain the protocol version number and type of server.
 * @author tonyj
 */
public class ProtocolOperation extends Operation<String> {
    public ProtocolOperation() {
        super("protocol",new Message(XrootdProtocol.kXR_protocol),new ProtocolCallback());
    }
    private static class ProtocolCallback extends Callback<String> {

        @Override
        public String responseReady(Response response) throws IOException
        {
            int pval = response.readInt();
            int flags = response.readInt();
            return pval+" "+flags;
        }
        
    }
}
