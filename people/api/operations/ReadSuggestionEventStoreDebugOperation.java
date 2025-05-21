package com.google.android.gms.people.api.operations;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.leveldb.LevelDbException;
import defpackage.cuey;
import defpackage.cuut;
import defpackage.fedk;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ReadSuggestionEventStoreDebugOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.people.api.operations.READ_SUGGESTION_EVENT_STORE".equals(intent.getAction())) {
            try {
                cuut c = cuut.c(this);
                StringBuilder sb = new StringBuilder();
                sb.append("suggestions in db:\n");
                Map a = c.a();
                for (String str : a.keySet()) {
                    sb.append(String.format("key: %s, value: {%s}\n", str, a.get(str)));
                }
                cuey.h("ReadSuggestionEventOp", "Db data: %s", sb.toString());
            } catch (LevelDbException | fedk | UnsupportedEncodingException e) {
                cuey.e("ReadSuggestionEventOp", "Exception in reading db: %s", e);
            }
        }
    }
}
