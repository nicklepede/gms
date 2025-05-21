package com.google.android.gms.fitness.service.wearable;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.bgen;
import defpackage.bhaf;
import defpackage.bhbc;
import defpackage.djks;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitAppPackageIntentOperation extends IntentOperation {
    static {
        bhaf.a();
    }

    public static boolean a(Context context, boolean z) {
        return z ? bhbc.b(djks.a(context)) : bhbc.a(djks.a(context), "com.google.android.gms.fitness.service.wearable.FIT_MOBILE_APP_NOT_INSTALLED_CAPABILITY");
    }

    private static String b(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            return data.getSchemeSpecificPart();
        }
        return null;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        getApplicationContext();
        String action = intent.getAction();
        if ("android.intent.action.PACKAGE_ADDED".equals(action) && bgen.a(b(intent))) {
            a(getApplicationContext(), true);
        } else if ("android.intent.action.PACKAGE_FULLY_REMOVED".equals(action) && bgen.a(b(intent))) {
            a(getApplicationContext(), false);
        }
    }
}
