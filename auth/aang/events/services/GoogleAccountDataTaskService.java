package com.google.android.gms.auth.aang.events.services;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.arwm;
import defpackage.asej;
import defpackage.asot;
import defpackage.bqna;
import defpackage.brut;
import defpackage.byln;
import defpackage.dxkm;
import defpackage.eiho;
import defpackage.eipl;
import defpackage.eitj;
import defpackage.eits;
import defpackage.ejhf;
import defpackage.ejxz;
import defpackage.ejya;
import defpackage.ekfa;
import defpackage.ekfb;
import defpackage.enre;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fkih;
import defpackage.uqg;
import defpackage.uqk;
import defpackage.uqw;
import defpackage.utx;
import defpackage.uup;
import defpackage.vmj;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GoogleAccountDataTaskService extends GmsTaskBoundService {
    public static final asot a = asot.c("Auth", asej.GOOGLE_AUTH_AANG, "GoogleAccountDataTaskService");

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        char c;
        boolean z;
        String str = bylnVar.a;
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
                if (fkih.e()) {
                    dxkm dxkmVar = ((uqg) uqg.a.b()).b;
                    vmj vmjVar = (vmj) utx.a(dxkmVar.a());
                    if (vmjVar != null && !vmjVar.b.isEmpty()) {
                        uqw uqwVar = (uqw) uqw.a.b();
                        eits eitsVar = (eits) Collection.EL.stream(uqwVar.e("com.google")).collect(eipl.a(new uup(), new Function() { // from class: uuq
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo464andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                return uqw.b((GoogleAccount) obj);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }));
                        for (String str2 : vmjVar.b) {
                            boolean containsKey = eitsVar.containsKey(str2);
                            if (containsKey) {
                                Account account = (Account) eitsVar.get(str2);
                                arwm.s(account);
                                z = !TextUtils.isEmpty(uqwVar.i(account));
                            } else {
                                z = false;
                            }
                            brut v = brut.v();
                            fecj v2 = ejya.a.v();
                            ejxz ejxzVar = ejxz.LST_MIGRATION_EVENT;
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            ejya ejyaVar = (ejya) v2.b;
                            ejyaVar.e = ejxzVar.aw;
                            ejyaVar.b |= 1;
                            fecj v3 = ekfb.a.v();
                            fecj v4 = ekfa.a.v();
                            if (!v4.b.L()) {
                                v4.U();
                            }
                            fecp fecpVar = v4.b;
                            ekfa ekfaVar = (ekfa) fecpVar;
                            ekfaVar.b |= 1;
                            ekfaVar.c = containsKey;
                            if (!fecpVar.L()) {
                                v4.U();
                            }
                            ekfa ekfaVar2 = (ekfa) v4.b;
                            ekfaVar2.b |= 2;
                            ekfaVar2.d = z;
                            if (!v3.b.L()) {
                                v3.U();
                            }
                            ekfb ekfbVar = (ekfb) v3.b;
                            ekfa ekfaVar3 = (ekfa) v4.Q();
                            ekfaVar3.getClass();
                            ekfbVar.c = ekfaVar3;
                            ekfbVar.b |= 2;
                            if (!v2.b.L()) {
                                v2.U();
                            }
                            ejya ejyaVar2 = (ejya) v2.b;
                            ekfb ekfbVar2 = (ekfb) v3.Q();
                            ekfbVar2.getClass();
                            ejyaVar2.al = ekfbVar2;
                            ejyaVar2.d |= 512;
                            v.f((ejya) v2.Q());
                        }
                        try {
                            utx.a(dxkmVar.b(new eiho() { // from class: uqd
                                @Override // defpackage.eiho
                                public final Object apply(Object obj) {
                                    vmj vmjVar2 = (vmj) obj;
                                    fecj fecjVar = (fecj) vmjVar2.iB(5, null);
                                    fecjVar.X(vmjVar2);
                                    if (!fecjVar.b.L()) {
                                        fecjVar.U();
                                    }
                                    vmj vmjVar3 = (vmj) fecjVar.b;
                                    vmj vmjVar4 = vmj.a;
                                    vmjVar3.b = feeq.a;
                                    return (vmj) fecjVar.Q();
                                }
                            }, enre.a));
                        } catch (IOException e) {
                            ((ejhf) ((ejhf) ((ejhf) a.j()).s(e)).ah((char) 484)).x("Failed to clear snapshot after comparison");
                        }
                    }
                    ((ejhf) ((ejhf) a.h()).ah((char) 483)).x("No accounts snapshot found.");
                } else {
                    ((ejhf) ((ejhf) a.h()).ah((char) 486)).x("Snapshot comparison is disabled.");
                }
            } catch (IOException e2) {
                ((ejhf) ((ejhf) ((ejhf) a.j()).s(e2)).ah((char) 491)).x("Failed to compare against accounts snapshot.");
                return 1;
            }
        } else if (c != 1) {
            ((ejhf) ((ejhf) a.j()).ah(490)).B("Unknown tag: %s", bylnVar.a);
        } else if (fkih.c()) {
            bqna b = bqna.b(AppContextProvider.a());
            uqw uqwVar2 = (uqw) uqw.a.b();
            eitj e3 = uqwVar2.e("com.google");
            int size = e3.size();
            for (int i = 0; i < size; i++) {
                GoogleAccount googleAccount = (GoogleAccount) e3.get(i);
                Account b2 = uqw.b(googleAccount);
                String c2 = b.c(b2);
                if (!TextUtils.isEmpty(c2)) {
                    try {
                        if (((uqk) uqk.a.b()).a(googleAccount) == null) {
                            ((ejhf) ((ejhf) a.h()).ah(487)).x("Migrating LST from AccountManager to app data.");
                            uqwVar2.o(b2, c2);
                        }
                    } catch (IOException e4) {
                        ((ejhf) ((ejhf) ((ejhf) a.j()).s(e4)).ah((char) 488)).x("IOException when migrating LST to app data.");
                    }
                }
            }
        } else {
            ((ejhf) ((ejhf) a.h()).ah((char) 489)).x("LST migration task is disabled");
        }
        return 0;
    }
}
