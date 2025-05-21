package com.google.android.gms.autofill.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import defpackage.aery;
import defpackage.aesb;
import defpackage.agjy;
import defpackage.agjz;
import defpackage.asej;
import defpackage.asot;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class RemoteIntentOperation extends IntentOperation {
    static {
        asot.b("RemoteIntentOperation", asej.AUTOFILL);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        SharedPreferences sharedPreferences = (SharedPreferences) ((aesb) aery.a(getBaseContext())).k.a();
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        String string = extras.getString("method");
        Change change = (Change) extras.getParcelable("change");
        if (!(sharedPreferences instanceof agjy)) {
            if (sharedPreferences instanceof agjz) {
                agjz agjzVar = (agjz) sharedPreferences;
                if (!"sync".equals(string) || change == null) {
                    return;
                }
                agjzVar.r(change);
                return;
            }
            return;
        }
        agjy agjyVar = (agjy) sharedPreferences;
        if ("request_sync".equals(string)) {
            agjyVar.c();
        } else {
            if (!"request_change".equals(string) || change == null) {
                return;
            }
            agjyVar.b(change);
        }
    }
}
