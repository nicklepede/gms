package com.google.android.gms.auth.api.phone.ui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest;
import defpackage.abky;
import defpackage.abnd;
import defpackage.abnw;
import defpackage.abnz;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.emsx;
import defpackage.emsz;
import defpackage.emta;
import defpackage.eqci;
import defpackage.fnkq;
import defpackage.fxxm;
import defpackage.fycr;
import defpackage.ing;
import defpackage.jvd;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class PhoneNumberVerificationUserConsentPromptChimeraActivity extends rxx {
    public static final ausn j = ausn.b("PNVUserConsentActivity", auid.MISSED_CALL_RETRIEVER);
    public abky k;
    public final abnz l = new abnz((byte[]) null);

    public final void a(boolean z, int i, String str) {
        Intent intent = new Intent();
        intent.putExtra("STATUS_CODE", i);
        intent.putExtra("MESSAGE", str);
        setResult(true != z ? 0 : -1, intent);
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String callingPackage = getCallingPackage();
        if (callingPackage == null) {
            callingPackage = "UNKNOWN_PACKAGE";
        }
        emta a = abnw.a(callingPackage, emsz.USER_CONSENT_REQUEST_RECEIVED);
        abnz abnzVar = this.l;
        abnzVar.a(a);
        if (!fnkq.d()) {
            ((eluo) j.i()).x("MissCallRetriever Feature is not enabled.");
            String callingPackage2 = getCallingPackage();
            abnzVar.a(abnw.b(callingPackage2 != null ? callingPackage2 : "UNKNOWN_PACKAGE", emsz.API_ERROR, emsx.FEATURE_DISABLED));
            a(false, 53003, "MissCallRetriever Feature is not enabled.");
            return;
        }
        if (getIntent() == null) {
            ((eluo) j.i()).x("Null Intent received in `PhoneNumberVerificationUserConsentPromptChimeraActivity`.");
            String callingPackage3 = getCallingPackage();
            abnzVar.a(abnw.b(callingPackage3 != null ? callingPackage3 : "UNKNOWN_PACKAGE", emsz.API_ERROR, emsx.NULL_INTENT_RECEIVED));
            a(false, 53008, "Null Intent received in `PhoneNumberVerificationUserConsentPromptChimeraActivity`.");
            return;
        }
        String q = aura.q(this);
        if (q == null || q.length() == 0) {
            ((eluo) j.i()).x("Can't determine calling package. Activity was probably not launched via `startActivityForResult()`.");
            a(false, 53008, "Can't determine calling package. Activity was probably not launched via `startActivityForResult()`.");
            abnzVar.a(abnw.b(q != null ? q : "UNKNOWN_PACKAGE", emsz.API_ERROR, emsx.MISSING_CALLING_PACKAGE));
            return;
        }
        fnkq fnkqVar = fnkq.a;
        int a2 = (int) fnkqVar.lK().a();
        int b = (int) fnkqVar.lK().b();
        eqci eqciVar = eqci.a;
        fxxm.e(eqciVar, "system(...)");
        this.k = new abky(this, a2, b, eqciVar);
        IncomingCallRetrieverRequest incomingCallRetrieverRequest = (IncomingCallRetrieverRequest) ing.a(getIntent(), "EXTRA_MISSED_CALL_VERIFICATION_REQUEST", IncomingCallRetrieverRequest.class);
        if (incomingCallRetrieverRequest != null) {
            fycr.b(jvd.a(this), null, null, new abnd(this, q, incomingCallRetrieverRequest, null), 3);
            return;
        }
        ((eluo) j.i()).x("Phone number range not provided.");
        abnzVar.a(abnw.b(q, emsz.API_ERROR, emsx.PHONE_NUMBER_RANGE_ABSENT));
        a(false, 53006, "Phone number range not provided.");
    }
}
