package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.mediation.e;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.i;
import com.google.android.gms.ads.mediation.j;
import com.google.android.gms.ads.mediation.k;
import defpackage.eiig;
import defpackage.tbu;
import defpackage.tcd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class CustomEventAdapter implements com.google.android.gms.ads.mediation.d, g, i {
    static final tbu a = new tbu(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");
    b b;
    c c;
    d d;

    private static Object a(Class cls, String str) {
        try {
            eiig.x(str);
            return cls.cast(Class.forName(str).getDeclaredConstructor(null).newInstance(null));
        } catch (Throwable th) {
            h.k("Could not instantiate custom event adapter: " + str + ". " + th.getMessage());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final View getBannerView() {
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void onDestroy() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.a();
        }
        c cVar = this.c;
        if (cVar != null) {
            cVar.a();
        }
        d dVar = this.d;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void onPause() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.b();
        }
        c cVar = this.c;
        if (cVar != null) {
            cVar.b();
        }
        d dVar = this.d;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // com.google.android.gms.ads.mediation.c
    public final void onResume() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.c();
        }
        c cVar = this.c;
        if (cVar != null) {
            cVar.c();
        }
        d dVar = this.d;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // com.google.android.gms.ads.mediation.d
    public final void requestBannerAd(Context context, e eVar, Bundle bundle, tcd tcdVar, com.google.android.gms.ads.mediation.b bVar, Bundle bundle2) {
        b bVar2 = (b) a(b.class, bundle.getString("class_name"));
        this.b = bVar2;
        if (bVar2 == null) {
            eVar.g(a);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        eiig.x(this.b);
        b bVar3 = this.b;
        bundle.getString("parameter");
        bVar3.d();
    }

    @Override // com.google.android.gms.ads.mediation.g
    public final void requestInterstitialAd(Context context, com.google.android.gms.ads.mediation.h hVar, Bundle bundle, com.google.android.gms.ads.mediation.b bVar, Bundle bundle2) {
        c cVar = (c) a(c.class, bundle.getString("class_name"));
        this.c = cVar;
        if (cVar == null) {
            hVar.h(a);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        eiig.x(this.c);
        c cVar2 = this.c;
        bundle.getString("parameter");
        cVar2.e();
    }

    @Override // com.google.android.gms.ads.mediation.i
    public final void requestNativeAd(Context context, j jVar, Bundle bundle, k kVar, Bundle bundle2) {
        d dVar = (d) a(d.class, bundle.getString("class_name"));
        this.d = dVar;
        if (dVar == null) {
            jVar.i(a);
            return;
        }
        if (bundle2 != null) {
            bundle2.getBundle(bundle.getString("class_name"));
        }
        eiig.x(this.d);
        d dVar2 = this.d;
        bundle.getString("parameter");
        dVar2.d();
    }

    @Override // com.google.android.gms.ads.mediation.g
    public final void showInterstitial() {
        c cVar = this.c;
        if (cVar != null) {
            cVar.d();
        }
    }
}
