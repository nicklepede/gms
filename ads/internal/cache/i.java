package com.google.android.gms.ads.internal.cache;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
