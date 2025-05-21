package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import defpackage.eolj;
import defpackage.fjzz;
import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
final class s {
    private final ad a = new ad(fjzz.a.a().d(), fjzz.a.a().c());

    public s(Context context) {
        try {
            eolj.a();
        } catch (GeneralSecurityException e) {
            d.c(context, "HybridConfig.register", e);
        }
    }

    public static final boolean b(String str) {
        return "doubleclick.net".equals(str) || DesugarCollections.unmodifiableMap(fjzz.d().b).containsKey(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r0.b(r7, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.eoca a(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = b(r7)     // Catch: java.lang.Throwable -> L76
            r1 = 0
            if (r0 != 0) goto La
            monitor-exit(r6)
            return r1
        La:
            enyn r0 = defpackage.fjzz.d()     // Catch: java.lang.Throwable -> L76
            feea r0 = r0.b     // Catch: java.lang.Throwable -> L76
            java.util.Map r0 = j$.util.DesugarCollections.unmodifiableMap(r0)     // Catch: java.lang.Throwable -> L76
            java.lang.Object r7 = r0.get(r7)     // Catch: java.lang.Throwable -> L76
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L76
            if (r7 != 0) goto L1e
            monitor-exit(r6)
            return r1
        L1e:
            com.google.android.gms.ads.identifier.settings.ad r0 = r6.a     // Catch: java.lang.Throwable -> L76
            java.lang.Object r2 = r0.a(r7)     // Catch: java.lang.Throwable -> L76
            eoca r2 = (defpackage.eoca) r2     // Catch: java.lang.Throwable -> L76
            if (r2 != 0) goto L74
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L76
            if (r2 != 0) goto L6c
            int r2 = r7.length()     // Catch: java.lang.Throwable -> L76
            int r2 = r2 % 2
            if (r2 == 0) goto L37
            goto L6c
        L37:
            byte[] r2 = defpackage.aspj.c(r7)     // Catch: java.lang.Throwable -> L76
            eokr r3 = defpackage.eomd.a     // Catch: java.lang.Throwable -> L76
            epfc r4 = defpackage.epfc.NIST_P256     // Catch: java.lang.Throwable -> L76
            epfe r5 = defpackage.epfe.COMPRESSED     // Catch: java.lang.Throwable -> L76
            java.security.spec.ECPoint r2 = defpackage.epff.i(r4, r5, r2)     // Catch: java.lang.Throwable -> L76
            eokt r1 = defpackage.eokt.d(r3, r2, r1)     // Catch: java.lang.Throwable -> L76
            eocj r2 = new eocj     // Catch: java.lang.Throwable -> L76
            r2.<init>()     // Catch: java.lang.Throwable -> L76
            eoch r1 = defpackage.eocl.b(r1)     // Catch: java.lang.Throwable -> L76
            r3 = 0
            r1.b(r3)     // Catch: java.lang.Throwable -> L76
            r1.a()     // Catch: java.lang.Throwable -> L76
            r2.c(r1)     // Catch: java.lang.Throwable -> L76
            eocl r1 = r2.a()     // Catch: java.lang.Throwable -> L76
            eobx r2 = defpackage.eolo.a()     // Catch: java.lang.Throwable -> L76
            java.lang.Class<eoca> r3 = defpackage.eoca.class
            java.lang.Object r1 = r1.l(r2, r3)     // Catch: java.lang.Throwable -> L76
            eoca r1 = (defpackage.eoca) r1     // Catch: java.lang.Throwable -> L76
        L6c:
            if (r1 == 0) goto L73
            r0.b(r7, r1)     // Catch: java.lang.Throwable -> L76
            monitor-exit(r6)
            return r1
        L73:
            r2 = r1
        L74:
            monitor-exit(r6)
            return r2
        L76:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L76
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.settings.s.a(java.lang.String):eoca");
    }
}
