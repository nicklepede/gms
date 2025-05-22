package com.google.android.gms.nearby.sharing;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import defpackage.chhz;
import defpackage.conm;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class NotificationActionChimeraActivity extends rxx {
    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        chhz chhzVar = new chhz(this);
        Intent intent = getIntent();
        if (intent == null) {
            conm.a.e().p("Failed to create NotificationActionActivity, because the intent is null", new Object[0]);
            finish();
            return;
        }
        chhzVar.e("nearby_sharing", intent.getIntExtra("notification_id", -1));
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("share_pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e) {
                conm.a.b().f(e).p("Failed to send pendingIntent.", new Object[0]);
            }
        }
        conm.a.b().p("NotificationActionActivity create", new Object[0]);
        finish();
    }
}
