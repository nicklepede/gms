package com.google.android.gms.auth.uiflows;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.abnm$$ExternalSyntheticApiModelOutline0;
import defpackage.aued;
import defpackage.wvv;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class LocaleChangedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        List i;
        String group;
        String id;
        Context baseContext = getBaseContext();
        aued f = aued.f(baseContext);
        if (wvv.b() && (i = f.i()) != null) {
            Iterator it = i.iterator();
            while (it.hasNext()) {
                NotificationChannel m = abnm$$ExternalSyntheticApiModelOutline0.m(it.next());
                group = m.getGroup();
                if ("com.google.android.gms.auth.base.Notifications.AuthGroup".equals(group)) {
                    id = m.getId();
                    wvv.a(f, baseContext, id);
                }
            }
        }
    }
}
