
package hep.io.root.daemon.xrootd;

import java.net.InetSocketAddress;

/**
 *
 * @author bvan
 */
public interface RedirectedInetSocketAddress {
    
    public InetSocketAddress getPrevious();

}
