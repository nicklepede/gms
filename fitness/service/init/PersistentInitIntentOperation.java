package com.google.android.gms.fitness.service.init;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bikw;
import defpackage.biky;
import defpackage.biwm;
import defpackage.bjen;
import defpackage.bjev;
import java.util.HashSet;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PersistentInitIntentOperation extends IntentOperation {
    static {
        bjev.a();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Context applicationContext = getApplicationContext();
        biky a = bikw.a(applicationContext);
        int i = biwm.a;
        HashSet<String> hashSet = new HashSet(bikw.a(applicationContext).e().d());
        hashSet.remove("none");
        hashSet.remove("local_no_account");
        for (String str : hashSet) {
            if (biwm.a(a.p(str), a.q(str), str)) {
                bjen.b(applicationContext, str);
            }
        }
    }
}
