package com.google.android.gms.people.api.operations;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import defpackage.cuey;
import defpackage.cuut;
import defpackage.fqyv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ResetSuggestionEventStoreDebugOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fqyv.a.a().i() && "com.google.android.gms.people.api.operations.RESET_SUGGESTION_EVENT_STORE".equals(intent.getAction())) {
            try {
                cuut c = cuut.c(this);
                cuey.f("ResetSuggestionEventOp", "Start to reset db");
                try {
                    LevelDb.destroy(c.c);
                } catch (LevelDbException e) {
                    cuey.e("FSA2_SuggestionStorage", "Failed to destroy %s: %s", c.c, e);
                }
                cuey.f("ResetSuggestionEventOp", "Db reset successfully.");
            } catch (LevelDbException e2) {
                cuey.e("ResetSuggestionEventOp", "Exception in resetting db: %s", e2);
            }
        }
    }
}
