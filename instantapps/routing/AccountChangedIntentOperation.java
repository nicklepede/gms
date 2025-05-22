package com.google.android.gms.instantapps.routing;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.instantapps.AppContextProvider;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bqmv;
import defpackage.bqsj;
import defpackage.casd;
import defpackage.catb;
import defpackage.flap;
import defpackage.xgt;
import j$.util.Objects;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AccountChangedIntentOperation extends IntentOperation {
    static {
        ausn.b("AccChngedIntent", auid.INSTANT_APPS);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null && Objects.equals(intent.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE") && bqmv.a(this).r.a()) {
            bqsj bqsjVar = bqmv.a(this).c;
            Account a = bqsjVar.a();
            if (a != null) {
                Iterator it = xgt.c(intent).iterator();
                while (it.hasNext()) {
                    if (((Account) it.next()).name.equals(a.name)) {
                        bqsjVar.c();
                    }
                }
            }
            flap flapVar = flap.ONE_OFF_SYNC_AT_ACCOUNT_CHANGE;
            int i = DomainFilterUpdateChimeraService.f;
            casd a2 = casd.a(AppContextProvider.a());
            catb catbVar = new catb();
            catbVar.j = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
            catbVar.t(DomainFilterUpdateChimeraService.d(flapVar.a()));
            catbVar.x(0, 0);
            catbVar.y(0, 1);
            catbVar.e(15L, 120L);
            catbVar.v(1);
            a2.f(catbVar.b());
        }
    }
}
