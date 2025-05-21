package com.google.android.gms.gcm.gmsproc;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bhvo;
import defpackage.bhyh;
import defpackage.bifi;
import defpackage.bifj;
import defpackage.byjl;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GmsAutoStarter extends IntentOperation {
    public static void a(Context context, Intent intent) {
        bhvo.i(context);
        String action = intent.getAction();
        if (!Objects.equals(action, "com.google.android.checkin.CHECKIN_COMPLETE") || intent.getBooleanExtra("success", true)) {
            if (!Objects.equals(action, "com.google.android.gms.gcm.REGISTERED")) {
                bifi.d(context, true, byjl.a(context));
                bifj.a(context).b();
            } else {
                bifj a = bifj.a(context);
                bifj.d(bhyh.b(a.a));
                a.b();
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        a(this, intent);
    }
}
