package com.google.android.gms.nearby.presence.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.cewl;
import defpackage.ckjx;
import defpackage.ckku;
import defpackage.ckmb;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class ServerSyncChimeraBroadcastReceiver extends IntentOperation {
    private ckjx a;

    public ServerSyncChimeraBroadcastReceiver() {
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.a = cewl.d(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            ((ejhf) ((ejhf) ckmb.a.j()).ah((char) 8250)).x("Received unexpected broadcast with no action");
            return;
        }
        if (action.equals("com.google.android.gms.nearby.presence.service.SYNC_SERVER")) {
            ((ejhf) ckmb.a.f(ckmb.a()).ah(8249)).x("Received action to sync certificates to the server");
            ckjx ckjxVar = this.a;
            ckku ckkuVar = new ckku();
            ckkuVar.a = 7;
            ckjxVar.e(ckkuVar.a());
        }
    }

    public ServerSyncChimeraBroadcastReceiver(ckjx ckjxVar, Context context) {
        this.a = ckjxVar;
    }
}
