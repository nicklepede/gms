package com.google.android.gms.location.fused.logging;

import android.location.GnssCapabilities;
import android.location.LocationManager;
import android.os.Build;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.location.fused.logging.HardwareLoggerService;
import defpackage.brbz;
import defpackage.bubv;
import defpackage.byln;
import defpackage.eijr;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class HardwareLoggerService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private brbz b;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!"HardwareLogger".equals(bylnVar.a)) {
            return 2;
        }
        this.b.d(new eijr() { // from class: bzqu
            @Override // defpackage.eijr
            public final Object a() {
                GnssCapabilities gnssCapabilities;
                boolean hasLowPowerMode;
                fecj v = elfm.a.v();
                elfl elflVar = elfl.HARDWARE;
                if (!v.b.L()) {
                    v.U();
                }
                HardwareLoggerService hardwareLoggerService = HardwareLoggerService.this;
                elfm elfmVar = (elfm) v.b;
                elfmVar.c = elflVar.F;
                elfmVar.b |= 1;
                fecj v2 = bzqt.a.v();
                LocationManager locationManager = (LocationManager) Objects.requireNonNull((LocationManager) hardwareLoggerService.getSystemService("location"));
                String a2 = ipm.a(locationManager);
                if (a2 != null) {
                    String substring = a2.substring(0, Math.min(a2.length(), 50));
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    bzqt bzqtVar = (bzqt) v2.b;
                    substring.getClass();
                    bzqtVar.b |= 2;
                    bzqtVar.d = substring;
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    boolean hasSystemFeature = hardwareLoggerService.getPackageManager().hasSystemFeature("android.hardware.wifi.aware");
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    bzqt bzqtVar2 = (bzqt) v2.b;
                    bzqtVar2.b |= 4;
                    bzqtVar2.e = hasSystemFeature;
                    boolean hasSystemFeature2 = hardwareLoggerService.getPackageManager().hasSystemFeature("android.hardware.wifi.rtt");
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    bzqt bzqtVar3 = (bzqt) v2.b;
                    bzqtVar3.b |= 8;
                    bzqtVar3.f = hasSystemFeature2;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    boolean z = locationManager.getGnssBatchSize() > 1;
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    bzqt bzqtVar4 = (bzqt) v2.b;
                    bzqtVar4.b |= 16;
                    bzqtVar4.g = z;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    gnssCapabilities = locationManager.getGnssCapabilities();
                    hasLowPowerMode = gnssCapabilities.hasLowPowerMode();
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    bzqt bzqtVar5 = (bzqt) v2.b;
                    bzqtVar5.b |= 32;
                    bzqtVar5.h = hasLowPowerMode;
                }
                if (!v.b.L()) {
                    v.U();
                }
                elfm elfmVar2 = (elfm) v.b;
                bzqt bzqtVar6 = (bzqt) v2.Q();
                bzqtVar6.getClass();
                elfmVar2.w = bzqtVar6;
                elfmVar2.b |= 1048576;
                return (elfm) v.Q();
            }
        });
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        super.onCreate();
        this.b = bubv.v();
    }
}
