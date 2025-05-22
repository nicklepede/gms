package com.google.android.gms.cast.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aoej;
import defpackage.aond;
import defpackage.aone;
import defpackage.aonh;
import defpackage.apaa;
import defpackage.ind;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastConnectionDialogControl$ConnectionDialogReceiver extends TracingBroadcastReceiver {
    final /* synthetic */ aoej a;
    private boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastConnectionDialogControl$ConnectionDialogReceiver(aoej aoejVar) {
        super("cast");
        this.a = aoejVar;
        this.b = false;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        ind.c(this.a.b, this, new IntentFilter("com.google.android.gms.cast.activity.DIALOG_ACTION_STATE_CHANGE"), "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 4);
        this.b = true;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("com.google.android.gms.cast.activity.DIALOG_KEY_ACTION_RESULT", 1);
        if (intExtra == 0) {
            aoej aoejVar = this.a;
            aoejVar.c = 4;
            aoejVar.a.c("ConnectionDialogReceiver got an Intent with DIALOG_OPENED", new Object[0]);
            return;
        }
        aoej aoejVar2 = this.a;
        aoejVar2.c = 1;
        if (this.b) {
            aoejVar2.b.unregisterReceiver(this);
            this.b = false;
        }
        aoejVar2.a.c("ConnectionDialogReceiver got an Intent with DIALOG_CLOSED and action result %d", Integer.valueOf(intExtra));
        aond aondVar = aoejVar2.d;
        if (aondVar == null || intExtra == 1) {
            return;
        }
        if (intExtra == 4) {
            aonh aonhVar = aondVar.a;
            aonhVar.n.c("retry the application launch", new Object[0]);
            aone aoneVar = aonhVar.e;
            aonhVar.a(aoneVar.a, aoneVar.b, aoneVar.c, aoneVar.d);
            return;
        }
        int intExtra2 = intExtra == 3 ? 2019 : intExtra == 2 ? intent.getIntExtra("com.google.android.gms.cast.session.DIALOG_KEY_STATUS_CODE", -1) : -1;
        aonh aonhVar2 = aondVar.a;
        apaa apaaVar = aonhVar2.d;
        if (apaaVar != null) {
            aonhVar2.n.c("notify application launch failed with statusCode: %d", Integer.valueOf(intExtra2));
            apaaVar.g(apaaVar.c, intExtra2);
        }
    }
}
