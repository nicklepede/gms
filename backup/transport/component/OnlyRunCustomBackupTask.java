package com.google.android.gms.backup.transport.component;

import android.content.Context;
import com.google.android.gms.backup.BackUpNowConfig;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ahhj;
import defpackage.ahkk;
import defpackage.ahwd;
import defpackage.ahwj;
import defpackage.aiwv;
import defpackage.aixa;
import defpackage.akdr;
import defpackage.akds;
import defpackage.akdx;
import defpackage.arxo;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.eigb;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.ekhk;
import defpackage.ekhl;
import defpackage.ekkw;
import defpackage.enpf;
import defpackage.enre;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fllq;
import defpackage.fllt;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class OnlyRunCustomBackupTask extends GmsTaskBoundService {
    private static final arxo a = new ahwd("CustomDownloadStarterTask");

    public static void d(Context context) {
        akdx akdxVar = new akdx();
        fllt flltVar = fllt.a;
        Integer num = null;
        aiwv aiwvVar = flltVar.a().am() ? new aiwv(new aixa(context)) : null;
        if (!fllt.q()) {
            a.j("Server flag says not to schedule custom backups", new Object[0]);
            return;
        }
        if (aiwvVar != null) {
            if (fllt.a.a().D()) {
                long currentTimeMillis = System.currentTimeMillis();
                eiid a2 = aiwvVar.a();
                num = (Integer) (!a2.h() ? eigb.a : eiid.j(Integer.valueOf((int) TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis - ((Long) a2.c()).longValue())))).f();
            }
            eiid a3 = aiwvVar.a();
            if (a3.h()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (((Long) a3.c()).longValue() > currentTimeMillis2) {
                    aiwv.a.m("Last schedule happened in the future", new Object[0]);
                } else if (currentTimeMillis2 < ((Long) a3.c()).longValue() + TimeUnit.MINUTES.toMillis(flltVar.a().r())) {
                    a.j("Not scheduling as it was recently run already", new Object[0]);
                    return;
                }
            }
            try {
                aixa aixaVar = aiwvVar.b;
                final long currentTimeMillis3 = System.currentTimeMillis();
                ((enpf) aixaVar.a.b(new eiho() { // from class: aiwy
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        aiww aiwwVar = (aiww) obj;
                        fecj fecjVar = (fecj) aiwwVar.iB(5, null);
                        fecjVar.X(aiwwVar);
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        long j = currentTimeMillis3;
                        aiww aiwwVar2 = (aiww) fecjVar.b;
                        aiww aiwwVar3 = aiww.a;
                        aiwwVar2.b |= 1;
                        aiwwVar2.c = j;
                        return (aiww) fecjVar.Q();
                    }
                }, enre.a)).u();
            } catch (InterruptedException | ExecutionException e) {
                aiwv.a.g("Unable to save custom backup schedule timestamp", e, new Object[0]);
            }
        }
        akdr b = akds.b(context);
        bykj bykjVar = new bykj();
        bykjVar.w("com.google.android.gms.backup.transport.component.OnlyRunCustomBackupTask");
        boolean z = b.b;
        bykjVar.i(z);
        boolean z2 = b.c;
        bykjVar.r(z2);
        bykjVar.e(fllq.d(), fllq.c());
        bykjVar.t("only_run_custom_backup");
        boolean z3 = b.a;
        bykjVar.y(true != z3 ? 2 : 1, 1);
        bykjVar.p = true;
        bykjVar.v(1);
        byjl.a(context).f(bykjVar.b());
        a.j("OnlyRunCustomBackupTask scheduled to run", new Object[0]);
        long d = fllq.d();
        long c = fllq.c();
        fecj v = ekkw.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        ekkw ekkwVar = (ekkw) fecpVar;
        ekkwVar.b |= 1;
        ekkwVar.c = true;
        if (!fecpVar.L()) {
            v.U();
        }
        fecp fecpVar2 = v.b;
        ekkw ekkwVar2 = (ekkw) fecpVar2;
        ekkwVar2.b = 2 | ekkwVar2.b;
        ekkwVar2.d = z3;
        if (!fecpVar2.L()) {
            v.U();
        }
        fecp fecpVar3 = v.b;
        ekkw ekkwVar3 = (ekkw) fecpVar3;
        ekkwVar3.b |= 4;
        ekkwVar3.e = z;
        if (!fecpVar3.L()) {
            v.U();
        }
        fecp fecpVar4 = v.b;
        ekkw ekkwVar4 = (ekkw) fecpVar4;
        ekkwVar4.b |= 8;
        ekkwVar4.f = z2;
        if (!fecpVar4.L()) {
            v.U();
        }
        fecp fecpVar5 = v.b;
        ekkw ekkwVar5 = (ekkw) fecpVar5;
        ekkwVar5.b |= 16;
        ekkwVar5.g = d;
        if (!fecpVar5.L()) {
            v.U();
        }
        ekkw ekkwVar6 = (ekkw) v.b;
        ekkwVar6.b |= 32;
        ekkwVar6.h = c;
        if (num != null) {
            int intValue = num.intValue();
            if (!v.b.L()) {
                v.U();
            }
            ekkw ekkwVar7 = (ekkw) v.b;
            ekkwVar7.b |= 64;
            ekkwVar7.i = intValue;
        }
        fecj c2 = ahwj.c();
        ekkw ekkwVar8 = (ekkw) v.Q();
        if (!c2.b.L()) {
            c2.U();
        }
        ekhl ekhlVar = (ekhl) c2.b;
        ekhl ekhlVar2 = ekhl.a;
        ekkwVar8.getClass();
        ekhlVar.ad = ekkwVar8;
        ekhlVar.c |= 536870912;
        akdxVar.a((ekhl) c2.Q(), ekhk.CUSTOM_BACK_UP_SCHEDULE);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!fllt.q()) {
            a.j("Server flag says not to schedule custom backups", new Object[0]);
            return 2;
        }
        arxo arxoVar = a;
        arxoVar.j("OnlyRunCustomBackupTask started running", new Object[0]);
        akdr b = akds.b(this);
        ahhj ahhjVar = new ahhj();
        ahhjVar.a = b.a;
        ahhjVar.b = b.c;
        ahhjVar.c = b.b;
        ahhjVar.d = fllq.h();
        ahhjVar.e = b.d;
        ahhjVar.g = true;
        ahhjVar.h = false;
        ahhjVar.i = false;
        arxoVar.h("Requesting backup of just custom backup packages", new Object[0]);
        new ahkk(this).b(new BackUpNowConfig(ahhjVar));
        return 0;
    }
}
