package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bblp;
import defpackage.ekvl;
import defpackage.uyd;
import defpackage.uzk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class br {
    public final uzk a;
    public final v b;
    public a c;
    public uyd[] d;
    public an e;
    public String f;
    public final ViewGroup g;
    public com.google.ads.mediation.a h;
    private final com.google.android.gms.ads.internal.mediation.client.a i;
    private final i j;

    public br(ViewGroup viewGroup) {
        i iVar = i.a;
        this.i = new com.google.android.gms.ads.internal.mediation.client.a();
        this.a = new uzk();
        this.b = new bq(this);
        this.g = viewGroup;
        this.j = iVar;
        this.e = null;
        new AtomicBoolean(false);
    }

    public static AdSizeParcel f(Context context, uyd[] uydVarArr) {
        int length = uydVarArr.length;
        if (uydVarArr[0].equals(uyd.b)) {
            return new AdSizeParcel("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
        }
        AdSizeParcel adSizeParcel = new AdSizeParcel(context, uydVarArr);
        adSizeParcel.j = false;
        return adSizeParcel;
    }

    public final bk a() {
        an anVar = this.e;
        if (anVar != null) {
            try {
                return anVar.b();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public final void b() {
        try {
            an anVar = this.e;
            if (anVar != null) {
                anVar.d();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    public final void c(bo boVar) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.e == null) {
                if (this.d == null || this.f == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                ViewGroup viewGroup = this.g;
                Context context = viewGroup.getContext();
                AdSizeParcel f = f(context, this.d);
                an anVar = "search_v2".equals(f.a) ? (an) new o(u.a(), context, f, this.f).d(context) : (an) new n(u.a(), context, f, this.f, this.i).d(context);
                this.e = anVar;
                anVar.g(new z(this.b));
                a aVar = this.c;
                if (aVar != null) {
                    this.e.s(new x(aVar));
                }
                com.google.ads.mediation.a aVar2 = this.h;
                if (aVar2 != null) {
                    this.e.m(new aw(aVar2));
                }
                this.e.u(new bg());
                this.e.q();
                an anVar2 = this.e;
                if (anVar2 != null) {
                    try {
                        final bblp c = anVar2.c();
                        if (c != null) {
                            if (((Boolean) com.google.android.gms.ads.internal.flag.m.c.d()).booleanValue() && ((Boolean) com.google.android.gms.ads.internal.config.p.bD.g()).booleanValue()) {
                                com.google.android.gms.ads.internal.util.client.f.a.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.bp
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        br.this.g.addView((View) ObjectWrapper.a(c));
                                    }
                                });
                            } else {
                                viewGroup.addView((View) ObjectWrapper.a(c));
                            }
                        }
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
                    }
                }
            }
            boVar.i = currentTimeMillis;
            ekvl.y(this.e);
            this.e.p(this.j.a(this.g.getContext(), boVar));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e2);
        }
    }

    public final void d() {
        try {
            an anVar = this.e;
            if (anVar != null) {
                anVar.e();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }

    public final void e() {
        try {
            an anVar = this.e;
            if (anVar != null) {
                anVar.f();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.h.o("#007 Could not call remote method.", e);
        }
    }
}
