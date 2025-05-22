package com.google.android.gms.common.app;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.atge;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class DataDirPermissionsHelper$BootCompletedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
            atge.a(getApplicationInfo(), true);
        }
    }
}
