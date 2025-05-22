package com.google.android.gms.adsidentity.init;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.adsidentity.service.AdsidentityMendelPropertyUpdateService;
import com.google.android.gms.chimera.modules.adsidentity.AppContextProvider;
import defpackage.apzs;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.fmqy;
import defpackage.vah;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AdServicesBackCompatModuleInitIntentOperation extends apzs {
    private Context a;
    private vah b;

    public AdServicesBackCompatModuleInitIntentOperation() {
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (fmqy.p()) {
            Log.i("adservices", "Register privacy sandbox mendel properties by handle intent");
            this.b.b();
        }
        if (fmqy.a.lK().l()) {
            Context context = this.a;
            int i2 = AdsidentityMendelPropertyUpdateService.a;
            Log.i("adservices", "Schedule privacy sandbox mendel properties daily job");
            cate cateVar = new cate();
            cateVar.w(AdsidentityMendelPropertyUpdateService.class.getName());
            cateVar.t("adservices");
            cateVar.j(cata.EVERY_DAY);
            cateVar.v(0);
            cateVar.p = true;
            cateVar.y(2, 2);
            casd.a(context).f(cateVar.b());
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        Context a = AppContextProvider.a();
        this.a = a;
        this.b = vah.a(a);
    }

    AdServicesBackCompatModuleInitIntentOperation(Context context, vah vahVar) {
        this.a = context;
        this.b = vahVar;
    }
}
