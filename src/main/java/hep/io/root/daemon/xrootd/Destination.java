
package hep.io.root.daemon.xrootd;

import java.net.InetAddress;
import java.net.InetSocketAddress;


/**
 * Transitional class.
 * @author bvan
 */
public class Destination extends InetSocketAddress {
        
    protected Destination(InetAddress addr, int port){
        super(addr, port);
    }
    
    protected Destination(String host, int port){
        super(host, port);
    }
        
    public static class RedirectedDestination extends Destination implements RedirectedInetSocketAddress{
        private final Destination previous;

        public RedirectedDestination(InetAddress host, int port, Destination previous){
            super(host, port);
            this.previous = previous;
        }

        public Destination getPrevious(){
            return previous;
        }
    }

}
