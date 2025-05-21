package com.google.android.gms.org.conscrypt;

import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLSession;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
interface ConscryptSession extends SSLSession {

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    /* renamed from: com.google.android.gms.org.conscrypt.ConscryptSession$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    String getApplicationProtocol();

    @Override // javax.net.ssl.SSLSession
    X509Certificate[] getPeerCertificates();

    byte[] getPeerSignedCertificateTimestamp();

    String getRequestedServerName();

    List getStatusResponses();
}
