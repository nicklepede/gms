package com.google.android.gms.ipa.mediastoreindexer;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bqye;
import defpackage.eltz;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ToggleMediastoreIndexerIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("GmscoreIpa", auid.PLATFORM_DATA_INDEXER);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ((eluo) a.h()).x("Handling global search source toggled intent");
        if ("com.google.android.gms.icing.GlobalSearchSourceToggled".equals(intent.getAction()) && "internal.3p:MusicRecording".equals(intent.getStringExtra("SourceName"))) {
            boolean booleanExtra = intent.getBooleanExtra("Enabled", false);
            eltz h = bqye.a.h();
            Boolean valueOf = Boolean.valueOf(booleanExtra);
            ((eluo) ((eluo) h).ai((char) 5376)).B("Updating external media source state, enabled:%s", valueOf);
            synchronized (bqye.b) {
                bqye.c = valueOf;
            }
        }
    }
}
