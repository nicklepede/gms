package com.google.android.gms.ocr.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.anya;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class OcrModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if ((i & 4) == 0 && (i & 8) == 0) {
            return;
        }
        startService(IntentOperation.getStartIntent(this, OcrModelUpdateStateIntentOperation.class, "com.google.android.gms.ocr.MODEL_UPDATE_ACTION"));
    }
}
