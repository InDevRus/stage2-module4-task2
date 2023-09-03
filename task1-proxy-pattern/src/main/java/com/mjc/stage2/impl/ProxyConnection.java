package com.mjc.stage2.impl;


import com.mjc.stage2.Connection;

public class ProxyConnection implements Connection {
    private final RealConnection realConnection;

    private boolean isClosed = false;

    public ProxyConnection(RealConnection realConnection) {
        this.realConnection = realConnection;
    }

    public void reallyClose() {
        isClosed = true;
        ConnectionPool.getInstance().releaseConnection(realConnection);
    }

    @Override
    public void close() {
        isClosed = true;
        ConnectionPool.getInstance().releaseConnection(this);
    }

    @Override
    public boolean isClosed() {
        return isClosed;
    }
}
