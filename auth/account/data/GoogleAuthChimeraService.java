package com.google.android.gms.auth.account.data;

import android.content.Context;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aani;
import defpackage.aqup;
import defpackage.assx;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.ejck;
import defpackage.vac;
import defpackage.vah;
import defpackage.vgz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GoogleAuthChimeraService extends bxgd {
    public static final /* synthetic */ int a = 0;

    public GoogleAuthChimeraService() {
        super(AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, "com.google.android.gms.auth.account.authapi.START", ejck.a, 3, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        Context a2 = AppContextProvider.a();
        bxgjVar.c(new vgz(l(), new aani() { // from class: vgc
            @Override // defpackage.aani
            public final Object a(Object obj) {
                throw null;
            }
        }, aqup.d(a2), (vah) vah.a.b(), (vac) vac.a.b(), assx.b(a2)));
    }
}
