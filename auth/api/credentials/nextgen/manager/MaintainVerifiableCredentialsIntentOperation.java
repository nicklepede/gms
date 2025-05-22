package com.google.android.gms.auth.api.credentials.nextgen.manager;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.api.credentials.nextgen.service.MaintainVerifiableCredentialsService;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;
import defpackage.aaqy;
import defpackage.aatn;
import defpackage.aik;
import defpackage.aury;
import defpackage.auub;
import defpackage.bolc;
import defpackage.boqy;
import defpackage.casd;
import defpackage.catb;
import defpackage.catg;
import defpackage.catn;
import defpackage.fngo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class MaintainVerifiableCredentialsIntentOperation extends IntentOperation {
    private final Context a = AppContextProvider.a();

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fngo fngoVar = fngo.a;
        if (fngoVar.lK().d()) {
            Context context = this.a;
            if ((aury.j(context) || aury.m(context) || aury.f(context)) && auub.e()) {
                if (fngoVar.lK().c() || aik.c(context).b(33023) != 0) {
                    int i = MaintainVerifiableCredentialsService.a;
                    casd.a(AppContextProvider.a()).c(MaintainVerifiableCredentialsService.class.getName());
                    boqy boqyVar = (boqy) aaqy.a.lK();
                    boqyVar.f.add(new bolc(Exception.class).c(null));
                    ((aatn) boqyVar.B(new aaqy())).a();
                    return;
                }
                if (intent == null || intent.getAction() == null || !intent.getAction().equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE") || !(intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED") || intent.hasCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED"))) {
                    int i2 = MaintainVerifiableCredentialsService.a;
                    catg catgVar = new catg();
                    catgVar.w(MaintainVerifiableCredentialsService.class.getName());
                    catgVar.t("RecurringMaintainVerifiableCredentials");
                    catgVar.v(2);
                    catgVar.l(true);
                    catgVar.a = catn.l;
                    casd.a(AppContextProvider.a()).f(catgVar.b());
                    return;
                }
                int i3 = MaintainVerifiableCredentialsService.a;
                catb catbVar = new catb();
                catbVar.w(MaintainVerifiableCredentialsService.class.getName());
                catbVar.t("OneOffMaintainVerifiableCredentials");
                catbVar.v(2);
                catbVar.g(0);
                catbVar.e(0L, 1L);
                casd.a(AppContextProvider.a()).f(catbVar.b());
            }
        }
    }
}
