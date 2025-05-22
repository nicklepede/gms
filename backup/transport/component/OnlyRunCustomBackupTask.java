package com.google.android.gms.backup.transport.component;

import android.content.Context;
import com.google.android.gms.backup.BackUpNowConfig;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.ajhz;
import defpackage.ajla;
import defpackage.ajwt;
import defpackage.ajwv;
import defpackage.ajwz;
import defpackage.akxl;
import defpackage.akxq;
import defpackage.ameo;
import defpackage.amep;
import defpackage.ameu;
import defpackage.auad;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.ektg;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.emuw;
import defpackage.emux;
import defpackage.emyi;
import defpackage.eqcy;
import defpackage.eqex;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.foda;
import defpackage.fodd;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class OnlyRunCustomBackupTask extends GmsTaskBoundService {
    private static final auad a = new ajwt("CustomDownloadStarterTask");

    public static void d(Context context) {
        new ameu();
        fodd foddVar = fodd.a;
        Integer num = null;
        akxl akxlVar = foddVar.lK().am() ? new akxl(new akxq(context)) : null;
        if (!fodd.q()) {
            a.j("Server flag says not to schedule custom backups", new Object[0]);
            return;
        }
        if (akxlVar != null) {
            if (foddVar.lK().D()) {
                long currentTimeMillis = System.currentTimeMillis();
                ekvi a2 = akxlVar.a();
                num = (Integer) (!a2.h() ? ektg.a : ekvi.j(Integer.valueOf((int) TimeUnit.MILLISECONDS.toMinutes(currentTimeMillis - ((Long) a2.c()).longValue())))).f();
            }
            ekvi a3 = akxlVar.a();
            if (a3.h()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (((Long) a3.c()).longValue() > currentTimeMillis2) {
                    akxl.a.m("Last schedule happened in the future", new Object[0]);
                } else if (currentTimeMillis2 < ((Long) a3.c()).longValue() + TimeUnit.MINUTES.toMillis(foddVar.lK().r())) {
                    a.j("Not scheduling as it was recently run already", new Object[0]);
                    return;
                }
            }
            try {
                akxq akxqVar = akxlVar.b;
                final long currentTimeMillis3 = System.currentTimeMillis();
                ((eqcy) akxqVar.a.b(new ekut() { // from class: akxo
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        akxm akxmVar = (akxm) obj;
                        fgrc fgrcVar = (fgrc) akxmVar.iQ(5, null);
                        fgrcVar.X(akxmVar);
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        long j = currentTimeMillis3;
                        akxm akxmVar2 = (akxm) fgrcVar.b;
                        akxm akxmVar3 = akxm.a;
                        akxmVar2.b |= 1;
                        akxmVar2.c = j;
                        return (akxm) fgrcVar.Q();
                    }
                }, eqex.a)).u();
            } catch (InterruptedException | ExecutionException e) {
                akxl.a.g("Unable to save custom backup schedule timestamp", e, new Object[0]);
            }
        }
        ameo b = amep.b(context);
        catb catbVar = new catb();
        catbVar.w("com.google.android.gms.backup.transport.component.OnlyRunCustomBackupTask");
        boolean z = b.b;
        catbVar.i(z);
        boolean z2 = b.c;
        catbVar.r(z2);
        catbVar.e(foda.d(), foda.c());
        catbVar.t("only_run_custom_backup");
        boolean z3 = b.a;
        catbVar.y(true != z3 ? 2 : 1, 1);
        catbVar.p = true;
        catbVar.v(1);
        casd.a(context).f(catbVar.b());
        a.j("OnlyRunCustomBackupTask scheduled to run", new Object[0]);
        long d = foda.d();
        long c = foda.c();
        fgrc v = emyi.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        emyi emyiVar = (emyi) fgriVar;
        emyiVar.b |= 1;
        emyiVar.c = true;
        if (!fgriVar.L()) {
            v.U();
        }
        fgri fgriVar2 = v.b;
        emyi emyiVar2 = (emyi) fgriVar2;
        emyiVar2.b = 2 | emyiVar2.b;
        emyiVar2.d = z3;
        if (!fgriVar2.L()) {
            v.U();
        }
        fgri fgriVar3 = v.b;
        emyi emyiVar3 = (emyi) fgriVar3;
        emyiVar3.b |= 4;
        emyiVar3.e = z;
        if (!fgriVar3.L()) {
            v.U();
        }
        fgri fgriVar4 = v.b;
        emyi emyiVar4 = (emyi) fgriVar4;
        emyiVar4.b |= 8;
        emyiVar4.f = z2;
        if (!fgriVar4.L()) {
            v.U();
        }
        fgri fgriVar5 = v.b;
        emyi emyiVar5 = (emyi) fgriVar5;
        emyiVar5.b |= 16;
        emyiVar5.g = d;
        if (!fgriVar5.L()) {
            v.U();
        }
        emyi emyiVar6 = (emyi) v.b;
        emyiVar6.b |= 32;
        emyiVar6.h = c;
        if (num != null) {
            int intValue = num.intValue();
            if (!v.b.L()) {
                v.U();
            }
            emyi emyiVar7 = (emyi) v.b;
            emyiVar7.b |= 64;
            emyiVar7.i = intValue;
        }
        fgrc c2 = ajwz.c();
        emyi emyiVar8 = (emyi) v.Q();
        if (!c2.b.L()) {
            c2.U();
        }
        emux emuxVar = (emux) c2.b;
        emux emuxVar2 = emux.a;
        emyiVar8.getClass();
        emuxVar.ad = emyiVar8;
        emuxVar.c |= 536870912;
        ajwv.a((emux) c2.Q(), emuw.CUSTOM_BACK_UP_SCHEDULE);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!fodd.q()) {
            a.j("Server flag says not to schedule custom backups", new Object[0]);
            return 2;
        }
        auad auadVar = a;
        auadVar.j("OnlyRunCustomBackupTask started running", new Object[0]);
        ameo b = amep.b(this);
        ajhz ajhzVar = new ajhz();
        ajhzVar.a = b.a;
        ajhzVar.b = b.c;
        ajhzVar.c = b.b;
        ajhzVar.d = foda.h();
        ajhzVar.e = b.d;
        ajhzVar.g = true;
        ajhzVar.h = false;
        ajhzVar.i = false;
        auadVar.h("Requesting backup of just custom backup packages", new Object[0]);
        new ajla(this).b(new BackUpNowConfig(ajhzVar));
        return 0;
    }
}
