package com.google.android.gms.signin.service;

import android.accounts.Account;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asxe;
import defpackage.atzb;
import defpackage.auad;
import defpackage.auwr;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.dfab;
import defpackage.dfeq;
import defpackage.dffh;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SignInBrokerChimeraService extends bzot {
    private static final auad a = dfeq.b("SignInBrokerService");

    public SignInBrokerChimeraService() {
        super(44, "com.google.android.gms.signin.service.START", Collections.EMPTY_SET, 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        String str;
        String str2 = getServiceRequest.f;
        atzb.s(getServiceRequest.h);
        HashSet hashSet = new HashSet(Arrays.asList(getServiceRequest.h));
        int callingUid = Binder.getCallingUid();
        Bundle bundle = getServiceRequest.i;
        ClassLoader classLoader = BinderWrapper.class.getClassLoader();
        atzb.s(classLoader);
        bundle.setClassLoader(classLoader);
        String string = bundle.getString("com.google.android.gms.signin.internal.realClientPackageName");
        if (TextUtils.isEmpty(string)) {
            str = str2;
        } else {
            if (!asxe.d(this).i(callingUid)) {
                a.f("Caller is not a Google app!", new Object[0]);
                bzozVar.a(10, null);
                return;
            }
            try {
                callingUid = auwr.b(this).f(string, 0).applicationInfo.uid;
                str = string;
            } catch (PackageManager.NameNotFoundException unused) {
                a.f("Bad package name: ".concat(String.valueOf(string)), new Object[0]);
                bzozVar.a(10, null);
                return;
            }
        }
        int i = getServiceRequest.e;
        dffh dffhVar = new dffh(this, str, hashSet, callingUid, (Account) bundle.getParcelable("com.google.android.gms.signin.internal.clientRequestedAccount"), dfab.a(bundle).b(), l());
        Account a2 = getServiceRequest.a();
        if (a2 != null) {
            dffhVar.q(a2, hashSet);
        }
        bzozVar.c(dffhVar);
    }
}
