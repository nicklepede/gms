package com.google.android.gms.auth.uiflows;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.abnj$$ExternalSyntheticApiModelOutline0;
import defpackage.asbo;
import defpackage.uzv;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class LocaleChangedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        List i;
        String group;
        String id;
        Context baseContext = getBaseContext();
        asbo f = asbo.f(baseContext);
        if (uzv.b() && (i = f.i()) != null) {
            Iterator it = i.iterator();
            while (it.hasNext()) {
                NotificationChannel m = abnj$$ExternalSyntheticApiModelOutline0.m(it.next());
                group = m.getGroup();
                if ("com.google.android.gms.auth.base.Notifications.AuthGroup".equals(group)) {
                    id = m.getId();
                    uzv.a(f, baseContext, id);
                }
            }
        }
    }
}
