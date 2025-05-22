package com.google.android.gms.signin.service;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asxd;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auum;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dfab;
import defpackage.dffh;
import defpackage.ekvl;
import defpackage.elpp;
import defpackage.eluo;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SignInInternalBrokerChimeraService extends bzot {
    private static final ausn a = ausn.b("SignInInternalBrokerSrv", auid.SIGNIN);

    public SignInInternalBrokerChimeraService() {
        super(44, "com.google.android.gms.signin.service.INTERNAL_START", elpp.a, 1, 9);
        setWantIntentExtras(true);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.gms.signin.service.INTERNAL_START".equals(intent.getAction())) {
            ((eluo) ((eluo) a.i()).ai((char) 10893)).B("request for unknown service %s", intent.getAction());
            return null;
        }
        String stringExtra = intent.getStringExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.PACKAGE_NAME");
        ekvl.y(stringExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.SIGNIN_OPTIONS");
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.SCOPES");
        ekvl.y(stringArrayExtra);
        Set b = auum.b(stringArrayExtra);
        int intExtra = intent.getIntExtra("com.google.android.gms.signin.service.SignInInternalBrokerService.CALLING_UID", 0);
        int i = asxd.c;
        return new dffh(this, stringExtra, b, intExtra, (Account) bundleExtra.getParcelable("com.google.android.gms.signin.internal.clientRequestedAccount"), dfab.a(bundleExtra).b(), l());
    }
}
