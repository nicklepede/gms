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
import defpackage.azht;
import defpackage.tcm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class NativeAdViewHolderDelegateCreatorImpl extends j {
    @Override // com.google.android.gms.ads.internal.formats.client.k
    public IBinder newNativeAdViewHolderDelegate(azht azhtVar, azht azhtVar2, azht azhtVar3) {
        k asInterface;
        Context context = ((View) ObjectWrapper.a(azhtVar)).getContext();
        p.c(context);
        if (((Boolean) p.e.d()).booleanValue() && (asInterface = j.asInterface((IBinder) tcm.a(context).b("com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl"))) != null) {
            try {
                return asInterface.newNativeAdViewHolderDelegate(azhtVar, azhtVar2, azhtVar3);
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
