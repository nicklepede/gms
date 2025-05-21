package com.google.android.gms.findmydevice.spot.locationreporting;

import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bebm;
import defpackage.bebo;
import defpackage.bebp;
import defpackage.beim;
import defpackage.belk;
import defpackage.dnlf;
import defpackage.dwvc;
import defpackage.dwwe;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class FixClockDriftIntentOperation extends IntentOperation {
    public static final asot a = asot.b("FixClockDriftIntOp", asej.FIND_MY_DEVICE_SPOT);
    public final belk b;
    public final dwvc c;
    public final bebm d;
    public final dnlf e;
    public final Executor f;
    public final dwwe g;
    private final beim h;

    public FixClockDriftIntentOperation() {
        this(bebo.a());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:40:0x00c3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(android.content.Intent r14) {
        /*
            r13 = this;
            java.lang.String r0 = "com.google.android.gms.findmydevice.spot.locationreporting.FIX_CLOCK_DRIFT"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            boolean r0 = defpackage.bfdp.b(r14, r0)
            if (r0 != 0) goto Ld
            return
        Ld:
            boolean r0 = defpackage.bfdr.a()
            if (r0 != 0) goto L21
            asot r14 = com.google.android.gms.findmydevice.spot.locationreporting.FixClockDriftIntentOperation.a
            ejgq r14 = r14.j()
            java.lang.String r0 = "Eddystone use cases are disabled."
            r1 = 4226(0x1082, float:5.922E-42)
            defpackage.a.A(r14, r0, r1)
            return
        L21:
            java.lang.String r0 = "device_id"
            java.lang.String r0 = r14.getStringExtra(r0)
            if (r0 == 0) goto Lc5
            java.lang.String r1 = "fixed_clock_offset"
            boolean r1 = r14.hasExtra(r1)
            if (r1 == 0) goto Lc5
            java.lang.String r1 = "previous_clock_offset"
            boolean r1 = r14.hasExtra(r1)
            if (r1 != 0) goto L3b
            goto Lc5
        L3b:
            java.lang.String r1 = "fixed_clock_offset"
            r2 = 0
            long r6 = r14.getLongExtra(r1, r2)
            java.lang.String r1 = "previous_clock_offset"
            long r9 = r14.getLongExtra(r1, r2)
            eufn r14 = defpackage.eufn.a
            fecj r14 = r14.v()
            fecp r1 = r14.b
            boolean r1 = r1.L()
            if (r1 != 0) goto L5a
            r14.U()
        L5a:
            fecp r1 = r14.b
            eufn r1 = (defpackage.eufn) r1
            r1.b = r0
            fecp r14 = r14.Q()
            r8 = r14
            eufn r8 = (defpackage.eufn) r8
            dnlf r14 = r13.e
            long r0 = r14.a()
            long r0 = defpackage.dxaj.a(r0)
            beim r14 = r13.h
            java.lang.Object r2 = r14.a
            monitor-enter(r2)
            java.util.Map r14 = r14.b     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r3 = r14.get(r8)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> Lbe
            if (r3 == 0) goto L9a
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L96
            long r3 = r0 - r3
            fobr r5 = defpackage.fobr.a     // Catch: java.lang.Throwable -> L96
            fobs r5 = r5.a()     // Catch: java.lang.Throwable -> L96
            long r11 = r5.l()     // Catch: java.lang.Throwable -> L96
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 >= 0) goto L9a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L96
            return
        L96:
            r0 = move-exception
            r14 = r0
            r5 = r13
            goto Lc1
        L9a:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> Lbe
            r14.put(r8, r0)     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lbe
            dwvc r14 = r13.c
            enss r14 = r14.j(r8)
            egmx r14 = defpackage.egmx.f(r14)
            beiv r4 = new beiv
            r5 = r13
            r4.<init>()
            java.util.concurrent.Executor r0 = r5.f
            egmx r14 = r14.i(r4, r0)
            java.lang.String r0 = "Clock offset update"
            defpackage.dwup.a(r0, r14)
            return
        Lbe:
            r0 = move-exception
            r5 = r13
        Lc0:
            r14 = r0
        Lc1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc3
            throw r14
        Lc3:
            r0 = move-exception
            goto Lc0
        Lc5:
            r5 = r13
            asot r14 = com.google.android.gms.findmydevice.spot.locationreporting.FixClockDriftIntentOperation.a
            ejgq r14 = r14.j()
            java.lang.String r0 = "No device information in intent"
            r1 = 4224(0x1080, float:5.919E-42)
            defpackage.a.A(r14, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.findmydevice.spot.locationreporting.FixClockDriftIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    public FixClockDriftIntentOperation(bebp bebpVar) {
        this.b = bebpVar.o();
        this.c = bebpVar.D();
        this.h = bebpVar.l();
        this.d = bebpVar.i();
        this.g = bebpVar.U();
        this.e = bebpVar.C();
        this.f = bebpVar.G();
    }
}
