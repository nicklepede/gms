package com.google.android.gms.auth.api.phone.ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.ekfl;
import defpackage.ekfn;
import defpackage.ekfo;
import defpackage.enop;
import defpackage.fktp;
import defpackage.fvbo;
import defpackage.fvgt;
import defpackage.ilq;
import defpackage.joo;
import defpackage.qet;
import defpackage.zky;
import defpackage.znd;
import defpackage.znw;
import defpackage.znz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class PhoneNumberVerificationUserConsentPromptChimeraActivity extends qet {
    public static final asot j = asot.b("PNVUserConsentActivity", asej.MISSED_CALL_RETRIEVER);
    public zky k;
    public final znz l = new znz((byte[]) null);

    public final void a(boolean z, int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("STATUS_CODE", i);
        intent.putExtra("MESSAGE", str);
        setResult(true != z ? 0 : -1, intent);
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String callingPackage = getCallingPackage();
        if (callingPackage == null) {
            callingPackage = "UNKNOWN_PACKAGE";
        }
        ekfo a = znw.a(callingPackage, ekfn.USER_CONSENT_REQUEST_RECEIVED);
        znz znzVar = this.l;
        znzVar.a(a);
        if (!fktp.d()) {
            ((ejhf) j.i()).x("MissCallRetriever Feature is not enabled.");
            String callingPackage2 = getCallingPackage();
            znzVar.a(znw.b(callingPackage2 != null ? callingPackage2 : "UNKNOWN_PACKAGE", ekfn.API_ERROR, ekfl.FEATURE_DISABLED));
            a(false, 53003, "MissCallRetriever Feature is not enabled.");
            return;
        }
        if (getIntent() == null) {
            ((ejhf) j.i()).x("Null Intent received in `PhoneNumberVerificationUserConsentPromptChimeraActivity`.");
            String callingPackage3 = getCallingPackage();
            znzVar.a(znw.b(callingPackage3 != null ? callingPackage3 : "UNKNOWN_PACKAGE", ekfn.API_ERROR, ekfl.NULL_INTENT_RECEIVED));
            a(false, 53008, "Null Intent received in `PhoneNumberVerificationUserConsentPromptChimeraActivity`.");
            return;
        }
        String q = asng.q(this);
        if (q == null || q.length() == 0) {
            ((ejhf) j.i()).x("Can't determine calling package. Activity was probably not launched via `startActivityForResult()`.");
            a(false, 53008, "Can't determine calling package. Activity was probably not launched via `startActivityForResult()`.");
            znzVar.a(znw.b(q != null ? q : "UNKNOWN_PACKAGE", ekfn.API_ERROR, ekfl.MISSING_CALLING_PACKAGE));
            return;
        }
        fktp fktpVar = fktp.a;
        int a2 = (int) fktpVar.a().a();
        int b = (int) fktpVar.a().b();
        enop enopVar = enop.a;
        fvbo.e(enopVar, "system(...)");
        this.k = new zky(this, a2, b, enopVar);
        IncomingCallRetrieverRequest incomingCallRetrieverRequest = (IncomingCallRetrieverRequest) ilq.a(getIntent(), "EXTRA_MISSED_CALL_VERIFICATION_REQUEST", IncomingCallRetrieverRequest.class);
        if (incomingCallRetrieverRequest != null) {
            fvgt.b(joo.a(this), null, null, new znd(this, q, incomingCallRetrieverRequest, null), 3);
            return;
        }
        ((ejhf) j.i()).x("Phone number range not provided.");
        znzVar.a(znw.b(q, ekfn.API_ERROR, ekfl.PHONE_NUMBER_RANGE_ABSENT));
        a(false, 53006, "Phone number range not provided.");
    }
}
