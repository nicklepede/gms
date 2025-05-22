package com.google.android.gms.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.at;
import com.google.android.gms.ads.internal.client.au;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.mediation.client.e;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bblp;
import defpackage.uym;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AdPreloaderRemoteCreatorImpl extends at {
    @Override // com.google.android.gms.ads.internal.client.au
    public IBinder newAdPreloader(bblp bblpVar, e eVar, int i) {
        au asInterface;
        Context context = (Context) ObjectWrapper.a(bblpVar);
        p.c(context);
        if (((Boolean) p.e.d()).booleanValue() && (asInterface = at.asInterface((IBinder) uym.a(context).b("com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl"))) != null) {
            try {
                return asInterface.newAdPreloader(bblpVar, eVar, i);
            } catch (RemoteException e) {
                int i2 = c.a;
                h.e("Failed to create AdPreloader using dyanamite package.", e);
            }
        }
        int i3 = c.a;
        h.d("ChimeraAdPreloaderCreatorImpl is not available or disabled. ");
        return null;
    }
}
