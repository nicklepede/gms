package com.google.android.gms.nearby.presence.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.nearby.presence.ServerSyncResult;
import defpackage.auur;
import defpackage.chdw;
import defpackage.cmsc;
import defpackage.cmsz;
import defpackage.cmug;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.eluo;
import defpackage.ftfv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    private cmsc b = null;

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!ftfv.G()) {
            ((eluo) ((eluo) cmug.a.j()).ai((char) 8147)).B("%s is disabled because NP private identity is not enabled, skip chime sync!", "GcmChimeraBroadcastReceiver");
            return;
        }
        if (intent == null) {
            ((eluo) ((eluo) cmug.a.j()).ai((char) 8146)).B("%s: Intent is expected but found null, skip chime sync!", "GcmChimeraBroadcastReceiver");
            return;
        }
        if (this.b == null) {
            this.b = chdw.d(context);
        }
        cmsc cmscVar = this.b;
        final String c = auur.c(intent.getStringExtra("debug"));
        final String c2 = auur.c(intent.getStringExtra("deviceid"));
        if (c2.isEmpty()) {
            ((eluo) ((eluo) cmug.a.j()).ai(8148)).P("%s: Intent does not contain dusiHash (%s), skip chime sync!", "GcmChimeraBroadcastReceiver", c2);
            return;
        }
        cmsz cmszVar = new cmsz();
        cmszVar.a = 5;
        cmszVar.d = c2;
        dhlw e = cmscVar.e(cmszVar.a());
        e.z(new dhlq() { // from class: cnqc
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                eluo eluoVar = (eluo) ((eluo) cmug.a.h()).ai(8144);
                int i = ((ServerSyncResult) obj).d;
                eluoVar.U("%s: PresenceClient.sync() succeeded with source(%s, %s) and result: %s", "GcmChimeraBroadcastReceiver", c, c2, i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "NO_OP" : "CREDENTIALS_DELETED" : "RPC_ERROR" : "IO_ERROR" : "INVALID_PARAMS" : "SUCCESS");
            }
        });
        e.y(new dhln() { // from class: cnqd
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                ((eluo) ((eluo) ((eluo) cmug.a.i()).s(exc)).ai(8145)).T("%s: PresenceClient.sync() failed: source(%s, %s)", "GcmChimeraBroadcastReceiver", c, c2);
            }
        });
    }
}
