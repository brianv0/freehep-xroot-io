package hep.io.root.daemon.xrootd;

import java.io.IOException;
import java.net.URL;
import java.net.URLStreamHandler;

/**
 * A stream handler for files opened with the scalla protocol.
 * This stream handler will be created automatically if RootURLStreamFactory
 * is used, or this can be created and passed as an argument to the URL 
 * constructor.
 * @author Tony Johnson
 */
public class XrootdStreamHandler extends URLStreamHandler {

    private XrootdInputStreamFactory streamFactory;

    public XrootdStreamHandler() {
        this(new XrootdInputStreamFactory());
    }

    public XrootdStreamHandler(XrootdInputStreamFactory factory) {
        this.streamFactory = factory;
    }

    @Override
    protected XrootdURLConnection openConnection(URL uRL) throws IOException {
        return new XrootdURLConnection(uRL, streamFactory);
    }
}
