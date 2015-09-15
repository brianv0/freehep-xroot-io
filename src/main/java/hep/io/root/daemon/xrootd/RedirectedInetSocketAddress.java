
package hep.io.root.daemon.xrootd;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 *
 * @author bvan
 */
public class RedirectedInetSocketAddress extends InetSocketAddress {
    final private InetSocketAddress previous;

    public RedirectedInetSocketAddress(InetAddress addr, int port, InetSocketAddress previous){
        super(addr, port);
        this.previous = previous;
    }
    
    public InetSocketAddress getPrevious(){
        return this.previous;
    }

}
