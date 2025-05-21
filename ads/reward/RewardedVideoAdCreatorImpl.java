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
import defpackage.azht;
import defpackage.tcm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class RewardedVideoAdCreatorImpl extends b {
    @Override // com.google.android.gms.ads.internal.reward.client.c
    public IBinder newRewardedVideoAd(azht azhtVar, e eVar, int i) {
        c asInterface;
        Context context = (Context) ObjectWrapper.a(azhtVar);
        p.c(context);
        if (((Boolean) p.e.d()).booleanValue() && (asInterface = b.asInterface((IBinder) tcm.a(context).b("com.google.android.gms.ads.reward.ChimeraRewardedVideoAdCreatorImpl"))) != null) {
            try {
                return asInterface.newRewardedVideoAd(azhtVar, eVar, i);
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
