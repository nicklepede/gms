package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.locationreporting.GetCurrentLocationIntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bebo;
import defpackage.bejb;
import defpackage.belh;
import defpackage.belx;
import defpackage.bfdp;
import defpackage.bzhj;
import defpackage.bzhs;
import defpackage.dnlf;
import defpackage.doci;
import defpackage.dwup;
import defpackage.egmx;
import defpackage.ejhf;
import defpackage.enqc;
import j$.time.Duration;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GetCurrentLocationIntentOperation extends IntentOperation {
    public static final asot a = asot.b("GetCurrentLocationIntOp", asej.FIND_MY_DEVICE_SPOT);
    public final bejb b;
    public final dnlf c;
    public final Context d;
    private final bzhs e;
    private final belx f;
    private final Executor g;

    public GetCurrentLocationIntentOperation() {
        this(bebo.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (bfdp.b(intent, "com.google.android.gms.findmydevice.spot.locationreporting.GET_CURRENT_LOCATION")) {
            int intExtra = intent.getIntExtra("priority", 102);
            int i = 0;
            boolean booleanExtra = intent.getBooleanExtra("throttle_never", false);
            if (booleanExtra && intExtra != 100) {
                ((ejhf) ((ejhf) a.i()).ah((char) 4230)).x("ThrottleBehavior.THROTTLE_NEVER should only be used with Priority.HIGH_ACCURACY.");
            } else if (booleanExtra) {
                i = 2;
            }
            bzhj bzhjVar = new bzhj();
            bzhjVar.d(intExtra);
            bzhjVar.e(i);
            dwup.a("Get current location", egmx.f(doci.b(this.e.b(bzhjVar.a(), null))).i(new enqc() { // from class: beiw
                @Override // defpackage.enqc
                public final enss a(Object obj) {
                    Location location = (Location) obj;
                    if (location == null) {
                        ((ejhf) ((ejhf) GetCurrentLocationIntentOperation.a.j()).ah((char) 4228)).x("Cannot get current location.");
                        return ensm.a;
                    }
                    GetCurrentLocationIntentOperation getCurrentLocationIntentOperation = GetCurrentLocationIntentOperation.this;
                    if (!location.equals(getCurrentLocationIntentOperation.b.a(location, Duration.ofMillis(getCurrentLocationIntentOperation.c.a()).toSeconds(), fobh.c() ? eiid.j(Double.valueOf(fobr.e())) : eigb.a))) {
                        ((ejhf) ((ejhf) GetCurrentLocationIntentOperation.a.h()).ah((char) 4227)).x("Current location is invalid or no better than the previous one.");
                        return ensm.a;
                    }
                    Context context = getCurrentLocationIntentOperation.d;
                    Intent c = beiz.c(context);
                    if (c == null) {
                        return ensm.a;
                    }
                    c.putExtra("location", location);
                    context.startService(c);
                    return ensm.a;
                }
            }, this.g));
            this.f.a();
        }
    }

    public GetCurrentLocationIntentOperation(belh belhVar) {
        this.e = belhVar.B();
        this.f = belhVar.p();
        this.b = belhVar.m();
        this.c = belhVar.C();
        this.d = belhVar.c();
        this.g = belhVar.G();
    }
}
