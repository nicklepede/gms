package com.google.android.gms.ads.httpcache;

import android.os.ParcelFileDescriptor;
import defpackage.enrv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class e implements enrv {
    final /* synthetic */ com.google.android.gms.ads.internal.httpcache.f a;
    final /* synthetic */ f b;

    public e(f fVar, com.google.android.gms.ads.internal.httpcache.f fVar2) {
        this.a = fVar2;
        this.b = fVar;
    }

    @Override // defpackage.enrv
    public final void a(Throwable th) {
        this.b.b(this.a, null);
    }

    @Override // defpackage.enrv
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.b(this.a, (ParcelFileDescriptor) obj);
    }
}
