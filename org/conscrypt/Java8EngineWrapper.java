package com.google.android.gms.org.conscrypt;

import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.util.List;
import java.util.function.BiFunction;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
final class Java8EngineWrapper extends AbstractConscryptEngine {
    private final ConscryptEngine delegate;
    private BiFunction selector;

    Java8EngineWrapper(ConscryptEngine conscryptEngine) {
        Preconditions.checkNotNull(conscryptEngine, "delegate");
        this.delegate = conscryptEngine;
    }

    static SSLEngine getDelegate(SSLEngine sSLEngine) {
        return sSLEngine instanceof Java8EngineWrapper ? ((Java8EngineWrapper) sSLEngine).delegate : sSLEngine;
    }

    private static ApplicationProtocolSelector toApplicationProtocolSelector(final BiFunction biFunction) {
        if (biFunction == null) {
            return null;
        }
        return new ApplicationProtocolSelector() { // from class: com.google.android.gms.org.conscrypt.Java8EngineWrapper.1
            @Override // com.google.android.gms.org.conscrypt.ApplicationProtocolSelector
            public String selectApplicationProtocol(SSLEngine sSLEngine, List list) {
                Object apply;
                apply = BiFunction.this.apply(sSLEngine, list);
                return (String) apply;
            }

            @Override // com.google.android.gms.org.conscrypt.ApplicationProtocolSelector
            public String selectApplicationProtocol(SSLSocket sSLSocket, List list) {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // javax.net.ssl.SSLEngine
    public void beginHandshake() {
        this.delegate.beginHandshake();
    }

    @Override // javax.net.ssl.SSLEngine
    public void closeInbound() {
        this.delegate.closeInbound();
    }

    @Override // javax.net.ssl.SSLEngine
    public void closeOutbound() {
        this.delegate.closeOutbound();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public byte[] exportKeyingMaterial(String str, byte[] bArr, int i) {
        return this.delegate.exportKeyingMaterial(str, bArr, i);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public String getApplicationProtocol() {
        return this.delegate.getApplicationProtocol();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public String[] getApplicationProtocols() {
        return this.delegate.getApplicationProtocols();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public byte[] getChannelId() {
        return this.delegate.getChannelId();
    }

    @Override // javax.net.ssl.SSLEngine
    public Runnable getDelegatedTask() {
        this.delegate.getDelegatedTask();
        return null;
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getEnableSessionCreation() {
        return this.delegate.getEnableSessionCreation();
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getEnabledCipherSuites() {
        return this.delegate.getEnabledCipherSuites();
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getEnabledProtocols() {
        return this.delegate.getEnabledProtocols();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public String getHandshakeApplicationProtocol() {
        return this.delegate.getHandshakeApplicationProtocol();
    }

    @Override // javax.net.ssl.SSLEngine
    public BiFunction getHandshakeApplicationProtocolSelector() {
        return this.selector;
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        return this.delegate.getHandshakeStatus();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public String getHostname() {
        return this.delegate.getHostname();
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getNeedClientAuth() {
        return this.delegate.getNeedClientAuth();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public String getPeerHost() {
        return this.delegate.getPeerHost();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public int getPeerPort() {
        return this.delegate.getPeerPort();
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLParameters getSSLParameters() {
        return this.delegate.getSSLParameters();
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLSession getSession() {
        return this.delegate.getSession();
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLEngine
    public String[] getSupportedProtocols() {
        return this.delegate.getSupportedProtocols();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public byte[] getTlsUnique() {
        return this.delegate.getTlsUnique();
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getUseClientMode() {
        return this.delegate.getUseClientMode();
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean getWantClientAuth() {
        return this.delegate.getWantClientAuth();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public SSLSession handshakeSession() {
        return this.delegate.handshakeSession();
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean isInboundDone() {
        return this.delegate.isInboundDone();
    }

    @Override // javax.net.ssl.SSLEngine
    public boolean isOutboundDone() {
        return this.delegate.isOutboundDone();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public int maxSealOverhead() {
        return this.delegate.maxSealOverhead();
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public void setApplicationProtocolSelector(ApplicationProtocolSelector applicationProtocolSelector) {
        this.delegate.setApplicationProtocolSelector(applicationProtocolSelector == null ? null : new ApplicationProtocolSelectorAdapter(this, applicationProtocolSelector));
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public void setApplicationProtocols(String[] strArr) {
        this.delegate.setApplicationProtocols(strArr);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public void setBufferAllocator(BufferAllocator bufferAllocator) {
        this.delegate.setBufferAllocator(bufferAllocator);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public void setChannelIdEnabled(boolean z) {
        this.delegate.setChannelIdEnabled(z);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public void setChannelIdPrivateKey(PrivateKey privateKey) {
        this.delegate.setChannelIdPrivateKey(privateKey);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnableSessionCreation(boolean z) {
        this.delegate.setEnableSessionCreation(z);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnabledCipherSuites(String[] strArr) {
        this.delegate.setEnabledCipherSuites(strArr);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setEnabledProtocols(String[] strArr) {
        this.delegate.setEnabledProtocols(strArr);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setHandshakeApplicationProtocolSelector(BiFunction biFunction) {
        this.selector = biFunction;
        setApplicationProtocolSelector(toApplicationProtocolSelector(biFunction));
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public void setHandshakeListener(HandshakeListener handshakeListener) {
        this.delegate.setHandshakeListener(handshakeListener);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public void setHostname(String str) {
        this.delegate.setHostname(str);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setNeedClientAuth(boolean z) {
        this.delegate.setNeedClientAuth(z);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setSSLParameters(SSLParameters sSLParameters) {
        this.delegate.setSSLParameters(sSLParameters);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setUseClientMode(boolean z) {
        this.delegate.setUseClientMode(z);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public void setUseSessionTickets(boolean z) {
        this.delegate.setUseSessionTickets(z);
    }

    @Override // javax.net.ssl.SSLEngine
    public void setWantClientAuth(boolean z) {
        this.delegate.setWantClientAuth(z);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return this.delegate.unwrap(byteBuffer, byteBuffer2);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return this.delegate.wrap(byteBuffer, byteBuffer2);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        return this.delegate.unwrap(byteBuffer, byteBufferArr);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer byteBuffer) {
        return this.delegate.wrap(byteBufferArr, i, i2, byteBuffer);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine, javax.net.ssl.SSLEngine
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2) {
        return this.delegate.unwrap(byteBuffer, byteBufferArr, i, i2);
    }

    @Override // javax.net.ssl.SSLEngine
    public SSLEngineResult wrap(ByteBuffer[] byteBufferArr, ByteBuffer byteBuffer) {
        return this.delegate.wrap(byteBufferArr, byteBuffer);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer[] byteBufferArr2, int i3, int i4) {
        return this.delegate.unwrap(byteBufferArr, i, i2, byteBufferArr2, i3, i4);
    }

    @Override // com.google.android.gms.org.conscrypt.AbstractConscryptEngine
    public SSLEngineResult unwrap(ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) {
        return this.delegate.unwrap(byteBufferArr, byteBufferArr2);
    }
}
