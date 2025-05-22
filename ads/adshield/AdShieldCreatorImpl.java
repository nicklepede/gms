package com.google.android.gms.ads.adshield;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.adshield.internal.b;
import com.google.android.gms.ads.adshield.internal.c;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bblp;
import defpackage.uym;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AdShieldCreatorImpl extends b {
    @Override // com.google.android.gms.ads.adshield.internal.c
    @Deprecated
    public IBinder newAdShieldClient(String str, bblp bblpVar) {
        c asInterface = b.asInterface((IBinder) uym.a((Context) ObjectWrapper.a(bblpVar)).b("com.google.android.gms.ads.adshield.ChimeraAdShieldCreatorImpl"));
        if (asInterface != null) {
            try {
                return asInterface.newAdShieldClient(str, bblpVar);
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
    public IBinder newAdShieldClientWithoutAdvertisingId(String str, bblp bblpVar) {
        c asInterface = b.asInterface((IBinder) uym.a((Context) ObjectWrapper.a(bblpVar)).b("com.google.android.gms.ads.adshield.ChimeraAdShieldCreatorImpl"));
        if (asInterface != null) {
            try {
                return asInterface.newAdShieldClientWithoutAdvertisingId(str, bblpVar);
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
    public IBinder newUnifiedAdShieldClient(bblp bblpVar, bblp bblpVar2, byte[] bArr) {
        c asInterface = b.asInterface((IBinder) uym.a((Context) ObjectWrapper.a(bblpVar)).b("com.google.android.gms.ads.adshield.ChimeraAdShieldCreatorImpl"));
        if (asInterface != null) {
            try {
                return asInterface.newUnifiedAdShieldClient(bblpVar, bblpVar2, bArr);
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
