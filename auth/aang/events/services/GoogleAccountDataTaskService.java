package com.google.android.gms.auth.aang.events.services;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.atzb;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bsup;
import defpackage.buco;
import defpackage.cauf;
import defpackage.dzwm;
import defpackage.ekut;
import defpackage.elcq;
import defpackage.elgo;
import defpackage.elgx;
import defpackage.eluo;
import defpackage.emlk;
import defpackage.emll;
import defpackage.emsm;
import defpackage.emsn;
import defpackage.eqex;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fmyw;
import defpackage.wmf;
import defpackage.wmj;
import defpackage.wmv;
import defpackage.wpw;
import defpackage.wqo;
import defpackage.xik;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GoogleAccountDataTaskService extends GmsTaskBoundService {
    public static final ausn a = ausn.c("Auth", auid.GOOGLE_AUTH_AANG, "GoogleAccountDataTaskService");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        char c;
        boolean z;
        String str = caufVar.a;
        int hashCode = str.hashCode();
        if (hashCode != -149605000) {
            if (hashCode == 1680148371 && str.equals("TASK_MIGRATE_ACCOUNT_LSTS_TO_APP_DATA")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("TASK_COMPARE_WITH_ACCOUNTS_SNAPSHOT")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            try {
                if (fmyw.e()) {
                    dzwm dzwmVar = ((wmf) wmf.a.b()).b;
                    xik xikVar = (xik) wpw.a(dzwmVar.a());
                    if (xikVar != null && !xikVar.b.isEmpty()) {
                        wmv wmvVar = (wmv) wmv.a.b();
                        elgx elgxVar = (elgx) Collection.EL.stream(wmvVar.e("com.google")).collect(elcq.a(new wqo(), new Function() { // from class: wqp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo479andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return wmv.b((GoogleAccount) obj);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }));
                        for (String str2 : xikVar.b) {
                            boolean containsKey = elgxVar.containsKey(str2);
                            if (containsKey) {
                                Account account = (Account) elgxVar.get(str2);
                                atzb.s(account);
                                z = !TextUtils.isEmpty(wmvVar.i(account));
                            } else {
                                z = false;
                            }
                            buco v = buco.v();
                            fgrc v2 = emll.a.v();
                            emlk emlkVar = emlk.LST_MIGRATION_EVENT;
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            emll emllVar = (emll) v2.b;
                            emllVar.e = emlkVar.ar;
                            emllVar.b |= 1;
                            fgrc v3 = emsn.a.v();
                            fgrc v4 = emsm.a.v();
                            if (!v4.b.L()) {
                                v4.U();
                            }
                            fgri fgriVar = v4.b;
                            emsm emsmVar = (emsm) fgriVar;
                            emsmVar.b |= 1;
                            emsmVar.c = containsKey;
                            if (!fgriVar.L()) {
                                v4.U();
                            }
                            emsm emsmVar2 = (emsm) v4.b;
                            emsmVar2.b |= 2;
                            emsmVar2.d = z;
                            if (!v3.b.L()) {
                                v3.U();
                            }
                            emsn emsnVar = (emsn) v3.b;
                            emsm emsmVar3 = (emsm) v4.Q();
                            emsmVar3.getClass();
                            emsnVar.c = emsmVar3;
                            emsnVar.b |= 2;
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            emll emllVar2 = (emll) v2.b;
                            emsn emsnVar2 = (emsn) v3.Q();
                            emsnVar2.getClass();
                            emllVar2.al = emsnVar2;
                            emllVar2.d |= 64;
                            v.f((emll) v2.Q());
                        }
                        try {
                            wpw.a(dzwmVar.b(new ekut() { // from class: wmc
                                @Override // defpackage.ekut
                                public final Object apply(Object obj) {
                                    xik xikVar2 = (xik) obj;
                                    fgrc fgrcVar = (fgrc) xikVar2.iQ(5, null);
                                    fgrcVar.X(xikVar2);
                                    if (!fgrcVar.b.L()) {
                                        fgrcVar.U();
                                    }
                                    xik xikVar3 = (xik) fgrcVar.b;
                                    xik xikVar4 = xik.a;
                                    xikVar3.b = fgtj.a;
                                    return (xik) fgrcVar.Q();
                                }
                            }, eqex.a));
                        } catch (IOException e) {
                            ((eluo) ((eluo) ((eluo) a.j()).s(e)).ai((char) 484)).x("Failed to clear snapshot after comparison");
                        }
                    }
                    ((eluo) ((eluo) a.h()).ai((char) 483)).x("No accounts snapshot found.");
                } else {
                    ((eluo) ((eluo) a.h()).ai((char) 486)).x("Snapshot comparison is disabled.");
                }
            } catch (IOException e2) {
                ((eluo) ((eluo) ((eluo) a.j()).s(e2)).ai((char) 491)).x("Failed to compare against accounts snapshot.");
                return 1;
            }
        } else if (c != 1) {
            ((eluo) ((eluo) a.j()).ai(490)).B("Unknown tag: %s", caufVar.a);
        } else if (fmyw.c()) {
            bsup b = bsup.b(AppContextProvider.a());
            wmv wmvVar2 = (wmv) wmv.a.b();
            elgo e3 = wmvVar2.e("com.google");
            int size = e3.size();
            for (int i = 0; i < size; i++) {
                GoogleAccount googleAccount = (GoogleAccount) e3.get(i);
                Account b2 = wmv.b(googleAccount);
                String c2 = b.c(b2);
                if (!TextUtils.isEmpty(c2)) {
                    try {
                        if (((wmj) wmj.a.b()).a(googleAccount) == null) {
                            ((eluo) ((eluo) a.h()).ai(487)).x("Migrating LST from AccountManager to app data.");
                            wmvVar2.o(b2, c2);
                        }
                    } catch (IOException e4) {
                        ((eluo) ((eluo) ((eluo) a.j()).s(e4)).ai((char) 488)).x("IOException when migrating LST to app data.");
                    }
                }
            }
        } else {
            ((eluo) ((eluo) a.h()).ai((char) 489)).x("LST migration task is disabled");
        }
        return 0;
    }
}
