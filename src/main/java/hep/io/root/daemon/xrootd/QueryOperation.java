package hep.io.root.daemon.xrootd;

import hep.io.root.daemon.xrootd.Callback.StringCallback;

/**
 * Query a file.
 * @author tonyj
 */
public class QueryOperation extends Operation<String> {

    public QueryOperation(int queryType, String path) {
        super("query", new QueryMessage(queryType, path), new StringCallback());
    }

    private static class QueryMessage extends Message {

        QueryMessage(int queryType, String path) {
            super(XrootdProtocol.kXR_query, path);
            writeShort(queryType);
        }
    }
}
