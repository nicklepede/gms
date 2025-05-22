package com.google.android.gms.wearable.backup.wear;

import com.google.android.gms.wearable.backup.wear.BackupSettingsListenerChimeraService;
import defpackage.ajql;
import defpackage.akgc;
import defpackage.auad;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.dlxc;
import defpackage.dmcv;
import defpackage.dmdv;
import defpackage.dmgl;
import defpackage.dmmv;
import defpackage.dofv;
import defpackage.doge;
import defpackage.dohj;
import defpackage.dohk;
import defpackage.dohn;
import defpackage.doho;
import defpackage.dohq;
import defpackage.doht;
import defpackage.dohv;
import defpackage.dohw;
import defpackage.dojw;
import defpackage.dqml;
import defpackage.ekut;
import defpackage.emyt;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.eqgo;
import defpackage.euyj;
import defpackage.evmj;
import defpackage.evmk;
import defpackage.evoj;
import defpackage.evok;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import j$.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BackupSettingsListenerChimeraService extends dmmv {
    public static final auad a = new dlxc("BackupSettingsWLS");
    private dmcv b;
    private dmgl c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dmmv, defpackage.dlwc
    public final dhlw k(String str, String str2, byte[] bArr) {
        char c;
        int length;
        int length2;
        int length3;
        auad auadVar = a;
        final boolean z = false;
        auadVar.j("onRequest: nodeId=%s path=%s request=%s", str, str2, bArr);
        if (this.b == null) {
            this.b = dmdv.f(this);
        }
        switch (str2.hashCode()) {
            case -958277363:
                if (str2.equals("/backup_settings/refresh_backup_status")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -845419055:
                if (str2.equals("/backup_settings/fetch_storage_quota")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -314016672:
                if (str2.equals("/backup_settings/enable_backup")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -281347678:
                if (str2.equals("/backup_settings/backup_enabled")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -247125423:
                if (str2.equals("/backup_settings/enable_backup_skipped")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 819670735:
                if (str2.equals("/backup_settings/backup_supported")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 859409177:
                if (str2.equals("/backup_settings/fetch_backup_size_and_time_stats")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 2082270935:
                if (str2.equals("/backup_settings/disable_backup")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                akgc.a();
                auadVar.j("backup_supported response: %b", false);
                fgrc v = doge.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                doge dogeVar = (doge) v.b;
                dogeVar.b |= 1;
                dogeVar.c = false;
                return dhmr.d(((doge) v.Q()).r());
            case 1:
                if (bArr != null && (length = bArr.length) != 0) {
                    try {
                        fgri y = fgri.y(dofv.a, bArr, 0, length, fgqp.a());
                        fgri.M(y);
                        z = ((dofv) y).c;
                    } catch (fgsd unused) {
                    }
                }
                dmdv dmdvVar = (dmdv) this.b;
                eqgo eqgoVar = dmdvVar.c;
                final ajql ajqlVar = dmdvVar.d;
                Objects.requireNonNull(ajqlVar);
                eqgb h = eqgb.h(eqgoVar.submit(new Callable() { // from class: dmdl
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(ajql.this.j());
                    }
                }));
                ekut ekutVar = new ekut() { // from class: dmeb
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        BackupSettingsListenerChimeraService.a.h("isBackupEnabled successfully completed", new Object[0]);
                        fgrc v2 = dofw.a.v();
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        dofw dofwVar = (dofw) v2.b;
                        dofwVar.b |= 1;
                        dofwVar.c = booleanValue;
                        return ((dofw) v2.Q()).r();
                    }
                };
                eqex eqexVar = eqex.a;
                return dqml.a(eqcq.g(eqdl.f(h, ekutVar, eqexVar), Throwable.class, new eqdv() { // from class: dmec
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj) {
                        Throwable th = (Throwable) obj;
                        BackupSettingsListenerChimeraService.a.n("Failed to complete task: isBackupEnabled", th, new Object[0]);
                        if (!z) {
                            return eqgc.h(th);
                        }
                        fgrc v2 = dofw.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        dofw dofwVar = (dofw) v2.b;
                        dofwVar.d = 1;
                        dofwVar.b |= 2;
                        return eqgc.i(((dofw) v2.Q()).r());
                    }
                }, eqexVar));
            case 2:
                try {
                    fgri y2 = fgri.y(doho.a, bArr, 0, bArr.length, fgqp.a());
                    fgri.M(y2);
                    final doho dohoVar = (doho) y2;
                    dohn dohnVar = dohoVar.d;
                    if (dohnVar == null) {
                        dohnVar = dohn.a;
                    }
                    dmcv dmcvVar = this.b;
                    String str3 = dohoVar.c;
                    boolean z2 = dohoVar.e;
                    euyj euyjVar = z2 ? euyj.ani : euyj.ang;
                    fgrc v2 = evoj.a.v();
                    evmk evmkVar = evmk.a;
                    evmj evmjVar = (evmj) evmkVar.v();
                    evmjVar.a(dohnVar.c);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    evoj evojVar = (evoj) v2.b;
                    evmk evmkVar2 = (evmk) evmjVar.Q();
                    evmkVar2.getClass();
                    evojVar.c = evmkVar2;
                    evojVar.b |= 1;
                    evmj evmjVar2 = (evmj) evmkVar.v();
                    evmjVar2.a(dohnVar.d);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    evoj evojVar2 = (evoj) v2.b;
                    evmk evmkVar3 = (evmk) evmjVar2.Q();
                    evmkVar3.getClass();
                    evojVar2.d = evmkVar3;
                    evojVar2.b |= 2;
                    evmj evmjVar3 = (evmj) evmkVar.v();
                    evmjVar3.a(dohnVar.e);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    evoj evojVar3 = (evoj) v2.b;
                    evmk evmkVar4 = (evmk) evmjVar3.Q();
                    evmkVar4.getClass();
                    evojVar3.e = evmkVar4;
                    evojVar3.b |= 4;
                    evmj evmjVar4 = (evmj) evmkVar.v();
                    evmjVar4.a(dohnVar.f);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    evoj evojVar4 = (evoj) v2.b;
                    evmk evmkVar5 = (evmk) evmjVar4.Q();
                    evmkVar5.getClass();
                    evojVar4.f = evmkVar5;
                    evojVar4.b |= 8;
                    evmj evmjVar5 = (evmj) evmkVar.v();
                    evmjVar5.a(dohnVar.g);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    evoj evojVar5 = (evoj) v2.b;
                    evmk evmkVar6 = (evmk) evmjVar5.Q();
                    evmkVar6.getClass();
                    evojVar5.g = evmkVar6;
                    evojVar5.b |= 16;
                    eqgb h2 = eqgb.h(dmcvVar.b(str3, z2, euyjVar, (evoj) v2.Q(), Integer.valueOf(dohnVar.b)));
                    ekut ekutVar2 = new ekut() { // from class: dmdx
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            BackupSettingsListenerChimeraService.a.h("enableBackup successfully completed", new Object[0]);
                            return dohp.a.r();
                        }
                    };
                    eqex eqexVar2 = eqex.a;
                    return dqml.a(eqcq.g(eqdl.f(h2, ekutVar2, eqexVar2), Throwable.class, new eqdv() { // from class: dmea
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj) {
                            Throwable th = (Throwable) obj;
                            BackupSettingsListenerChimeraService.a.n("Failed to complete task: enableBackup", th, new Object[0]);
                            if (!doho.this.f) {
                                return eqgc.h(th);
                            }
                            fgrc v3 = dohp.a.v();
                            if (!v3.b.L()) {
                                v3.U();
                            }
                            dohp dohpVar = (dohp) v3.b;
                            dohpVar.c = 1;
                            dohpVar.b = 1 | dohpVar.b;
                            return eqgc.i(((dohp) v3.Q()).r());
                        }
                    }, eqexVar2));
                } catch (fgsd e) {
                    a.n("Malformed EnableBackupRequest protocol buffer", e, new Object[0]);
                    return null;
                }
            case 3:
                try {
                    fgri y3 = fgri.y(dohk.a, bArr, 0, bArr.length, fgqp.a());
                    fgri.M(y3);
                    final dohk dohkVar = (dohk) y3;
                    dohj dohjVar = dohkVar.c;
                    if (dohjVar == null) {
                        dohjVar = dohj.a;
                    }
                    fgrc v3 = evok.a.v();
                    evmk evmkVar7 = evmk.a;
                    evmj evmjVar6 = (evmj) evmkVar7.v();
                    evmjVar6.a(dohjVar.d);
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    evok evokVar = (evok) v3.b;
                    evmk evmkVar8 = (evmk) evmjVar6.Q();
                    evmkVar8.getClass();
                    evokVar.c = evmkVar8;
                    evokVar.b |= 1;
                    evmj evmjVar7 = (evmj) evmkVar7.v();
                    evmjVar7.a(dohjVar.e);
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    evok evokVar2 = (evok) v3.b;
                    evmk evmkVar9 = (evmk) evmjVar7.Q();
                    evmkVar9.getClass();
                    evokVar2.d = evmkVar9;
                    evokVar2.b |= 2;
                    evmj evmjVar8 = (evmj) evmkVar7.v();
                    evmjVar8.a(dohjVar.f);
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    evok evokVar3 = (evok) v3.b;
                    evmk evmkVar10 = (evmk) evmjVar8.Q();
                    evmkVar10.getClass();
                    evokVar3.e = evmkVar10;
                    evokVar3.b |= 4;
                    evmj evmjVar9 = (evmj) evmkVar7.v();
                    evmjVar9.a(dohjVar.g);
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    evok evokVar4 = (evok) v3.b;
                    evmk evmkVar11 = (evmk) evmjVar9.Q();
                    evmkVar11.getClass();
                    evokVar4.f = evmkVar11;
                    evokVar4.b |= 8;
                    evmj evmjVar10 = (evmj) evmkVar7.v();
                    evmjVar10.a(dohjVar.h);
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    evok evokVar5 = (evok) v3.b;
                    evmk evmkVar12 = (evmk) evmjVar10.Q();
                    evmkVar12.getClass();
                    evokVar5.g = evmkVar12;
                    evokVar5.b |= 16;
                    eqgb h3 = eqgb.h(this.b.a(euyj.anh, (evok) v3.Q(), Integer.valueOf(dohjVar.c)));
                    ekut ekutVar3 = new ekut() { // from class: dmed
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            BackupSettingsListenerChimeraService.a.h("disableBackup successfully completed", new Object[0]);
                            return dohl.a.r();
                        }
                    };
                    eqex eqexVar3 = eqex.a;
                    return dqml.a(eqcq.g(eqdl.f(h3, ekutVar3, eqexVar3), Throwable.class, new eqdv() { // from class: dmee
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj) {
                            Throwable th = (Throwable) obj;
                            BackupSettingsListenerChimeraService.a.n("Failed to complete task: disableBackup", th, new Object[0]);
                            if (!dohk.this.d) {
                                return eqgc.h(th);
                            }
                            fgrc v4 = dohl.a.v();
                            if (!v4.b.L()) {
                                v4.U();
                            }
                            dohl dohlVar = (dohl) v4.b;
                            dohlVar.c = 1;
                            dohlVar.b = 1 | dohlVar.b;
                            return eqgc.i(((dohl) v4.Q()).r());
                        }
                    }, eqexVar3));
                } catch (fgsd e2) {
                    a.n("Malformed DisableBackupRequest protocol buffer", e2, new Object[0]);
                    return null;
                }
            case 4:
                if (bArr != null && (length2 = bArr.length) != 0) {
                    try {
                        fgri y4 = fgri.y(dojw.a, bArr, 0, length2, fgqp.a());
                        fgri.M(y4);
                        z = ((dojw) y4).c;
                    } catch (fgsd unused2) {
                    }
                }
                eqgb h4 = eqgb.h(this.b.e());
                ekut ekutVar4 = new ekut() { // from class: dmdy
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        dogc dogcVar = (dogc) obj;
                        BackupSettingsListenerChimeraService.a.h("refreshBackupStatus successfully completed", new Object[0]);
                        fgrc v4 = dojx.a.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        dojx dojxVar = (dojx) v4.b;
                        dogcVar.getClass();
                        dojxVar.c = dogcVar;
                        dojxVar.b |= 1;
                        return ((dojx) v4.Q()).r();
                    }
                };
                eqex eqexVar4 = eqex.a;
                return dqml.a(eqcq.g(eqdl.f(h4, ekutVar4, eqexVar4), Throwable.class, new eqdv() { // from class: dmdz
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj) {
                        Throwable th = (Throwable) obj;
                        BackupSettingsListenerChimeraService.a.n("Failed to complete task: refreshBackupStatus", th, new Object[0]);
                        if (!z) {
                            return eqgc.h(th);
                        }
                        fgrc v4 = dojx.a.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        dojx dojxVar = (dojx) v4.b;
                        dojxVar.d = 1;
                        dojxVar.b |= 2;
                        return eqgc.i(((dojx) v4.Q()).r());
                    }
                }, eqexVar4));
            case 5:
                try {
                    fgri y5 = fgri.y(dohv.a, bArr, 0, bArr.length, fgqp.a());
                    fgri.M(y5);
                    final dohv dohvVar = (dohv) y5;
                    eqgb h5 = eqgb.h(this.b.d(dohvVar.c));
                    ekut ekutVar5 = new ekut() { // from class: dmef
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            dogd dogdVar = (dogd) obj;
                            BackupSettingsListenerChimeraService.a.h("fetchBackupStorageQuota successfully completed", new Object[0]);
                            fgrc v4 = dohw.a.v();
                            if (!v4.b.L()) {
                                v4.U();
                            }
                            dohw dohwVar = (dohw) v4.b;
                            dogdVar.getClass();
                            dohwVar.c = dogdVar;
                            dohwVar.b |= 1;
                            return ((dohw) v4.Q()).r();
                        }
                    };
                    eqex eqexVar5 = eqex.a;
                    return dqml.a(eqcq.g(eqdl.f(h5, ekutVar5, eqexVar5), Throwable.class, new eqdv() { // from class: dmeg
                        @Override // defpackage.eqdv
                        public final eqgl a(Object obj) {
                            Throwable th = (Throwable) obj;
                            BackupSettingsListenerChimeraService.a.n("Failed to complete task: fetchBackupStorageQuota", th, new Object[0]);
                            if (!dohv.this.d) {
                                return eqgc.h(th);
                            }
                            fgrc v4 = dohw.a.v();
                            if (!v4.b.L()) {
                                v4.U();
                            }
                            dohw dohwVar = (dohw) v4.b;
                            dohwVar.d = 1;
                            dohwVar.b |= 2;
                            return eqgc.i(((dohw) v4.Q()).r());
                        }
                    }, eqexVar5));
                } catch (fgsd e3) {
                    a.n("Malformed FetchStorageQuotaRequest protocol buffer", e3, new Object[0]);
                    return null;
                }
            case 6:
                if (bArr != null && (length3 = bArr.length) != 0) {
                    try {
                        fgri y6 = fgri.y(doht.a, bArr, 0, length3, fgqp.a());
                        fgri.M(y6);
                        z = ((doht) y6).c;
                    } catch (fgsd unused3) {
                    }
                }
                eqgb h6 = eqgb.h(this.b.c());
                ekut ekutVar6 = new ekut() { // from class: dmeh
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        dofz dofzVar = (dofz) obj;
                        BackupSettingsListenerChimeraService.a.h("fetchBackupStats successfully completed", new Object[0]);
                        fgrc v4 = dohu.a.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        dohu dohuVar = (dohu) v4.b;
                        dofzVar.getClass();
                        dohuVar.c = dofzVar;
                        dohuVar.b |= 1;
                        return ((dohu) v4.Q()).r();
                    }
                };
                eqex eqexVar6 = eqex.a;
                return dqml.a(eqcq.g(eqdl.f(h6, ekutVar6, eqexVar6), Throwable.class, new eqdv() { // from class: dmei
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj) {
                        Throwable th = (Throwable) obj;
                        BackupSettingsListenerChimeraService.a.n("Failed to complete task: fetchBackupStats", th, new Object[0]);
                        if (!z) {
                            return eqgc.h(th);
                        }
                        fgrc v4 = dohu.a.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        dohu dohuVar = (dohu) v4.b;
                        dohuVar.d = 1;
                        dohuVar.b |= 2;
                        return eqgc.i(((dohu) v4.Q()).r());
                    }
                }, eqexVar6));
            case 7:
                if (this.c == null) {
                    this.c = new dmgl();
                }
                try {
                    fgri y7 = fgri.y(dohq.a, bArr, 0, bArr.length, fgqp.a());
                    fgri.M(y7);
                    emyt b = emyt.b(((dohq) y7).c);
                    if (b == null) {
                        b = emyt.UNKNOWN_FRAGMENT_TYPE;
                    }
                    this.c.a(3, b);
                    return dhmr.d(dohw.a.r());
                } catch (fgsd e4) {
                    a.n("Malformed EnableBackupSkippedRequest protocol buffer", e4, new Object[0]);
                    return null;
                }
            default:
                auadVar.m("Unsupported request: ".concat(String.valueOf(str2)), new Object[0]);
                return null;
        }
    }
}
