package com.google.android.gms.location.provider.gnss;

import android.location.Location;
import android.location.LocationManager;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aura;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.eluo;
import defpackage.fsfk;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class CrashloopMitigationService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.a("CrashloopMitigation");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        long elapsedRealtimeAgeMillis;
        Location lastKnownLocation = ((LocationManager) Objects.requireNonNull((LocationManager) getSystemService(LocationManager.class))).getLastKnownLocation("gps");
        if (lastKnownLocation != null) {
            elapsedRealtimeAgeMillis = lastKnownLocation.getElapsedRealtimeAgeMillis();
            if (elapsedRealtimeAgeMillis <= fsfk.a.lK().f()) {
                return 0;
            }
        }
        ((eluo) ((eluo) b.h()).ai((char) 5644)).x("Re-enabling GnssLocationService overlay");
        aura.M("com.google.android.gms.location.provider.gnss.GnssLocationService", 1);
        return 0;
    }
}
