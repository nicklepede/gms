package com.google.android.gms.gcm.gmsproc;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bkad;
import defpackage.bkcw;
import defpackage.bkjx;
import defpackage.bkjy;
import defpackage.casd;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GmsAutoStarter extends IntentOperation {
    public static void a(Context context, Intent intent) {
        bkad.i(context);
        String action = intent.getAction();
        if (!Objects.equals(action, "com.google.android.checkin.CHECKIN_COMPLETE") || intent.getBooleanExtra("success", true)) {
            if (!Objects.equals(action, "com.google.android.gms.gcm.REGISTERED")) {
                bkjx.d(context, true, casd.a(context));
                bkjy.a(context).b();
            } else {
                bkjy a = bkjy.a(context);
                bkjy.d(bkcw.b(a.a));
                a.b();
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        a(this, intent);
    }
}
