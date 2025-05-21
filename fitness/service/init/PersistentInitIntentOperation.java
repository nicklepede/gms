package com.google.android.gms.fitness.service.init;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bggg;
import defpackage.bggi;
import defpackage.bgrw;
import defpackage.bgzx;
import defpackage.bhaf;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PersistentInitIntentOperation extends IntentOperation {
    static {
        bhaf.a();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Context applicationContext = getApplicationContext();
        bggi a = bggg.a(applicationContext);
        int i = bgrw.a;
        HashSet<String> hashSet = new HashSet(bggg.a(applicationContext).e().d());
        hashSet.remove("none");
        hashSet.remove("local_no_account");
        for (String str : hashSet) {
            if (bgrw.a(a.p(str), a.q(str), str)) {
                bgzx.b(applicationContext, str);
            }
        }
    }
}
