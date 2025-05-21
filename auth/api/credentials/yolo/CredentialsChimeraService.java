package com.google.android.gms.auth.api.credentials.yolo;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aozv;
import defpackage.aqup;
import defpackage.arwm;
import defpackage.asot;
import defpackage.bmgp;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eiid;
import defpackage.eiif;
import defpackage.ejck;
import defpackage.ejhf;
import defpackage.vnh;
import defpackage.vni;
import defpackage.whv;
import defpackage.whw;
import defpackage.xug;
import defpackage.xuk;
import defpackage.xul;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class CredentialsChimeraService extends bxgd {
    public static final asot a = xul.a("CredentialsChimeraService");

    public CredentialsChimeraService() {
        super(68, "com.google.android.gms.auth.api.credentials.service.START", ejck.a, 3, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        ((ejhf) whw.b.j()).w(new whv("**************************** WARNING ***************************\nYou are using the deprecated SmartLock for Passwords APIs from\nplay-services-auth SDK. Starting with play-services-auth:21.0.0,\nthese APIs have been removed from the SDK and you will no longer\nbe able to build your app with the above SDK or beyond. Please\nmigrate to the Credential Manager APIs, see https://goo.gle/4aap5k4.\n****************************************************************"));
        Bundle bundle = getServiceRequest.i;
        vni vniVar = vni.a;
        vnh vnhVar = new vnh();
        ClassLoader classLoader = PasswordSpecification.class.getClassLoader();
        arwm.s(classLoader);
        bundle.setClassLoader(classLoader);
        String string = bundle.getString("consumer_package");
        if (!TextUtils.isEmpty(string)) {
            arwm.s(string);
            vnhVar.a = string;
        }
        if (bundle.containsKey("force_save_dialog") && bundle.getBoolean("force_save_dialog", false)) {
            vnhVar.b = true;
        }
        String string2 = bundle.getString("log_session_id");
        if (!TextUtils.isEmpty(string2)) {
            vnhVar.c = string2;
        }
        vni vniVar2 = new vni(vnhVar);
        String str = vniVar2.b;
        if (eiif.c(str)) {
            str = getServiceRequest.f;
            vnh vnhVar2 = new vnh(vniVar2);
            vnhVar2.a = str;
            vniVar2 = new vni(vnhVar2);
        }
        vni vniVar3 = vniVar2;
        if (!str.equals(getServiceRequest.f)) {
            aqup.d(this).e(getServiceRequest.f);
        }
        eiid a2 = aozv.a(this, str);
        if (!a2.h()) {
            bxgjVar.a(10, null);
            return;
        }
        bxgjVar.c(new xug(this, (String) a2.c(), vniVar3, l(), xuk.a(), bmgp.a(this, null), getServiceRequest.f, getServiceRequest.p));
    }
}
