package com.google.android.gms.ads.internal.cache;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import defpackage.atvv;
import defpackage.aurc;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.uyn;
import java.io.IOException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class m implements atvv {
    final /* synthetic */ CacheOffering a;
    final /* synthetic */ com.google.android.gms.ads.internal.util.future.i b;
    final /* synthetic */ o c;

    public m(o oVar, CacheOffering cacheOffering, com.google.android.gms.ads.internal.util.future.i iVar) {
        this.a = cacheOffering;
        this.b = iVar;
        this.c = oVar;
    }

    @Override // defpackage.atvv
    public final void a(Bundle bundle) {
        o oVar = this.c;
        synchronized (oVar.d) {
            if (oVar.b) {
                return;
            }
            oVar.b = true;
            final c cVar = oVar.a;
            if (cVar == null) {
                return;
            }
            eqgo eqgoVar = com.google.android.gms.ads.internal.util.future.e.a;
            final CacheOffering cacheOffering = this.a;
            final com.google.android.gms.ads.internal.util.future.i iVar = this.b;
            final eqgl submit = eqgoVar.submit(new Runnable() { // from class: com.google.android.gms.ads.internal.cache.j
                @Override // java.lang.Runnable
                public final void run() {
                    m mVar = m.this;
                    c cVar2 = cVar;
                    com.google.android.gms.ads.internal.util.future.i iVar2 = iVar;
                    try {
                        h g = cVar2.g();
                        Feature[] D = cVar2.D();
                        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.config.p.L.g()).booleanValue();
                        CacheOffering cacheOffering2 = cacheOffering;
                        CacheEntryParcel e = (booleanValue && aurc.e(D, uyn.a)) ? g.e(cacheOffering2) : g.d(cacheOffering2);
                        if (!e.e()) {
                            iVar2.c(new RuntimeException("No entry contents."));
                            mVar.c.a();
                            return;
                        }
                        l lVar = new l(mVar, e.c());
                        int read = lVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        lVar.unread(read);
                        iVar2.a(new q(lVar, e.d(), e.g(), e.a(), e.f()));
                    } catch (RemoteException | IOException e2) {
                        int i = com.google.android.gms.ads.internal.util.c.a;
                        com.google.android.gms.ads.internal.util.client.h.h("Unable to obtain a cache service instance.", e2);
                        iVar2.c(e2);
                        mVar.c.a();
                    }
                }
            });
            iVar.hD(new Runnable() { // from class: com.google.android.gms.ads.internal.cache.k
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.google.android.gms.ads.internal.util.future.i.this.isCancelled()) {
                        submit.cancel(true);
                    }
                }
            }, com.google.android.gms.ads.internal.util.future.e.d);
        }
    }

    @Override // defpackage.atvv
    public final void b(int i) {
    }
}
