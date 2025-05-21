package com.google.android.gms.ads.measurement;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.measurement.internal.b;
import com.google.android.gms.ads.measurement.internal.c;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.azht;
import defpackage.tcm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class GmpMeasurementReporterCreatorImpl extends b {
    @Override // com.google.android.gms.ads.measurement.internal.c
    public IBinder newGmpMeasurementReporter(azht azhtVar) {
        c asInterface = b.asInterface((IBinder) tcm.a((Context) ObjectWrapper.a(azhtVar)).b("com.google.android.gms.ads.measurement.ChimeraGmpMeasurementReporterCreatorImpl"));
        if (asInterface != null) {
            try {
                return asInterface.newGmpMeasurementReporter(azhtVar);
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
