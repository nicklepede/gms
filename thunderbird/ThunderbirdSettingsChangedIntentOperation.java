package com.google.android.gms.thunderbird;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.dfvn;
import defpackage.fsnb;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ThunderbirdSettingsChangedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getAction(), "com.google.android.gms.thunderbird.storage.DEBUG_SETTINGS_CHANGED") && fsnb.C()) {
            dfvn.f();
        }
    }
}
