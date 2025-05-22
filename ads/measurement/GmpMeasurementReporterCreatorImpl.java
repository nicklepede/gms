package com.google.android.gms.ads.measurement;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.measurement.internal.b;
import com.google.android.gms.ads.measurement.internal.c;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.bblp;
import defpackage.uym;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class GmpMeasurementReporterCreatorImpl extends b {
    @Override // com.google.android.gms.ads.measurement.internal.c
    public IBinder newGmpMeasurementReporter(bblp bblpVar) {
        c asInterface = b.asInterface((IBinder) uym.a((Context) ObjectWrapper.a(bblpVar)).b("com.google.android.gms.ads.measurement.ChimeraGmpMeasurementReporterCreatorImpl"));
        if (asInterface != null) {
            try {
                return asInterface.newGmpMeasurementReporter(bblpVar);
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
