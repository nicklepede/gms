package com.google.android.gms.location.provider.gnss;

import android.location.Location;
import android.location.LocationManager;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asng;
import defpackage.asot;
import defpackage.byln;
import defpackage.ejhf;
import defpackage.fpls;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class CrashloopMitigationService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.a("CrashloopMitigation");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        long elapsedRealtimeAgeMillis;
        Location lastKnownLocation = ((LocationManager) Objects.requireNonNull((LocationManager) getSystemService(LocationManager.class))).getLastKnownLocation("gps");
        if (lastKnownLocation != null) {
            elapsedRealtimeAgeMillis = lastKnownLocation.getElapsedRealtimeAgeMillis();
            if (elapsedRealtimeAgeMillis <= fpls.a.a().f()) {
                return 0;
            }
        }
        ((ejhf) ((ejhf) b.h()).ah((char) 5630)).x("Re-enabling GnssLocationService overlay");
        asng.M("com.google.android.gms.location.provider.gnss.GnssLocationService", 1);
        return 0;
    }
}
