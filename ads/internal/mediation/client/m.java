package com.google.android.gms.ads.internal.mediation.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.bj;
import defpackage.atzb;
import defpackage.uxu;
import defpackage.uzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class m implements com.google.android.gms.ads.mediation.e, com.google.android.gms.ads.mediation.h, com.google.android.gms.ads.mediation.j {
    public com.google.android.gms.ads.mediation.n a;
    public com.google.android.gms.ads.internal.formats.client.m b;
    private final i c;

    public m(i iVar) {
        this.c = iVar;
    }

    @Override // com.google.android.gms.ads.mediation.j
    public final void a(com.google.android.gms.ads.mediation.i iVar, com.google.android.gms.ads.mediation.n nVar) {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdLoaded.");
        this.a = nVar;
        if (!(iVar instanceof AdMobAdapter)) {
            new uzk().b(new bj(null));
        }
        try {
            this.c.e();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void b() {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdClicked.");
        try {
            this.c.a();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.j
    public final void c() {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.mediation.n nVar = this.a;
        if (this.b == null) {
            if (nVar == null) {
                com.google.android.gms.ads.internal.util.client.h.n("#007 Could not call remote method.");
                return;
            } else if (!nVar.n) {
                com.google.android.gms.ads.internal.util.client.h.d("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdClicked.");
        try {
            this.c.a();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void d() {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdClosed.");
        try {
            this.c.b();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void e() {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdClosed.");
        try {
            this.c.b();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.j
    public final void f() {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdClosed.");
        try {
            this.c.b();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void g(uxu uxuVar) {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdFailedToLoad with error. ErrorCode: " + uxuVar.a + ". ErrorMessage: " + uxuVar.b + ". ErrorDomain: " + uxuVar.c);
        try {
            this.c.c(uxuVar.a());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void h(uxu uxuVar) {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdFailedToLoad with error. ErrorCode: " + uxuVar.a + ". ErrorMessage: " + uxuVar.b + ". ErrorDomain: " + uxuVar.c);
        try {
            this.c.c(uxuVar.a());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.j
    public final void i(uxu uxuVar) {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdFailedToLoad with error. ErrorCode: " + uxuVar.a + ". ErrorMessage: " + uxuVar.b + ". ErrorDomain: " + uxuVar.c);
        try {
            this.c.c(uxuVar.a());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.j
    public final void j() {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.mediation.n nVar = this.a;
        if (this.b == null) {
            if (nVar == null) {
                com.google.android.gms.ads.internal.util.client.h.n("#007 Could not call remote method.");
                return;
            } else if (!nVar.m) {
                com.google.android.gms.ads.internal.util.client.h.d("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdImpression.");
        try {
            this.c.d();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void k() {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdLoaded.");
        try {
            this.c.e();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void l() {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdLoaded.");
        try {
            this.c.e();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.j
    public final void m(com.google.android.gms.ads.internal.formats.client.m mVar) {
        String str;
        atzb.h("#008 Must be called on the main UI thread.");
        try {
            com.google.android.gms.ads.internal.formats.client.l lVar = mVar.a;
            Parcel fF = lVar.fF(4, lVar.fE());
            str = fF.readString();
            fF.recycle();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.g(e);
            str = null;
        }
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdLoaded with template id ".concat(String.valueOf(str)));
        this.b = mVar;
        try {
            this.c.e();
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void n() {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdOpened.");
        try {
            this.c.f();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.h
    public final void o() {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdOpened.");
        try {
            this.c.f();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.j
    public final void p() {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAdOpened.");
        try {
            this.c.f();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.e
    public final void q(String str, String str2) {
        atzb.h("#008 Must be called on the main UI thread.");
        com.google.android.gms.ads.internal.util.client.h.d("Adapter called onAppEvent.");
        try {
            this.c.g(str, str2);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.j
    public final void r(com.google.android.gms.ads.internal.formats.client.m mVar, String str) {
        try {
            this.c.h(mVar.a, str);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }
}
