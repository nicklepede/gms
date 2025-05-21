package com.google.android.gms.nearby.presence.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.nearby.presence.ServerSyncResult;
import defpackage.asqx;
import defpackage.cewl;
import defpackage.ckjx;
import defpackage.ckku;
import defpackage.ckmb;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.ejhf;
import defpackage.fqma;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    private ckjx b = null;

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!fqma.E()) {
            ((ejhf) ((ejhf) ckmb.a.j()).ah((char) 8195)).B("%s is disabled because NP private identity is not enabled, skip chime sync!", "GcmChimeraBroadcastReceiver");
            return;
        }
        if (intent == null) {
            ((ejhf) ((ejhf) ckmb.a.j()).ah((char) 8194)).B("%s: Intent is expected but found null, skip chime sync!", "GcmChimeraBroadcastReceiver");
            return;
        }
        if (this.b == null) {
            this.b = cewl.d(context);
        }
        ckjx ckjxVar = this.b;
        final String c = asqx.c(intent.getStringExtra("debug"));
        final String c2 = asqx.c(intent.getStringExtra("deviceid"));
        if (c2.isEmpty()) {
            ((ejhf) ((ejhf) ckmb.a.j()).ah(8196)).P("%s: Intent does not contain dusiHash (%s), skip chime sync!", "GcmChimeraBroadcastReceiver", c2);
            return;
        }
        ckku ckkuVar = new ckku();
        ckkuVar.a = 5;
        ckkuVar.d = c2;
        dfaq e = ckjxVar.e(ckkuVar.a());
        e.z(new dfak() { // from class: clhu
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                ejhf ejhfVar = (ejhf) ((ejhf) ckmb.a.h()).ah(8192);
                int i = ((ServerSyncResult) obj).d;
                ejhfVar.U("%s: PresenceClient.sync() succeeded with source(%s, %s) and result: %s", "GcmChimeraBroadcastReceiver", c, c2, i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "NO_OP" : "CREDENTIALS_DELETED" : "RPC_ERROR" : "IO_ERROR" : "INVALID_PARAMS" : "SUCCESS");
            }
        });
        e.y(new dfah() { // from class: clhv
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                ((ejhf) ((ejhf) ((ejhf) ckmb.a.i()).s(exc)).ah(8193)).T("%s: PresenceClient.sync() failed: source(%s, %s)", "GcmChimeraBroadcastReceiver", c, c2);
            }
        });
    }
}
