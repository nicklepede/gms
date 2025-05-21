package com.google.android.gms.languageprofile.service;

import android.content.Intent;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asej;
import defpackage.asot;
import defpackage.bqcv;
import defpackage.bqdv;
import defpackage.bqed;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eiid;
import defpackage.ejck;
import defpackage.ejhf;
import defpackage.fpjy;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class LanguageProfileChimeraService extends bxgd {
    private static final asot a = asot.b("LanguageProfileChimeraService", asej.LANGUAGE_PROFILE);

    public LanguageProfileChimeraService() {
        super(167, "com.google.android.gms.languageprofile.service.START", ejck.a, 2, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new bqcv(l(), getServiceRequest.f, getServiceRequest.p));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        bqed.a();
        if (fpjy.e()) {
            bqdv.a();
        }
        eiid a2 = AccountsChangedIntentOperation.a(AppContextProvider.a());
        if (a2.h()) {
            AppContextProvider.a().startService((Intent) a2.c());
        } else {
            ((ejhf) a.i()).x("AccountsChangedIntentOperation could not be fired due to null intent.");
        }
    }
}
