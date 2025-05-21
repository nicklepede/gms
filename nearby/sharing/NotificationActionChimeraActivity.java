package com.google.android.gms.nearby.sharing;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import defpackage.cfao;
import defpackage.cmfe;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class NotificationActionChimeraActivity extends qet {
    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cfao cfaoVar = new cfao(this);
        Intent intent = getIntent();
        if (intent == null) {
            cmfe.a.e().p("Failed to create NotificationActionActivity, because the intent is null", new Object[0]);
            finish();
            return;
        }
        cfaoVar.e("nearby_sharing", intent.getIntExtra("notification_id", -1));
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("share_pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e) {
                cmfe.a.b().f(e).p("Failed to send pendingIntent.", new Object[0]);
            }
        }
        cmfe.a.b().p("NotificationActionActivity create", new Object[0]);
        finish();
    }
}
