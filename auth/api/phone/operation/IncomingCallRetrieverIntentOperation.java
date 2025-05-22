package com.google.android.gms.auth.api.phone.operation;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.PhoneNumberRange;
import android.telephony.TelephonyManager;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest;
import com.google.android.gms.auth.api.phone.IncomingCallRetrieverResponse;
import com.google.android.gms.auth.api.phone.operation.IncomingCallRetrieverIntentOperation;
import com.google.android.gms.chimera.modules.auth.api.phone.AppContextProvider;
import defpackage.ablz;
import defpackage.abnw;
import defpackage.abnz;
import defpackage.aszx;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.bsxe;
import defpackage.eluo;
import defpackage.emsx;
import defpackage.emsz;
import defpackage.eqgo;
import defpackage.fnkq;
import defpackage.fxqz;
import defpackage.fxuv;
import defpackage.fxwd;
import defpackage.fxxm;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class IncomingCallRetrieverIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("IncomingCallIntentOp", auid.MISSED_CALL_RETRIEVER);
    public final abnz b;
    private final TelephonyManager c;
    private final fxwd d;
    private final eqgo e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncomingCallRetrieverIntentOperation() {
        this(bsxe.d, (TelephonyManager) AppContextProvider.a().getSystemService("phone"), new fxwd() { // from class: ably
            @Override // defpackage.fxwd
            public final Object a() {
                ausn ausnVar = IncomingCallRetrieverIntentOperation.a;
                return new CountDownLatch(1);
            }
        });
        fxuv fxuvVar = bsxe.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, int i, String str2, String str3) {
        IncomingCallRetrieverResponse incomingCallRetrieverResponse = new IncomingCallRetrieverResponse(str2, aszx.l(i), str3);
        Intent intent = new Intent("com.google.android.gms.auth.api.phone.PHONE_VERIFICATION_STATUS_INTENT_ACTION");
        intent.putExtra("PHONE_VERIFICATION_STATUS_INTENT_EXTRA", incomingCallRetrieverResponse);
        intent.setPackage(str);
        AppContextProvider.a().sendBroadcast(intent);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        IncomingCallRetrieverRequest incomingCallRetrieverRequest;
        fxxm.f(intent, "intent");
        ausn ausnVar = a;
        ((eluo) ausnVar.h()).x("onHandleIntent called");
        String stringExtra = intent.getStringExtra("EXTRA_CALLING_PACKAGE");
        if (stringExtra == null) {
            ((eluo) ausnVar.i()).x("Calling package absent");
            this.b.a(abnw.b("UNKNOWN_PACKAGE", emsz.API_ERROR, emsx.MISSING_CALLING_PACKAGE));
            return;
        }
        if (!fnkq.d()) {
            ((eluo) ausnVar.h()).x("MissCallRetriever Feature is not enabled");
            this.b.a(abnw.b(stringExtra, emsz.API_ERROR, emsx.FEATURE_DISABLED));
            b(stringExtra, 53003, (String) null, (String) null);
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("EXTRA_PHONE_NUMBER_RANGE");
        if (bundleExtra == null) {
            ((eluo) ausnVar.i()).x("Phone number range not provided.");
            this.b.a(abnw.b(stringExtra, emsz.API_ERROR, emsx.PHONE_NUMBER_RANGE_ABSENT));
            b(stringExtra, 53006, (String) null, (String) null);
            incomingCallRetrieverRequest = null;
        } else {
            String string = bundleExtra.getString("BUNDLE_KEY_COUNTRY_CODE");
            if (string == null) {
                string = "";
            }
            String string2 = bundleExtra.getString("BUNDLE_KEY_PREFIX");
            if (string2 == null) {
                string2 = "";
            }
            String string3 = bundleExtra.getString("BUNDLE_KEY_START_RANGE");
            if (string3 == null) {
                string3 = "";
            }
            String string4 = bundleExtra.getString("BUNDLE_KEY_END_RANGE");
            incomingCallRetrieverRequest = new IncomingCallRetrieverRequest(string, string2, string3, string4 != null ? string4 : "");
        }
        if (incomingCallRetrieverRequest == null) {
            return;
        }
        TelephonyManager telephonyManager = this.c;
        if (telephonyManager == null) {
            ((eluo) ausnVar.i()).x("TelephonyManager is not available.");
            this.b.a(abnw.b(stringExtra, emsz.API_ERROR, emsx.TELEPHONY_FEATURE_UNAVAILABLE));
            b(stringExtra, 53005, (String) null, (String) null);
            return;
        }
        CountDownLatch countDownLatch = (CountDownLatch) this.d.a();
        long c = fnkq.a.lK().c() * 1000;
        try {
            PhoneNumberRange phoneNumberRange = new PhoneNumberRange(incomingCallRetrieverRequest.a, incomingCallRetrieverRequest.b, incomingCallRetrieverRequest.c, incomingCallRetrieverRequest.d);
            ((eluo) ausnVar.h()).x("Calling Telephony API requestNumberVerification now");
            telephonyManager.requestNumberVerification(phoneNumberRange, c, this.e, new ablz(this, stringExtra, countDownLatch));
            this.b.a(abnw.a(stringExtra, emsz.TELEPHONY_VERIFICATION_API_CALLED));
            countDownLatch.await();
        } catch (Exception e) {
            countDownLatch.countDown();
            fxqz fxqzVar = e instanceof InterruptedException ? new fxqz(53008, emsx.THREAD_INTERRUPTED_DURING_VERIFICATION) : ((e instanceof UnsupportedOperationException) || (e instanceof IllegalStateException)) ? new fxqz(53005, emsx.TELEPHONY_FEATURE_UNAVAILABLE) : ((e instanceof NumberFormatException) || (e instanceof IllegalArgumentException)) ? new fxqz(53006, emsx.INVALID_PHONE_NUMBER_RANGE) : new fxqz(53008, emsx.UNKNOWN_ERROR);
            int intValue = ((Number) fxqzVar.a).intValue();
            emsx emsxVar = (emsx) fxqzVar.b;
            ((eluo) ((eluo) a.i()).s(e)).x("Error during phone number verification");
            this.b.a(abnw.b(stringExtra, emsz.TELEPHONY_API_CALLING_FAILED, emsxVar));
            b(stringExtra, intValue, (String) null, e.getMessage());
        }
    }

    public IncomingCallRetrieverIntentOperation(fxuv fxuvVar, TelephonyManager telephonyManager, fxwd fxwdVar) {
        fxxm.f(fxuvVar, "coroutineContext");
        fxxm.f(fxwdVar, "latchProvider");
        this.e = new aupz(Integer.MAX_VALUE, 9);
        this.b = new abnz(fxuvVar);
        this.c = telephonyManager;
        this.d = fxwdVar;
    }
}
