package com.google.android.gms.wearable.consent;

import defpackage.arxo;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.dkbc;
import defpackage.dkdy;
import defpackage.dlzd;
import defpackage.fecj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WatchAccountGaiaListenerChimeraService extends dkbc {
    private static final arxo a = new arxo("WatchAccountGaiaWLS", new String[0]);

    @Override // defpackage.dkbc, defpackage.djkj
    public final dfaq k(String str, String str2, byte[] bArr) {
        if (!str2.equals("/watch_account_gaia")) {
            a.m("Unexpected path: ".concat(String.valueOf(str2)), new Object[0]);
            return dfbl.c(new IllegalStateException("Invalid path"));
        }
        try {
            fecj v = dlzd.a.v();
            String a2 = dkdy.a(this);
            if (!v.b.L()) {
                v.U();
            }
            dlzd dlzdVar = (dlzd) v.b;
            a2.getClass();
            dlzdVar.b |= 1;
            dlzdVar.c = a2;
            dlzd dlzdVar2 = (dlzd) v.Q();
            a.h("Returning watch GAIA ID", new Object[0]);
            return dfbl.d(dlzdVar2.r());
        } catch (IllegalStateException e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            return dfbl.c(new IllegalStateException("Exception while fetching GAIA ID", th));
        }
    }
}
