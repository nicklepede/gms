package com.google.android.gms.common.app;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.ardp;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class DataDirPermissionsHelper$BootCompletedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
            ardp.a(getApplicationInfo(), true);
        }
    }
}
