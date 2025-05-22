package com.google.android.gms.auth.account.data;

import android.content.Context;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.acni;
import defpackage.asxe;
import defpackage.auwr;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elpp;
import defpackage.wwc;
import defpackage.wwh;
import defpackage.xda;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GoogleAuthChimeraService extends bzot {
    public static final /* synthetic */ int a = 0;

    public GoogleAuthChimeraService() {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, "com.google.android.gms.auth.account.authapi.START", elpp.a, 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        Context a2 = AppContextProvider.a();
        bzozVar.c(new xda(l(), new acni() { // from class: xcd
            @Override // defpackage.acni
            public final Object a(Object obj) {
                throw null;
            }
        }, asxe.d(a2), (wwh) wwh.a.b(), (wwc) wwc.a.b(), auwr.b(a2)));
    }
}
