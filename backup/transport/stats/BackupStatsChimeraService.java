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
import defpackage.ajix;
import defpackage.ajjf;
import defpackage.ajjh;
import defpackage.ajjo;
import defpackage.ajjp;
import defpackage.ajkq;
import defpackage.ajwt;
import defpackage.akbr;
import defpackage.akdt;
import defpackage.akdw;
import defpackage.akdx;
import defpackage.akea;
import defpackage.aked;
import defpackage.akej;
import defpackage.asxe;
import defpackage.aura;
import defpackage.bsup;
import defpackage.ekut;
import defpackage.fgrc;
import defpackage.focc;
import defpackage.fodd;
import defpackage.wjw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackupStatsChimeraService extends Service {
    public static final ajwt a = new ajwt("BackupStatsService");
    public final ekut b = new ekut() { // from class: ammm
        @Override // defpackage.ekut
        public final Object apply(Object obj) {
            return new ajif((Context) obj);
        }
    };
    public final akdt c = akdt.a();

    public final boolean a(BackupStatsRequestConfig backupStatsRequestConfig) {
        if (!asxe.d(this).i(Binder.getCallingUid())) {
            a.m("API call is not from Google signed package.", new Object[0]);
            return false;
        }
        if (backupStatsRequestConfig.a || backupStatsRequestConfig.b) {
            return true;
        }
        a.m("Client should request either backup data size or backup timestamp", new Object[0]);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ajig, java.lang.Object] */
    public final ApplicationBackupStats[] b(long j, BackupStatsRequestConfig backupStatsRequestConfig) {
        try {
            Account a2 = this.b.apply(this).a();
            return c(a2, j, akdt.e(this, a2, "android"), backupStatsRequestConfig);
        } catch (akdw e) {
            a.g("Failed to get auth token for backup account.", e, new Object[0]);
            return null;
        } catch (aked unused) {
            a.m("There is no backup account.", new Object[0]);
            return null;
        }
    }

    public final ApplicationBackupStats[] c(Account account, long j, String str, BackupStatsRequestConfig backupStatsRequestConfig) {
        fgrc v = ajjf.a.v();
        if (!v.b.L()) {
            v.U();
        }
        ajjf ajjfVar = (ajjf) v.b;
        ajjfVar.b |= 1;
        ajjfVar.c = j;
        if (!v.b.L()) {
            v.U();
        }
        ajjf ajjfVar2 = (ajjf) v.b;
        ajjfVar2.b |= 16;
        ajjfVar2.f = str;
        fgrc v2 = ajix.a.v();
        boolean z = backupStatsRequestConfig.a;
        if (!v2.b.L()) {
            v2.U();
        }
        ajix ajixVar = (ajix) v2.b;
        ajixVar.b |= 1;
        ajixVar.d = z;
        boolean z2 = backupStatsRequestConfig.b;
        if (!v2.b.L()) {
            v2.U();
        }
        ajix ajixVar2 = (ajix) v2.b;
        ajixVar2.b |= 2;
        ajixVar2.e = z2;
        boolean z3 = fodd.s() && z;
        if (!v2.b.L()) {
            v2.U();
        }
        ajix ajixVar3 = (ajix) v2.b;
        ajixVar3.b |= 4;
        ajixVar3.f = z3;
        if (!v.b.L()) {
            v.U();
        }
        ajjf ajjfVar3 = (ajjf) v.b;
        ajix ajixVar4 = (ajix) v2.Q();
        ajixVar4.getClass();
        ajjfVar3.o = ajixVar4;
        ajjfVar3.b |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES;
        if (focc.c()) {
            long e = aura.e(this);
            if (!v.b.L()) {
                v.U();
            }
            ajjf ajjfVar4 = (ajjf) v.b;
            ajjfVar4.b |= 2;
            ajjfVar4.d = e;
        }
        try {
            return (ApplicationBackupStats[]) d(account, v).toArray(new ApplicationBackupStats[0]);
        } catch (akdx e2) {
            ajwt ajwtVar = a;
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append(message);
            sb.append(", code : ");
            int i = e2.a;
            if (i == 0) {
                throw null;
            }
            sb.append(i - 1);
            ajwtVar.f(sb.toString(), new Object[0]);
            return null;
        } catch (akej e3) {
            a.f("Transfer exception while getting backup stats ".concat(e3.toString()), new Object[0]);
            return null;
        } catch (wjw e4) {
            a.f("Auth exception while getting backup stats ".concat(e4.toString()), new Object[0]);
            return null;
        }
    }

    public final List d(Account account, fgrc fgrcVar) {
        ArrayList arrayList = new ArrayList();
        try {
            ajjp c = akbr.a(this).c(account, fgrcVar);
            int b = ajjo.b(c.c);
            if (b != 0) {
                if (b != 1) {
                    bsup.b(this).h("com.google", ((ajjf) fgrcVar.b).f);
                    int b2 = ajjo.b(c.c);
                    throw new akdx("Authentication failure on server.", b2 != 0 ? b2 : 1);
                }
            }
            for (ajjh ajjhVar : c.h) {
                arrayList.add(new ApplicationBackupStats(ajjhVar.b, ajjhVar.c, ajjhVar.d, ajjhVar.e, ajjhVar.f));
            }
            return arrayList;
        } catch (akea e) {
            a.f("Got backup stats response status : " + e.a, new Object[0]);
            throw new akej();
        } catch (IOException e2) {
            a.g("Network exception sending backup stats request.", e2, new Object[0]);
            throw new akej();
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return new ajkq(this);
    }
}
