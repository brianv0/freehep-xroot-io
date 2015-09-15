package hep.io.root.daemon.xrootd;

import hep.io.root.daemon.xrootd.Callback.DefaultCallback;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

/**
 * Close a previously opened file, communications path, or path group.
 * @author tonyj
 */
public class CloseOperation extends Operation<Void> {

    private OpenFile file;

    /**
     * Create a close operation
     * @param file The file to close
     */
    public CloseOperation(OpenFile file) {
        super("close", new CloseMessage(file), new DefaultCallback());
        this.file = file;
    }

    @Override
    public InetSocketAddress getDestination() {
        return file.getDestination();
    }

    @Override
    public Operation getPrerequisite() {
        return new OpenOperation(file);
    }
    
    @Override
    public Multiplexor getMultiplexor() {
        return file.getMultiplexor();
    } 
    
    private static class CloseMessage extends Message {

        private OpenFile file;
        CloseMessage(OpenFile file) {
            super(XrootdProtocol.kXR_close);
            this.file = file;
        }
        @Override
        public void writeExtra(ByteBuffer out) throws IOException {
            // Note, we do things this way because the file handle may have changed
            // since we were created, as a result of a redirect.
            out.putInt(file.getHandle());
        }
    }
}
