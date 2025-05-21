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
import defpackage.azht;
import defpackage.tcm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AdManagerCreatorImpl extends ap {
    @Override // com.google.android.gms.ads.internal.client.aq
    public IBinder newAdManager(azht azhtVar, AdSizeParcel adSizeParcel, String str, e eVar, int i) {
        aq asInterface;
        Context context = (Context) ObjectWrapper.a(azhtVar);
        p.c(context);
        if (((Boolean) p.e.d()).booleanValue() && (asInterface = ap.asInterface((IBinder) tcm.a(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl"))) != null) {
            try {
                return asInterface.newAdManager(azhtVar, adSizeParcel, str, eVar, i);
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
    public IBinder newAdManagerByType(azht azhtVar, AdSizeParcel adSizeParcel, String str, e eVar, int i, int i2) {
        aq asInterface;
        Context context = (Context) ObjectWrapper.a(azhtVar);
        p.c(context);
        if (((Boolean) p.e.d()).booleanValue() && (asInterface = ap.asInterface((IBinder) tcm.a(context).b("com.google.android.gms.ads.ChimeraAdManagerCreatorImpl"))) != null) {
            try {
                return asInterface.newAdManagerByType(azhtVar, adSizeParcel, str, eVar, i, i2);
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
