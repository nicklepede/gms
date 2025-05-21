package com.google.android.gms.auth.blockstore.service.cloudsync;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.auth.blockstore.service.cloudsync.CloudSyncBackupTaskService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aacb;
import defpackage.aacc;
import defpackage.aahf;
import defpackage.aakp;
import defpackage.aalu;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.byln;
import defpackage.dxkm;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fkwa;
import defpackage.fnck;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CloudSyncBackupTaskService extends GmsTaskBoundService {
    public static final asot a = aacc.b("CloudSyncBackupTaskService");
    public aacb b;
    private aahf c;

    public static void d(Context context) {
        ((ejhf) ((ejhf) a.h()).ah((char) 810)).x("scheduling a periodic backup task.");
        boolean d = fkwa.d();
        boolean c = fkwa.c();
        UUID randomUUID = UUID.randomUUID();
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_KEY_BACKUP_TRIGGER", 1);
        bundle.putString("CLOUDSYNC_BACKUP_SESSION_ID", randomUUID.toString());
        if (!fnck.d()) {
            bykm bykmVar = new bykm();
            bykmVar.t("CLOUD_BACKUP_PERIODIC");
            bykmVar.w(CloudSyncBackupTaskService.class.getName());
            bykmVar.j(byki.a(fkwa.a.a().b()));
            bykmVar.y(d ? 1 : 0, 1);
            bykmVar.x(c ? 1 : 0, 1);
            bykmVar.u = bundle;
            bykmVar.v(2);
            byjl.a(context).f(bykmVar.b());
            return;
        }
        byko bykoVar = new byko();
        bykoVar.w(CloudSyncBackupTaskService.class.getName());
        bykoVar.t("CLOUD_BACKUP_PERIODIC");
        bykoVar.a = bykv.j;
        bykoVar.l(true);
        bykoVar.u = bundle;
        bykoVar.v(2);
        if (fkwa.d()) {
            bykoVar.k();
        }
        if (fkwa.c()) {
            bykoVar.e();
        }
        byjl.a(context).f(bykoVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 808)).x("triggering a cloud sync back up.");
        if (!fkwa.e()) {
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 809)).x("feature flag disabled, skip syncing.");
            return ensj.i(0);
        }
        Bundle bundle = bylnVar.b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        int i = bundle.getInt("EXTRA_KEY_BACKUP_TRIGGER", 0);
        final int a2 = aalu.a(i) == 0 ? 1 : aalu.a(i);
        final String string = bundle.getString("CLOUDSYNC_BACKUP_SESSION_ID", "");
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.c == null) {
            this.c = aahf.a(getApplicationContext());
        }
        final aahf aahfVar = this.c;
        aakp n = aakp.n();
        final long currentTimeMillis = System.currentTimeMillis();
        dxkm dxkmVar = n.c;
        eiho eihoVar = new eiho() { // from class: aake
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                aana aanaVar = (aana) obj;
                asot asotVar2 = aakp.a;
                fecj fecjVar = (fecj) aanaVar.iB(5, null);
                fecjVar.X(aanaVar);
                aamv aamvVar = aanaVar.j;
                if (aamvVar == null) {
                    aamvVar = aamv.a;
                }
                fecj fecjVar2 = (fecj) aamvVar.iB(5, null);
                fecjVar2.X(aamvVar);
                aamv aamvVar2 = aanaVar.j;
                if (aamvVar2 == null) {
                    aamvVar2 = aamv.a;
                }
                aalv aalvVar = aamvVar2.d;
                if (aalvVar == null) {
                    aalvVar = aalv.a;
                }
                fecj fecjVar3 = (fecj) aalvVar.iB(5, null);
                fecjVar3.X(aalvVar);
                if (!fecjVar3.b.L()) {
                    fecjVar3.U();
                }
                long j = currentTimeMillis;
                fecp fecpVar = fecjVar3.b;
                aalv aalvVar2 = (aalv) fecpVar;
                aalvVar2.b |= 4;
                aalvVar2.e = j;
                if (!fecpVar.L()) {
                    fecjVar3.U();
                }
                int i2 = a2;
                aalv aalvVar3 = (aalv) fecjVar3.b;
                if (i2 == 0) {
                    throw null;
                }
                aalvVar3.f = i2 - 1;
                aalvVar3.b |= 8;
                aalv aalvVar4 = (aalv) fecjVar3.Q();
                if (!fecjVar2.b.L()) {
                    fecjVar2.U();
                }
                aamv aamvVar3 = (aamv) fecjVar2.b;
                aalvVar4.getClass();
                aamvVar3.d = aalvVar4;
                aamvVar3.b |= 2;
                aamv aamvVar4 = (aamv) fecjVar2.Q();
                if (!fecjVar.b.L()) {
                    fecjVar.U();
                }
                aana aanaVar2 = (aana) fecjVar.b;
                aamvVar4.getClass();
                aanaVar2.j = aamvVar4;
                aanaVar2.b |= 32;
                return (aana) fecjVar.Q();
            }
        };
        enre enreVar = enre.a;
        return enps.g(enps.g(ensi.h(dxkmVar.b(eihoVar, enreVar)), new enqc() { // from class: aafx
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                enss f;
                asot asotVar2 = CloudSyncBackupTaskService.a;
                enss[] enssVarArr = new enss[2];
                final aahf aahfVar2 = aahf.this;
                if (!aahfVar2.c()) {
                    ((ejhf) ((ejhf) aahf.d.h()).ah((char) 846)).x("User is not opted into Cloud backup. Should skip cloud sync.");
                    f = ensj.i(false);
                } else if (fkwa.a.a().f()) {
                    ((ejhf) ((ejhf) aahf.d.h()).ah((char) 845)).x("alwaysBackupEmptyData is enabled");
                    f = ensj.i(true);
                } else {
                    f = enps.f(aakp.n().c.a(), new eiho() { // from class: aajw
                        @Override // defpackage.eiho
                        public final Object apply(Object obj2) {
                            aana aanaVar = (aana) obj2;
                            if (aanaVar == null) {
                                ((ejhf) aakp.a.i()).x("No block data on device!");
                                return false;
                            }
                            if (aakp.p(aanaVar)) {
                                ((ejhf) aakp.a.h()).x("The device has none-empty cloud backup, thus forcing a Cloud backup.");
                                return true;
                            }
                            Iterator it = DesugarCollections.unmodifiableMap(aanaVar.g).entrySet().iterator();
                            while (it.hasNext()) {
                                aamp aampVar = ((aamq) ((Map.Entry) it.next()).getValue()).e;
                                if (aampVar == null) {
                                    aampVar = aamp.a;
                                }
                                if (aampVar.c) {
                                    return true;
                                }
                            }
                            Iterator it2 = DesugarCollections.unmodifiableMap(aanaVar.e).values().iterator();
                            while (it2.hasNext()) {
                                Iterator it3 = DesugarCollections.unmodifiableMap(((aamx) it2.next()).c).values().iterator();
                                while (it3.hasNext()) {
                                    aamq aamqVar = ((aams) it3.next()).d;
                                    if (aamqVar == null) {
                                        aamqVar = aamq.a;
                                    }
                                    aamp aampVar2 = aamqVar.e;
                                    if (aampVar2 == null) {
                                        aampVar2 = aamp.a;
                                    }
                                    if (aampVar2.c) {
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                    }, enre.a);
                }
                enssVarArr[0] = f;
                enssVarArr[1] = !fkwa.a.a().j() ? ensj.i(false) : aahfVar2.c() ? ensj.i(false) : enps.f(aakp.n().c.a(), new eiho() { // from class: aakf
                    @Override // defpackage.eiho
                    public final Object apply(Object obj2) {
                        aana aanaVar = (aana) obj2;
                        if (aanaVar != null) {
                            return Boolean.valueOf(aakp.p(aanaVar));
                        }
                        ((ejhf) aakp.a.i()).x("No block data on device!");
                        return false;
                    }
                }, enre.a);
                return enps.g(ensi.h(ensj.f(enssVarArr)), new enqc() { // from class: aagt
                    @Override // defpackage.enqc
                    public final enss a(Object obj2) {
                        List list = (List) obj2;
                        boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
                        boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
                        final aahf aahfVar3 = aahf.this;
                        if (booleanValue) {
                            final aakp n2 = aakp.n();
                            ensi h = ensi.h(ensj.f(n2.h(true), aahfVar3.b()));
                            enqc enqcVar = new enqc() { // from class: aagz
                                @Override // defpackage.enqc
                                public final enss a(Object obj3) {
                                    List list2 = (List) obj3;
                                    aalf aalfVar = (aalf) list2.get(0);
                                    aaky aakyVar = (aaky) list2.get(1);
                                    aafm aafmVar = new aafm();
                                    if (aalfVar != null) {
                                        aafmVar.c = aalfVar;
                                    }
                                    aafmVar.g = aakyVar.b;
                                    boolean z = aakyVar.a;
                                    if (!z && aakyVar.c == 3) {
                                        ((ejhf) ((ejhf) aahf.d.h()).ah((char) 836)).x("Failed to get folsom sync status, skipping backup.");
                                        aafmVar.d = false;
                                        aafmVar.b = aahe.UNABLE_TO_GET_FOLSOM_SYNC_STATUS;
                                        return ensj.i(new aafn(aafmVar));
                                    }
                                    feay feayVar = aalfVar.a;
                                    if (aalfVar.c == 2 && feayVar != null) {
                                        return aahf.this.d(feayVar.M(), z ? aahl.FOLSOM : aahl.NONE, aafmVar);
                                    }
                                    ((ejhf) ((ejhf) aahf.d.j()).ah((char) 835)).x("Failed to read blockstore data while syncing to cloud");
                                    aafmVar.d = false;
                                    aafmVar.b = aahe.UNABLE_TO_READ_FROM_STORAGE;
                                    return ensj.i(new aafn(aafmVar));
                                }
                            };
                            ensv ensvVar = aahfVar3.f;
                            return enps.g(enps.g(h, enqcVar, ensvVar), new enqc() { // from class: aaha
                                @Override // defpackage.enqc
                                public final enss a(Object obj3) {
                                    final aafn aafnVar = (aafn) obj3;
                                    fkwk.c();
                                    if (aafnVar.b != aahe.SUCCESS) {
                                        return ensj.i(aafnVar);
                                    }
                                    aakp aakpVar = n2;
                                    aahf aahfVar4 = aahf.this;
                                    ((ejhf) ((ejhf) aahf.d.h()).ah((char) 837)).x("Uploaded non-empty bytes, updating local records.");
                                    return enps.g(ensi.h(aakpVar.o(System.currentTimeMillis(), aafnVar.c.b == 0)), new enqc() { // from class: aahc
                                        @Override // defpackage.enqc
                                        public final enss a(Object obj4) {
                                            byte[] bArr = aahf.a;
                                            return ensj.i(aafn.this);
                                        }
                                    }, aahfVar4.f);
                                }
                            }, ensvVar);
                        }
                        if (booleanValue2) {
                            final aakp n3 = aakp.n();
                            return enps.g(ensi.h(aahfVar3.d(aahf.a, aahl.NONE, new aafm())), new enqc() { // from class: aahb
                                @Override // defpackage.enqc
                                public final enss a(Object obj3) {
                                    final aafn aafnVar = (aafn) obj3;
                                    return enps.g(aafnVar.b == aahe.SUCCESS ? ensi.h(n3.o(System.currentTimeMillis(), true)) : ensi.h(ensm.a), new enqc() { // from class: aagv
                                        @Override // defpackage.enqc
                                        public final enss a(Object obj4) {
                                            byte[] bArr = aahf.a;
                                            return ensj.i(aafn.this);
                                        }
                                    }, aahf.this.f);
                                }
                            }, aahfVar3.f);
                        }
                        ((ejhf) ((ejhf) aahf.d.h()).ah((char) 833)).x("Should not back up to cloud. Skipping.");
                        aafm aafmVar = new aafm();
                        aafmVar.d = false;
                        aafmVar.b = aahe.SYNC_SKIPPED_NOT_ELIGIBLE;
                        return ensj.i(new aafn(aafmVar));
                    }
                }, aahfVar2.f);
            }
        }, enreVar), new enqc() { // from class: aafy
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:77:0x0260  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x027a  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x0290  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x02a9  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x02bf  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x02d4  */
            @Override // defpackage.enqc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.enss a(java.lang.Object r26) {
                /*
                    Method dump skipped, instructions count: 1022
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aafy.a(java.lang.Object):enss");
            }
        }, enreVar);
    }
}
