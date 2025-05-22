package com.google.android.gms.ads.internal.mediation.client;

import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import defpackage.uzl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class n implements com.google.android.gms.ads.mediation.k {
    private final Set a;
    private final boolean b;
    private final int c;
    private final NativeAdOptionsParcel d;
    private final boolean f;
    private final List e = new ArrayList();
    private final Map g = new HashMap();

    public n(Set set, boolean z, int i, NativeAdOptionsParcel nativeAdOptionsParcel, List list, boolean z2) {
        this.a = set;
        this.b = z;
        this.c = i;
        this.d = nativeAdOptionsParcel;
        this.f = z2;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] split = str.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.g.put(split[1], true);
                        } else if ("false".equals(split[2])) {
                            this.g.put(split[1], false);
                        }
                    }
                } else {
                    this.e.add(str);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.b
    public final int a() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.mediation.b
    public final Set b() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.mediation.b
    @Deprecated
    public final boolean c() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.mediation.b
    public final boolean d() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.mediation.k
    public final com.google.android.gms.ads.formats.e e() {
        com.google.android.gms.ads.formats.d dVar = new com.google.android.gms.ads.formats.d();
        NativeAdOptionsParcel nativeAdOptionsParcel = this.d;
        if (nativeAdOptionsParcel == null) {
            return new com.google.android.gms.ads.formats.e(dVar);
        }
        int i = nativeAdOptionsParcel.a;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    dVar.g = nativeAdOptionsParcel.g;
                    dVar.c = nativeAdOptionsParcel.h;
                }
                dVar.a = nativeAdOptionsParcel.b;
                dVar.b = nativeAdOptionsParcel.c;
                dVar.d = nativeAdOptionsParcel.d;
                return new com.google.android.gms.ads.formats.e(dVar);
            }
            VideoOptionsParcel videoOptionsParcel = nativeAdOptionsParcel.f;
            if (videoOptionsParcel != null) {
                dVar.e = new uzl(videoOptionsParcel);
            }
        }
        dVar.f = nativeAdOptionsParcel.e;
        dVar.a = nativeAdOptionsParcel.b;
        dVar.b = nativeAdOptionsParcel.c;
        dVar.d = nativeAdOptionsParcel.d;
        return new com.google.android.gms.ads.formats.e(dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r2 == com.google.android.gms.ads.nativead.b.a(2)) goto L21;
     */
    @Override // com.google.android.gms.ads.mediation.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.ads.nativead.c f() {
        /*
            r7 = this;
            com.google.android.gms.ads.nativead.a r0 = new com.google.android.gms.ads.nativead.a
            r0.<init>()
            com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel r1 = r7.d
            if (r1 != 0) goto Lf
            com.google.android.gms.ads.nativead.c r1 = new com.google.android.gms.ads.nativead.c
            r1.<init>(r0)
            return r1
        Lf:
            int r2 = r1.a
            r3 = 2
            if (r2 == r3) goto L51
            r4 = 3
            if (r2 == r4) goto L46
            r5 = 4
            if (r2 == r5) goto L1b
            goto L55
        L1b:
            boolean r2 = r1.g
            r0.f = r2
            int r2 = r1.h
            r0.b = r2
            int r2 = r1.i
            boolean r5 = r1.j
            r0.g = r5
            r0.h = r2
            int r2 = r1.k
            r5 = 1
            int r6 = com.google.android.gms.ads.nativead.b.a(r5)
            if (r2 != r6) goto L36
        L34:
            r3 = r5
            goto L44
        L36:
            int r6 = com.google.android.gms.ads.nativead.b.a(r4)
            if (r2 != r6) goto L3e
            r3 = r4
            goto L44
        L3e:
            int r4 = com.google.android.gms.ads.nativead.b.a(r3)
            if (r2 != r4) goto L34
        L44:
            r0.i = r3
        L46:
            com.google.android.gms.ads.internal.client.VideoOptionsParcel r2 = r1.f
            if (r2 == 0) goto L51
            uzl r3 = new uzl
            r3.<init>(r2)
            r0.d = r3
        L51:
            int r2 = r1.e
            r0.e = r2
        L55:
            boolean r2 = r1.b
            r0.a = r2
            boolean r1 = r1.d
            r0.c = r1
            com.google.android.gms.ads.nativead.c r1 = new com.google.android.gms.ads.nativead.c
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.mediation.client.n.f():com.google.android.gms.ads.nativead.c");
    }

    @Override // com.google.android.gms.ads.mediation.k
    public final Map g() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.mediation.k
    public final boolean h() {
        return this.e.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.k
    public final boolean i() {
        return this.e.contains("6");
    }
}
