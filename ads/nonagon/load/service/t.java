package com.google.android.gms.ads.nonagon.load.service;

import android.content.Context;
import android.os.SystemClock;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class t implements com.google.android.gms.ads.nonagon.util.concurrent.f {
    protected final Context a;
    protected final String b;
    protected final int c;

    public t(Context context, String str, int i) {
        this.a = context;
        this.b = str;
        this.c = i;
    }

    @Override // com.google.android.gms.ads.nonagon.util.concurrent.f
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        r rVar = (r) obj;
        String str = rVar.a;
        int i = rVar.b;
        Map map = rVar.c;
        byte[] bArr = rVar.d;
        String str2 = rVar.e;
        com.google.android.gms.ads.internal.c.j();
        return b(str, i, map, bArr, str2, SystemClock.elapsedRealtime());
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01fa, code lost:
    
        com.google.android.gms.ads.internal.util.client.h.k(defpackage.a.j(r0, "Received error HTTP response code: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020b, code lost:
    
        throw new com.google.android.gms.ads.nonagon.load.a(1, defpackage.a.j(r0, "Received error HTTP response code: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017b, code lost:
    
        defpackage.asgt.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x022d, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.google.android.gms.ads.nonagon.load.service.s b(java.lang.String r18, int r19, java.util.Map r20, byte[] r21, java.lang.String r22, long r23) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.load.service.t.b(java.lang.String, int, java.util.Map, byte[], java.lang.String, long):com.google.android.gms.ads.nonagon.load.service.s");
    }
}
