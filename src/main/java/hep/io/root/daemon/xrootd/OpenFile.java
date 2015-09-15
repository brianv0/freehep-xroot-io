package hep.io.root.daemon.xrootd;

import java.net.InetSocketAddress;

/**
 * A class representing an open xrootd file. It encapsulates a handle used 
 * internally, and the destination with which the file is associated.
 * The handle and destination may be changed as a result of an error or a 
 * redirect.
 * @author tonyj
 */
public class OpenFile {

    private int handle;
    private InetSocketAddress destination;
    private Multiplexor multiplexor;
    private String path;
    private int mode;
    private int options;
    private int compressionSize;
    private int compressionType;
    private FileStatus status;

    public OpenFile(String path, int mode, int options) {
        this.path = path;
        this.mode = mode;
        this.options = options;
    }

    public int getHandle() {
        return handle;
    }

    public InetSocketAddress getDestination() {
        return destination;
    }
    
    public Multiplexor getMultiplexor() {
        return multiplexor;
    }
    
    void setHandleAndDestination(int handle, InetSocketAddress destination, Multiplexor multiplexor)
    {
        this.handle = handle;
        this.destination = destination;
        this.multiplexor = multiplexor;
    }

    public String getPath() {
        return path;
    }

    public int getMode() {
        return mode;
    }

    public int getOptions() {
        return options;
    }

    public int getCompressionSize() {
        return compressionSize;
    }

    void setCompressionSize(int compressionSize) {
        this.compressionSize = compressionSize;
    }

    public int getCompressionType() {
        return compressionType;
    }

    void setCompressionType(int compressionType) {
        this.compressionType = compressionType;
    }

    public FileStatus getStatus() {
        return status;
    }

    void setStatus(FileStatus status) {
        this.status = status;
    }

    //FIXME: Close this automatically in a finalizer?
    
}