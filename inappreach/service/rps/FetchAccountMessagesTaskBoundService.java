package com.google.android.gms.inappreach.service.rps;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.inappreach.service.rps.FetchAccountMessagesTaskBoundService;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.bqho;
import defpackage.bqhv;
import defpackage.bqiu;
import defpackage.bqla;
import defpackage.cauf;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.ewbd;
import defpackage.fgrc;
import defpackage.fryl;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class FetchAccountMessagesTaskBoundService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.inappreach.service.rps.FetchAccountMessagesTaskBoundService";
    private static final String b = "com.google.android.gms.inappreach.service.rps.FetchAccountMessagesTaskBoundService";
    private static final ausn c = ausn.b(FetchAccountMessagesTaskBoundService.class.getName(), auid.INAPP_REACH);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        Context applicationContext = getApplicationContext();
        if (!fryl.e()) {
            return 2;
        }
        final List<Account> h = auqx.h(applicationContext, applicationContext.getPackageName());
        try {
            ((eqcy) ((bqhv) bqiu.d().c().a()).d(new ekut() { // from class: bqlb
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    bqhi bqhiVar = (bqhi) obj;
                    String str = FetchAccountMessagesTaskBoundService.a;
                    HashSet<String> hashSet = new HashSet(DesugarCollections.unmodifiableMap(bqhiVar.b).keySet());
                    Iterator it = h.iterator();
                    while (it.hasNext()) {
                        hashSet.remove(((Account) it.next()).name);
                    }
                    fgrc fgrcVar = (fgrc) bqhiVar.iQ(5, null);
                    fgrcVar.X(bqhiVar);
                    bqhh bqhhVar = (bqhh) fgrcVar;
                    for (String str2 : hashSet) {
                        str2.getClass();
                        if (!bqhhVar.b.L()) {
                            bqhhVar.U();
                        }
                        ((bqhi) bqhhVar.b).b().remove(str2);
                    }
                    return (bqhi) bqhhVar.Q();
                }
            })).u();
            for (Account account : h) {
                fgrc v = bqho.a.v();
                String str = account.name;
                if (!v.b.L()) {
                    v.U();
                }
                bqho bqhoVar = (bqho) v.b;
                str.getClass();
                bqhoVar.c = str;
                fgrc v2 = ewbd.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                ewbd ewbdVar = (ewbd) v2.b;
                ewbdVar.c = 3;
                ewbdVar.b |= 1;
                ewbd ewbdVar2 = (ewbd) v2.Q();
                if (!v.b.L()) {
                    v.U();
                }
                bqho bqhoVar2 = (bqho) v.b;
                ewbdVar2.getClass();
                bqhoVar2.d = ewbdVar2;
                bqhoVar2.b |= 1;
                String packageName = applicationContext.getPackageName();
                if (!v.b.L()) {
                    v.U();
                }
                bqho bqhoVar3 = (bqho) v.b;
                packageName.getClass();
                bqhoVar3.b |= 2;
                bqhoVar3.e = packageName;
                new bqla((bqho) v.Q(), null).f(applicationContext);
            }
            return 0;
        } catch (InterruptedException | ExecutionException e) {
            ((eluo) ((eluo) ((eluo) c.j()).s(e)).ai((char) 5213)).x("Periodic fetch account messages task failed.");
            return 1;
        }
    }
}
