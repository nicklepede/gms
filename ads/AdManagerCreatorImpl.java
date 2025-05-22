package com.google.android.gms.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.ap;
import com.google.android.gms.ads.internal.client.aq;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.mediation.client.e;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bblp;
import defpackage.uym;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AdManagerCreatorImpl extends ap {
    @Override // com.google.android.gms.ads.internal.client.aq
    public IBinder newAdManager(bblp bblpVar, AdSizeParcel adSizeParcel, String str, e eVar, int i) {
        aq asInterface;
        Context context = (Context) ObjectWrapper.a(bblpVar);
        p.c(context);
        if (((Boolean) p.e.d()).booleanValue() && (asInterface = ap.asInterface((IBinder) uym.a(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl"))) != null) {
            try {
                return asInterface.newAdManager(bblpVar, adSizeParcel, str, eVar, i);
            } catch (RemoteException e) {
                if (c.b()) {
                    h.e("Failed to create using dynamite package", e);
                }
            }
        }
        int i2 = c.a;
        h.d("Chimera is not available or disabled.");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.aq
    public IBinder newAdManagerByType(bblp bblpVar, AdSizeParcel adSizeParcel, String str, e eVar, int i, int i2) {
        aq asInterface;
        Context context = (Context) ObjectWrapper.a(bblpVar);
        p.c(context);
        if (((Boolean) p.e.d()).booleanValue() && (asInterface = ap.asInterface((IBinder) uym.a(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl"))) != null) {
            try {
                return asInterface.newAdManagerByType(bblpVar, adSizeParcel, str, eVar, i, i2);
            } catch (RemoteException e) {
                if (c.b()) {
                    h.e("Failed to create using dynamite package", e);
                }
            }
        }
        int i3 = c.a;
        h.d("Chimera is not available or disabled.");
        return null;
    }
}
