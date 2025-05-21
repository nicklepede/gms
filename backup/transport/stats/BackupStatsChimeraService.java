package com.google.android.gms.backup.transport.stats;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.backup.ApplicationBackupStats;
import com.google.android.gms.backup.BackupStatsRequestConfig;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.ahih;
import defpackage.ahip;
import defpackage.ahir;
import defpackage.ahiy;
import defpackage.ahiz;
import defpackage.ahka;
import defpackage.ahwd;
import defpackage.aibb;
import defpackage.aidd;
import defpackage.aidg;
import defpackage.aidh;
import defpackage.aidk;
import defpackage.aidn;
import defpackage.aidt;
import defpackage.aqup;
import defpackage.asng;
import defpackage.bqna;
import defpackage.eiho;
import defpackage.fecj;
import defpackage.flks;
import defpackage.fllt;
import defpackage.unx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackupStatsChimeraService extends Service {
    public static final ahwd a = new ahwd("BackupStatsService");
    public final eiho b = new eiho() { // from class: aklj
        @Override // defpackage.eiho
        public final Object apply(Object obj) {
            return new ahhp((Context) obj);
        }
    };
    public final aidd c = aidd.a();

    public final boolean a(BackupStatsRequestConfig backupStatsRequestConfig) {
        if (!aqup.d(this).i(Binder.getCallingUid())) {
            a.m("API call is not from Google signed package.", new Object[0]);
            return false;
        }
        if (backupStatsRequestConfig.a || backupStatsRequestConfig.b) {
            return true;
        }
        a.m("Client should request either backup data size or backup timestamp", new Object[0]);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ahhq, java.lang.Object] */
    public final ApplicationBackupStats[] b(long j, BackupStatsRequestConfig backupStatsRequestConfig) {
        try {
            Account a2 = this.b.apply(this).a();
            return c(a2, j, aidd.e(this, a2, "android"), backupStatsRequestConfig);
        } catch (aidg e) {
            a.g("Failed to get auth token for backup account.", e, new Object[0]);
            return null;
        } catch (aidn unused) {
            a.m("There is no backup account.", new Object[0]);
            return null;
        }
    }

    public final ApplicationBackupStats[] c(Account account, long j, String str, BackupStatsRequestConfig backupStatsRequestConfig) {
        fecj v = ahip.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ahip ahipVar = (ahip) v.b;
        ahipVar.b |= 1;
        ahipVar.c = j;
        if (!v.b.L()) {
            v.U();
        }
        ahip ahipVar2 = (ahip) v.b;
        ahipVar2.b |= 16;
        ahipVar2.f = str;
        fecj v2 = ahih.a.v();
        boolean z = backupStatsRequestConfig.a;
        if (!v2.b.L()) {
            v2.U();
        }
        ahih ahihVar = (ahih) v2.b;
        ahihVar.b |= 1;
        ahihVar.d = z;
        boolean z2 = backupStatsRequestConfig.b;
        if (!v2.b.L()) {
            v2.U();
        }
        ahih ahihVar2 = (ahih) v2.b;
        ahihVar2.b |= 2;
        ahihVar2.e = z2;
        boolean z3 = fllt.s() && z;
        if (!v2.b.L()) {
            v2.U();
        }
        ahih ahihVar3 = (ahih) v2.b;
        ahihVar3.b |= 4;
        ahihVar3.f = z3;
        if (!v.b.L()) {
            v.U();
        }
        ahip ahipVar3 = (ahip) v.b;
        ahih ahihVar4 = (ahih) v2.Q();
        ahihVar4.getClass();
        ahipVar3.o = ahihVar4;
        ahipVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        if (flks.c()) {
            long e = asng.e(this);
            if (!v.b.L()) {
                v.U();
            }
            ahip ahipVar4 = (ahip) v.b;
            ahipVar4.b |= 2;
            ahipVar4.d = e;
        }
        try {
            return (ApplicationBackupStats[]) d(account, v).toArray(new ApplicationBackupStats[0]);
        } catch (aidh e2) {
            ahwd ahwdVar = a;
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append(message);
            sb.append(", code : ");
            int i = e2.a;
            if (i == 0) {
                throw null;
            }
            sb.append(i - 1);
            ahwdVar.f(sb.toString(), new Object[0]);
            return null;
        } catch (aidt e3) {
            a.f("Transfer exception while getting backup stats ".concat(e3.toString()), new Object[0]);
            return null;
        } catch (unx e4) {
            a.f("Auth exception while getting backup stats ".concat(e4.toString()), new Object[0]);
            return null;
        }
    }

    public final List d(Account account, fecj fecjVar) {
        ArrayList arrayList = new ArrayList();
        try {
            ahiz c = aibb.a(this).c(account, fecjVar);
            int b = ahiy.b(c.c);
            if (b != 0) {
                if (b != 1) {
                    bqna.b(this).h("com.google", ((ahip) fecjVar.b).f);
                    int b2 = ahiy.b(c.c);
                    throw new aidh("Authentication failure on server.", b2 != 0 ? b2 : 1);
                }
            }
            for (ahir ahirVar : c.h) {
                arrayList.add(new ApplicationBackupStats(ahirVar.b, ahirVar.c, ahirVar.d, ahirVar.e, ahirVar.f));
            }
            return arrayList;
        } catch (aidk e) {
            a.f("Got backup stats response status : " + e.a, new Object[0]);
            throw new aidt();
        } catch (IOException e2) {
            a.g("Network exception sending backup stats request.", e2, new Object[0]);
            throw new aidt();
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new ahka(this);
    }
}
