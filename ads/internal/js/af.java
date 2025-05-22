package com.google.android.gms.ads.internal.js;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class af implements com.google.android.gms.ads.internal.util.promise.c {
    final /* synthetic */ ag a;

    public af(ag agVar) {
        this.a = agVar;
    }

    @Override // com.google.android.gms.ads.internal.util.promise.c
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final k kVar = (k) obj;
        com.google.android.gms.ads.internal.util.future.e.c.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.js.ae
            @Override // java.lang.Runnable
            public final void run() {
                k kVar2 = kVar;
                kVar2.g("/result", com.google.android.gms.ads.internal.gmsg.d.b);
                kVar2.d();
            }
        });
    }
}
