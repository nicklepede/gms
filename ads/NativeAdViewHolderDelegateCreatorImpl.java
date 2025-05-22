package com.google.android.gms.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.config.p;
import com.google.android.gms.ads.internal.formats.client.j;
import com.google.android.gms.ads.internal.formats.client.k;
import com.google.android.gms.ads.internal.util.c;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bblp;
import defpackage.uym;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class NativeAdViewHolderDelegateCreatorImpl extends j {
    @Override // com.google.android.gms.ads.internal.formats.client.k
    public IBinder newNativeAdViewHolderDelegate(bblp bblpVar, bblp bblpVar2, bblp bblpVar3) {
        k asInterface;
        Context context = ((View) ObjectWrapper.a(bblpVar)).getContext();
        p.c(context);
        if (((Boolean) p.e.d()).booleanValue() && (asInterface = j.asInterface((IBinder) uym.a(context).b("com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl"))) != null) {
            try {
                return asInterface.newNativeAdViewHolderDelegate(bblpVar, bblpVar2, bblpVar3);
            } catch (RemoteException e) {
                if (c.b()) {
                    h.e("Failed to create using dynamite package", e);
                }
            }
        }
        int i = c.a;
        h.d("Chimera is not available or disabled.");
        return null;
    }
}
