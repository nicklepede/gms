package com.google.android.gms.ads.adshield.internal;

import android.os.IBinder;
import android.os.IInterface;
import defpackage.bblp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public interface c extends IInterface {
    IBinder newAdShieldClient(String str, bblp bblpVar);

    IBinder newAdShieldClientWithoutAdvertisingId(String str, bblp bblpVar);

    IBinder newUnifiedAdShieldClient(bblp bblpVar, bblp bblpVar2, byte[] bArr);
}
