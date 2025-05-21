package com.google.android.gms.nearby.discovery.fastpair.scanner;

import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import defpackage.aspj;
import defpackage.bhiy;
import defpackage.cgiv;
import defpackage.chqp;
import defpackage.chqs;
import defpackage.chqt;
import defpackage.dndj;
import defpackage.eiig;
import defpackage.exbz;
import defpackage.fqld;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class FastPairScannerImpl$FastPairFoundScanCallback extends bhiy {
    public static final /* synthetic */ int b = 0;
    public final AtomicInteger a;
    private final chqt c;

    public FastPairScannerImpl$FastPairFoundScanCallback(Context context, chqt chqtVar) {
        super(context, "FastPairFoundScanCallback");
        this.c = chqtVar;
        this.a = new AtomicInteger(-1);
    }

    @Override // defpackage.bhiy
    public final void c(int i, final ScanResult scanResult) {
        final int i2 = this.a.get();
        if (scanResult == null || scanResult.getScanRecord() == null || scanResult.getDevice() == null) {
            return;
        }
        if (scanResult.getRssi() > 126 || scanResult.getRssi() < -127) {
            cgiv.a.a(cgiv.e()).z("ScanResultHandler: ignores the scan result, rssi:%s", scanResult.getRssi());
            return;
        }
        final chqt chqtVar = this.c;
        ScanRecord scanRecord = scanResult.getScanRecord();
        eiig.x(scanRecord);
        final byte[] serviceData = scanRecord.getServiceData(chqt.c);
        if (serviceData != null) {
            chqtVar.h.f(new exbz("reportSpotDeviceSighting", new Runnable() { // from class: chqr
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.findmydevice.spot.ScanResult scanResult2 = new com.google.android.gms.findmydevice.spot.ScanResult();
                    bcwk.a(serviceData, scanResult2);
                    ScanResult scanResult3 = scanResult;
                    bcwk.c(scanResult3.getRssi(), scanResult2);
                    bcwk.b(scanResult3.getDevice().getAddress(), scanResult2);
                    chqt.this.f.a(new com.google.android.gms.findmydevice.spot.ScanResult[]{scanResult2});
                    cgiv.a.a(cgiv.e()).x("ScanResultHandler: finish spot report api");
                }
            }));
        }
        ScanRecord scanRecord2 = scanResult.getScanRecord();
        eiig.x(scanRecord2);
        byte[] serviceData2 = scanRecord2.getServiceData(chqt.d);
        if (serviceData2 != null && fqld.i()) {
            dndj.a(serviceData2, new chqs(chqtVar, scanResult));
        }
        ScanRecord scanRecord3 = scanResult.getScanRecord();
        eiig.x(scanRecord3);
        byte[] serviceData3 = scanRecord3.getServiceData(chqt.a);
        if (serviceData3 != null) {
            String b2 = aspj.b(serviceData3);
            if (b2.length() >= 6) {
                if (chqt.b.contains(b2.substring(0, 6))) {
                    return;
                }
            }
            final chqp f = chqp.f(scanResult);
            chqtVar.h.f(new exbz("reportSighting", new Runnable() { // from class: chqq
                @Override // java.lang.Runnable
                public final void run() {
                    chqt chqtVar2 = chqt.this;
                    long j = chqtVar2.k;
                    long j2 = -1;
                    if (j != -1) {
                        j2 = 0;
                        if (j != 0) {
                            j2 = chqtVar2.i.b() - chqtVar2.k;
                        }
                    }
                    chqtVar2.e.l(f, i2, j2);
                }
            }));
        }
    }
}
