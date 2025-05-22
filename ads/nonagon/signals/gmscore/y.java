package com.google.android.gms.ads.nonagon.signals.gmscore;

import com.google.android.gms.ads.social.GmsDoritosProvider;
import defpackage.eqgc;
import defpackage.eqgl;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
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
    public final eqgl b() {
        final eqgl i = eqgc.i(null);
        if (((Boolean) com.google.android.gms.ads.internal.config.p.aM.g()).booleanValue()) {
            i = this.b.getDoritosCookieAsynchronously(this.a);
        }
        final eqgl doritosCookiesAsynchronously = this.b.getDoritosCookiesAsynchronously(this.a);
        return eqgc.d(i, doritosCookiesAsynchronously).a(new Callable() { // from class: com.google.android.gms.ads.nonagon.signals.gmscore.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new z((String) eqgl.this.get(), (String) doritosCookiesAsynchronously.get());
            }
        }, com.google.android.gms.ads.internal.util.future.e.a);
    }
}
