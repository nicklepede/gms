package com.google.android.gms.wearable.consent;

import defpackage.auad;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.dmmv;
import defpackage.dmpr;
import defpackage.dokp;
import defpackage.fgrc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WatchAccountGaiaListenerChimeraService extends dmmv {
    private static final auad a = new auad("WatchAccountGaiaWLS", new String[0]);

    @Override // defpackage.dmmv, defpackage.dlwc
    public final dhlw k(String str, String str2, byte[] bArr) {
        if (!str2.equals("/watch_account_gaia")) {
            a.m("Unexpected path: ".concat(String.valueOf(str2)), new Object[0]);
            return dhmr.c(new IllegalStateException("Invalid path"));
        }
        try {
            fgrc v = dokp.a.v();
            String a2 = dmpr.a(this);
            if (!v.b.L()) {
                v.U();
            }
            dokp dokpVar = (dokp) v.b;
            a2.getClass();
            dokpVar.b |= 1;
            dokpVar.c = a2;
            dokp dokpVar2 = (dokp) v.Q();
            a.h("Returning watch GAIA ID", new Object[0]);
            return dhmr.d(dokpVar2.r());
        } catch (IllegalStateException e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            return dhmr.c(new IllegalStateException("Exception while fetching GAIA ID", th));
        }
    }
}
