package com.google.android.gms.backup.extension.download;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ajwt;
import defpackage.akyc;
import defpackage.akyf;
import defpackage.akyv;
import defpackage.akyz;
import defpackage.akzb;
import defpackage.akzc;
import defpackage.akzd;
import defpackage.akzl;
import defpackage.auad;
import defpackage.casd;
import defpackage.catb;
import defpackage.catc;
import defpackage.catp;
import defpackage.catq;
import defpackage.cauf;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.emxy;
import defpackage.fgrc;
import defpackage.fodd;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CustomBackupDownloadStarterTask extends GmsTaskBoundService {
    private static final auad a = new ajwt("CustomDownloadStarterTask");
    private final ekww b = ekxd.a(new ekww() { // from class: akyo
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fodd.t());
        }
    });

    static void d(Context context) {
        auad auadVar = a;
        auadVar.j("Trying to schedule Custom Backup Downloads", new Object[0]);
        new akyc(context);
        if (!akyc.k()) {
            auadVar.j("Server flag says not to schedule the operation", new Object[0]);
            return;
        }
        fodd foddVar = fodd.a;
        catq a2 = catp.a(1, (int) foddVar.lK().o(), (int) foddVar.lK().p());
        long s = foddVar.lK().s();
        long q = foddVar.lK().q();
        catb catbVar = new catb();
        catbVar.w(CustomBackupDownloadStarterTask.class.getName());
        catbVar.e(s, q);
        catbVar.t("com.google.android.gms.backup.extension.download.START_DOWNLOAD");
        catbVar.y(1, 1);
        catbVar.p = true;
        catbVar.v(1);
        catbVar.t = a2;
        catc b = catbVar.b();
        auadVar.d("Task will run between %s and %s seconds", Long.valueOf(s), Long.valueOf(q));
        casd.a(context).f(b);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        int i;
        akyc akycVar = new akyc(this);
        akzl akzlVar = new akzl(this);
        akzd akzdVar = new akzd(this);
        akyf akyfVar = new akyf();
        if (!akyc.k()) {
            a.j("Server flag says not to run the operation", new Object[0]);
            akyfVar.f(2);
            return 0;
        }
        akyv akyvVar = akycVar.b;
        long currentTimeMillis = System.currentTimeMillis();
        akzb b = akyvVar.b();
        if ((b.b & 4) != 0) {
            if (currentTimeMillis - b.e > TimeUnit.DAYS.toMillis(fodd.a.lK().j())) {
                a.j("Number of retries exceeded to run the operation", new Object[0]);
                akyfVar.f(9);
                return 2;
            }
        } else {
            fgrc w = akzb.a.w(b);
            if (!w.b.L()) {
                w.U();
            }
            akzb akzbVar = (akzb) w.b;
            akzbVar.b |= 4;
            akzbVar.e = currentTimeMillis;
            akyvVar.c((akzb) w.Q());
        }
        if (!akycVar.i()) {
            a.j("Restore token not yet available", new Object[0]);
            if (fodd.m()) {
                return 2;
            }
            akyfVar.f(3);
            return 1;
        }
        auad auadVar = a;
        auadVar.j("Restore has happened, applying user consent", new Object[0]);
        akyv akyvVar2 = akzlVar.a;
        if (akyvVar2.b().d) {
            akzlVar.c.d("User consent already applied", new Object[0]);
        } else {
            Context context = akzlVar.b;
            String string = Settings.Secure.getString(context.getContentResolver(), "custom_backup_data_download_selections");
            String[] strArr = new String[0];
            if (string != null) {
                strArr = string.split(",");
            }
            elgo k = elgo.k(strArr);
            int i2 = ((elpg) k).c;
            for (int i3 = 0; i3 < i2; i3++) {
                String str = (String) akzlVar.d.get((String) k.get(i3));
                if (str != null) {
                    akzlVar.c(str, 2);
                }
            }
            String string2 = Settings.Secure.getString(context.getContentResolver(), "custom_backup_data_download_unavailable_or_unselected");
            String[] strArr2 = new String[0];
            if (string2 != null) {
                strArr2 = string2.split(",");
            }
            elgo k2 = elgo.k(strArr2);
            int i4 = ((elpg) k2).c;
            for (int i5 = 0; i5 < i4; i5++) {
                String str2 = (String) akzlVar.d.get((String) k2.get(i5));
                if (str2 != null) {
                    akzlVar.c(str2, 3);
                }
            }
            fgrc w2 = akzb.a.w(akyvVar2.b());
            if (!w2.b.L()) {
                w2.U();
            }
            akzb akzbVar2 = (akzb) w2.b;
            akzbVar2.b = 2 | akzbVar2.b;
            akzbVar2.d = true;
            akyvVar2.c((akzb) w2.Q());
        }
        if (CustomBackupDownloadManagerChimeraService.b) {
            auadVar.j("There is an existing instance of download manager service..just return", new Object[0]);
            akyfVar.f(4);
            return 1;
        }
        for (String str3 : fodd.i().b) {
            if (akycVar.a.getPackageManager().resolveService(new Intent().setAction("com.google.android.gms.backup.action.CUSTOM_DOWNLOAD").setPackage(str3), 0) == null) {
                akzb b2 = akyvVar.b();
                Map e = akycVar.e();
                if (e.containsKey(str3)) {
                    akyz akyzVar = (akyz) e.get(str3);
                    int i6 = akyzVar.e;
                    if (i6 < 10) {
                        fgrc w3 = akyz.a.w(akyzVar);
                        i = 1;
                        akycVar.l(b2, w3, i6 + 1, str3);
                    }
                } else {
                    i = 1;
                    akycVar.l(b2, akyz.a.v(), 1, str3);
                }
                auadVar.j("All supported packages are not ready", new Object[0]);
                akyfVar.f(5);
                return i;
            }
        }
        if (!akycVar.f()) {
            auadVar.j("Supported packages do not have any data to download", new Object[0]);
            akyfVar.f(8);
            return 0;
        }
        if (akycVar.b().isEmpty()) {
            if (!akycVar.j()) {
                auadVar.j("There is no data remaining to be downloaded", new Object[0]);
                akyfVar.f(7);
                return 0;
            }
            fgrc v = emxy.a.v();
            if (!v.b.L()) {
                v.U();
            }
            emxy emxyVar = (emxy) v.b;
            emxyVar.b |= 1;
            emxyVar.c = true;
            akyfVar.b((emxy) v.Q());
            auadVar.j("All conditions satisfied. Starting download manager service", new Object[0]);
            CustomBackupDownloadManagerChimeraService.d(this);
            return 1;
        }
        auadVar.j("All eligible packages are ready, but there are packages user need to consent", new Object[0]);
        akyfVar.f(6);
        if (((Boolean) this.b.lK()).booleanValue()) {
            akyv a2 = akyv.a(this);
            fgrc w4 = akzb.a.w(a2.b());
            if (!w4.b.L()) {
                w4.U();
            }
            akzb akzbVar3 = (akzb) w4.b;
            akzbVar3.b = 8 | akzbVar3.b;
            akzbVar3.f = true;
            a2.c((akzb) w4.Q());
        }
        akzdVar.a(akzc.READY);
        return 0;
    }
}
