package com.google.android.gms.ads.social;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import defpackage.eqpn;
import defpackage.eqpt;
import defpackage.eqqe;
import defpackage.eqzf;
import defpackage.eqzk;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fhao;
import defpackage.fmpr;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class aa {
    private static aa b;
    final SharedPreferences a;
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final AtomicBoolean d = new AtomicBoolean(false);

    public aa(Context context) {
        this.a = context.getSharedPreferences("social.trustless_token", 0);
        try {
            eqzf.a();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.c.d().d(e, "TrustlessTokenStorage.TrustlessTokenStorage");
        }
    }

    static synchronized aa a(Context context) {
        aa aaVar;
        synchronized (aa.class) {
            if (b == null) {
                b = new aa(context);
            }
            aaVar = b;
        }
        return aaVar;
    }

    private final synchronized byte[] g(String str) {
        fgrc v;
        v = fhao.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fhao fhaoVar = (fhao) v.b;
        fhaoVar.b |= 1;
        fhaoVar.c = str;
        long currentTimeMillis = System.currentTimeMillis();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        fhao fhaoVar2 = (fhao) fgriVar;
        fhaoVar2.b |= 2;
        fhaoVar2.d = currentTimeMillis;
        if (!fgriVar.L()) {
            v.U();
        }
        fhao fhaoVar3 = (fhao) v.b;
        fhaoVar3.e = 1;
        fhaoVar3.b |= 4;
        return ((fhao) v.Q()).r();
    }

    final synchronized String b(String str) {
        if (str != null) {
            if (fmpr.g()) {
                try {
                    return Base64.encodeToString(((eqpt) eqqe.i(eqpn.a(Base64.decode(fmpr.d(), 8))).l(eqzk.a(), eqpt.class)).a(g(str), new byte[0]), 10);
                } catch (IOException | IllegalArgumentException | GeneralSecurityException e) {
                    String concat = "Failed to encrypt the token: ".concat(e.toString());
                    int i = com.google.android.gms.ads.internal.util.c.a;
                    com.google.android.gms.ads.internal.util.client.h.d(concat);
                    com.google.android.gms.ads.internal.c.d().d(e, "TrustlessTokenStorage.anonymizeTrustlessToken");
                    return null;
                }
            }
        }
        return str;
    }

    final synchronized String c(a aVar) {
        return b(this.a.getString(aVar == a.DORITOS_WITH_GAIA ? "token" : "gaialess_token", null));
    }

    final synchronized void d() {
        AtomicBoolean atomicBoolean = this.c;
        if (atomicBoolean.get() && this.d.get()) {
            return;
        }
        atomicBoolean.set(true);
        this.d.set(true);
        this.a.edit().putLong("token_expiration_millis", 0L).putLong("gaialess_token_expiration_millis", 0L).apply();
    }

    final synchronized void e(String str, a aVar) {
        SharedPreferences sharedPreferences = this.a;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        a aVar2 = a.DORITOS_WITH_GAIA;
        edit.putString(aVar == aVar2 ? "token" : "gaialess_token", str).apply();
        com.google.android.gms.ads.internal.c.j();
        sharedPreferences.edit().putLong(aVar == aVar2 ? "token_expiration_millis" : "gaialess_token_expiration_millis", System.currentTimeMillis() + fmpr.b()).apply();
        if (aVar == aVar2) {
            this.c.set(false);
        } else {
            this.d.set(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0015, code lost:
    
        if (r7.d.get() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final synchronized boolean f(com.google.android.gms.ads.social.a r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.google.android.gms.ads.social.a r0 = com.google.android.gms.ads.social.a.DORITOS_WITH_GAIA     // Catch: java.lang.Throwable -> L37
            r1 = 1
            if (r8 != r0) goto Lf
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.c     // Catch: java.lang.Throwable -> L37
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L37
            if (r2 != 0) goto L17
            goto L19
        Lf:
            java.util.concurrent.atomic.AtomicBoolean r2 = r7.d     // Catch: java.lang.Throwable -> L37
            boolean r2 = r2.get()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L19
        L17:
            monitor-exit(r7)
            return r1
        L19:
            com.google.android.gms.ads.internal.c.j()     // Catch: java.lang.Throwable -> L37
            android.content.SharedPreferences r2 = r7.a     // Catch: java.lang.Throwable -> L37
            if (r8 != r0) goto L23
            java.lang.String r8 = "token_expiration_millis"
            goto L25
        L23:
            java.lang.String r8 = "gaialess_token_expiration_millis"
        L25:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L37
            r5 = 0
            long r5 = r2.getLong(r8, r5)     // Catch: java.lang.Throwable -> L37
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            monitor-exit(r7)
            if (r8 < 0) goto L35
            return r1
        L35:
            r8 = 0
            return r8
        L37:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L37
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.social.aa.f(com.google.android.gms.ads.social.a):boolean");
    }
}
