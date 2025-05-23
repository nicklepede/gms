package com.google.android.gms.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.aj;
import com.google.android.gms.ads.internal.client.ak;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.mediation.client.e;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bblp;
import defpackage.uym;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AdLoaderBuilderCreatorImpl extends aj {
    @Override // com.google.android.gms.ads.internal.client.ak
    public IBinder newAdLoaderBuilder(bblp bblpVar, String str, e eVar, int i) {
        ak asInterface;
        Context context = (Context) ObjectWrapper.a(bblpVar);
        p.c(context);
        if (((Boolean) p.e.d()).booleanValue() && (asInterface = aj.asInterface((IBinder) uym.a(context).b("com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl"))) != null) {
            try {
                return asInterface.newAdLoaderBuilder(bblpVar, str, eVar, i);
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
}
