package com.google.android.gms.location.fused.logging;

import android.location.GnssCapabilities;
import android.location.LocationManager;
import android.os.Build;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.location.fused.logging.HardwareLoggerService;
import defpackage.btjq;
import defpackage.bwjx;
import defpackage.cauf;
import defpackage.ekww;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class HardwareLoggerService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private btjq b;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!"HardwareLogger".equals(caufVar.a)) {
            return 2;
        }
        this.b.d(new ekww() { // from class: cbzl
            @Override // defpackage.ekww
            public final Object lK() {
                GnssCapabilities gnssCapabilities;
                boolean hasLowPowerMode;
                fgrc v = ensz.a.v();
                ensy ensyVar = ensy.HARDWARE;
                if (!v.b.L()) {
                    v.U();
                }
                HardwareLoggerService hardwareLoggerService = HardwareLoggerService.this;
                ensz enszVar = (ensz) v.b;
                enszVar.c = ensyVar.F;
                enszVar.b |= 1;
                fgrc v2 = cbzk.a.v();
                LocationManager locationManager = (LocationManager) Objects.requireNonNull((LocationManager) hardwareLoggerService.getSystemService("location"));
                String a2 = irc.a(locationManager);
                if (a2 != null) {
                    String substring = a2.substring(0, Math.min(a2.length(), 50));
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    cbzk cbzkVar = (cbzk) v2.b;
                    substring.getClass();
                    cbzkVar.b |= 2;
                    cbzkVar.d = substring;
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    boolean hasSystemFeature = hardwareLoggerService.getPackageManager().hasSystemFeature("android.hardware.wifi.aware");
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    cbzk cbzkVar2 = (cbzk) v2.b;
                    cbzkVar2.b |= 4;
                    cbzkVar2.e = hasSystemFeature;
                    boolean hasSystemFeature2 = hardwareLoggerService.getPackageManager().hasSystemFeature("android.hardware.wifi.rtt");
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    cbzk cbzkVar3 = (cbzk) v2.b;
                    cbzkVar3.b |= 8;
                    cbzkVar3.f = hasSystemFeature2;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    boolean z = locationManager.getGnssBatchSize() > 1;
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    cbzk cbzkVar4 = (cbzk) v2.b;
                    cbzkVar4.b |= 16;
                    cbzkVar4.g = z;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    gnssCapabilities = locationManager.getGnssCapabilities();
                    hasLowPowerMode = gnssCapabilities.hasLowPowerMode();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    cbzk cbzkVar5 = (cbzk) v2.b;
                    cbzkVar5.b |= 32;
                    cbzkVar5.h = hasLowPowerMode;
                }
                if (!v.b.L()) {
                    v.U();
                }
                ensz enszVar2 = (ensz) v.b;
                cbzk cbzkVar6 = (cbzk) v2.Q();
                cbzkVar6.getClass();
                enszVar2.w = cbzkVar6;
                enszVar2.b |= 1048576;
                return (ensz) v.Q();
            }
        });
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        super.onCreate();
        this.b = bwjx.v();
    }
}
