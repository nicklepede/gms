package com.google.android.gms.people.api.operations;

import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import defpackage.cvuf;
import defpackage.cwof;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PeopleDebugChimeraIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!Build.TYPE.equals("user") && "com.google.android.gms.people.api.operations.DATA_CHANGED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("a");
            String stringExtra2 = intent.getStringExtra("p");
            int parseInt = Integer.parseInt(intent.getStringExtra("s"));
            cwof.k("PeopleDebugChimeraIntentOperation", "DataChanged! %s/%s scopes=%d", stringExtra, stringExtra2, Integer.valueOf(parseInt));
            cvuf a = cvuf.a(this);
            a.c(stringExtra, stringExtra2, parseInt);
            a.d();
        }
    }
}
