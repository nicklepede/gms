package com.google.android.gms.inappreach.service.rps;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.inappreach.service.rps.FetchAccountMessagesTaskBoundService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asnd;
import defpackage.asot;
import defpackage.boae;
import defpackage.boai;
import defpackage.bobg;
import defpackage.bodk;
import defpackage.byln;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.etll;
import defpackage.fecj;
import defpackage.fpfb;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class FetchAccountMessagesTaskBoundService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.inappreach.service.rps.FetchAccountMessagesTaskBoundService";
    private static final String b = "com.google.android.gms.inappreach.service.rps.FetchAccountMessagesTaskBoundService";
    private static final asot c = asot.b(FetchAccountMessagesTaskBoundService.class.getName(), asej.INAPP_REACH);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        Context applicationContext = getApplicationContext();
        if (!fpfb.d()) {
            return 2;
        }
        final List<Account> h = asnd.h(applicationContext, applicationContext.getPackageName());
        try {
            ((enpf) ((boai) bobg.c().b().a()).d(new eiho() { // from class: bodl
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    bnzy bnzyVar = (bnzy) obj;
                    String str = FetchAccountMessagesTaskBoundService.a;
                    HashSet<String> hashSet = new HashSet(DesugarCollections.unmodifiableMap(bnzyVar.b).keySet());
                    Iterator it = h.iterator();
                    while (it.hasNext()) {
                        hashSet.remove(((Account) it.next()).name);
                    }
                    fecj fecjVar = (fecj) bnzyVar.iB(5, null);
                    fecjVar.X(bnzyVar);
                    bnzx bnzxVar = (bnzx) fecjVar;
                    for (String str2 : hashSet) {
                        str2.getClass();
                        if (!bnzxVar.b.L()) {
                            bnzxVar.U();
                        }
                        ((bnzy) bnzxVar.b).b().remove(str2);
                    }
                    return (bnzy) bnzxVar.Q();
                }
            })).u();
            for (Account account : h) {
                fecj v = boae.a.v();
                String str = account.name;
                if (!v.b.L()) {
                    v.U();
                }
                boae boaeVar = (boae) v.b;
                str.getClass();
                boaeVar.c = str;
                fecj v2 = etll.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                etll etllVar = (etll) v2.b;
                etllVar.c = 3;
                etllVar.b |= 1;
                etll etllVar2 = (etll) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                boae boaeVar2 = (boae) v.b;
                etllVar2.getClass();
                boaeVar2.d = etllVar2;
                boaeVar2.b |= 1;
                String packageName = applicationContext.getPackageName();
                if (!v.b.L()) {
                    v.U();
                }
                boae boaeVar3 = (boae) v.b;
                packageName.getClass();
                boaeVar3.b |= 2;
                boaeVar3.e = packageName;
                new bodk((boae) v.Q(), null).f(applicationContext);
            }
            return 0;
        } catch (InterruptedException | ExecutionException e) {
            ((ejhf) ((ejhf) ((ejhf) c.j()).s(e)).ah((char) 5200)).x("Periodic fetch account messages task failed.");
            return 1;
        }
    }
}
