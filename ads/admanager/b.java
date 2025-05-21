package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ab;
import com.google.android.gms.ads.internal.client.an;
import com.google.android.gms.ads.internal.client.ba;
import com.google.android.gms.ads.internal.client.bo;
import com.google.android.gms.ads.internal.client.i;
import com.google.android.gms.ads.internal.client.p;
import com.google.android.gms.ads.internal.client.u;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.tbx;
import defpackage.tco;
import defpackage.tdh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class b extends com.google.android.gms.ads.interstitial.b {
    private final Context a;
    private final i b;
    private final an c;
    private final com.google.android.gms.ads.internal.mediation.client.a d;
    private final long e;

    public b() {
        throw null;
    }

    public final void a(bo boVar, tbx tbxVar) {
        try {
            an anVar = this.c;
            if (anVar != null) {
                boVar.i = this.e;
                anVar.r(this.b.a(this.a, boVar), new ab(tbxVar, this));
            }
        } catch (RemoteException e) {
            h.o("#007 Could not call remote method.", e);
            tbxVar.a(new tdh(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }

    @Override // com.google.android.gms.ads.interstitial.b
    public final void b(tco tcoVar) {
        try {
            an anVar = this.c;
            if (anVar != null) {
                anVar.t(new ba(tcoVar));
            }
        } catch (RemoteException e) {
            h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.b
    public final void c(boolean z) {
        try {
            an anVar = this.c;
            if (anVar != null) {
                anVar.n(z);
            }
        } catch (RemoteException e) {
            h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.b
    public final void d() {
        h.k("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        try {
            an anVar = this.c;
            if (anVar != null) {
                anVar.o(new ObjectWrapper(null));
            }
        } catch (RemoteException e) {
            h.o("#007 Could not call remote method.", e);
        }
    }

    public b(Context context, String str) {
        com.google.android.gms.ads.internal.mediation.client.a aVar = new com.google.android.gms.ads.internal.mediation.client.a();
        this.d = aVar;
        this.e = System.currentTimeMillis();
        this.a = context;
        this.b = i.a;
        this.c = (an) new p(u.a(), context, new AdSizeParcel("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false), str, aVar).d(context);
    }
}
