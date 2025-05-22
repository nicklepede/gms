package com.google.android.gms.ocr.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.apzs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class OcrModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if ((i & 4) == 0 && (i & 8) == 0) {
            return;
        }
        startService(IntentOperation.getStartIntent(this, OcrModelUpdateStateIntentOperation.class, "com.google.android.gms.ocr.MODEL_UPDATE_ACTION"));
    }
}
