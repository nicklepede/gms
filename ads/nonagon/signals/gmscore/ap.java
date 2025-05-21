package com.google.android.gms.ads.nonagon.signals.gmscore;

import android.os.Bundle;
import defpackage.fixe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ap implements fixe {
    private final ai a;

    public ap(ai aiVar) {
        this.a = aiVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.fuuq, defpackage.fuup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Integer a() {
        boolean z;
        Bundle bundle = this.a.a.a.getBundle("extras");
        int i = -1;
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("query_info_type", "");
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        z = 4;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        z = 5;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        z = 6;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        z = 7;
                        break;
                    }
                    z = -1;
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        z = 8;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    i = 0;
                    break;
                case true:
                    i = 1;
                    break;
                case true:
                    i = 2;
                    break;
                case true:
                    i = 3;
                    break;
                case true:
                    i = 4;
                    break;
                case true:
                    i = 5;
                    break;
                case true:
                    i = 6;
                    break;
                case true:
                    i = 7;
                    break;
                case true:
                    i = 8;
                    break;
            }
        }
        return Integer.valueOf(i);
    }
}
