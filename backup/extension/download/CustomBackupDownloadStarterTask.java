package com.google.android.gms.backup.extension.download;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ahwd;
import defpackage.aixm;
import defpackage.aixp;
import defpackage.aiyf;
import defpackage.aiyj;
import defpackage.aiyl;
import defpackage.aiym;
import defpackage.aiyn;
import defpackage.aiyv;
import defpackage.arxo;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.bykk;
import defpackage.bykx;
import defpackage.byky;
import defpackage.byln;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.ekkm;
import defpackage.fecj;
import defpackage.fllt;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CustomBackupDownloadStarterTask extends GmsTaskBoundService {
    private static final arxo a = new ahwd("CustomDownloadStarterTask");
    private final eijr b = eijy.a(new eijr() { // from class: aixy
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(fllt.t());
        }
    });

    static void d(Context context) {
        arxo arxoVar = a;
        arxoVar.j("Trying to schedule Custom Backup Downloads", new Object[0]);
        new aixm(context);
        if (!aixm.k()) {
            arxoVar.j("Server flag says not to schedule the operation", new Object[0]);
            return;
        }
        int o = (int) fllt.a.a().o();
        fllt flltVar = fllt.a;
        byky a2 = bykx.a(1, o, (int) flltVar.a().p());
        long s = flltVar.a().s();
        long q = flltVar.a().q();
        bykj bykjVar = new bykj();
        bykjVar.w(CustomBackupDownloadStarterTask.class.getName());
        bykjVar.e(s, q);
        bykjVar.t("com.google.android.gms.backup.extension.download.START_DOWNLOAD");
        bykjVar.y(1, 1);
        bykjVar.p = true;
        bykjVar.v(1);
        bykjVar.t = a2;
        bykk b = bykjVar.b();
        arxoVar.d("Task will run between %s and %s seconds", Long.valueOf(s), Long.valueOf(q));
        byjl.a(context).f(b);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        int i;
        aixm aixmVar = new aixm(this);
        aiyv aiyvVar = new aiyv(this);
        aiyn aiynVar = new aiyn(this);
        aixp aixpVar = new aixp();
        if (!aixm.k()) {
            a.j("Server flag says not to run the operation", new Object[0]);
            aixpVar.f(2);
            return 0;
        }
        aiyf aiyfVar = aixmVar.b;
        long currentTimeMillis = System.currentTimeMillis();
        aiyl b = aiyfVar.b();
        if ((b.b & 4) != 0) {
            if (currentTimeMillis - b.e > TimeUnit.DAYS.toMillis(fllt.a.a().j())) {
                a.j("Number of retries exceeded to run the operation", new Object[0]);
                aixpVar.f(9);
                return 2;
            }
        } else {
            fecj w = aiyl.a.w(b);
            if (!w.b.L()) {
                w.U();
            }
            aiyl aiylVar = (aiyl) w.b;
            aiylVar.b |= 4;
            aiylVar.e = currentTimeMillis;
            aiyfVar.c((aiyl) w.Q());
        }
        if (!aixmVar.i()) {
            a.j("Restore token not yet available", new Object[0]);
            if (fllt.m()) {
                return 2;
            }
            aixpVar.f(3);
            return 1;
        }
        arxo arxoVar = a;
        arxoVar.j("Restore has happened, applying user consent", new Object[0]);
        aiyf aiyfVar2 = aiyvVar.a;
        if (aiyfVar2.b().d) {
            aiyvVar.c.d("User consent already applied", new Object[0]);
        } else {
            Context context = aiyvVar.b;
            String string = Settings.Secure.getString(context.getContentResolver(), "custom_backup_data_download_selections");
            String[] strArr = new String[0];
            if (string != null) {
                strArr = string.split(",");
            }
            eitj k = eitj.k(strArr);
            int i2 = ((ejcb) k).c;
            for (int i3 = 0; i3 < i2; i3++) {
                String str = (String) aiyvVar.d.get((String) k.get(i3));
                if (str != null) {
                    aiyvVar.c(str, 2);
                }
            }
            String string2 = Settings.Secure.getString(context.getContentResolver(), "custom_backup_data_download_unavailable_or_unselected");
            String[] strArr2 = new String[0];
            if (string2 != null) {
                strArr2 = string2.split(",");
            }
            eitj k2 = eitj.k(strArr2);
            int i4 = ((ejcb) k2).c;
            for (int i5 = 0; i5 < i4; i5++) {
                String str2 = (String) aiyvVar.d.get((String) k2.get(i5));
                if (str2 != null) {
                    aiyvVar.c(str2, 3);
                }
            }
            fecj w2 = aiyl.a.w(aiyfVar2.b());
            if (!w2.b.L()) {
                w2.U();
            }
            aiyl aiylVar2 = (aiyl) w2.b;
            aiylVar2.b = 2 | aiylVar2.b;
            aiylVar2.d = true;
            aiyfVar2.c((aiyl) w2.Q());
        }
        if (CustomBackupDownloadManagerChimeraService.b) {
            arxoVar.j("There is an existing instance of download manager service..just return", new Object[0]);
            aixpVar.f(4);
            return 1;
        }
        for (String str3 : fllt.i().b) {
            if (aixmVar.a.getPackageManager().resolveService(new Intent().setAction("com.google.android.gms.backup.action.CUSTOM_DOWNLOAD").setPackage(str3), 0) == null) {
                aiyl b2 = aiyfVar.b();
                Map e = aixmVar.e();
                if (e.containsKey(str3)) {
                    aiyj aiyjVar = (aiyj) e.get(str3);
                    int i6 = aiyjVar.e;
                    if (i6 < 10) {
                        fecj w3 = aiyj.a.w(aiyjVar);
                        i = 1;
                        aixmVar.l(b2, w3, i6 + 1, str3);
                    }
                } else {
                    i = 1;
                    aixmVar.l(b2, aiyj.a.v(), 1, str3);
                }
                arxoVar.j("All supported packages are not ready", new Object[0]);
                aixpVar.f(5);
                return i;
            }
        }
        if (!aixmVar.f()) {
            arxoVar.j("Supported packages do not have any data to download", new Object[0]);
            aixpVar.f(8);
            return 0;
        }
        if (aixmVar.b().isEmpty()) {
            if (!aixmVar.j()) {
                arxoVar.j("There is no data remaining to be downloaded", new Object[0]);
                aixpVar.f(7);
                return 0;
            }
            fecj v = ekkm.a.v();
            if (!v.b.L()) {
                v.U();
            }
            ekkm ekkmVar = (ekkm) v.b;
            ekkmVar.b |= 1;
            ekkmVar.c = true;
            aixpVar.b((ekkm) v.Q());
            arxoVar.j("All conditions satisfied. Starting download manager service", new Object[0]);
            CustomBackupDownloadManagerChimeraService.d(this);
            return 1;
        }
        arxoVar.j("All eligible packages are ready, but there are packages user need to consent", new Object[0]);
        aixpVar.f(6);
        if (((Boolean) this.b.a()).booleanValue()) {
            aiyf a2 = aiyf.a(this);
            fecj w4 = aiyl.a.w(a2.b());
            if (!w4.b.L()) {
                w4.U();
            }
            aiyl aiylVar3 = (aiyl) w4.b;
            aiylVar3.b = 8 | aiylVar3.b;
            aiylVar3.f = true;
            a2.c((aiyl) w4.Q());
        }
        aiynVar.a(aiym.READY);
        return 0;
    }
}
