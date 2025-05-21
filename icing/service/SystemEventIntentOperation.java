package com.google.android.gms.icing.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import defpackage.asqg;
import defpackage.blfw;
import defpackage.eihn;
import defpackage.fmwx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SystemEventIntentOperation extends IntentOperation {
    public static final String a = asqg.f("com.google.android.gms.icing");
    public static final String b = asqg.f("com.google.android.gms.icing.mdh");

    public static void a(Context context, Intent intent) {
        blfw.p("SystemEventIntentOperation.run: Got intent %s", intent);
        if (intent == null) {
            return;
        }
        if (eihn.a(intent.getAction(), "android.intent.action.PACKAGE_CHANGED") && fmwx.c()) {
            return;
        }
        if (eihn.a(intent.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
            intent.setAction("android.intent.action.PACKAGE_CHANGED");
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                blfw.r("SystemEventIntentOperation.run Intent extra %s: %s", str, extras.get(str));
            }
        }
        String action = intent.getAction();
        "com.google.gservices.intent.action.GSERVICES_CHANGED".equals(action);
        if ("com.google.android.gms.phenotype.COMMITTED".equals(action) || a.equals(action) || b.equals(action)) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
            if (stringExtra == null) {
                return;
            }
            if (!"com.google.android.gms.icing".equals(stringExtra) && !"com.google.android.gms.icing.mdh".equals(stringExtra)) {
                return;
            }
        }
        intent.setClassName(context, "com.google.android.gms.icing.service.IndexWorkerService");
        context.startService(intent);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        a(this, intent);
    }
}
