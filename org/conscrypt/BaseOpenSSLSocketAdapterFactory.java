package com.google.android.gms.org.conscrypt;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public abstract class BaseOpenSSLSocketAdapterFactory extends SSLSocketFactory {
    private final OpenSSLSocketFactoryImpl delegate;

    protected BaseOpenSSLSocketAdapterFactory(OpenSSLSocketFactoryImpl openSSLSocketFactoryImpl) {
        this.delegate = openSSLSocketFactoryImpl;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    protected abstract Socket wrap(OpenSSLSocketImpl openSSLSocketImpl);

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        return wrap((OpenSSLSocketImpl) this.delegate.createSocket(socket, str, i, z));
    }
}
