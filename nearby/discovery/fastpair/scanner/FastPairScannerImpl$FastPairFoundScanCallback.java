package com.google.android.gms.nearby.discovery.fastpair.scanner;

import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import defpackage.autd;
import defpackage.bjnn;
import defpackage.ciqy;
import defpackage.cjyq;
import defpackage.cjyt;
import defpackage.cjyu;
import defpackage.dpns;
import defpackage.ekvl;
import defpackage.ezqi;
import defpackage.ftey;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FastPairScannerImpl$FastPairFoundScanCallback extends bjnn {
    public static final /* synthetic */ int b = 0;
    public final AtomicInteger a;
    private final cjyu c;

    public FastPairScannerImpl$FastPairFoundScanCallback(Context context, cjyu cjyuVar) {
        super(context, "FastPairFoundScanCallback");
        this.c = cjyuVar;
        this.a = new AtomicInteger(-1);
    }

    @Override // defpackage.bjnn
    public final void c(int i, final ScanResult scanResult) {
        final int i2 = this.a.get();
        if (scanResult == null || scanResult.getScanRecord() == null || scanResult.getDevice() == null) {
            return;
        }
        if (scanResult.getRssi() > 126 || scanResult.getRssi() < -127) {
            ciqy.a.a(ciqy.e()).z("ScanResultHandler: ignores the scan result, rssi:%s", scanResult.getRssi());
            return;
        }
        final cjyu cjyuVar = this.c;
        ScanRecord scanRecord = scanResult.getScanRecord();
        ekvl.y(scanRecord);
        final byte[] serviceData = scanRecord.getServiceData(cjyu.c);
        if (serviceData != null) {
            cjyuVar.h.f(new ezqi("reportSpotDeviceSighting", new Runnable() { // from class: cjys
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.findmydevice.spot.ScanResult scanResult2 = new com.google.android.gms.findmydevice.spot.ScanResult();
                    bexw.a(serviceData, scanResult2);
                    ScanResult scanResult3 = scanResult;
                    bexw.c(scanResult3.getRssi(), scanResult2);
                    bexw.b(scanResult3.getDevice().getAddress(), scanResult2);
                    cjyu.this.f.a(new com.google.android.gms.findmydevice.spot.ScanResult[]{scanResult2});
                    ciqy.a.a(ciqy.e()).x("ScanResultHandler: finish spot report api");
                }
            }));
        }
        ScanRecord scanRecord2 = scanResult.getScanRecord();
        ekvl.y(scanRecord2);
        byte[] serviceData2 = scanRecord2.getServiceData(cjyu.d);
        if (serviceData2 != null && ftey.i()) {
            dpns.a(serviceData2, new cjyt(cjyuVar, scanResult));
        }
        ScanRecord scanRecord3 = scanResult.getScanRecord();
        ekvl.y(scanRecord3);
        byte[] serviceData3 = scanRecord3.getServiceData(cjyu.a);
        if (serviceData3 != null) {
            String b2 = autd.b(serviceData3);
            if (b2.length() >= 6) {
                if (cjyu.b.contains(b2.substring(0, 6))) {
                    return;
                }
            }
            final cjyq f = cjyq.f(scanResult);
            cjyuVar.h.f(new ezqi("reportSighting", new Runnable() { // from class: cjyr
                @Override // java.lang.Runnable
                public final void run() {
                    cjyu cjyuVar2 = cjyu.this;
                    long j = cjyuVar2.k;
                    long j2 = -1;
                    if (j != -1) {
                        j2 = 0;
                        if (j != 0) {
                            j2 = cjyuVar2.i.b() - cjyuVar2.k;
                        }
                    }
                    cjyuVar2.e.l(f, i2, j2);
                }
            }));
        }
    }
}
