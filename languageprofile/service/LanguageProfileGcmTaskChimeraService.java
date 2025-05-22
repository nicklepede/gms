package com.google.android.gms.languageprofile.service;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import com.google.android.gms.languageprofile.service.LanguageProfileGcmTaskChimeraService;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.athr;
import defpackage.auid;
import defpackage.auio;
import defpackage.ausn;
import defpackage.bsjn;
import defpackage.bskd;
import defpackage.bski;
import defpackage.bslj;
import defpackage.bsll;
import defpackage.bslr;
import defpackage.bslt;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.casd;
import defpackage.cauf;
import defpackage.cbfo;
import defpackage.cbgj;
import defpackage.dtlq;
import defpackage.dtlt;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.ekww;
import defpackage.elkk;
import defpackage.eluo;
import defpackage.eumq;
import defpackage.eumr;
import defpackage.fsdp;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LanguageProfileGcmTaskChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("LPGcmTaskChimeraService", auid.LANGUAGE_PROFILE);

    static void d(casd casdVar, cbgj cbgjVar) {
        if (fsdp.e()) {
            ((eluo) b.h()).x("Scheduling sync task.");
            cbgjVar.j();
            return;
        }
        ((eluo) b.h()).x("Unscheduling sync tasks.");
        casdVar.d("languageprofile.StoreLanguageSettingsByClientIdPeriodicTask", "com.google.android.gms.languageprofile.GcmTaskService");
        casdVar.d("languageprofile.SyncPeriodicUploadTask", "com.google.android.gms.languageprofile.GcmTaskService");
        casdVar.d("languageprofile.SyncPeriodicWipeoutTask", "com.google.android.gms.languageprofile.GcmTaskService");
        casdVar.d("languageprofile.CleanupPeriodicTask", "com.google.android.gms.languageprofile.GcmTaskService");
    }

    private static void e(bsxr bsxrVar, auio auioVar) {
        if (bsxrVar != null) {
            bsxr.a(auioVar);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        bsxr bsxrVar;
        boolean z = false;
        z = false;
        if (fsdp.e()) {
            if (athr.b()) {
                AppContextProvider.a();
                ekww ekwwVar = bsxv.a;
                bsxrVar = new bsxr();
            } else {
                bsxrVar = null;
            }
            dtlq a2 = bskd.a().a(caufVar.a);
            bsjn bsjnVar = (bsjn) a2.a;
            switch (bsjnVar.ordinal()) {
                case 1:
                    int i = a2.b;
                    if (i == 3) {
                        e(bsxrVar, auio.LANGUAGEPROFILE_CRON_PERIODIC_SETTINGS_UPLOAD);
                        List h = elkk.h(bski.c(), new ekut() { // from class: bskz
                            @Override // defpackage.ekut
                            public final Object apply(Object obj) {
                                int i2 = LanguageProfileGcmTaskChimeraService.a;
                                return eulk.b((Locale) obj, true);
                            }
                        });
                        eumq eumqVar = (eumq) eumr.a.v();
                        eumqVar.a(h);
                        String d = fsdp.d();
                        if (!eumqVar.b.L()) {
                            eumqVar.U();
                        }
                        ((eumr) eumqVar.b).c = d;
                        boolean z2 = Build.VERSION.SDK_INT < 24;
                        if (!eumqVar.b.L()) {
                            eumqVar.U();
                        }
                        ((eumr) eumqVar.b).d = z2;
                        eumr eumrVar = (eumr) eumqVar.Q();
                        bsll a3 = bsll.a();
                        ekvi b2 = bski.b();
                        if (b2.h()) {
                            if (fsdp.a.lK().m()) {
                                for (Account account : (Account[]) b2.c()) {
                                    a3.q(account.name, eumrVar, eumrVar.c);
                                }
                            } else {
                                for (Account account2 : (Account[]) b2.c()) {
                                    a3.p(account2, eumrVar);
                                }
                            }
                        }
                        z = true;
                    } else if (i == 2) {
                        e(bsxrVar, auio.LANGUAGEPROFILE_CRON_ONE_OFF_SETTINGS_UPLOAD);
                    }
                    cbgj c = bskd.c();
                    return c.n(c.a(a2, new bslj(bsll.a(), z), bskd.b()));
                case 2:
                    e(bsxrVar, auio.LANGUAGEPROFILE_CRON_ONE_OFF_PROFILE_DOWNLOAD);
                    cbgj c2 = bskd.c();
                    return c2.n(c2.a(a2, new bslr(bslt.a()), bskd.b()));
                case 3:
                    int i2 = a2.b;
                    if (i2 == 3) {
                        e(bsxrVar, auio.LANGUAGEPROFILE_CRON_PERIODIC_WIPEOUT);
                    } else if (i2 == 2) {
                        e(bsxrVar, auio.LANGUAGEPROFILE_CRON_ONE_OFF_WIPEOUT);
                    }
                    cbfo l = bskd.c().l(bsjnVar);
                    return l.a(l.b(new dtlt() { // from class: bskw
                        @Override // defpackage.dtlt
                        public final eqgl a() {
                            int i3 = LanguageProfileGcmTaskChimeraService.a;
                            ArrayList arrayList = new ArrayList();
                            try {
                                bsll.a().r();
                            } catch (IOException e) {
                                arrayList.add(e);
                            }
                            try {
                                List asList = Arrays.asList((Account[]) bski.b().e(new Account[0]));
                                ekww ekwwVar2 = bsjq.a;
                                dznq dznqVar = new dznq();
                                dznqVar.a = bsjq.a();
                                Context a4 = AppContextProvider.a();
                                Pattern pattern = dzno.a;
                                dznn dznnVar = new dznn(a4);
                                dznnVar.j();
                                dznnVar.e("languageprofile");
                                dznqVar.c(dznnVar.a());
                                dznqVar.b(asList);
                                dznqVar.a().a();
                            } catch (IOException e2) {
                                arrayList.add(e2);
                            }
                            if (arrayList.isEmpty()) {
                                return eqgf.a;
                            }
                            throw bskm.a("Exception in the wipeout task", arrayList);
                        }
                    }, i2, bskd.b()), i2);
                case 4:
                    e(bsxrVar, auio.LANGUAGEPROFILE_CRON_PERIODIC_CLEANUP);
                    cbfo l2 = bskd.c().l(bsjnVar);
                    dtlt dtltVar = new dtlt() { // from class: bsky
                        @Override // defpackage.dtlt
                        public final eqgl a() {
                            int i3 = LanguageProfileGcmTaskChimeraService.a;
                            bsll a4 = bsll.a();
                            ekvi b3 = bski.b();
                            if (b3.h()) {
                                for (Account account3 : (Account[]) b3.c()) {
                                    a4.m(account3);
                                }
                            }
                            return eqgf.a;
                        }
                    };
                    int i3 = a2.b;
                    return l2.a(l2.b(dtltVar, i3, bskd.b()), i3);
                case 5:
                    cbfo l3 = bskd.c().l(bsjnVar);
                    dtlt dtltVar2 = new dtlt() { // from class: bskv
                        @Override // defpackage.dtlt
                        public final eqgl a() {
                            int i4 = LanguageProfileGcmTaskChimeraService.a;
                            bsll a4 = bsll.a();
                            if (fsdp.h() && fsdp.i()) {
                                ekvi b3 = bski.b();
                                if (b3.h()) {
                                    elia eliaVar = new elia();
                                    for (Account account3 : (Account[]) b3.c()) {
                                        euly g = a4.g(account3.name);
                                        for (eumr eumrVar2 : DesugarCollections.unmodifiableList(((eulz) g.b).b)) {
                                            eliaVar.b(eumrVar2.c, eumrVar2);
                                        }
                                        String str = account3.name;
                                        fgrc v = eumb.a.v();
                                        boolean z3 = ((eulz) g.b).c;
                                        if (!v.b.L()) {
                                            v.U();
                                        }
                                        fgri fgriVar = v.b;
                                        ((eumb) fgriVar).b = z3;
                                        long j = ((eulz) g.b).d;
                                        if (!fgriVar.L()) {
                                            v.U();
                                        }
                                        ((eumb) v.b).c = j;
                                        a4.n(str, (eumb) v.Q());
                                    }
                                    elid a5 = eliaVar.a();
                                    elsn listIterator = a5.z().listIterator();
                                    while (listIterator.hasNext()) {
                                        String str2 = (String) listIterator.next();
                                        elhz g2 = a5.g(str2);
                                        if (g2.size() > 1) {
                                            ((eluo) bsll.a.j()).B("Found differing language settings for application %s", str2);
                                        }
                                        fgrc v2 = euma.a.v();
                                        eumr eumrVar3 = (eumr) g2.listIterator().next();
                                        if (!v2.b.L()) {
                                            v2.U();
                                        }
                                        euma eumaVar = (euma) v2.b;
                                        eumrVar3.getClass();
                                        eumaVar.c = eumrVar3;
                                        eumaVar.b |= 1;
                                        a4.o(str2, (euma) v2.Q());
                                    }
                                }
                            }
                            return eqgf.a;
                        }
                    };
                    int i4 = a2.b;
                    return l3.a(l3.b(dtltVar2, i4, bskd.b()), i4);
                case 6:
                    cbfo l4 = bskd.c().l(bsjnVar);
                    dtlt dtltVar3 = new dtlt() { // from class: bskx
                        @Override // defpackage.dtlt
                        public final eqgl a() {
                            int i5 = LanguageProfileGcmTaskChimeraService.a;
                            bsll a4 = bsll.a();
                            if (fsdp.g()) {
                                ekvi b3 = bski.b();
                                if (b3.h()) {
                                    bzlt c3 = a4.b().c();
                                    for (Account account3 : (Account[]) b3.c()) {
                                        c3.j(account3.name);
                                    }
                                    bzlw.g(c3);
                                }
                            }
                            return eqgf.a;
                        }
                    };
                    int i5 = a2.b;
                    return l4.a(l4.b(dtltVar3, i5, bskd.b()), i5);
            }
        }
        return 0;
    }
}
