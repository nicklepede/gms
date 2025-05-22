package com.google.android.gms.ads.httpcache;

import android.os.ParcelFileDescriptor;
import defpackage.eqfo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class e implements eqfo {
    final /* synthetic */ com.google.android.gms.ads.internal.httpcache.f a;
    final /* synthetic */ f b;

    public e(f fVar, com.google.android.gms.ads.internal.httpcache.f fVar2) {
        this.a = fVar2;
        this.b = fVar;
    }

    @Override // defpackage.eqfo
    public final void a(Throwable th) {
        this.b.b(this.a, null);
    }

    @Override // defpackage.eqfo
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.b(this.a, (ParcelFileDescriptor) obj);
    }
}
