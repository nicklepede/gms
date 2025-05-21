package com.google.android.gms.adsidentity.init;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.adsidentity.service.AdsidentityMendelPropertyUpdateService;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import defpackage.anya;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.fkas;
import defpackage.teh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AdServicesBackCompatModuleInitIntentOperation extends anya {
    private Context a;
    private teh b;

    public AdServicesBackCompatModuleInitIntentOperation() {
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (fkas.p()) {
            Log.i("adservices", "Register privacy sandbox mendel properties by handle intent");
            this.b.b();
        }
        if (fkas.a.a().l()) {
            Context context = this.a;
            int i2 = AdsidentityMendelPropertyUpdateService.a;
            Log.i("adservices", "Schedule privacy sandbox mendel properties daily job");
            bykm bykmVar = new bykm();
            bykmVar.w(AdsidentityMendelPropertyUpdateService.class.getName());
            bykmVar.t("adservices");
            bykmVar.j(byki.EVERY_DAY);
            bykmVar.v(0);
            bykmVar.p = true;
            bykmVar.y(2, 2);
            byjl.a(context).f(bykmVar.b());
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        Context a = AppContextProvider.a();
        this.a = a;
        this.b = teh.a(a);
    }

    AdServicesBackCompatModuleInitIntentOperation(Context context, teh tehVar) {
        this.a = context;
        this.b = tehVar;
    }
}
