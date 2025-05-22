package com.google.android.gms.auth.api.signin.service;

import com.google.android.gms.auth.api.signin.service.SignInChimeraService;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.abpt;
import defpackage.abpz;
import defpackage.abqa;
import defpackage.abqf;
import defpackage.auad;
import defpackage.bomo;
import defpackage.bonh;
import defpackage.bonj;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.dfab;
import defpackage.ekwb;
import defpackage.elgt;
import defpackage.elgx;
import defpackage.fuwt;
import j$.util.Objects;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SignInChimeraService extends bzot {
    public static final auad a = new auad("Auth.Api.SignIn", "Service", "SignInChimeraService");
    public static final elgx b;

    static {
        elgt elgtVar = new elgt();
        elgtVar.i(abqf.class, bomo.AUTH_API_SIGNIN_SILENT_SIGNIN);
        elgtVar.i(abqa.class, bomo.AUTH_API_SIGNIN_SIGN_OUT);
        elgtVar.i(abpz.class, bomo.AUTH_API_SIGNIN_REVOKE_ACCESS);
        b = elgtVar.b();
    }

    public SignInChimeraService() {
        super(91, "com.google.android.gms.auth.api.signin.service.START", Collections.EMPTY_SET, 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzpe l = l();
        final abpt abptVar = new abpt(this, getServiceRequest.f, getServiceRequest.h, dfab.a(getServiceRequest.i).b(), l, bonh.b(this, null));
        Objects.requireNonNull(abptVar);
        bonj.c(l, new ekwb() { // from class: abqh
            @Override // defpackage.ekwb
            public final void lY(Object obj) {
                bonk bonkVar = (bonk) obj;
                bomo bomoVar = (bomo) SignInChimeraService.b.get(bonkVar.a.getClass());
                atzb.s(bomoVar);
                abpt abptVar2 = abpt.this;
                abptVar2.b.a(bono.a(bomoVar, bonkVar, abptVar2.a));
            }
        });
        fuwt fuwtVar = fuwt.a;
        if (fuwtVar.lK().b()) {
            a.m(fuwtVar.lK().a(), new Object[0]);
        }
        bzozVar.c(abptVar);
    }
}
