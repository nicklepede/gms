package com.google.android.gms.languageprofile.service;

import android.content.Intent;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bskl;
import defpackage.bsll;
import defpackage.bslt;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.ekvi;
import defpackage.elpp;
import defpackage.eluo;
import defpackage.fsdp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LanguageProfileChimeraService extends bzot {
    private static final ausn a = ausn.b("LanguageProfileChimeraService", auid.LANGUAGE_PROFILE);

    public LanguageProfileChimeraService() {
        super(167, "com.google.android.gms.languageprofile.service.START", elpp.a, 2, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new bskl(l(), getServiceRequest.f, getServiceRequest.p));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        bslt.a();
        if (fsdp.e()) {
            bsll.a();
        }
        ekvi a2 = AccountsChangedIntentOperation.a(AppContextProvider.a());
        if (a2.h()) {
            AppContextProvider.a().startService((Intent) a2.c());
        } else {
            ((eluo) a.i()).x("AccountsChangedIntentOperation could not be fired due to null intent.");
        }
    }
}
