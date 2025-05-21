package com.google.android.gms.signin.service;

import android.accounts.Account;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aqup;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.assx;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.dcow;
import defpackage.dctl;
import defpackage.dcuc;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SignInBrokerChimeraService extends bxgd {
    private static final arxo a = dctl.b("SignInBrokerService");

    public SignInBrokerChimeraService() {
        super(44, "com.google.android.gms.signin.service.START", Collections.EMPTY_SET, 3, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        String str;
        String str2 = getServiceRequest.f;
        arwm.s(getServiceRequest.h);
        HashSet hashSet = new HashSet(Arrays.asList(getServiceRequest.h));
        int callingUid = Binder.getCallingUid();
        Bundle bundle = getServiceRequest.i;
        ClassLoader classLoader = BinderWrapper.class.getClassLoader();
        arwm.s(classLoader);
        bundle.setClassLoader(classLoader);
        String string = bundle.getString("com.google.android.gms.signin.internal.realClientPackageName");
        if (TextUtils.isEmpty(string)) {
            str = str2;
        } else {
            if (!aqup.d(this).i(callingUid)) {
                a.f("Caller is not a Google app!", new Object[0]);
                bxgjVar.a(10, null);
                return;
            }
            try {
                callingUid = assx.b(this).f(string, 0).applicationInfo.uid;
                str = string;
            } catch (PackageManager.NameNotFoundException unused) {
                a.f("Bad package name: ".concat(String.valueOf(string)), new Object[0]);
                bxgjVar.a(10, null);
                return;
            }
        }
        int i = getServiceRequest.e;
        dcuc dcucVar = new dcuc(this, str, hashSet, callingUid, (Account) bundle.getParcelable("com.google.android.gms.signin.internal.clientRequestedAccount"), dcow.a(bundle).b(), l());
        Account a2 = getServiceRequest.a();
        if (a2 != null) {
            dcucVar.q(a2, hashSet);
        }
        bxgjVar.c(dcucVar);
    }
}
