package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.locationreporting.WaitForLocationReportUploadIntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgda;
import defpackage.bgmo;
import defpackage.bgmt;
import defpackage.bhff;
import defpackage.dzgp;
import defpackage.ejaa;
import defpackage.ekut;
import defpackage.eqex;
import java.util.concurrent.CancellationException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class WaitForLocationReportUploadIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private final bgmo b;

    static {
        ausn.b("WaitForLocRptUplIntOp", auid.FIND_MY_DEVICE_SPOT);
    }

    public WaitForLocationReportUploadIntentOperation() {
        this(bgda.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (bhff.b(intent, "com.google.android.gms.findmydevice.spot.locationreporting.WAIT_FOR_UPLOAD_SIGHTINGS")) {
            dzgp.a("Fast sightings upload", ejaa.g(this.b.a()).e(CancellationException.class, new ekut() { // from class: bgxf
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    int i = WaitForLocationReportUploadIntentOperation.a;
                    return null;
                }
            }, eqex.a));
        }
    }

    public WaitForLocationReportUploadIntentOperation(bgmt bgmtVar) {
        this.b = bgmtVar.n();
    }
}
