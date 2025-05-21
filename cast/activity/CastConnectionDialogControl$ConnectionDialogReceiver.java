package com.google.android.gms.cast.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.amcy;
import defpackage.amls;
import defpackage.amlt;
import defpackage.amlw;
import defpackage.amyp;
import defpackage.iln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastConnectionDialogControl$ConnectionDialogReceiver extends TracingBroadcastReceiver {
    final /* synthetic */ amcy a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastConnectionDialogControl$ConnectionDialogReceiver(amcy amcyVar) {
        super("cast");
        this.a = amcyVar;
        this.b = false;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        iln.c(this.a.b, this, new IntentFilter("com.google.android.gms.cast.activity.DIALOG_ACTION_STATE_CHANGE"), "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 4);
        this.b = true;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jz(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.gms.cast.activity.DIALOG_KEY_ACTION_RESULT", 1);
        if (intExtra == 0) {
            amcy amcyVar = this.a;
            amcyVar.c = 4;
            amcyVar.a.c("ConnectionDialogReceiver got an Intent with DIALOG_OPENED", new Object[0]);
            return;
        }
        amcy amcyVar2 = this.a;
        amcyVar2.c = 1;
        if (this.b) {
            amcyVar2.b.unregisterReceiver(this);
            this.b = false;
        }
        amcyVar2.a.c("ConnectionDialogReceiver got an Intent with DIALOG_CLOSED and action result %d", Integer.valueOf(intExtra));
        amls amlsVar = amcyVar2.d;
        if (amlsVar == null || intExtra == 1) {
            return;
        }
        if (intExtra == 4) {
            amlw amlwVar = amlsVar.a;
            amlwVar.n.c("retry the application launch", new Object[0]);
            amlt amltVar = amlwVar.e;
            amlwVar.a(amltVar.a, amltVar.b, amltVar.c, amltVar.d);
            return;
        }
        int intExtra2 = intExtra == 3 ? 2019 : intExtra == 2 ? intent.getIntExtra("com.google.android.gms.cast.session.DIALOG_KEY_STATUS_CODE", -1) : -1;
        amlw amlwVar2 = amlsVar.a;
        amyp amypVar = amlwVar2.d;
        if (amypVar != null) {
            amlwVar2.n.c("notify application launch failed with statusCode: %d", Integer.valueOf(intExtra2));
            amypVar.g(amypVar.c, intExtra2);
        }
    }
}
