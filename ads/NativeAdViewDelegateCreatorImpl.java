package com.google.android.gms.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.formats.client.g;
import com.google.android.gms.ads.internal.formats.client.h;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bblp;
import defpackage.uym;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class NativeAdViewDelegateCreatorImpl extends g {
    @Override // com.google.android.gms.ads.internal.formats.client.h
    public IBinder newNativeAdViewDelegate(bblp bblpVar, bblp bblpVar2, bblp bblpVar3, int i) {
        h asInterface;
        Context context = (Context) ObjectWrapper.a(bblpVar);
        p.c(context);
        if (((Boolean) p.e.d()).booleanValue() && (asInterface = g.asInterface((IBinder) uym.a(context).b("com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl"))) != null) {
            try {
                return asInterface.newNativeAdViewDelegate(bblpVar, bblpVar2, bblpVar3, i);
            } catch (RemoteException e) {
                if (c.b()) {
                    com.google.android.gms.ads.internal.util.client.h.e("Failed to create using dynamite package", e);
                }
            }
        }
        int i2 = c.a;
        com.google.android.gms.ads.internal.util.client.h.d("Chimera is not available or disabled.");
        return null;
    }
}
