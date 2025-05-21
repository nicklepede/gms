package com.google.android.gms.auth.api.signin.service;

import com.google.android.gms.auth.api.signin.service.SignInChimeraService;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arxo;
import defpackage.bmfw;
import defpackage.bmgp;
import defpackage.bmgr;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.dcow;
import defpackage.eiiw;
import defpackage.eito;
import defpackage.eits;
import defpackage.fsbx;
import defpackage.zpt;
import defpackage.zpz;
import defpackage.zqa;
import defpackage.zqf;
import j$.util.Objects;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SignInChimeraService extends bxgd {
    public static final arxo a = new arxo("Auth.Api.SignIn", "Service", "SignInChimeraService");
    public static final eits b;

    static {
        eito eitoVar = new eito();
        eitoVar.i(zqf.class, bmfw.AUTH_API_SIGNIN_SILENT_SIGNIN);
        eitoVar.i(zqa.class, bmfw.AUTH_API_SIGNIN_SIGN_OUT);
        eitoVar.i(zpz.class, bmfw.AUTH_API_SIGNIN_REVOKE_ACCESS);
        b = eitoVar.b();
    }

    public SignInChimeraService() {
        super(91, "com.google.android.gms.auth.api.signin.service.START", Collections.EMPTY_SET, 3, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgo l = l();
        final zpt zptVar = new zpt(this, getServiceRequest.f, getServiceRequest.h, dcow.a(getServiceRequest.i).b(), l, bmgp.b(this, null));
        Objects.requireNonNull(zptVar);
        bmgr.c(l, new eiiw() { // from class: zqh
            @Override // defpackage.eiiw
            public final void lB(Object obj) {
                bmgs bmgsVar = (bmgs) obj;
                bmfw bmfwVar = (bmfw) SignInChimeraService.b.get(bmgsVar.a.getClass());
                arwm.s(bmfwVar);
                zpt zptVar2 = zpt.this;
                zptVar2.b.a(bmgw.a(bmfwVar, bmgsVar, zptVar2.a));
            }
        });
        if (fsbx.a.a().b()) {
            a.m(fsbx.a.a().a(), new Object[0]);
        }
        bxgjVar.c(zptVar);
    }
}
