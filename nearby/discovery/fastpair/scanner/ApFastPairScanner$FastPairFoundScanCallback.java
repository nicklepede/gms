package com.google.android.gms.nearby.discovery.fastpair.scanner;

import android.bluetooth.le.ScanResult;
import defpackage.autd;
import defpackage.bjnn;
import defpackage.ciqy;
import defpackage.cjxm;
import defpackage.cjxx;
import defpackage.cjxy;
import defpackage.cjyi;
import defpackage.cjyn;
import defpackage.cjyq;
import defpackage.dpns;
import defpackage.ezqi;
import defpackage.ftey;
import defpackage.fxxm;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ApFastPairScanner$FastPairFoundScanCallback extends bjnn {
    public static final /* synthetic */ int c = 0;
    public final AtomicInteger a;
    final /* synthetic */ cjxm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApFastPairScanner$FastPairFoundScanCallback(cjxm cjxmVar) {
        super(cjxmVar.a, "FastPairFoundScanCallback");
        this.b = cjxmVar;
        this.a = new AtomicInteger(-1);
    }

    @Override // defpackage.bjnn
    public final void c(int i, ScanResult scanResult) {
        byte[] e;
        cjyn e2;
        byte[] e3;
        final byte[] e4;
        if (scanResult == null || scanResult.getScanRecord() == null || scanResult.getDevice() == null) {
            return;
        }
        final cjyq f = cjyq.f(scanResult);
        cjxm cjxmVar = this.b;
        final int i2 = this.a.get();
        if (f.c() > 126 || f.c() < -127) {
            ciqy.a.a(ciqy.e()).z("FastPairScannerController: ignores the scan result, rssi=%s", f.c());
            return;
        }
        cjyi cjyiVar = cjxmVar.c;
        cjyn e5 = f.e();
        if (e5 != null && (e4 = e5.e(cjxy.e)) != null) {
            final cjxy cjxyVar = (cjxy) cjyiVar;
            cjxyVar.b.f(new ezqi("reportSpotDeviceSighting", new Runnable() { // from class: cjxv
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.findmydevice.spot.ScanResult scanResult2 = new com.google.android.gms.findmydevice.spot.ScanResult();
                    bexw.a(e4, scanResult2);
                    cjyq cjyqVar = f;
                    bexw.c(cjyqVar.c(), scanResult2);
                    bexw.b(cjyqVar.d().getAddress(), scanResult2);
                    cjxy.this.m.a(new com.google.android.gms.findmydevice.spot.ScanResult[]{scanResult2});
                    ciqy.a.a(ciqy.e()).x("FastPairScannerController: finish spot report api");
                }
            }));
        }
        if (ftey.i() && (e2 = f.e()) != null && (e3 = e2.e(cjxy.f)) != null) {
            dpns.a(e3, new cjxx(f, (cjxy) cjyiVar));
        }
        cjyn e6 = f.e();
        if (e6 == null || (e = e6.e(cjxy.g)) == null) {
            return;
        }
        String b = autd.b(e);
        if (b.length() >= 6) {
            String substring = b.substring(0, 6);
            fxxm.e(substring, "substring(...)");
            if (cjxy.h.contains(substring)) {
                return;
            }
        }
        final cjxy cjxyVar2 = (cjxy) cjyiVar;
        cjxyVar2.b.f(new ezqi("reportSighting", new Runnable() { // from class: cjxw
            @Override // java.lang.Runnable
            public final void run() {
                cjxy cjxyVar3 = cjxy.this;
                long j = cjxyVar3.j;
                long j2 = -1;
                if (j != -1) {
                    j2 = 0;
                    if (j != 0) {
                        j2 = cjxyVar3.l.b() - cjxyVar3.j;
                    }
                }
                cjxyVar3.k.l(f, i2, j2);
            }
        }));
    }
}
