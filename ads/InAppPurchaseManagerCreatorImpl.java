package com.google.android.gms.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.purchase.client.c;
import com.google.android.gms.ads.internal.purchase.client.d;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bblp;
import defpackage.uym;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class InAppPurchaseManagerCreatorImpl extends c {
    private static final boolean a = com.google.android.gms.ads.internal.util.c.b();

    @Override // com.google.android.gms.ads.internal.purchase.client.d
    public IBinder newInAppPurchaseManager(bblp bblpVar) {
        d asInterface;
        Context context = (Context) ObjectWrapper.a(bblpVar);
        p.c(context);
        if (((Boolean) p.e.d()).booleanValue() && (asInterface = c.asInterface((IBinder) uym.a(context).b("com.google.android.gms.ads.ChimeraInAppPurchaseManagerCreatorImpl"))) != null) {
            try {
                return asInterface.newInAppPurchaseManager(bblpVar);
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
