package com.google.android.gms.nearby.presence.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.chdw;
import defpackage.cmsc;
import defpackage.cmsz;
import defpackage.cmug;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class ServerSyncChimeraBroadcastReceiver extends IntentOperation {
    private cmsc a;

    public ServerSyncChimeraBroadcastReceiver() {
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        this.a = chdw.d(this);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            ((eluo) ((eluo) cmug.a.j()).ai((char) 8203)).x("Received unexpected broadcast with no action");
            return;
        }
        if (action.equals("com.google.android.gms.nearby.presence.service.SYNC_SERVER")) {
            ((eluo) cmug.a.f(cmug.a()).ai(8202)).x("Received action to sync certificates to the server");
            cmsc cmscVar = this.a;
            cmsz cmszVar = new cmsz();
            cmszVar.a = 7;
            cmscVar.e(cmszVar.a());
        }
    }

    public ServerSyncChimeraBroadcastReceiver(cmsc cmscVar, Context context) {
        this.a = cmscVar;
    }
}
