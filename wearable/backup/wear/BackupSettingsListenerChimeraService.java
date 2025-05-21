package com.google.android.gms.wearable.backup.wear;

import com.google.android.gms.wearable.backup.wear.BackupSettingsListenerChimeraService;
import defpackage.ahpv;
import defpackage.aifm;
import defpackage.arxo;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.djlj;
import defpackage.djrc;
import defpackage.djsc;
import defpackage.djus;
import defpackage.dkbc;
import defpackage.dlue;
import defpackage.dlun;
import defpackage.dlvs;
import defpackage.dlvt;
import defpackage.dlvw;
import defpackage.dlvx;
import defpackage.dlvz;
import defpackage.dlwc;
import defpackage.dlwe;
import defpackage.dlwf;
import defpackage.dlyf;
import defpackage.docc;
import defpackage.eiho;
import defpackage.eklh;
import defpackage.enox;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.ensv;
import defpackage.esiu;
import defpackage.eswt;
import defpackage.eswu;
import defpackage.esyt;
import defpackage.esyu;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import j$.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BackupSettingsListenerChimeraService extends dkbc {
    public static final arxo a = new djlj("BackupSettingsWLS");
    private djrc b;
    private djus c;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dkbc, defpackage.djkj
    public final dfaq k(String str, String str2, byte[] bArr) {
        char c;
        int length;
        int length2;
        int length3;
        arxo arxoVar = a;
        final boolean z = false;
        arxoVar.j("onRequest: nodeId=%s path=%s request=%s", str, str2, bArr);
        if (this.b == null) {
            this.b = djsc.f(this);
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
                aifm.a();
                arxoVar.j("backup_supported response: %b", false);
                fecj v = dlun.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                dlun dlunVar = (dlun) v.b;
                dlunVar.b |= 1;
                dlunVar.c = false;
                return dfbl.d(((dlun) v.Q()).r());
            case 1:
                if (bArr != null && (length = bArr.length) != 0) {
                    try {
                        fecp y = fecp.y(dlue.a, bArr, 0, length, febw.a());
                        fecp.M(y);
                        z = ((dlue) y).c;
                    } catch (fedk unused) {
                    }
                }
                djsc djscVar = (djsc) this.b;
                ensv ensvVar = djscVar.c;
                final ahpv ahpvVar = djscVar.d;
                Objects.requireNonNull(ahpvVar);
                ensi h = ensi.h(ensvVar.submit(new Callable() { // from class: djrs
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return Boolean.valueOf(ahpv.this.k());
                    }
                }));
                eiho eihoVar = new eiho() { // from class: djsi
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        BackupSettingsListenerChimeraService.a.h("isBackupEnabled successfully completed", new Object[0]);
                        fecj v2 = dluf.a.v();
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        dluf dlufVar = (dluf) v2.b;
                        dlufVar.b |= 1;
                        dlufVar.c = booleanValue;
                        return ((dluf) v2.Q()).r();
                    }
                };
                enre enreVar = enre.a;
                return docc.a(enox.g(enps.f(h, eihoVar, enreVar), Throwable.class, new enqc() { // from class: djsj
                    @Override // defpackage.enqc
                    public final enss a(Object obj) {
                        Throwable th = (Throwable) obj;
                        BackupSettingsListenerChimeraService.a.n("Failed to complete task: isBackupEnabled", th, new Object[0]);
                        if (!z) {
                            return ensj.h(th);
                        }
                        fecj v2 = dluf.a.v();
                        if (!v2.b.L()) {
                            v2.U();
                        }
                        dluf dlufVar = (dluf) v2.b;
                        dlufVar.d = 1;
                        dlufVar.b |= 2;
                        return ensj.i(((dluf) v2.Q()).r());
                    }
                }, enreVar));
            case 2:
                try {
                    fecp y2 = fecp.y(dlvx.a, bArr, 0, bArr.length, febw.a());
                    fecp.M(y2);
                    final dlvx dlvxVar = (dlvx) y2;
                    dlvw dlvwVar = dlvxVar.d;
                    if (dlvwVar == null) {
                        dlvwVar = dlvw.a;
                    }
                    djrc djrcVar = this.b;
                    String str3 = dlvxVar.c;
                    boolean z2 = dlvxVar.e;
                    esiu esiuVar = z2 ? esiu.amS : esiu.sl;
                    fecj v2 = esyt.a.v();
                    eswt eswtVar = (eswt) eswu.a.v();
                    eswtVar.a(dlvwVar.c);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    esyt esytVar = (esyt) v2.b;
                    eswu eswuVar = (eswu) eswtVar.Q();
                    eswuVar.getClass();
                    esytVar.c = eswuVar;
                    esytVar.b |= 1;
                    eswu eswuVar2 = eswu.a;
                    eswt eswtVar2 = (eswt) eswuVar2.v();
                    eswtVar2.a(dlvwVar.d);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    esyt esytVar2 = (esyt) v2.b;
                    eswu eswuVar3 = (eswu) eswtVar2.Q();
                    eswuVar3.getClass();
                    esytVar2.d = eswuVar3;
                    esytVar2.b |= 2;
                    eswt eswtVar3 = (eswt) eswuVar2.v();
                    eswtVar3.a(dlvwVar.e);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    esyt esytVar3 = (esyt) v2.b;
                    eswu eswuVar4 = (eswu) eswtVar3.Q();
                    eswuVar4.getClass();
                    esytVar3.e = eswuVar4;
                    esytVar3.b |= 4;
                    eswt eswtVar4 = (eswt) eswuVar2.v();
                    eswtVar4.a(dlvwVar.f);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    esyt esytVar4 = (esyt) v2.b;
                    eswu eswuVar5 = (eswu) eswtVar4.Q();
                    eswuVar5.getClass();
                    esytVar4.f = eswuVar5;
                    esytVar4.b |= 8;
                    eswt eswtVar5 = (eswt) eswuVar2.v();
                    eswtVar5.a(dlvwVar.g);
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    esyt esytVar5 = (esyt) v2.b;
                    eswu eswuVar6 = (eswu) eswtVar5.Q();
                    eswuVar6.getClass();
                    esytVar5.g = eswuVar6;
                    esytVar5.b |= 16;
                    ensi h2 = ensi.h(djrcVar.b(str3, z2, esiuVar, (esyt) v2.Q(), Integer.valueOf(dlvwVar.b)));
                    eiho eihoVar2 = new eiho() { // from class: djse
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            BackupSettingsListenerChimeraService.a.h("enableBackup successfully completed", new Object[0]);
                            return dlvy.a.r();
                        }
                    };
                    enre enreVar2 = enre.a;
                    return docc.a(enox.g(enps.f(h2, eihoVar2, enreVar2), Throwable.class, new enqc() { // from class: djsh
                        @Override // defpackage.enqc
                        public final enss a(Object obj) {
                            Throwable th = (Throwable) obj;
                            BackupSettingsListenerChimeraService.a.n("Failed to complete task: enableBackup", th, new Object[0]);
                            if (!dlvx.this.f) {
                                return ensj.h(th);
                            }
                            fecj v3 = dlvy.a.v();
                            if (!v3.b.L()) {
                                v3.U();
                            }
                            dlvy dlvyVar = (dlvy) v3.b;
                            dlvyVar.c = 1;
                            dlvyVar.b = 1 | dlvyVar.b;
                            return ensj.i(((dlvy) v3.Q()).r());
                        }
                    }, enreVar2));
                } catch (fedk e) {
                    a.n("Malformed EnableBackupRequest protocol buffer", e, new Object[0]);
                    return null;
                }
            case 3:
                try {
                    fecp y3 = fecp.y(dlvt.a, bArr, 0, bArr.length, febw.a());
                    fecp.M(y3);
                    final dlvt dlvtVar = (dlvt) y3;
                    dlvs dlvsVar = dlvtVar.c;
                    if (dlvsVar == null) {
                        dlvsVar = dlvs.a;
                    }
                    fecj v3 = esyu.a.v();
                    eswt eswtVar6 = (eswt) eswu.a.v();
                    eswtVar6.a(dlvsVar.d);
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    esyu esyuVar = (esyu) v3.b;
                    eswu eswuVar7 = (eswu) eswtVar6.Q();
                    eswuVar7.getClass();
                    esyuVar.c = eswuVar7;
                    esyuVar.b |= 1;
                    eswu eswuVar8 = eswu.a;
                    eswt eswtVar7 = (eswt) eswuVar8.v();
                    eswtVar7.a(dlvsVar.e);
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    esyu esyuVar2 = (esyu) v3.b;
                    eswu eswuVar9 = (eswu) eswtVar7.Q();
                    eswuVar9.getClass();
                    esyuVar2.d = eswuVar9;
                    esyuVar2.b |= 2;
                    eswt eswtVar8 = (eswt) eswuVar8.v();
                    eswtVar8.a(dlvsVar.f);
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    esyu esyuVar3 = (esyu) v3.b;
                    eswu eswuVar10 = (eswu) eswtVar8.Q();
                    eswuVar10.getClass();
                    esyuVar3.e = eswuVar10;
                    esyuVar3.b |= 4;
                    eswt eswtVar9 = (eswt) eswuVar8.v();
                    eswtVar9.a(dlvsVar.g);
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    esyu esyuVar4 = (esyu) v3.b;
                    eswu eswuVar11 = (eswu) eswtVar9.Q();
                    eswuVar11.getClass();
                    esyuVar4.f = eswuVar11;
                    esyuVar4.b |= 8;
                    eswt eswtVar10 = (eswt) eswuVar8.v();
                    eswtVar10.a(dlvsVar.h);
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    esyu esyuVar5 = (esyu) v3.b;
                    eswu eswuVar12 = (eswu) eswtVar10.Q();
                    eswuVar12.getClass();
                    esyuVar5.g = eswuVar12;
                    esyuVar5.b |= 16;
                    ensi h3 = ensi.h(this.b.a(esiu.amR, (esyu) v3.Q(), Integer.valueOf(dlvsVar.c)));
                    eiho eihoVar3 = new eiho() { // from class: djsk
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            BackupSettingsListenerChimeraService.a.h("disableBackup successfully completed", new Object[0]);
                            return dlvu.a.r();
                        }
                    };
                    enre enreVar3 = enre.a;
                    return docc.a(enox.g(enps.f(h3, eihoVar3, enreVar3), Throwable.class, new enqc() { // from class: djsl
                        @Override // defpackage.enqc
                        public final enss a(Object obj) {
                            Throwable th = (Throwable) obj;
                            BackupSettingsListenerChimeraService.a.n("Failed to complete task: disableBackup", th, new Object[0]);
                            if (!dlvt.this.d) {
                                return ensj.h(th);
                            }
                            fecj v4 = dlvu.a.v();
                            if (!v4.b.L()) {
                                v4.U();
                            }
                            dlvu dlvuVar = (dlvu) v4.b;
                            dlvuVar.c = 1;
                            dlvuVar.b = 1 | dlvuVar.b;
                            return ensj.i(((dlvu) v4.Q()).r());
                        }
                    }, enreVar3));
                } catch (fedk e2) {
                    a.n("Malformed DisableBackupRequest protocol buffer", e2, new Object[0]);
                    return null;
                }
            case 4:
                if (bArr != null && (length2 = bArr.length) != 0) {
                    try {
                        fecp y4 = fecp.y(dlyf.a, bArr, 0, length2, febw.a());
                        fecp.M(y4);
                        z = ((dlyf) y4).c;
                    } catch (fedk unused2) {
                    }
                }
                ensi h4 = ensi.h(this.b.e());
                eiho eihoVar4 = new eiho() { // from class: djsf
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        dlul dlulVar = (dlul) obj;
                        BackupSettingsListenerChimeraService.a.h("refreshBackupStatus successfully completed", new Object[0]);
                        fecj v4 = dlyg.a.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        dlyg dlygVar = (dlyg) v4.b;
                        dlulVar.getClass();
                        dlygVar.c = dlulVar;
                        dlygVar.b |= 1;
                        return ((dlyg) v4.Q()).r();
                    }
                };
                enre enreVar4 = enre.a;
                return docc.a(enox.g(enps.f(h4, eihoVar4, enreVar4), Throwable.class, new enqc() { // from class: djsg
                    @Override // defpackage.enqc
                    public final enss a(Object obj) {
                        Throwable th = (Throwable) obj;
                        BackupSettingsListenerChimeraService.a.n("Failed to complete task: refreshBackupStatus", th, new Object[0]);
                        if (!z) {
                            return ensj.h(th);
                        }
                        fecj v4 = dlyg.a.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        dlyg dlygVar = (dlyg) v4.b;
                        dlygVar.d = 1;
                        dlygVar.b |= 2;
                        return ensj.i(((dlyg) v4.Q()).r());
                    }
                }, enreVar4));
            case 5:
                try {
                    fecp y5 = fecp.y(dlwe.a, bArr, 0, bArr.length, febw.a());
                    fecp.M(y5);
                    final dlwe dlweVar = (dlwe) y5;
                    ensi h5 = ensi.h(this.b.d(dlweVar.c));
                    eiho eihoVar5 = new eiho() { // from class: djsm
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            dlum dlumVar = (dlum) obj;
                            BackupSettingsListenerChimeraService.a.h("fetchBackupStorageQuota successfully completed", new Object[0]);
                            fecj v4 = dlwf.a.v();
                            if (!v4.b.L()) {
                                v4.U();
                            }
                            dlwf dlwfVar = (dlwf) v4.b;
                            dlumVar.getClass();
                            dlwfVar.c = dlumVar;
                            dlwfVar.b |= 1;
                            return ((dlwf) v4.Q()).r();
                        }
                    };
                    enre enreVar5 = enre.a;
                    return docc.a(enox.g(enps.f(h5, eihoVar5, enreVar5), Throwable.class, new enqc() { // from class: djsn
                        @Override // defpackage.enqc
                        public final enss a(Object obj) {
                            Throwable th = (Throwable) obj;
                            BackupSettingsListenerChimeraService.a.n("Failed to complete task: fetchBackupStorageQuota", th, new Object[0]);
                            if (!dlwe.this.d) {
                                return ensj.h(th);
                            }
                            fecj v4 = dlwf.a.v();
                            if (!v4.b.L()) {
                                v4.U();
                            }
                            dlwf dlwfVar = (dlwf) v4.b;
                            dlwfVar.d = 1;
                            dlwfVar.b |= 2;
                            return ensj.i(((dlwf) v4.Q()).r());
                        }
                    }, enreVar5));
                } catch (fedk e3) {
                    a.n("Malformed FetchStorageQuotaRequest protocol buffer", e3, new Object[0]);
                    return null;
                }
            case 6:
                if (bArr != null && (length3 = bArr.length) != 0) {
                    try {
                        fecp y6 = fecp.y(dlwc.a, bArr, 0, length3, febw.a());
                        fecp.M(y6);
                        z = ((dlwc) y6).c;
                    } catch (fedk unused3) {
                    }
                }
                ensi h6 = ensi.h(this.b.c());
                eiho eihoVar6 = new eiho() { // from class: djso
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        dlui dluiVar = (dlui) obj;
                        BackupSettingsListenerChimeraService.a.h("fetchBackupStats successfully completed", new Object[0]);
                        fecj v4 = dlwd.a.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        dlwd dlwdVar = (dlwd) v4.b;
                        dluiVar.getClass();
                        dlwdVar.c = dluiVar;
                        dlwdVar.b |= 1;
                        return ((dlwd) v4.Q()).r();
                    }
                };
                enre enreVar6 = enre.a;
                return docc.a(enox.g(enps.f(h6, eihoVar6, enreVar6), Throwable.class, new enqc() { // from class: djsp
                    @Override // defpackage.enqc
                    public final enss a(Object obj) {
                        Throwable th = (Throwable) obj;
                        BackupSettingsListenerChimeraService.a.n("Failed to complete task: fetchBackupStats", th, new Object[0]);
                        if (!z) {
                            return ensj.h(th);
                        }
                        fecj v4 = dlwd.a.v();
                        if (!v4.b.L()) {
                            v4.U();
                        }
                        dlwd dlwdVar = (dlwd) v4.b;
                        dlwdVar.d = 1;
                        dlwdVar.b |= 2;
                        return ensj.i(((dlwd) v4.Q()).r());
                    }
                }, enreVar6));
            case 7:
                if (this.c == null) {
                    this.c = new djus();
                }
                try {
                    fecp y7 = fecp.y(dlvz.a, bArr, 0, bArr.length, febw.a());
                    fecp.M(y7);
                    eklh b = eklh.b(((dlvz) y7).c);
                    if (b == null) {
                        b = eklh.UNKNOWN_FRAGMENT_TYPE;
                    }
                    this.c.a(3, b);
                    return dfbl.d(dlwf.a.r());
                } catch (fedk e4) {
                    a.n("Malformed EnableBackupSkippedRequest protocol buffer", e4, new Object[0]);
                    return null;
                }
            default:
                arxoVar.m("Unsupported request: ".concat(String.valueOf(str2)), new Object[0]);
                return null;
        }
    }
}
