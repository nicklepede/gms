package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.locationreporting.WaitForLocationReportUploadIntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bebo;
import defpackage.belc;
import defpackage.belh;
import defpackage.bfdp;
import defpackage.dwup;
import defpackage.egmx;
import defpackage.eiho;
import defpackage.enre;
import java.util.concurrent.CancellationException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class WaitForLocationReportUploadIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private final belc b;

    static {
        asot.b("WaitForLocRptUplIntOp", asej.FIND_MY_DEVICE_SPOT);
    }

    public WaitForLocationReportUploadIntentOperation() {
        this(bebo.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (bfdp.b(intent, "com.google.android.gms.findmydevice.spot.locationreporting.WAIT_FOR_UPLOAD_SIGHTINGS")) {
            dwup.a("Fast sightings upload", egmx.f(this.b.a()).d(CancellationException.class, new eiho() { // from class: bevs
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    int i = WaitForLocationReportUploadIntentOperation.a;
                    return null;
                }
            }, enre.a));
        }
    }

    public WaitForLocationReportUploadIntentOperation(belh belhVar) {
        this.b = belhVar.n();
    }
}
