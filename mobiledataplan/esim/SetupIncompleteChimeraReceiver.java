package com.google.android.gms.mobiledataplan.esim;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.asej;
import defpackage.asot;
import defpackage.ejhf;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class SetupIncompleteChimeraReceiver extends BroadcastReceiver {
    private static final asot b = asot.b("MobileDataPlan", asej.MOBILE_DATA_PLAN);

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.telephony.euicc.action.NOTIFY_CARRIER_SETUP_INCOMPLETE")) {
            return;
        }
        ((ejhf) b.j()).B("Unrecognized action for eSIM SetupIncompleteReceiver: %s", intent.getAction());
    }
}
