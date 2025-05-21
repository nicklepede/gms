package com.google.android.gms.ads.adshield;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.adshield.internal.b;
import com.google.android.gms.ads.adshield.internal.c;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.azht;
import defpackage.tcm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AdShieldCreatorImpl extends b {
    @Override // com.google.android.gms.ads.adshield.internal.c
    @Deprecated
    public IBinder newAdShieldClient(String str, azht azhtVar) {
        c asInterface = b.asInterface((IBinder) tcm.a((Context) ObjectWrapper.a(azhtVar)).b("com.google.android.gms.ads.adshield.ChimeraAdShieldCreatorImpl"));
        if (asInterface != null) {
            try {
                return asInterface.newAdShieldClient(str, azhtVar);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.c.a;
                h.e("Failed to create using dynamite package", e);
            }
        }
        int i2 = com.google.android.gms.ads.internal.util.c.a;
        h.d("Chimera is not available.");
        return null;
    }

    @Override // com.google.android.gms.ads.adshield.internal.c
    @Deprecated
    public IBinder newAdShieldClientWithoutAdvertisingId(String str, azht azhtVar) {
        c asInterface = b.asInterface((IBinder) tcm.a((Context) ObjectWrapper.a(azhtVar)).b("com.google.android.gms.ads.adshield.ChimeraAdShieldCreatorImpl"));
        if (asInterface != null) {
            try {
                return asInterface.newAdShieldClientWithoutAdvertisingId(str, azhtVar);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.c.a;
                h.e("Failed to create using dynamite package", e);
            }
        }
        int i2 = com.google.android.gms.ads.internal.util.c.a;
        h.d("Chimera is not available.");
        return null;
    }

    @Override // com.google.android.gms.ads.adshield.internal.c
    public IBinder newUnifiedAdShieldClient(azht azhtVar, azht azhtVar2, byte[] bArr) {
        c asInterface = b.asInterface((IBinder) tcm.a((Context) ObjectWrapper.a(azhtVar)).b("com.google.android.gms.ads.adshield.ChimeraAdShieldCreatorImpl"));
        if (asInterface != null) {
            try {
                return asInterface.newUnifiedAdShieldClient(azhtVar, azhtVar2, bArr);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.c.a;
                h.e("Failed to create using dynamite package", e);
            }
        }
        int i2 = com.google.android.gms.ads.internal.util.c.a;
        h.d("Chimera is not available.");
        return null;
    }
}
