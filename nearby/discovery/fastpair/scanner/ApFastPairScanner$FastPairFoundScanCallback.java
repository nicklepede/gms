package com.google.android.gms.nearby.discovery.fastpair.scanner;

import android.bluetooth.le.ScanResult;
import defpackage.aspj;
import defpackage.bhiy;
import defpackage.cgiv;
import defpackage.chpl;
import defpackage.chpw;
import defpackage.chpx;
import defpackage.chqh;
import defpackage.chqm;
import defpackage.chqp;
import defpackage.dndj;
import defpackage.exbz;
import defpackage.fqld;
import defpackage.fvbo;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ApFastPairScanner$FastPairFoundScanCallback extends bhiy {
    public static final /* synthetic */ int c = 0;
    public final AtomicInteger a;
    final /* synthetic */ chpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApFastPairScanner$FastPairFoundScanCallback(chpl chplVar) {
        super(chplVar.a, "FastPairFoundScanCallback");
        this.b = chplVar;
        this.a = new AtomicInteger(-1);
    }

    @Override // defpackage.bhiy
    public final void c(int i, ScanResult scanResult) {
        byte[] e;
        chqm e2;
        byte[] e3;
        final byte[] e4;
        if (scanResult == null || scanResult.getScanRecord() == null || scanResult.getDevice() == null) {
            return;
        }
        final chqp f = chqp.f(scanResult);
        chpl chplVar = this.b;
        final int i2 = this.a.get();
        if (f.c() > 126 || f.c() < -127) {
            cgiv.a.a(cgiv.e()).z("FastPairScannerController: ignores the scan result, rssi=%s", f.c());
            return;
        }
        chqh chqhVar = chplVar.c;
        chqm e5 = f.e();
        if (e5 != null && (e4 = e5.e(chpx.e)) != null) {
            final chpx chpxVar = (chpx) chqhVar;
            chpxVar.b.f(new exbz("reportSpotDeviceSighting", new Runnable() { // from class: chpu
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.findmydevice.spot.ScanResult scanResult2 = new com.google.android.gms.findmydevice.spot.ScanResult();
                    bcwk.a(e4, scanResult2);
                    chqp chqpVar = f;
                    bcwk.c(chqpVar.c(), scanResult2);
                    bcwk.b(chqpVar.d().getAddress(), scanResult2);
                    chpx.this.m.a(new com.google.android.gms.findmydevice.spot.ScanResult[]{scanResult2});
                    cgiv.a.a(cgiv.e()).x("FastPairScannerController: finish spot report api");
                }
            }));
        }
        if (fqld.i() && (e2 = f.e()) != null && (e3 = e2.e(chpx.f)) != null) {
            dndj.a(e3, new chpw(f, (chpx) chqhVar));
        }
        chqm e6 = f.e();
        if (e6 == null || (e = e6.e(chpx.g)) == null) {
            return;
        }
        String b = aspj.b(e);
        if (b.length() >= 6) {
            String substring = b.substring(0, 6);
            fvbo.e(substring, "substring(...)");
            if (chpx.h.contains(substring)) {
                return;
            }
        }
        final chpx chpxVar2 = (chpx) chqhVar;
        chpxVar2.b.f(new exbz("reportSighting", new Runnable() { // from class: chpv
            @Override // java.lang.Runnable
            public final void run() {
                chpx chpxVar3 = chpx.this;
                long j = chpxVar3.j;
                long j2 = -1;
                if (j != -1) {
                    j2 = 0;
                    if (j != 0) {
                        j2 = chpxVar3.l.b() - chpxVar3.j;
                    }
                }
                chpxVar3.k.l(f, i2, j2);
            }
        }));
    }
}
