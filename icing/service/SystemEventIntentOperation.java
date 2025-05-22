package com.google.android.gms.icing.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import defpackage.auua;
import defpackage.bnmo;
import defpackage.ekus;
import defpackage.fpow;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SystemEventIntentOperation extends IntentOperation {
    public static final String a = auua.f("com.google.android.gms.icing");
    public static final String b = auua.f("com.google.android.gms.icing.mdh");

    public static void a(Context context, Intent intent) {
        bnmo.p("SystemEventIntentOperation.run: Got intent %s", intent);
        if (intent == null) {
            return;
        }
        if (ekus.a(intent.getAction(), "android.intent.action.PACKAGE_CHANGED") && fpow.c()) {
            return;
        }
        if (ekus.a(intent.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
            intent.setAction("android.intent.action.PACKAGE_CHANGED");
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                bnmo.r("SystemEventIntentOperation.run Intent extra %s: %s", str, extras.get(str));
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
