package com.google.android.gms.org.conscrypt.metrics;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public enum Protocol {
    UNKNOWN_PROTO(0),
    SSLv3(1),
    TLSv1(2),
    TLSv1_1(3),
    TLSv1_2(4),
    TLSv1_3(5),
    TLS_PROTO_FAILED(65535);

    final int id;

    Protocol(int i) {
        this.id = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Protocol forName(String str) {
        char c;
        switch (str.hashCode()) {
            case -1149123720:
                if (str.equals("TLS_PROTO_FAILED")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -503070503:
                if (str.equals("TLSv1.1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -503070502:
                if (str.equals("TLSv1.2")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -503070501:
                if (str.equals("TLSv1.3")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 79201641:
                if (str.equals("SSLv3")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 79923350:
                if (str.equals("TLSv1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        return c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? c != 5 ? UNKNOWN_PROTO : TLS_PROTO_FAILED : TLSv1_3 : TLSv1_2 : TLSv1_1 : TLSv1 : SSLv3;
    }

    public int getId() {
        return this.id;
    }
}
