package com.google.android.gms.findmydevice.spot.locationreporting;

import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bgcy;
import defpackage.bgda;
import defpackage.bgdb;
import defpackage.bgjy;
import defpackage.bgmw;
import defpackage.dpvo;
import defpackage.dzhc;
import defpackage.dzie;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class FixClockDriftIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("FixClockDriftIntOp", auid.FIND_MY_DEVICE_SPOT);
    public final bgmw b;
    public final dzhc c;
    public final bgcy d;
    public final dpvo e;
    public final Executor f;
    public final dzie g;
    private final bgjy h;

    public FixClockDriftIntentOperation() {
        this(bgda.a());
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
            boolean r0 = defpackage.bhff.b(r14, r0)
            if (r0 != 0) goto Ld
            return
        Ld:
            boolean r0 = defpackage.bhfh.a()
            if (r0 != 0) goto L21
            ausn r14 = com.google.android.gms.findmydevice.spot.locationreporting.FixClockDriftIntentOperation.a
            eltz r14 = r14.j()
            java.lang.String r0 = "Eddystone use cases are disabled."
            r1 = 4232(0x1088, float:5.93E-42)
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
            ewvg r14 = defpackage.ewvg.a
            fgrc r14 = r14.v()
            fgri r1 = r14.b
            boolean r1 = r1.L()
            if (r1 != 0) goto L5a
            r14.U()
        L5a:
            fgri r1 = r14.b
            ewvg r1 = (defpackage.ewvg) r1
            r1.b = r0
            fgri r14 = r14.Q()
            r8 = r14
            ewvg r8 = (defpackage.ewvg) r8
            dpvo r14 = r13.e
            long r0 = r14.a()
            long r0 = defpackage.dzmj.a(r0)
            bgjy r14 = r13.h
            java.lang.Object r2 = r14.a
            monitor-enter(r2)
            java.util.Map r14 = r14.b     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r3 = r14.get(r8)     // Catch: java.lang.Throwable -> Lbe
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Throwable -> Lbe
            if (r3 == 0) goto L9a
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L96
            long r3 = r0 - r3
            fqtl r5 = defpackage.fqtl.a     // Catch: java.lang.Throwable -> L96
            fqtm r5 = r5.lK()     // Catch: java.lang.Throwable -> L96
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
            dzhc r14 = r13.c
            eqgl r14 = r14.j(r8)
            ejaa r14 = defpackage.ejaa.g(r14)
            bgkh r4 = new bgkh
            r5 = r13
            r4.<init>()
            java.util.concurrent.Executor r0 = r5.f
            ejaa r14 = r14.i(r4, r0)
            java.lang.String r0 = "Clock offset update"
            defpackage.dzgp.a(r0, r14)
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
            ausn r14 = com.google.android.gms.findmydevice.spot.locationreporting.FixClockDriftIntentOperation.a
            eltz r14 = r14.j()
            java.lang.String r0 = "No device information in intent"
            r1 = 4230(0x1086, float:5.927E-42)
            defpackage.a.A(r14, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.findmydevice.spot.locationreporting.FixClockDriftIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    public FixClockDriftIntentOperation(bgdb bgdbVar) {
        this.b = bgdbVar.o();
        this.c = bgdbVar.D();
        this.h = bgdbVar.l();
        this.d = bgdbVar.i();
        this.g = bgdbVar.U();
        this.e = bgdbVar.C();
        this.f = bgdbVar.G();
    }
}
