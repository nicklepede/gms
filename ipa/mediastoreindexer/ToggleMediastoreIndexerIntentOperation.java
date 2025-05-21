package com.google.android.gms.ipa.mediastoreindexer;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.boqo;
import defpackage.ejgq;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ToggleMediastoreIndexerIntentOperation extends IntentOperation {
    private static final asot a = asot.b("GmscoreIpa", asej.PLATFORM_DATA_INDEXER);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ((ejhf) a.h()).x("Handling global search source toggled intent");
        if ("com.google.android.gms.icing.GlobalSearchSourceToggled".equals(intent.getAction()) && "internal.3p:MusicRecording".equals(intent.getStringExtra("SourceName"))) {
            boolean booleanExtra = intent.getBooleanExtra("Enabled", false);
            ejgq h = boqo.a.h();
            Boolean valueOf = Boolean.valueOf(booleanExtra);
            ((ejhf) ((ejhf) h).ah((char) 5363)).B("Updating external media source state, enabled:%s", valueOf);
            synchronized (boqo.b) {
                boqo.c = valueOf;
            }
        }
    }
}
