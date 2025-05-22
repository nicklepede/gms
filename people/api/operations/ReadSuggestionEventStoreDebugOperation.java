package com.google.android.gms.people.api.operations;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.leveldb.LevelDbException;
import defpackage.cwof;
import defpackage.cxeb;
import defpackage.fgsd;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ReadSuggestionEventStoreDebugOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.people.api.operations.READ_SUGGESTION_EVENT_STORE".equals(intent.getAction())) {
            try {
                cxeb c = cxeb.c(this);
                StringBuilder sb = new StringBuilder();
                sb.append("suggestions in db:\n");
                Map a = c.a();
                for (String str : a.keySet()) {
                    sb.append(String.format("key: %s, value: {%s}\n", str, a.get(str)));
                }
                cwof.h("ReadSuggestionEventOp", "Db data: %s", sb.toString());
            } catch (LevelDbException | fgsd | UnsupportedEncodingException e) {
                cwof.e("ReadSuggestionEventOp", "Exception in reading db: %s", e);
            }
        }
    }
}
