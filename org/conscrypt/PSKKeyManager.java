package com.google.android.gms.org.conscrypt;

import java.net.Socket;
import javax.crypto.SecretKey;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLEngine;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes6.dex */
public interface PSKKeyManager extends KeyManager {
    public static final int MAX_IDENTITY_HINT_LENGTH_BYTES = 128;
    public static final int MAX_IDENTITY_LENGTH_BYTES = 128;
    public static final int MAX_KEY_LENGTH_BYTES = 256;

    String chooseClientKeyIdentity(String str, Socket socket);

    String chooseClientKeyIdentity(String str, SSLEngine sSLEngine);

    String chooseServerKeyIdentityHint(Socket socket);

    String chooseServerKeyIdentityHint(SSLEngine sSLEngine);

    SecretKey getKey(String str, String str2, Socket socket);

    SecretKey getKey(String str, String str2, SSLEngine sSLEngine);
}
