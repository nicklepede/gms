package com.google.android.gms.auth.uiflows.addaccount.setupwizard;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.uiflows.addaccount.setupwizard.BufferedLogsUploadIntentOperation;
import defpackage.asmf;
import defpackage.edkl;
import defpackage.edkm;
import defpackage.vba;
import defpackage.vbd;
import defpackage.vbe;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class BufferedLogsUploadIntentOperation extends IntentOperation {
    public edkl a;
    public vbd b;
    private edkm c;
    private edkm d;

    private final void a(final edkm edkmVar, final String str) {
        new asmf(1, 9).execute(new Runnable() { // from class: adjy
            @Override // java.lang.Runnable
            public final void run() {
                edkm edkmVar2 = edkmVar;
                BufferedLogsUploadIntentOperation bufferedLogsUploadIntentOperation = BufferedLogsUploadIntentOperation.this;
                String str2 = str;
                ((dxob) bufferedLogsUploadIntentOperation.b.a.b.a()).b(Boolean.valueOf(edkmVar2.b(str2)));
                bufferedLogsUploadIntentOperation.a.e(str2);
            }
        });
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        edkl a = edkl.a(getApplicationContext());
        edkm edkmVar = new edkm(getApplicationContext(), "ANDROID_AUTH");
        edkm edkmVar2 = new edkm(getApplicationContext(), "KIDS_SUPERVISION");
        vbd f = vbe.f(getApplicationContext());
        this.a = a;
        this.c = edkmVar;
        this.d = edkmVar2;
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
        edkm edkmVar = this.c;
        if (edkmVar == null) {
            edkmVar = new edkm(getApplicationContext(), "ANDROID_AUTH");
        }
        this.c = edkmVar;
        a(edkmVar, vba.b(getApplicationContext()));
        edkm edkmVar2 = this.d;
        if (edkmVar2 == null) {
            edkmVar2 = new edkm(getApplicationContext(), "KIDS_SUPERVISION");
        }
        this.d = edkmVar2;
        a(edkmVar2, vba.c(getApplicationContext()));
    }
}
