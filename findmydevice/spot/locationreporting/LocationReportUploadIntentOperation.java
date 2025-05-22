package com.google.android.gms.findmydevice.spot.locationreporting;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.findmydevice.spot.locationreporting.LocationReportUploadIntentOperation;
import defpackage.arwk;
import defpackage.auid;
import defpackage.ausn;
import defpackage.azuv;
import defpackage.azuy;
import defpackage.azve;
import defpackage.bfac;
import defpackage.bfad;
import defpackage.bfbw;
import defpackage.bfcb;
import defpackage.bgco;
import defpackage.bgda;
import defpackage.bgdb;
import defpackage.bgde;
import defpackage.bgmo;
import defpackage.bgwc;
import defpackage.bhff;
import defpackage.bsxr;
import defpackage.bygd;
import defpackage.dyqq;
import defpackage.dyqs;
import defpackage.dzgp;
import defpackage.ejaa;
import defpackage.ekut;
import defpackage.ekvl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.ewyj;
import defpackage.fbrg;
import defpackage.fbrj;
import defpackage.fbrl;
import defpackage.fgpr;
import defpackage.fqtb;
import defpackage.fwty;
import defpackage.wjw;
import j$.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class LocationReportUploadIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("LocationReportUplIntOp", auid.FIND_MY_DEVICE_SPOT);
    public static final arwk b = new arwk(5);
    public final bgdb c;
    public final bgwc d;
    public final bfbw e;
    public final Context f;
    public final eqgo g;
    public final bfac h;
    public final bsxr i;
    private final Map j;
    private final bgmo k;
    private final bgde l;

    public LocationReportUploadIntentOperation() {
        this(bgda.a());
    }

    public static fbrj b(Throwable th) {
        if (th instanceof bfad) {
            bfad bfadVar = (bfad) th;
            if ((bfadVar.getCause() instanceof wjw) || bfadVar.c(fwty.UNAUTHENTICATED)) {
                return fbrj.FAILED_UNAUTHENTICATED;
            }
            if (bfadVar.b()) {
                return fbrj.FAILED_NO_NETWORK;
            }
        }
        return fbrj.FAILED_UNEXPECTED_ERROR;
    }

    public static final void d(final fbrl fbrlVar, final String str, final fbrj fbrjVar, final int i) {
        bygd.v().f(bfcb.a(fbrg.SIGHTING_BATCH_UPLOAD, new ekut() { // from class: bgmb
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                fgrc fgrcVar = (fgrc) obj;
                ausn ausnVar = LocationReportUploadIntentOperation.a;
                fgrc v = fbrk.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                String str2 = str;
                fbrj fbrjVar2 = fbrj.this;
                fbrk fbrkVar = (fbrk) v.b;
                fbrkVar.e = fbrjVar2.a();
                fbrkVar.b |= 4;
                fbri fbriVar = str2 == null ? fbri.UNNOWN_SCHEDULING_MECHANISM : str2.equals("BATCH_UPLOAD_TRIGGERED_BY_GMS_TASK") ? fbri.GMS_TASK : str2.equals("BATCH_UPLOAD_TRIGGERED_BY_FAST_EXECUTOR_SERVICE") ? fbri.FAST_EXECUTOR : str2.equals("BATCH_UPLOAD_TRIGGERED_BY_FAST_EXECUTOR_SERVICE_ACTIVE_NETWORK") ? fbri.FAST_EXECUTOR_ACTIVE_NETWORK : fbri.UNNOWN_SCHEDULING_MECHANISM;
                if (!v.b.L()) {
                    v.U();
                }
                fbrk fbrkVar2 = (fbrk) v.b;
                fbrkVar2.c = fbriVar.a();
                fbrkVar2.b |= 1;
                if (!v.b.L()) {
                    v.U();
                }
                fbrl fbrlVar2 = fbrlVar;
                fbrk fbrkVar3 = (fbrk) v.b;
                fbrkVar3.d = fbrlVar2.a();
                fbrkVar3.b |= 2;
                if (!v.b.L()) {
                    v.U();
                }
                int i2 = i;
                fbrk fbrkVar4 = (fbrk) v.b;
                fbrkVar4.b |= 8;
                fbrkVar4.f = i2;
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                fbrf fbrfVar = (fbrf) fgrcVar.b;
                fbrk fbrkVar5 = (fbrk) v.Q();
                fbrf fbrfVar2 = fbrf.a;
                fbrkVar5.getClass();
                fbrfVar.f = fbrkVar5;
                fbrfVar.b |= 8;
                return fgrcVar;
            }
        }));
    }

    public final eqgl a(final ewyj ewyjVar, final Queue queue) {
        Account account = (Account) queue.poll();
        ekvl.y(account);
        bgco c = c(account);
        dyqs dyqsVar = new dyqs(c.s(), (Executor) c.P.b.a());
        dyqq dyqqVar = dyqsVar.b;
        final fgpr nD = ewyjVar.nD();
        return ejaa.g(ejaa.g(ejaa.g(dyqqVar.a(false)).h(new ekut() { // from class: dyqk
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                dzlb dzlbVar = ((dzlc) obj).c;
                if (dzlbVar == null) {
                    dzlbVar = dzlb.a;
                }
                return dzlbVar.c;
            }
        }, eqex.a)).i(new eqdv() { // from class: dyqr
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                int i = dyqs.c;
                return eqgc.i(fgpr.w(((eqpt) eqqe.j(((fgpr) obj).M()).l(ereg.a, eqpt.class)).a(fgpr.this.M(), null)));
            }
        }, dyqsVar.a)).f(Throwable.class, new eqdv() { // from class: bglx
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                Throwable th = (Throwable) obj;
                ((eluo) ((eluo) ((eluo) LocationReportUploadIntentOperation.a.i()).s(th)).ai((char) 4253)).x("Failed encrypting sightings batch.");
                Queue queue2 = queue;
                if (queue2.isEmpty()) {
                    return eqgc.h(th);
                }
                return LocationReportUploadIntentOperation.this.a(ewyjVar, queue2);
            }
        }, this.g);
    }

    public final bgco c(Account account) {
        bgco bgcoVar;
        Map map = this.j;
        synchronized (map) {
            bgcoVar = (bgco) map.get(account);
            if (bgcoVar == null) {
                bgcoVar = this.c.i().b(account);
                map.put(account, bgcoVar);
            }
        }
        return bgcoVar;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        eqgl eqglVar;
        if (bhff.b(intent, "com.google.android.gms.findmydevice.spot.locationreporting.UPLOAD_SIGHTINGS")) {
            final String stringExtra = intent.getStringExtra("scheduled_by");
            bgmo bgmoVar = this.k;
            if (bgmoVar.e(stringExtra)) {
                final azuy a2 = azuv.a("finder_crowdsourcedReport", new azve(this.l.a), new DroidGuardResultsRequest(), azuy.a, azuy.b);
                ejaa g = ejaa.g(this.d.b());
                eqdv eqdvVar = new eqdv() { // from class: bgmc
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj) {
                        final bgwa bgwaVar = (bgwa) obj;
                        elgx elgxVar = bgwaVar.a;
                        if (elgxVar.isEmpty()) {
                            ((eluo) ((eluo) LocationReportUploadIntentOperation.a.j()).ai((char) 4261)).x("No sightings to upload.");
                            return eqgf.a;
                        }
                        elsn listIterator = elgxVar.values().listIterator();
                        final int i = 0;
                        while (listIterator.hasNext()) {
                            i += ((ewyj) listIterator.next()).c.size();
                        }
                        final String str = stringExtra;
                        final LocationReportUploadIntentOperation locationReportUploadIntentOperation = LocationReportUploadIntentOperation.this;
                        if (!fqte.e()) {
                            locationReportUploadIntentOperation.e.a(new itk() { // from class: bglw
                                @Override // defpackage.itk
                                public final void a(Object obj2) {
                                    arwu arwuVar = (arwu) obj2;
                                    arwq m = arwuVar.m("SIGHTINGS_PER_BATCH", LocationReportUploadIntentOperation.b);
                                    arwk arwkVar = m.g;
                                    long j = i;
                                    arwn arwnVar = arwu.b;
                                    m.a(arwkVar.a(j), 1L, arwnVar);
                                    arwuVar.d("COLLECTED_BATCHES").a(0L, 1L, arwnVar);
                                    String str2 = str;
                                    if (str2 != null) {
                                        arwuVar.d(str2).a(0L, 1L, arwnVar);
                                    }
                                }
                            });
                        }
                        Context context = locationReportUploadIntentOperation.f;
                        final List h = auqx.h(context, context.getPackageName());
                        if (h.isEmpty()) {
                            ((eluo) ((eluo) LocationReportUploadIntentOperation.a.j()).ai((char) 4260)).x("No Google accounts available to upload sightings.");
                            return eqgf.a;
                        }
                        final azuy azuyVar = a2;
                        return ejaa.g(locationReportUploadIntentOperation.c.F().f()).i(new eqdv() { // from class: bgme
                            /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
                            
                                if (defpackage.bgia.c(r4) != false) goto L17;
                             */
                            @Override // defpackage.eqdv
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final defpackage.eqgl a(java.lang.Object r19) {
                                /*
                                    Method dump skipped, instructions count: 268
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.bgme.a(java.lang.Object):eqgl");
                            }
                        }, locationReportUploadIntentOperation.g);
                    }
                };
                eqgo eqgoVar = this.g;
                ejaa i = g.i(eqdvVar, eqgoVar);
                Objects.requireNonNull(a2);
                i.hD(new Runnable() { // from class: bgmd
                    @Override // java.lang.Runnable
                    public final void run() {
                        azuy.this.close();
                    }
                }, eqgoVar);
                eqglVar = i;
            } else {
                bgmoVar.d(false, !fqtb.j());
                eqglVar = eqgf.a;
            }
            dzgp.a("Location report upload", eqglVar);
        }
    }

    public LocationReportUploadIntentOperation(bgdb bgdbVar) {
        this.c = bgdbVar;
        this.j = new HashMap();
        this.d = bgdbVar.v();
        this.k = bgdbVar.n();
        this.h = bgdbVar.Q();
        this.e = bgdbVar.g();
        this.f = bgdbVar.c();
        this.l = bgdbVar.S();
        this.g = bgdbVar.G();
        this.i = bgdbVar.X();
    }
}
