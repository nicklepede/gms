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
import defpackage.azht;
import defpackage.tcm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class MobileAdsSettingManagerCreatorImpl extends bc {
    @Override // com.google.android.gms.ads.internal.client.bd
    public IBinder getMobileAdsSettingManager(azht azhtVar, int i) {
        bd asInterface;
        Context context = (Context) ObjectWrapper.a(azhtVar);
        p.c(context);
        if (((Boolean) p.e.d()).booleanValue() && (asInterface = bc.asInterface((IBinder) tcm.a(context).b("com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl"))) != null) {
            try {
                return asInterface.getMobileAdsSettingManager(azhtVar, i);
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
