package com.google.android.gms.org.conscrypt;

import java.security.Principal;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLEngine;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class Spake2PlusKeyManager implements KeyManager {
    private final byte[] context;
    private final int handshakeLimit;
    private final byte[] idProver;
    private final byte[] idVerifier;
    private final boolean isClient;
    private final byte[] password;

    Spake2PlusKeyManager(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, boolean z, int i) {
        this.context = bArr == null ? new byte[0] : bArr;
        this.password = bArr2;
        this.idProver = bArr3 == null ? new byte[0] : bArr3;
        this.idVerifier = bArr4 == null ? new byte[0] : bArr4;
        this.isClient = z;
        this.handshakeLimit = i;
    }

    public String chooseEngineAlias(String str, Principal[] principalArr, SSLEngine sSLEngine) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public String chooseEngineClientAlias(String[] strArr, Principal[] principalArr, SSLEngine sSLEngine) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public byte[] getContext() {
        return this.context;
    }

    public int getHandshakeLimit() {
        return this.handshakeLimit;
    }

    public byte[] getIdProver() {
        return this.idProver;
    }

    public byte[] getIdVerifier() {
        return this.idVerifier;
    }

    public byte[] getPassword() {
        return this.password;
    }

    public boolean isClient() {
        return this.isClient;
    }
}
