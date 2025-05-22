package com.google.android.gms.org.conscrypt;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.security.PrivateKey;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public abstract class OpenSSLSocketImpl extends AbstractConscryptSocket {
    public OpenSSLSocketImpl() {
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public /* bridge */ /* synthetic */ void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        super.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ void bind(SocketAddress socketAddress) {
        super.bind(socketAddress);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    @Deprecated
    public final byte[] getAlpnSelectedProtocol() {
        return SSLUtils.toProtocolBytes(getApplicationProtocol());
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ SocketChannel getChannel() {
        return null;
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public abstract byte[] getChannelId();

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public FileDescriptor getFileDescriptor$() {
        return super.getFileDescriptor$();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public abstract SSLSession getHandshakeSession();

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public String getHostname() {
        return super.getHostname();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public String getHostnameOrIP() {
        return super.getHostnameOrIP();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ InetAddress getInetAddress() {
        return super.getInetAddress();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ InputStream getInputStream() {
        return super.getInputStream();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ boolean getKeepAlive() {
        return super.getKeepAlive();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ InetAddress getLocalAddress() {
        return super.getLocalAddress();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ int getLocalPort() {
        return super.getLocalPort();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ SocketAddress getLocalSocketAddress() {
        return super.getLocalSocketAddress();
    }

    @Deprecated
    public final byte[] getNpnSelectedProtocol() {
        return null;
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ boolean getOOBInline() {
        return false;
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ OutputStream getOutputStream() {
        return super.getOutputStream();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ int getReceiveBufferSize() {
        return super.getReceiveBufferSize();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ SocketAddress getRemoteSocketAddress() {
        return super.getRemoteSocketAddress();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ boolean getReuseAddress() {
        return super.getReuseAddress();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ int getSendBufferSize() {
        return super.getSendBufferSize();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ int getSoLinger() {
        return super.getSoLinger();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public int getSoWriteTimeout() {
        return 0;
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ boolean getTcpNoDelay() {
        return super.getTcpNoDelay();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ int getTrafficClass() {
        return super.getTrafficClass();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ boolean isBound() {
        return super.isBound();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ boolean isClosed() {
        return super.isClosed();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ boolean isConnected() {
        return super.isConnected();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ boolean isInputShutdown() {
        return super.isInputShutdown();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ boolean isOutputShutdown() {
        return super.isOutputShutdown();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket
    public /* bridge */ /* synthetic */ void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        super.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    @Deprecated
    public final void setAlpnProtocols(byte[] bArr) {
        if (bArr == null) {
            bArr = EmptyArray.BYTE;
        }
        setApplicationProtocols(SSLUtils.decodeProtocols(bArr));
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public abstract void setChannelIdEnabled(boolean z);

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public abstract void setChannelIdPrivateKey(PrivateKey privateKey);

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public void setHandshakeTimeout(int i) {
        super.setHandshakeTimeout(i);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public void setHostname(String str) {
        super.setHostname(str);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ void setKeepAlive(boolean z) {
        super.setKeepAlive(z);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ void setPerformancePreferences(int i, int i2, int i3) {
        super.setPerformancePreferences(i, i2, i3);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ void setReceiveBufferSize(int i) {
        super.setReceiveBufferSize(i);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ void setReuseAddress(boolean z) {
        super.setReuseAddress(z);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ void setSendBufferSize(int i) {
        super.setSendBufferSize(i);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ void setSoLinger(boolean z, int i) {
        super.setSoLinger(z, i);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public void setSoWriteTimeout(int i) {
        super.setSoWriteTimeout(i);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ void setTcpNoDelay(boolean z) {
        super.setTcpNoDelay(z);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ void setTrafficClass(int i) {
        super.setTrafficClass(i);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    public abstract void setUseSessionTickets(boolean z);

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ void shutdownInput() {
        super.shutdownInput();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, java.net.Socket
    public /* bridge */ /* synthetic */ void shutdownOutput() {
        super.shutdownOutput();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket, javax.net.ssl.SSLSocket, java.net.Socket
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public OpenSSLSocketImpl(String str, int i) {
        super(str, i);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptSocket
    @Deprecated
    public final void setAlpnProtocols(String[] strArr) {
        if (strArr == null) {
            strArr = EmptyArray.STRING;
        }
        setApplicationProtocols(strArr);
    }

    public OpenSSLSocketImpl(String str, int i, InetAddress inetAddress, int i2) {
        super(str, i, inetAddress, i2);
    }

    public OpenSSLSocketImpl(InetAddress inetAddress, int i) {
        super(inetAddress, i);
    }

    public OpenSSLSocketImpl(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        super(inetAddress, i, inetAddress2, i2);
    }

    public OpenSSLSocketImpl(Socket socket, String str, int i, boolean z) {
        super(socket, str, i, z);
    }

    @Deprecated
    public final void setNpnProtocols(byte[] bArr) {
    }
}
