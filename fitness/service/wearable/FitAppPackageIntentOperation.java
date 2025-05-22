package com.google.android.gms.fitness.service.wearable;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.bijd;
import defpackage.bjev;
import defpackage.bjfs;
import defpackage.dlwl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitAppPackageIntentOperation extends IntentOperation {
    static {
        bjev.a();
    }

    public static boolean a(Context context, boolean z) {
        return z ? bjfs.b(dlwl.a(context)) : bjfs.a(dlwl.a(context), "com.google.android.gms.fitness.service.wearable.FIT_MOBILE_APP_NOT_INSTALLED_CAPABILITY");
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
        if ("android.intent.action.PACKAGE_ADDED".equals(action) && bijd.a(b(intent))) {
            a(getApplicationContext(), true);
        } else if ("android.intent.action.PACKAGE_FULLY_REMOVED".equals(action) && bijd.a(b(intent))) {
            a(getApplicationContext(), false);
        }
    }
}
