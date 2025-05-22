package com.google.android.gms.findmydevice.spot.locationreporting;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.findmydevice.spot.locationreporting.GetCurrentLocationIntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgda;
import defpackage.bgkn;
import defpackage.bgmt;
import defpackage.bgnj;
import defpackage.bhff;
import defpackage.cbqa;
import defpackage.cbqj;
import defpackage.dpvo;
import defpackage.dqmr;
import defpackage.dzgp;
import defpackage.ejaa;
import defpackage.eluo;
import defpackage.eqdv;
import j$.time.Duration;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GetCurrentLocationIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("GetCurrentLocationIntOp", auid.FIND_MY_DEVICE_SPOT);
    public final bgkn b;
    public final dpvo c;
    public final Context d;
    private final cbqj e;
    private final bgnj f;
    private final Executor g;

    public GetCurrentLocationIntentOperation() {
        this(bgda.a());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (bhff.b(intent, "com.google.android.gms.findmydevice.spot.locationreporting.GET_CURRENT_LOCATION")) {
            int intExtra = intent.getIntExtra("priority", 102);
            int i = 0;
            boolean booleanExtra = intent.getBooleanExtra("throttle_never", false);
            if (booleanExtra && intExtra != 100) {
                ((eluo) ((eluo) a.i()).ai((char) 4236)).x("ThrottleBehavior.THROTTLE_NEVER should only be used with Priority.HIGH_ACCURACY.");
            } else if (booleanExtra) {
                i = 2;
            }
            cbqa cbqaVar = new cbqa();
            cbqaVar.d(intExtra);
            cbqaVar.e(i);
            dzgp.a("Get current location", ejaa.g(dqmr.b(this.e.b(cbqaVar.a(), null))).i(new eqdv() { // from class: bgki
                @Override // defpackage.eqdv
                public final eqgl a(Object obj) {
                    Location location = (Location) obj;
                    if (location == null) {
                        ((eluo) ((eluo) GetCurrentLocationIntentOperation.a.j()).ai((char) 4234)).x("Cannot get current location.");
                        return eqgf.a;
                    }
                    GetCurrentLocationIntentOperation getCurrentLocationIntentOperation = GetCurrentLocationIntentOperation.this;
                    if (!location.equals(getCurrentLocationIntentOperation.b.a(location, Duration.ofMillis(getCurrentLocationIntentOperation.c.a()).toSeconds(), fqtb.c() ? ekvi.j(Double.valueOf(fqtl.e())) : ektg.a))) {
                        ((eluo) ((eluo) GetCurrentLocationIntentOperation.a.h()).ai((char) 4233)).x("Current location is invalid or no better than the previous one.");
                        return eqgf.a;
                    }
                    Context context = getCurrentLocationIntentOperation.d;
                    Intent c = bgkl.c(context);
                    if (c == null) {
                        return eqgf.a;
                    }
                    c.putExtra("location", location);
                    context.startService(c);
                    return eqgf.a;
                }
            }, this.g));
            this.f.a();
        }
    }

    public GetCurrentLocationIntentOperation(bgmt bgmtVar) {
        this.e = bgmtVar.B();
        this.f = bgmtVar.p();
        this.b = bgmtVar.m();
        this.c = bgmtVar.C();
        this.d = bgmtVar.c();
        this.g = bgmtVar.G();
    }
}
