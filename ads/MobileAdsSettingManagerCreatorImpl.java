package com.google.android.gms.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.bc;
import com.google.android.gms.ads.internal.client.bd;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bblp;
import defpackage.uym;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class MobileAdsSettingManagerCreatorImpl extends bc {
    @Override // com.google.android.gms.ads.internal.client.bd
    public IBinder getMobileAdsSettingManager(bblp bblpVar, int i) {
        bd asInterface;
        Context context = (Context) ObjectWrapper.a(bblpVar);
        p.c(context);
        if (((Boolean) p.e.d()).booleanValue() && (asInterface = bc.asInterface((IBinder) uym.a(context).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl"))) != null) {
            try {
                return asInterface.getMobileAdsSettingManager(bblpVar, i);
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
