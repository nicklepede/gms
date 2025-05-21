package com.google.android.gms.languageprofile.service;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import com.google.android.gms.languageprofile.service.LanguageProfileGcmTaskChimeraService;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.arfc;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asot;
import defpackage.bqbx;
import defpackage.bqcn;
import defpackage.bqcs;
import defpackage.bqdt;
import defpackage.bqdv;
import defpackage.bqeb;
import defpackage.bqed;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.byjl;
import defpackage.byln;
import defpackage.bywx;
import defpackage.byxs;
import defpackage.drbi;
import defpackage.drbl;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eijr;
import defpackage.eixf;
import defpackage.ejhf;
import defpackage.erxd;
import defpackage.erxe;
import defpackage.fpjy;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class LanguageProfileGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("LPGcmTaskChimeraService", asej.LANGUAGE_PROFILE);

    static void d(byjl byjlVar, byxs byxsVar) {
        if (fpjy.e()) {
            ((ejhf) b.h()).x("Scheduling sync task.");
            byxsVar.j();
            return;
        }
        ((ejhf) b.h()).x("Unscheduling sync tasks.");
        byjlVar.d("languageprofile.StoreLanguageSettingsByClientIdPeriodicTask", "com.google.android.gms.languageprofile.GcmTaskService");
        byjlVar.d("languageprofile.SyncPeriodicUploadTask", "com.google.android.gms.languageprofile.GcmTaskService");
        byjlVar.d("languageprofile.SyncPeriodicWipeoutTask", "com.google.android.gms.languageprofile.GcmTaskService");
        byjlVar.d("languageprofile.CleanupPeriodicTask", "com.google.android.gms.languageprofile.GcmTaskService");
    }

    private static void e(bqqa bqqaVar, aseu aseuVar) {
        if (bqqaVar != null) {
            bqqa.a(aseuVar);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        bqqa bqqaVar;
        boolean z = false;
        z = false;
        if (fpjy.e()) {
            if (arfc.b()) {
                AppContextProvider.a();
                eijr eijrVar = bqqe.a;
                bqqaVar = new bqqa();
            } else {
                bqqaVar = null;
            }
            drbi a2 = bqcn.a().a(bylnVar.a);
            bqbx bqbxVar = (bqbx) a2.a;
            switch (bqbxVar.ordinal()) {
                case 1:
                    int i = a2.b;
                    if (i == 3) {
                        e(bqqaVar, aseu.LANGUAGEPROFILE_CRON_PERIODIC_SETTINGS_UPLOAD);
                        List h = eixf.h(bqcs.c(), new eiho() { // from class: bqdj
                            @Override // defpackage.eiho
                            public final Object apply(Object obj) {
                                int i2 = LanguageProfileGcmTaskChimeraService.a;
                                return ervx.b((Locale) obj, true);
                            }
                        });
                        erxd erxdVar = (erxd) erxe.a.v();
                        erxdVar.a(h);
                        String d = fpjy.d();
                        if (!erxdVar.b.L()) {
                            erxdVar.U();
                        }
                        erxe erxeVar = (erxe) erxdVar.b;
                        d.getClass();
                        erxeVar.c = d;
                        boolean z2 = Build.VERSION.SDK_INT < 24;
                        if (!erxdVar.b.L()) {
                            erxdVar.U();
                        }
                        ((erxe) erxdVar.b).d = z2;
                        erxe erxeVar2 = (erxe) erxdVar.Q();
                        bqdv a3 = bqdv.a();
                        eiid b2 = bqcs.b();
                        if (b2.h()) {
                            if (fpjy.a.a().m()) {
                                for (Account account : (Account[]) b2.c()) {
                                    a3.q(account.name, erxeVar2, erxeVar2.c);
                                }
                            } else {
                                for (Account account2 : (Account[]) b2.c()) {
                                    a3.p(account2, erxeVar2);
                                }
                            }
                        }
                        z = true;
                    } else if (i == 2) {
                        e(bqqaVar, aseu.LANGUAGEPROFILE_CRON_ONE_OFF_SETTINGS_UPLOAD);
                    }
                    byxs c = bqcn.c();
                    return c.n(c.a(a2, new bqdt(bqdv.a(), z), bqcn.b()));
                case 2:
                    e(bqqaVar, aseu.LANGUAGEPROFILE_CRON_ONE_OFF_PROFILE_DOWNLOAD);
                    byxs c2 = bqcn.c();
                    return c2.n(c2.a(a2, new bqeb(bqed.a()), bqcn.b()));
                case 3:
                    int i2 = a2.b;
                    if (i2 == 3) {
                        e(bqqaVar, aseu.LANGUAGEPROFILE_CRON_PERIODIC_WIPEOUT);
                    } else if (i2 == 2) {
                        e(bqqaVar, aseu.LANGUAGEPROFILE_CRON_ONE_OFF_WIPEOUT);
                    }
                    bywx l = bqcn.c().l(bqbxVar);
                    return l.a(l.b(new drbl() { // from class: bqdg
                        @Override // defpackage.drbl
                        public final enss a() {
                            int i3 = LanguageProfileGcmTaskChimeraService.a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                bqdv.a().r();
                            } catch (IOException e) {
                                arrayList.add(e);
                            }
                            try {
                                List asList = Arrays.asList((Account[]) bqcs.b().e(new Account[0]));
                                eijr eijrVar2 = bqca.a;
                                dxbq dxbqVar = new dxbq();
                                dxbqVar.a = bqca.a();
                                Context a4 = AppContextProvider.a();
                                Pattern pattern = dxbo.a;
                                dxbn dxbnVar = new dxbn(a4);
                                dxbnVar.j();
                                dxbnVar.e("languageprofile");
                                dxbqVar.c(dxbnVar.a());
                                dxbqVar.b(asList);
                                dxbqVar.a().a();
                            } catch (IOException e2) {
                                arrayList.add(e2);
                            }
                            if (arrayList.isEmpty()) {
                                return ensm.a;
                            }
                            throw bqcw.a("Exception in the wipeout task", arrayList);
                        }
                    }, i2, bqcn.b()), i2);
                case 4:
                    e(bqqaVar, aseu.LANGUAGEPROFILE_CRON_PERIODIC_CLEANUP);
                    bywx l2 = bqcn.c().l(bqbxVar);
                    drbl drblVar = new drbl() { // from class: bqdi
                        @Override // defpackage.drbl
                        public final enss a() {
                            int i3 = LanguageProfileGcmTaskChimeraService.a;
                            bqdv a4 = bqdv.a();
                            eiid b3 = bqcs.b();
                            if (b3.h()) {
                                for (Account account3 : (Account[]) b3.c()) {
                                    a4.m(account3);
                                }
                            }
                            return ensm.a;
                        }
                    };
                    int i3 = a2.b;
                    return l2.a(l2.b(drblVar, i3, bqcn.b()), i3);
                case 5:
                    bywx l3 = bqcn.c().l(bqbxVar);
                    drbl drblVar2 = new drbl() { // from class: bqdf
                        @Override // defpackage.drbl
                        public final enss a() {
                            int i4 = LanguageProfileGcmTaskChimeraService.a;
                            bqdv a4 = bqdv.a();
                            if (fpjy.h() && fpjy.i()) {
                                eiid b3 = bqcs.b();
                                if (b3.h()) {
                                    eiuv eiuvVar = new eiuv();
                                    for (Account account3 : (Account[]) b3.c()) {
                                        erwl g = a4.g(account3.name);
                                        for (erxe erxeVar3 : DesugarCollections.unmodifiableList(((erwm) g.b).b)) {
                                            eiuvVar.b(erxeVar3.c, erxeVar3);
                                        }
                                        String str = account3.name;
                                        fecj v = erwo.a.v();
                                        boolean z3 = ((erwm) g.b).c;
                                        if (!v.b.L()) {
                                            v.U();
                                        }
                                        fecp fecpVar = v.b;
                                        ((erwo) fecpVar).b = z3;
                                        long j = ((erwm) g.b).d;
                                        if (!fecpVar.L()) {
                                            v.U();
                                        }
                                        ((erwo) v.b).c = j;
                                        a4.n(str, (erwo) v.Q());
                                    }
                                    eiuy a5 = eiuvVar.a();
                                    ejfg listIterator = a5.z().listIterator();
                                    while (listIterator.hasNext()) {
                                        String str2 = (String) listIterator.next();
                                        eiuu g2 = a5.g(str2);
                                        if (g2.size() > 1) {
                                            ((ejhf) bqdv.a.j()).B("Found differing language settings for application %s", str2);
                                        }
                                        fecj v2 = erwn.a.v();
                                        erxe erxeVar4 = (erxe) g2.listIterator().next();
                                        if (!v2.b.L()) {
                                            v2.U();
                                        }
                                        erwn erwnVar = (erwn) v2.b;
                                        erxeVar4.getClass();
                                        erwnVar.c = erxeVar4;
                                        erwnVar.b |= 1;
                                        a4.o(str2, (erwn) v2.Q());
                                    }
                                }
                            }
                            return ensm.a;
                        }
                    };
                    int i4 = a2.b;
                    return l3.a(l3.b(drblVar2, i4, bqcn.b()), i4);
                case 6:
                    bywx l4 = bqcn.c().l(bqbxVar);
                    drbl drblVar3 = new drbl() { // from class: bqdh
                        @Override // defpackage.drbl
                        public final enss a() {
                            int i5 = LanguageProfileGcmTaskChimeraService.a;
                            bqdv a4 = bqdv.a();
                            if (fpjy.g()) {
                                eiid b3 = bqcs.b();
                                if (b3.h()) {
                                    bxdd c3 = a4.b().c();
                                    for (Account account3 : (Account[]) b3.c()) {
                                        c3.j(account3.name);
                                    }
                                    bxdg.g(c3);
                                }
                            }
                            return ensm.a;
                        }
                    };
                    int i5 = a2.b;
                    return l4.a(l4.b(drblVar3, i5, bqcn.b()), i5);
            }
        }
        return 0;
    }
}
