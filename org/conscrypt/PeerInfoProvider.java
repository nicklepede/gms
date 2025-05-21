package com.google.android.gms.org.conscrypt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
abstract class PeerInfoProvider {
    private static final PeerInfoProvider NULL_PEER_INFO_PROVIDER = new PeerInfoProvider() { // from class: com.google.android.gms.org.conscrypt.PeerInfoProvider.1
        @Override // com.google.android.gms.org.conscrypt.PeerInfoProvider
        public String getHostname() {
            return null;
        }

        @Override // com.google.android.gms.org.conscrypt.PeerInfoProvider
        public String getHostnameOrIP() {
            return null;
        }

        @Override // com.google.android.gms.org.conscrypt.PeerInfoProvider
        public int getPort() {
            return -1;
        }
    };

    static PeerInfoProvider forHostAndPort(final String str, final int i) {
        return new PeerInfoProvider() { // from class: com.google.android.gms.org.conscrypt.PeerInfoProvider.2
            @Override // com.google.android.gms.org.conscrypt.PeerInfoProvider
            public String getHostname() {
                return str;
            }

            @Override // com.google.android.gms.org.conscrypt.PeerInfoProvider
            public String getHostnameOrIP() {
                return str;
            }

            @Override // com.google.android.gms.org.conscrypt.PeerInfoProvider
            public int getPort() {
                return i;
            }
        };
    }

    static PeerInfoProvider nullProvider() {
        return NULL_PEER_INFO_PROVIDER;
    }

    public abstract String getHostname();

    public abstract String getHostnameOrIP();

    public abstract int getPort();
}
