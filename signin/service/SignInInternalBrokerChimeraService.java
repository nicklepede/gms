package com.google.android.gms.signin.service;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aquo;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqs;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dcow;
import defpackage.dcuc;
import defpackage.eiig;
import defpackage.ejck;
import defpackage.ejhf;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SignInInternalBrokerChimeraService extends bxgd {
    private static final asot a = asot.b("SignInInternalBrokerSrv", asej.SIGNIN);

    public SignInInternalBrokerChimeraService() {
        super(44, "com.google.android.gms.signin.service.INTERNAL_START", ejck.a, 1, 9);
        setWantIntentExtras(true);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.signin.service.INTERNAL_START".equals(intent.getAction())) {
            ((ejhf) ((ejhf) a.i()).ah((char) 10890)).B("request for unknown service %s", intent.getAction());
            return null;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.PACKAGE_NAME");
        eiig.x(stringExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.SIGNIN_OPTIONS");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.SCOPES");
        eiig.x(stringArrayExtra);
        Set b = asqs.b(stringArrayExtra);
        int intExtra = intent.getIntExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.CALLING_UID", 0);
        int i = aquo.c;
        return new dcuc(this, stringExtra, b, intExtra, (Account) bundleExtra.getParcelable("com.google.android.gms.signin.internal.clientRequestedAccount"), dcow.a(bundleExtra).b(), l());
    }
}
