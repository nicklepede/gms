package com.google.android.gms.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.purchase.client.c;
import com.google.android.gms.ads.internal.purchase.client.d;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.azht;
import defpackage.tcm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class InAppPurchaseManagerCreatorImpl extends c {
    private static final boolean a = com.google.android.gms.ads.internal.util.c.b();

    @Override // com.google.android.gms.ads.internal.purchase.client.d
    public IBinder newInAppPurchaseManager(azht azhtVar) {
        d asInterface;
        Context context = (Context) ObjectWrapper.a(azhtVar);
        p.c(context);
        if (((Boolean) p.e.d()).booleanValue() && (asInterface = c.asInterface((IBinder) tcm.a(context).b("com.google.android.gms.ads.ChimeraInAppPurchaseManagerCreatorImpl"))) != null) {
            try {
                return asInterface.newInAppPurchaseManager(azhtVar);
            } catch (RemoteException e) {
                if (a) {
                    int i = com.google.android.gms.ads.internal.util.c.a;
                    h.e("Failed to create using dynamite package", e);
                }
            }
        }
        int i2 = com.google.android.gms.ads.internal.util.c.a;
        h.d("Chimera is not available or disabled.");
        return null;
    }
}
