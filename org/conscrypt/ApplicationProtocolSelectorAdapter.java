package com.google.android.gms.org.conscrypt;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSocket;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
final class ApplicationProtocolSelectorAdapter {
    private static final int NO_PROTOCOL_SELECTED = -1;
    private final SSLEngine engine;
    private final ApplicationProtocolSelector selector;
    private final SSLSocket socket;

    public ApplicationProtocolSelectorAdapter(SSLEngine sSLEngine, ApplicationProtocolSelector applicationProtocolSelector) {
        Preconditions.checkNotNull(sSLEngine, "engine");
        this.engine = sSLEngine;
        this.socket = null;
        Preconditions.checkNotNull(applicationProtocolSelector, "selector");
        this.selector = applicationProtocolSelector;
    }

    public int selectApplicationProtocol(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            List<String> asList = Arrays.asList(SSLUtils.decodeProtocols(bArr));
            SSLEngine sSLEngine = this.engine;
            String selectApplicationProtocol = sSLEngine != null ? this.selector.selectApplicationProtocol(sSLEngine, asList) : this.selector.selectApplicationProtocol(this.socket, asList);
            if (selectApplicationProtocol != null && !selectApplicationProtocol.isEmpty()) {
                int i = 0;
                for (String str : asList) {
                    if (selectApplicationProtocol.equals(str)) {
                        return i;
                    }
                    i += str.length() + 1;
                }
            }
        }
        return -1;
    }

    public ApplicationProtocolSelectorAdapter(SSLSocket sSLSocket, ApplicationProtocolSelector applicationProtocolSelector) {
        this.engine = null;
        Preconditions.checkNotNull(sSLSocket, "socket");
        this.socket = sSLSocket;
        Preconditions.checkNotNull(applicationProtocolSelector, "selector");
        this.selector = applicationProtocolSelector;
    }
}
