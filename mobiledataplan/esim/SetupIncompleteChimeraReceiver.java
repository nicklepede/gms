package com.google.android.gms.mobiledataplan.esim;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.auid;
import defpackage.ausn;
import defpackage.eluo;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class SetupIncompleteChimeraReceiver extends BroadcastReceiver {
    private static final ausn b = ausn.b("MobileDataPlan", auid.MOBILE_DATA_PLAN);

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.telephony.euicc.action.NOTIFY_CARRIER_SETUP_INCOMPLETE")) {
            return;
        }
        ((eluo) b.j()).B("Unrecognized action for eSIM SetupIncompleteReceiver: %s", intent.getAction());
    }
}
