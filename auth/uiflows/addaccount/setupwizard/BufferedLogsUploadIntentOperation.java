package com.google.android.gms.auth.uiflows.addaccount.setupwizard;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.uiflows.addaccount.setupwizard.BufferedLogsUploadIntentOperation;
import defpackage.aupz;
import defpackage.efxh;
import defpackage.efxi;
import defpackage.wxa;
import defpackage.wxd;
import defpackage.wxe;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BufferedLogsUploadIntentOperation extends IntentOperation {
    public efxh a;
    public wxd b;
    private efxi c;
    private efxi d;

    private final void a(final efxi efxiVar, final String str) {
        new aupz(1, 9).execute(new Runnable() { // from class: afkf
            @Override // java.lang.Runnable
            public final void run() {
                efxi efxiVar2 = efxiVar;
                BufferedLogsUploadIntentOperation bufferedLogsUploadIntentOperation = BufferedLogsUploadIntentOperation.this;
                String str2 = str;
                ((eaab) bufferedLogsUploadIntentOperation.b.a.b.lK()).b(Boolean.valueOf(efxiVar2.b(str2)));
                bufferedLogsUploadIntentOperation.a.e(str2);
            }
        });
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        efxh a = efxh.a(getApplicationContext());
        efxi efxiVar = new efxi(getApplicationContext(), "ANDROID_AUTH");
        efxi efxiVar2 = new efxi(getApplicationContext(), "KIDS_SUPERVISION");
        wxd f = wxe.f(getApplicationContext());
        this.a = a;
        this.c = efxiVar;
        this.d = efxiVar2;
        this.b = f;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            Log.w("Auth", String.format(Locale.US, "[BufferedLogsUploadIntentOperation] null intent", new Object[0]));
            return;
        }
        if (!"com.google.android.gms.auth.uiflows.addaccount.setupwizard.auth_action_suw_finished".equals(intent.getAction())) {
            Log.w("Auth", String.format(Locale.US, "[BufferedLogsUploadIntentOperation] Unknown action", new Object[0]));
            return;
        }
        efxi efxiVar = this.c;
        if (efxiVar == null) {
            efxiVar = new efxi(getApplicationContext(), "ANDROID_AUTH");
        }
        this.c = efxiVar;
        a(efxiVar, wxa.b(getApplicationContext()));
        efxi efxiVar2 = this.d;
        if (efxiVar2 == null) {
            efxiVar2 = new efxi(getApplicationContext(), "KIDS_SUPERVISION");
        }
        this.d = efxiVar2;
        a(efxiVar2, wxa.c(getApplicationContext()));
    }
}
