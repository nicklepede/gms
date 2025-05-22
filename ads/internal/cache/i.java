package com.google.android.gms.ads.internal.cache;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class i extends com.google.android.gms.ads.internal.util.future.i {
    final /* synthetic */ o a;

    public i(o oVar) {
        this.a = oVar;
    }

    @Override // com.google.android.gms.ads.internal.util.future.i, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.a.a();
        return super.cancel(z);
    }
}
