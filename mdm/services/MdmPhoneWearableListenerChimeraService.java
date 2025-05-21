package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.WakefulBroadcastReceiver;
import com.google.android.gms.chimera.modules.security.nonwearable.AppContextProvider;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import defpackage.aseu;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.cdaj;
import defpackage.cyrt;
import defpackage.deqh;
import defpackage.deqy;
import defpackage.dkbc;
import defpackage.eijr;
import defpackage.fmse;
import defpackage.jmr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdmPhoneWearableListenerChimeraService extends dkbc {
    private bqqa a;

    @Override // defpackage.dkbc, defpackage.djkh
    public final void a(MessageEventParcelable messageEventParcelable) {
        String str = messageEventParcelable.b;
        if (!str.equals("com.google.android.gms.mdm.ACTION_RING")) {
            if (str.equals("com.google.android.gms.mdm.ACTION_CANCEL_RING")) {
                RingChimeraService.g(AppContextProvider.a());
                bqqa.a(aseu.SECURITY__NONWEARABLE_FMD_ACTION_WEAR_STOP_RINGING);
                return;
            }
            return;
        }
        String str2 = messageEventParcelable.d;
        Context a = AppContextProvider.a();
        cdaj.c("Start ringing requested by Wear.", new Object[0]);
        Intent j = cyrt.j(a);
        j.putExtra("remote", false);
        j.putExtra("requestorNodeId", str2);
        if (fmse.h()) {
            int i = deqy.c;
            WakefulBroadcastReceiver.startWakefulService(a, j);
        } else {
            int i2 = deqh.b;
            jmr.a(a, j);
        }
        bqqa.a(aseu.SECURITY__NONWEARABLE_FMD_ACTION_WEAR_RING);
    }

    @Override // defpackage.dkbc, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        eijr eijrVar = bqqe.a;
        this.a = new bqqa();
    }
}
