package com.google.android.gms.thunderbird;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.digs;
import defpackage.fvik;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ThunderbirdSettingsChangedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getAction(), "com.google.android.gms.thunderbird.storage.DEBUG_SETTINGS_CHANGED") && fvik.C()) {
            digs.f();
        }
    }
}
