package com.google.android.gms.findmydevice.spot.locationreporting;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import com.google.android.gms.findmydevice.spot.locationreporting.LocationReportUploadIntentOperation;
import defpackage.aptt;
import defpackage.asej;
import defpackage.asot;
import defpackage.axqv;
import defpackage.axqy;
import defpackage.axre;
import defpackage.bcyq;
import defpackage.bcyr;
import defpackage.bdak;
import defpackage.bdap;
import defpackage.bebc;
import defpackage.bebo;
import defpackage.bebp;
import defpackage.bebs;
import defpackage.belc;
import defpackage.beup;
import defpackage.bfdp;
import defpackage.bqqa;
import defpackage.bvxr;
import defpackage.dwep;
import defpackage.dwer;
import defpackage.dwup;
import defpackage.egmx;
import defpackage.eiho;
import defpackage.eiig;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensm;
import defpackage.enss;
import defpackage.ensv;
import defpackage.euiq;
import defpackage.ezcr;
import defpackage.ezcu;
import defpackage.ezcw;
import defpackage.feay;
import defpackage.fobh;
import defpackage.ftya;
import defpackage.unx;
import j$.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class LocationReportUploadIntentOperation extends IntentOperation {
    public static final asot a = asot.b("LocationReportUplIntOp", asej.FIND_MY_DEVICE_SPOT);
    public static final aptt b = new aptt(5);
    public final bebp c;
    public final beup d;
    public final bdak e;
    public final Context f;
    public final ensv g;
    public final bcyq h;
    public final bqqa i;
    private final Map j;
    private final belc k;
    private final bebs l;

    public LocationReportUploadIntentOperation() {
        this(bebo.a());
    }

    public static ezcu b(Throwable th) {
        if (th instanceof bcyr) {
            bcyr bcyrVar = (bcyr) th;
            if ((bcyrVar.getCause() instanceof unx) || bcyrVar.c(ftya.UNAUTHENTICATED)) {
                return ezcu.FAILED_UNAUTHENTICATED;
            }
            if (bcyrVar.b()) {
                return ezcu.FAILED_NO_NETWORK;
            }
        }
        return ezcu.FAILED_UNEXPECTED_ERROR;
    }

    public static final void d(final ezcw ezcwVar, final String str, final ezcu ezcuVar, final int i) {
        bvxr.v().f(bdap.a(ezcr.SIGHTING_BATCH_UPLOAD, new eiho() { // from class: bekp
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                fecj fecjVar = (fecj) obj;
                asot asotVar = LocationReportUploadIntentOperation.a;
                fecj v = ezcv.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                String str2 = str;
                ezcu ezcuVar2 = ezcu.this;
                ezcv ezcvVar = (ezcv) v.b;
                ezcvVar.e = ezcuVar2.a();
                ezcvVar.b |= 4;
                ezct ezctVar = str2 == null ? ezct.UNNOWN_SCHEDULING_MECHANISM : str2.equals("BATCH_UPLOAD_TRIGGERED_BY_GMS_TASK") ? ezct.GMS_TASK : str2.equals("BATCH_UPLOAD_TRIGGERED_BY_FAST_EXECUTOR_SERVICE") ? ezct.FAST_EXECUTOR : str2.equals("BATCH_UPLOAD_TRIGGERED_BY_FAST_EXECUTOR_SERVICE_ACTIVE_NETWORK") ? ezct.FAST_EXECUTOR_ACTIVE_NETWORK : ezct.UNNOWN_SCHEDULING_MECHANISM;
                if (!v.b.L()) {
                    v.U();
                }
                ezcv ezcvVar2 = (ezcv) v.b;
                ezcvVar2.c = ezctVar.a();
                ezcvVar2.b |= 1;
                if (!v.b.L()) {
                    v.U();
                }
                ezcw ezcwVar2 = ezcwVar;
                ezcv ezcvVar3 = (ezcv) v.b;
                ezcvVar3.d = ezcwVar2.a();
                ezcvVar3.b |= 2;
                if (!v.b.L()) {
                    v.U();
                }
                int i2 = i;
                ezcv ezcvVar4 = (ezcv) v.b;
                ezcvVar4.b |= 8;
                ezcvVar4.f = i2;
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                ezcq ezcqVar = (ezcq) fecjVar.b;
                ezcv ezcvVar5 = (ezcv) v.Q();
                ezcq ezcqVar2 = ezcq.a;
                ezcvVar5.getClass();
                ezcqVar.f = ezcvVar5;
                ezcqVar.b |= 8;
                return fecjVar;
            }
        }));
    }

    public final enss a(final euiq euiqVar, final Queue queue) {
        Account account = (Account) queue.poll();
        eiig.x(account);
        bebc c = c(account);
        dwer dwerVar = new dwer(c.s(), (Executor) c.P.b.a());
        dwep dwepVar = dwerVar.b;
        final feay ng = euiqVar.ng();
        return egmx.f(egmx.f(egmx.f(dwepVar.a(false)).h(new eiho() { // from class: dwej
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                dwzb dwzbVar = ((dwzc) obj).c;
                if (dwzbVar == null) {
                    dwzbVar = dwzb.a;
                }
                return dwzbVar.c;
            }
        }, enre.a)).i(new enqc() { // from class: dweq
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                int i = dwer.c;
                return ensj.i(feay.w(((eoca) eocl.j(((feay) obj).M()).l(eoqk.a, eoca.class)).a(feay.this.M(), null)));
            }
        }, dwerVar.a)).e(Throwable.class, new enqc() { // from class: bekl
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                Throwable th = (Throwable) obj;
                ((ejhf) ((ejhf) ((ejhf) LocationReportUploadIntentOperation.a.i()).s(th)).ah((char) 4247)).x("Failed encrypting sightings batch.");
                Queue queue2 = queue;
                if (queue2.isEmpty()) {
                    return ensj.h(th);
                }
                return LocationReportUploadIntentOperation.this.a(euiqVar, queue2);
            }
        }, this.g);
    }

    public final bebc c(Account account) {
        bebc bebcVar;
        Map map = this.j;
        synchronized (map) {
            bebcVar = (bebc) map.get(account);
            if (bebcVar == null) {
                bebcVar = this.c.i().b(account);
                map.put(account, bebcVar);
            }
        }
        return bebcVar;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        enss enssVar;
        if (bfdp.b(intent, "com.google.android.gms.findmydevice.spot.locationreporting.UPLOAD_SIGHTINGS")) {
            final String stringExtra = intent.getStringExtra("scheduled_by");
            belc belcVar = this.k;
            if (belcVar.e(stringExtra)) {
                final axqy a2 = axqv.a("finder_crowdsourcedReport", new axre(this.l.a), new DroidGuardResultsRequest(), axqy.a, axqy.b);
                egmx f = egmx.f(this.d.b());
                enqc enqcVar = new enqc() { // from class: bekq
                    @Override // defpackage.enqc
                    public final enss a(Object obj) {
                        final beun beunVar = (beun) obj;
                        eits eitsVar = beunVar.a;
                        if (eitsVar.isEmpty()) {
                            ((ejhf) ((ejhf) LocationReportUploadIntentOperation.a.j()).ah((char) 4255)).x("No sightings to upload.");
                            return ensm.a;
                        }
                        ejfg listIterator = eitsVar.values().listIterator();
                        final int i = 0;
                        while (listIterator.hasNext()) {
                            i += ((euiq) listIterator.next()).c.size();
                        }
                        final String str = stringExtra;
                        final LocationReportUploadIntentOperation locationReportUploadIntentOperation = LocationReportUploadIntentOperation.this;
                        if (!fobk.e()) {
                            locationReportUploadIntentOperation.e.a(new iru() { // from class: bekk
                                @Override // defpackage.iru
                                public final void a(Object obj2) {
                                    apud apudVar = (apud) obj2;
                                    aptz m = apudVar.m("SIGHTINGS_PER_BATCH", LocationReportUploadIntentOperation.b);
                                    aptt apttVar = m.g;
                                    long j = i;
                                    aptw aptwVar = apud.b;
                                    m.a(apttVar.a(j), 1L, aptwVar);
                                    apudVar.d("COLLECTED_BATCHES").a(0L, 1L, aptwVar);
                                    String str2 = str;
                                    if (str2 != null) {
                                        apudVar.d(str2).a(0L, 1L, aptwVar);
                                    }
                                }
                            });
                        }
                        Context context = locationReportUploadIntentOperation.f;
                        final List h = asnd.h(context, context.getPackageName());
                        if (h.isEmpty()) {
                            ((ejhf) ((ejhf) LocationReportUploadIntentOperation.a.j()).ah((char) 4254)).x("No Google accounts available to upload sightings.");
                            return ensm.a;
                        }
                        final axqy axqyVar = a2;
                        return egmx.f(locationReportUploadIntentOperation.c.F().f()).i(new enqc() { // from class: beks
                            /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
                            
                                if (defpackage.bego.c(r4) != false) goto L17;
                             */
                            @Override // defpackage.enqc
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final defpackage.enss a(java.lang.Object r19) {
                                /*
                                    Method dump skipped, instructions count: 268
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.beks.a(java.lang.Object):enss");
                            }
                        }, locationReportUploadIntentOperation.g);
                    }
                };
                ensv ensvVar = this.g;
                egmx i = f.i(enqcVar, ensvVar);
                Objects.requireNonNull(a2);
                i.hn(new Runnable() { // from class: bekr
                    @Override // java.lang.Runnable
                    public final void run() {
                        axqy.this.close();
                    }
                }, ensvVar);
                enssVar = i;
            } else {
                belcVar.d(false, !fobh.j());
                enssVar = ensm.a;
            }
            dwup.a("Location report upload", enssVar);
        }
    }

    public LocationReportUploadIntentOperation(bebp bebpVar) {
        this.c = bebpVar;
        this.j = new HashMap();
        this.d = bebpVar.v();
        this.k = bebpVar.n();
        this.h = bebpVar.Q();
        this.e = bebpVar.g();
        this.f = bebpVar.c();
        this.l = bebpVar.S();
        this.g = bebpVar.G();
        this.i = bebpVar.X();
    }
}
