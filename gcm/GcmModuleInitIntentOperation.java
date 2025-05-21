package com.google.android.gms.gcm;

import android.content.Intent;
import com.google.android.gms.gcm.gmsproc.GmsAutoStarter;
import defpackage.anya;
import defpackage.bhvo;
import defpackage.dnnr;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        bhvo.i(this);
        if (bhvo.p()) {
            Intent intent2 = new Intent(intent);
            String action = intent.getAction();
            if (Objects.equals(action, "android.intent.action.BOOT_COMPLETED")) {
                intent2.setAction("com.google.android.gcm.intent.USER_UNLOCKED");
            } else if (Objects.equals(action, "android.intent.action.LOCKED_BOOT_COMPLETED")) {
                intent2.setAction(null);
            }
            intent2.setClassName(this, "com.google.android.gms.gcm.GcmService");
            startService(intent2);
        } else if (Objects.equals(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
            intent.setAction("com.google.android.gcm.intent.USER_UNLOCKED");
            GcmProxyIntentOperation.a(this, intent);
        }
        if (dnnr.h(this)) {
            return;
        }
        GmsAutoStarter.a(this, intent);
    }
}
