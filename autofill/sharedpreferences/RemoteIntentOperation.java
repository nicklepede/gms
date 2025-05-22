package com.google.android.gms.autofill.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import defpackage.agsl;
import defpackage.agso;
import defpackage.aiko;
import defpackage.aikp;
import defpackage.auid;
import defpackage.ausn;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class RemoteIntentOperation extends IntentOperation {
    static {
        ausn.b("RemoteIntentOperation", auid.AUTOFILL);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        SharedPreferences sharedPreferences = (SharedPreferences) ((agso) agsl.a(getBaseContext())).k.a();
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        String string = extras.getString("method");
        Change change = (Change) extras.getParcelable("change");
        if (!(sharedPreferences instanceof aiko)) {
            if (sharedPreferences instanceof aikp) {
                aikp aikpVar = (aikp) sharedPreferences;
                if (!"sync".equals(string) || change == null) {
                    return;
                }
                aikpVar.r(change);
                return;
            }
            return;
        }
        aiko aikoVar = (aiko) sharedPreferences;
        if ("request_sync".equals(string)) {
            aikoVar.c();
        } else {
            if (!"request_change".equals(string) || change == null) {
                return;
            }
            aikoVar.b(change);
        }
    }
}
