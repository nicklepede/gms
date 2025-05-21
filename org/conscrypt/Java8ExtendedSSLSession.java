package com.google.android.gms.org.conscrypt;

import java.util.Collections;
import java.util.List;
import javax.net.ssl.SNIHostName;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
class Java8ExtendedSSLSession extends Java7ExtendedSSLSession {
    public Java8ExtendedSSLSession(ExternalSession externalSession) {
        super(externalSession);
    }

    @Override // javax.net.ssl.ExtendedSSLSession
    public final List getRequestedServerNames() {
        String requestedServerName = this.delegate.getRequestedServerName();
        return requestedServerName == null ? Collections.EMPTY_LIST : Collections.singletonList(new SNIHostName(requestedServerName));
    }
}
