package com.google.android.gms.ads.internal.webview;

import android.net.Uri;
import defpackage.eqfo;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
final class m implements eqfo {
    final /* synthetic */ List a;
    final /* synthetic */ Uri b;
    final /* synthetic */ n c;

    public m(n nVar, List list, Uri uri) {
        this.a = list;
        this.b = uri;
        this.c = nVar;
    }

    @Override // defpackage.eqfo
    public final void a(Throwable th) {
        String valueOf = String.valueOf(String.valueOf(this.b));
        int i = com.google.android.gms.ads.internal.util.c.a;
        com.google.android.gms.ads.internal.util.client.h.k("Failed to parse gmsg params for: ".concat(valueOf));
    }

    @Override // defpackage.eqfo
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.e((Map) obj, this.a);
    }
}
