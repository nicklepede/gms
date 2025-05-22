package com.google.android.gms.auth.blockstore.service.cloudsync;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.auth.blockstore.service.cloudsync.CloudSyncBackupTaskService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.accb;
import defpackage.accc;
import defpackage.achf;
import defpackage.ackp;
import defpackage.aclu;
import defpackage.ausn;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.cauf;
import defpackage.dzwm;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fnne;
import defpackage.fpuj;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CloudSyncBackupTaskService extends GmsTaskBoundService {
    public static final ausn a = accc.b("CloudSyncBackupTaskService");
    public accb b;
    private achf c;

    public static void d(Context context) {
        ((eluo) ((eluo) a.h()).ai((char) 810)).x("scheduling a periodic backup task.");
        boolean d = fnne.d();
        boolean c = fnne.c();
        UUID randomUUID = UUID.randomUUID();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_KEY_BACKUP_TRIGGER", 1);
        bundle.putString("CLOUDSYNC_BACKUP_SESSION_ID", randomUUID.toString());
        if (!fpuj.d()) {
            cate cateVar = new cate();
            cateVar.t("CLOUD_BACKUP_PERIODIC");
            cateVar.w(CloudSyncBackupTaskService.class.getName());
            cateVar.j(cata.a(fnne.a.lK().b()));
            cateVar.y(d ? 1 : 0, 1);
            cateVar.x(c ? 1 : 0, 1);
            cateVar.u = bundle;
            cateVar.v(2);
            casd.a(context).f(cateVar.b());
            return;
        }
        catg catgVar = new catg();
        catgVar.w(CloudSyncBackupTaskService.class.getName());
        catgVar.t("CLOUD_BACKUP_PERIODIC");
        catgVar.a = catn.j;
        catgVar.l(true);
        catgVar.u = bundle;
        catgVar.v(2);
        if (fnne.d()) {
            catgVar.k();
        }
        if (fnne.c()) {
            catgVar.e();
        }
        casd.a(context).f(catgVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 808)).x("triggering a cloud sync back up.");
        if (!fnne.e()) {
            ((eluo) ((eluo) ausnVar.h()).ai((char) 809)).x("feature flag disabled, skip syncing.");
            return eqgc.i(0);
        }
        Bundle bundle = caufVar.b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        int i = bundle.getInt("EXTRA_KEY_BACKUP_TRIGGER", 0);
        final int a2 = aclu.a(i) == 0 ? 1 : aclu.a(i);
        final String string = bundle.getString("CLOUDSYNC_BACKUP_SESSION_ID", "");
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.c == null) {
            this.c = achf.a(getApplicationContext());
        }
        final achf achfVar = this.c;
        ackp n = ackp.n();
        final long currentTimeMillis = System.currentTimeMillis();
        dzwm dzwmVar = n.c;
        ekut ekutVar = new ekut() { // from class: acke
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                acna acnaVar = (acna) obj;
                ausn ausnVar2 = ackp.a;
                fgrc fgrcVar = (fgrc) acnaVar.iQ(5, null);
                fgrcVar.X(acnaVar);
                acmv acmvVar = acnaVar.j;
                if (acmvVar == null) {
                    acmvVar = acmv.a;
                }
                fgrc fgrcVar2 = (fgrc) acmvVar.iQ(5, null);
                fgrcVar2.X(acmvVar);
                acmv acmvVar2 = acnaVar.j;
                if (acmvVar2 == null) {
                    acmvVar2 = acmv.a;
                }
                aclv aclvVar = acmvVar2.d;
                if (aclvVar == null) {
                    aclvVar = aclv.a;
                }
                fgrc fgrcVar3 = (fgrc) aclvVar.iQ(5, null);
                fgrcVar3.X(aclvVar);
                if (!fgrcVar3.b.L()) {
                    fgrcVar3.U();
                }
                long j = currentTimeMillis;
                fgri fgriVar = fgrcVar3.b;
                aclv aclvVar2 = (aclv) fgriVar;
                aclvVar2.b |= 4;
                aclvVar2.e = j;
                if (!fgriVar.L()) {
                    fgrcVar3.U();
                }
                int i2 = a2;
                aclv aclvVar3 = (aclv) fgrcVar3.b;
                if (i2 == 0) {
                    throw null;
                }
                aclvVar3.f = i2 - 1;
                aclvVar3.b |= 8;
                aclv aclvVar4 = (aclv) fgrcVar3.Q();
                if (!fgrcVar2.b.L()) {
                    fgrcVar2.U();
                }
                acmv acmvVar3 = (acmv) fgrcVar2.b;
                aclvVar4.getClass();
                acmvVar3.d = aclvVar4;
                acmvVar3.b |= 2;
                acmv acmvVar4 = (acmv) fgrcVar2.Q();
                if (!fgrcVar.b.L()) {
                    fgrcVar.U();
                }
                acna acnaVar2 = (acna) fgrcVar.b;
                acmvVar4.getClass();
                acnaVar2.j = acmvVar4;
                acnaVar2.b |= 32;
                return (acna) fgrcVar.Q();
            }
        };
        eqex eqexVar = eqex.a;
        return eqdl.g(eqdl.g(eqgb.h(dzwmVar.b(ekutVar, eqexVar)), new eqdv() { // from class: acfx
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                eqgl f;
                ausn ausnVar2 = CloudSyncBackupTaskService.a;
                eqgl[] eqglVarArr = new eqgl[2];
                final achf achfVar2 = achf.this;
                if (!achfVar2.c()) {
                    ((eluo) ((eluo) achf.d.h()).ai((char) 845)).x("User is not opted into Cloud backup. Should skip cloud sync.");
                    f = eqgc.i(false);
                } else if (fnne.a.lK().f()) {
                    ((eluo) ((eluo) achf.d.h()).ai((char) 844)).x("alwaysBackupEmptyData is enabled");
                    f = eqgc.i(true);
                } else {
                    f = eqdl.f(ackp.n().c.a(), new ekut() { // from class: acjw
                        @Override // defpackage.ekut
                        public final Object apply(Object obj2) {
                            acna acnaVar = (acna) obj2;
                            if (acnaVar == null) {
                                ((eluo) ackp.a.i()).x("No block data on device!");
                                return false;
                            }
                            if (ackp.p(acnaVar)) {
                                ((eluo) ackp.a.h()).x("The device has none-empty cloud backup, thus forcing a Cloud backup.");
                                return true;
                            }
                            Iterator it = DesugarCollections.unmodifiableMap(acnaVar.g).entrySet().iterator();
                            while (it.hasNext()) {
                                acmp acmpVar = ((acmq) ((Map.Entry) it.next()).getValue()).e;
                                if (acmpVar == null) {
                                    acmpVar = acmp.a;
                                }
                                if (acmpVar.c) {
                                    return true;
                                }
                            }
                            Iterator it2 = DesugarCollections.unmodifiableMap(acnaVar.e).values().iterator();
                            while (it2.hasNext()) {
                                Iterator it3 = DesugarCollections.unmodifiableMap(((acmx) it2.next()).c).values().iterator();
                                while (it3.hasNext()) {
                                    acmq acmqVar = ((acms) it3.next()).d;
                                    if (acmqVar == null) {
                                        acmqVar = acmq.a;
                                    }
                                    acmp acmpVar2 = acmqVar.e;
                                    if (acmpVar2 == null) {
                                        acmpVar2 = acmp.a;
                                    }
                                    if (acmpVar2.c) {
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                    }, eqex.a);
                }
                eqglVarArr[0] = f;
                eqglVarArr[1] = !fnne.a.lK().j() ? eqgc.i(false) : achfVar2.c() ? eqgc.i(false) : eqdl.f(ackp.n().c.a(), new ekut() { // from class: ackf
                    @Override // defpackage.ekut
                    public final Object apply(Object obj2) {
                        acna acnaVar = (acna) obj2;
                        if (acnaVar != null) {
                            return Boolean.valueOf(ackp.p(acnaVar));
                        }
                        ((eluo) ackp.a.i()).x("No block data on device!");
                        return false;
                    }
                }, eqex.a);
                return eqdl.g(eqgb.h(eqgc.f(eqglVarArr)), new eqdv() { // from class: acgt
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj2) {
                        List list = (List) obj2;
                        boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
                        boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
                        final achf achfVar3 = achf.this;
                        if (booleanValue) {
                            final ackp n2 = ackp.n();
                            eqgb h = eqgb.h(eqgc.f(n2.h(true), achfVar3.b()));
                            eqdv eqdvVar = new eqdv() { // from class: acgz
                                @Override // defpackage.eqdv
                                public final eqgl a(Object obj3) {
                                    List list2 = (List) obj3;
                                    aclf aclfVar = (aclf) list2.get(0);
                                    acky ackyVar = (acky) list2.get(1);
                                    acfm acfmVar = new acfm();
                                    if (aclfVar != null) {
                                        acfmVar.c = aclfVar;
                                    }
                                    acfmVar.g = ackyVar.b;
                                    boolean z = ackyVar.a;
                                    if (!z && ackyVar.c == 3) {
                                        ((eluo) ((eluo) achf.d.h()).ai((char) 836)).x("Failed to get folsom sync status, skipping backup.");
                                        acfmVar.d = false;
                                        acfmVar.b = ache.UNABLE_TO_GET_FOLSOM_SYNC_STATUS;
                                        return eqgc.i(new acfn(acfmVar));
                                    }
                                    fgpr fgprVar = aclfVar.a;
                                    if (aclfVar.c == 2 && fgprVar != null) {
                                        return achf.this.d(fgprVar.M(), z ? achl.FOLSOM : achl.NONE, acfmVar);
                                    }
                                    ((eluo) ((eluo) achf.d.j()).ai((char) 835)).x("Failed to read blockstore data while syncing to cloud");
                                    acfmVar.d = false;
                                    acfmVar.b = ache.UNABLE_TO_READ_FROM_STORAGE;
                                    return eqgc.i(new acfn(acfmVar));
                                }
                            };
                            eqgo eqgoVar = achfVar3.f;
                            return eqdl.g(eqdl.g(h, eqdvVar, eqgoVar), new eqdv() { // from class: acha
                                @Override // defpackage.eqdv
                                public final eqgl a(Object obj3) {
                                    final acfn acfnVar = (acfn) obj3;
                                    fnno.c();
                                    if (acfnVar.b != ache.SUCCESS) {
                                        return eqgc.i(acfnVar);
                                    }
                                    ackp ackpVar = n2;
                                    achf achfVar4 = achf.this;
                                    ((eluo) ((eluo) achf.d.h()).ai((char) 837)).x("Uploaded non-empty bytes, updating local records.");
                                    return eqdl.g(eqgb.h(ackpVar.o(System.currentTimeMillis(), acfnVar.c.b == 0)), new eqdv() { // from class: achc
                                        @Override // defpackage.eqdv
                                        public final eqgl a(Object obj4) {
                                            byte[] bArr = achf.a;
                                            return eqgc.i(acfn.this);
                                        }
                                    }, achfVar4.f);
                                }
                            }, eqgoVar);
                        }
                        if (booleanValue2) {
                            final ackp n3 = ackp.n();
                            return eqdl.g(eqgb.h(achfVar3.d(achf.a, achl.NONE, new acfm())), new eqdv() { // from class: achb
                                @Override // defpackage.eqdv
                                public final eqgl a(Object obj3) {
                                    final acfn acfnVar = (acfn) obj3;
                                    return eqdl.g(acfnVar.b == ache.SUCCESS ? eqgb.h(n3.o(System.currentTimeMillis(), true)) : eqgb.h(eqgf.a), new eqdv() { // from class: acgv
                                        @Override // defpackage.eqdv
                                        public final eqgl a(Object obj4) {
                                            byte[] bArr = achf.a;
                                            return eqgc.i(acfn.this);
                                        }
                                    }, achf.this.f);
                                }
                            }, achfVar3.f);
                        }
                        ((eluo) ((eluo) achf.d.h()).ai((char) 833)).x("Should not back up to cloud. Skipping.");
                        acfm acfmVar = new acfm();
                        acfmVar.d = false;
                        acfmVar.b = ache.SYNC_SKIPPED_NOT_ELIGIBLE;
                        return eqgc.i(new acfn(acfmVar));
                    }
                }, achfVar2.f);
            }
        }, eqexVar), new eqdv() { // from class: acfy
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:77:0x0260  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x027a  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0290  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x02a9  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x02bf  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x02d4  */
            @Override // defpackage.eqdv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.eqgl a(java.lang.Object r26) {
                /*
                    Method dump skipped, instructions count: 1022
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.acfy.a(java.lang.Object):eqgl");
            }
        }, eqexVar);
    }
}
