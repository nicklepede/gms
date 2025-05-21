package com.google.android.gms.instantapps.routing;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.instantapps.AppContextProvider;
import defpackage.asej;
import defpackage.asot;
import defpackage.boff;
import defpackage.bokt;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.fiks;
import defpackage.vks;
import j$.util.Objects;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AccountChangedIntentOperation extends IntentOperation {
    static {
        asot.b("AccChngedIntent", asej.INSTANT_APPS);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent != null && Objects.equals(intent.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE") && boff.a(this).r.a()) {
            bokt boktVar = boff.a(this).c;
            Account a = boktVar.a();
            if (a != null) {
                Iterator it = vks.c(intent).iterator();
                while (it.hasNext()) {
                    if (((Account) it.next()).name.equals(a.name)) {
                        boktVar.c();
                    }
                }
            }
            fiks fiksVar = fiks.ONE_OFF_SYNC_AT_ACCOUNT_CHANGE;
            int i = DomainFilterUpdateChimeraService.f;
            byjl a2 = byjl.a(AppContextProvider.a());
            bykj bykjVar = new bykj();
            bykjVar.j = "com.google.android.gms.instantapps.routing.DomainFilterUpdateService";
            bykjVar.t(DomainFilterUpdateChimeraService.d(fiksVar.a()));
            bykjVar.x(0, 0);
            bykjVar.y(0, 1);
            bykjVar.e(15L, 120L);
            bykjVar.v(1);
            a2.f(bykjVar.b());
        }
    }
}
