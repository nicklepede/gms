package com.google.android.gms.people.api.operations;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import defpackage.cwof;
import defpackage.cxeb;
import defpackage.ftsq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ResetSuggestionEventStoreDebugOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (ftsq.a.lK().i() && "com.google.android.gms.people.api.operations.RESET_SUGGESTION_EVENT_STORE".equals(intent.getAction())) {
            try {
                cxeb c = cxeb.c(this);
                cwof.f("ResetSuggestionEventOp", "Start to reset db");
                try {
                    LevelDb.destroy(c.c);
                } catch (LevelDbException e) {
                    cwof.e("FSA2_SuggestionStorage", "Failed to destroy %s: %s", c.c, e);
                }
                cwof.f("ResetSuggestionEventOp", "Db reset successfully.");
            } catch (LevelDbException e2) {
                cwof.e("ResetSuggestionEventOp", "Exception in resetting db: %s", e2);
            }
        }
    }
}
