package com.google.android.gms.auth.api.credentials.yolo;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arcm;
import defpackage.asxe;
import defpackage.atzb;
import defpackage.ausn;
import defpackage.bonh;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.ekvi;
import defpackage.ekvk;
import defpackage.elpp;
import defpackage.eluo;
import defpackage.xji;
import defpackage.xjj;
import defpackage.yeb;
import defpackage.yec;
import defpackage.zsd;
import defpackage.zsh;
import defpackage.zsi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class CredentialsChimeraService extends bzot {
    public static final ausn a = zsi.a("CredentialsChimeraService");

    public CredentialsChimeraService() {
        super(68, "com.google.android.gms.auth.api.credentials.service.START", elpp.a, 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        ((eluo) yec.b.j()).w(new yeb("**************************** WARNING ***************************\nYou are using the deprecated SmartLock for Passwords APIs from\nplay-services-auth SDK. Starting with play-services-auth:21.0.0,\nthese APIs have been removed from the SDK and you will no longer\nbe able to build your app with the above SDK or beyond. Please\nmigrate to the Credential Manager APIs, see https://goo.gle/4aap5k4.\n****************************************************************"));
        Bundle bundle = getServiceRequest.i;
        xjj xjjVar = xjj.a;
        xji xjiVar = new xji();
        ClassLoader classLoader = PasswordSpecification.class.getClassLoader();
        atzb.s(classLoader);
        bundle.setClassLoader(classLoader);
        String string = bundle.getString("consumer_package");
        if (!TextUtils.isEmpty(string)) {
            atzb.s(string);
            xjiVar.a = string;
        }
        if (bundle.containsKey("force_save_dialog") && bundle.getBoolean("force_save_dialog", false)) {
            xjiVar.b = true;
        }
        String string2 = bundle.getString("log_session_id");
        if (!TextUtils.isEmpty(string2)) {
            xjiVar.c = string2;
        }
        xjj xjjVar2 = new xjj(xjiVar);
        String str = xjjVar2.b;
        if (ekvk.c(str)) {
            str = getServiceRequest.f;
            xji xjiVar2 = new xji(xjjVar2);
            xjiVar2.a = str;
            xjjVar2 = new xjj(xjiVar2);
        }
        xjj xjjVar3 = xjjVar2;
        if (!str.equals(getServiceRequest.f)) {
            asxe.d(this).e(getServiceRequest.f);
        }
        ekvi a2 = arcm.a(this, str);
        if (!a2.h()) {
            bzozVar.a(10, null);
            return;
        }
        bzozVar.c(new zsd(this, (String) a2.c(), xjjVar3, l(), zsh.a(), bonh.a(this, null), getServiceRequest.f, getServiceRequest.p));
    }
}
