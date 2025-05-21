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
import defpackage.aqxi;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.bqpn;
import defpackage.ejhf;
import defpackage.ekfl;
import defpackage.ekfn;
import defpackage.ensv;
import defpackage.fktp;
import defpackage.fuvb;
import defpackage.fuyx;
import defpackage.fvaf;
import defpackage.fvbo;
import defpackage.zlz;
import defpackage.znw;
import defpackage.znz;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class IncomingCallRetrieverIntentOperation extends IntentOperation {
    public static final asot a = asot.b("IncomingCallIntentOp", asej.MISSED_CALL_RETRIEVER);
    public final znz b;
    private final TelephonyManager c;
    private final fvaf d;
    private final ensv e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IncomingCallRetrieverIntentOperation() {
        this(bqpn.d, (TelephonyManager) AppContextProvider.a().getSystemService("phone"), new fvaf() { // from class: zly
            @Override // defpackage.fvaf
            public final Object a() {
                asot asotVar = IncomingCallRetrieverIntentOperation.a;
                return new CountDownLatch(1);
            }
        });
        fuyx fuyxVar = bqpn.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(String str, int i, String str2, String str3) {
        IncomingCallRetrieverResponse incomingCallRetrieverResponse = new IncomingCallRetrieverResponse(str2, aqxi.l(i), str3);
        Intent intent = new Intent("com.google.android.gms.auth.api.phone.PHONE_VERIFICATION_STATUS_INTENT_ACTION");
        intent.putExtra("PHONE_VERIFICATION_STATUS_INTENT_EXTRA", incomingCallRetrieverResponse);
        intent.setPackage(str);
        AppContextProvider.a().sendBroadcast(intent);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        IncomingCallRetrieverRequest incomingCallRetrieverRequest;
        fvbo.f(intent, "intent");
        asot asotVar = a;
        ((ejhf) asotVar.h()).x("onHandleIntent called");
        String stringExtra = intent.getStringExtra("EXTRA_CALLING_PACKAGE");
        if (stringExtra == null) {
            ((ejhf) asotVar.i()).x("Calling package absent");
            this.b.a(znw.b("UNKNOWN_PACKAGE", ekfn.API_ERROR, ekfl.MISSING_CALLING_PACKAGE));
            return;
        }
        if (!fktp.d()) {
            ((ejhf) asotVar.h()).x("MissCallRetriever Feature is not enabled");
            this.b.a(znw.b(stringExtra, ekfn.API_ERROR, ekfl.FEATURE_DISABLED));
            b(stringExtra, 53003, (String) null, (String) null);
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("EXTRA_PHONE_NUMBER_RANGE");
        if (bundleExtra == null) {
            ((ejhf) asotVar.i()).x("Phone number range not provided.");
            this.b.a(znw.b(stringExtra, ekfn.API_ERROR, ekfl.PHONE_NUMBER_RANGE_ABSENT));
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
            ((ejhf) asotVar.i()).x("TelephonyManager is not available.");
            this.b.a(znw.b(stringExtra, ekfn.API_ERROR, ekfl.TELEPHONY_FEATURE_UNAVAILABLE));
            b(stringExtra, 53005, (String) null, (String) null);
            return;
        }
        CountDownLatch countDownLatch = (CountDownLatch) this.d.a();
        long c = fktp.a.a().c() * 1000;
        try {
            PhoneNumberRange phoneNumberRange = new PhoneNumberRange(incomingCallRetrieverRequest.a, incomingCallRetrieverRequest.b, incomingCallRetrieverRequest.c, incomingCallRetrieverRequest.d);
            ((ejhf) asotVar.h()).x("Calling Telephony API requestNumberVerification now");
            telephonyManager.requestNumberVerification(phoneNumberRange, c, this.e, new zlz(this, stringExtra, countDownLatch));
            this.b.a(znw.a(stringExtra, ekfn.TELEPHONY_VERIFICATION_API_CALLED));
            countDownLatch.await();
        } catch (Exception e) {
            countDownLatch.countDown();
            fuvb fuvbVar = e instanceof InterruptedException ? new fuvb(53008, ekfl.THREAD_INTERRUPTED_DURING_VERIFICATION) : ((e instanceof UnsupportedOperationException) || (e instanceof IllegalStateException)) ? new fuvb(53005, ekfl.TELEPHONY_FEATURE_UNAVAILABLE) : ((e instanceof NumberFormatException) || (e instanceof IllegalArgumentException)) ? new fuvb(53006, ekfl.INVALID_PHONE_NUMBER_RANGE) : new fuvb(53008, ekfl.UNKNOWN_ERROR);
            int intValue = ((Number) fuvbVar.a).intValue();
            ekfl ekflVar = (ekfl) fuvbVar.b;
            ((ejhf) ((ejhf) a.i()).s(e)).x("Error during phone number verification");
            this.b.a(znw.b(stringExtra, ekfn.TELEPHONY_API_CALLING_FAILED, ekflVar));
            b(stringExtra, intValue, (String) null, e.getMessage());
        }
    }

    public IncomingCallRetrieverIntentOperation(fuyx fuyxVar, TelephonyManager telephonyManager, fvaf fvafVar) {
        fvbo.f(fuyxVar, "coroutineContext");
        fvbo.f(fvafVar, "latchProvider");
        this.e = new asmf(Integer.MAX_VALUE, 9);
        this.b = new znz(fuyxVar);
        this.c = telephonyManager;
        this.d = fvafVar;
    }
}
