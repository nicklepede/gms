package com.google.android.gms.gcm;

import android.content.Intent;
import com.google.android.gms.gcm.gmsproc.GmsAutoStarter;
import defpackage.apzs;
import defpackage.bkad;
import defpackage.dpya;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        bkad.i(this);
        if (bkad.p()) {
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
        if (dpya.h(this)) {
            return;
        }
        GmsAutoStarter.a(this, intent);
    }
}
