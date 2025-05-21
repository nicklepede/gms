package com.google.android.gms.people.api.operations;

import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import defpackage.ctkz;
import defpackage.cuey;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PeopleDebugChimeraIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!Build.TYPE.equals("user") && "com.google.android.gms.people.api.operations.DATA_CHANGED".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("a");
            String stringExtra2 = intent.getStringExtra("p");
            int parseInt = Integer.parseInt(intent.getStringExtra("s"));
            cuey.k("PeopleDebugChimeraIntentOperation", "DataChanged! %s/%s scopes=%d", stringExtra, stringExtra2, Integer.valueOf(parseInt));
            ctkz a = ctkz.a(this);
            a.c(stringExtra, stringExtra2, parseInt);
            a.d();
        }
    }
}
