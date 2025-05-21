package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.social.GmsDoritosProvider;
import defpackage.ensj;
import defpackage.enss;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class y implements com.google.android.gms.ads.nonagon.signals.e {
    final String a;
    final GmsDoritosProvider b;

    public y(GmsDoritosProvider gmsDoritosProvider, String str) {
        this.b = gmsDoritosProvider;
        this.a = str;
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final int a() {
        return com.google.android.gms.ads.nonagon.signals.d.a(48);
    }

    @Override // com.google.android.gms.ads.nonagon.signals.e
    public final enss b() {
        final enss i = ensj.i(null);
        if (((Boolean) com.google.android.gms.ads.internal.config.p.aL.g()).booleanValue()) {
            i = this.b.getDoritosCookieAsynchronously(this.a);
        }
        final enss doritosCookiesAsynchronously = this.b.getDoritosCookiesAsynchronously(this.a);
        return ensj.d(i, doritosCookiesAsynchronously).a(new Callable() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new z((String) enss.this.get(), (String) doritosCookiesAsynchronously.get());
            }
        }, com.google.android.gms.ads.internal.util.future.e.a);
    }
}
