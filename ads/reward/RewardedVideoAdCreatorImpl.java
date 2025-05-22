package com.google.android.gms.ads.reward;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.mediation.client.e;
import com.google.android.gms.ads.internal.reward.client.b;
import com.google.android.gms.ads.internal.reward.client.c;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bblp;
import defpackage.uym;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class RewardedVideoAdCreatorImpl extends b {
    @Override // com.google.android.gms.ads.internal.reward.client.c
    public IBinder newRewardedVideoAd(bblp bblpVar, e eVar, int i) {
        c asInterface;
        Context context = (Context) ObjectWrapper.a(bblpVar);
        p.c(context);
        if (((Boolean) p.e.d()).booleanValue() && (asInterface = b.asInterface((IBinder) uym.a(context).b("com.google.android.gms.ads.reward.ChimeraRewardedVideoAdCreatorImpl"))) != null) {
            try {
                return asInterface.newRewardedVideoAd(bblpVar, eVar, i);
            } catch (RemoteException e) {
                if (com.google.android.gms.ads.internal.util.c.b()) {
                    h.e("Failed to create using dynamite package", e);
                }
            }
        }
        int i2 = com.google.android.gms.ads.internal.util.c.a;
        h.d("Chimera is not available or disabled.");
        return null;
    }
}
