package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.WakefulBroadcastReceiver;
import com.google.android.gms.chimera.modules.security.nonwearable.AppContextProvider;
import com.google.android.gms.wearable.internal.MessageEventParcelable;
import defpackage.auio;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.cfjj;
import defpackage.dbbr;
import defpackage.dhbk;
import defpackage.dhcb;
import defpackage.dmmv;
import defpackage.ekww;
import defpackage.fpkc;
import defpackage.jtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdmPhoneWearableListenerChimeraService extends dmmv {
    private bsxr a;

    @Override // defpackage.dmmv, defpackage.dlwa
    public final void a(MessageEventParcelable messageEventParcelable) {
        String str = messageEventParcelable.b;
        if (!str.equals("com.google.android.gms.mdm.ACTION_RING")) {
            if (str.equals("com.google.android.gms.mdm.ACTION_CANCEL_RING")) {
                RingChimeraService.g(AppContextProvider.a());
                bsxr.a(auio.SECURITY__NONWEARABLE_FMD_ACTION_WEAR_STOP_RINGING);
                return;
            }
            return;
        }
        String str2 = messageEventParcelable.d;
        Context a = AppContextProvider.a();
        cfjj.c("Start ringing requested by Wear.", new Object[0]);
        Intent j = dbbr.j(a);
        j.putExtra("remote", false);
        j.putExtra("requestorNodeId", str2);
        if (fpkc.i()) {
            int i = dhcb.c;
            WakefulBroadcastReceiver.startWakefulService(a, j);
        } else {
            int i2 = dhbk.b;
            jtg.a(a, j);
        }
        bsxr.a(auio.SECURITY__NONWEARABLE_FMD_ACTION_WEAR_RING);
    }

    @Override // defpackage.dmmv, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        ekww ekwwVar = bsxv.a;
        this.a = new bsxr();
    }
}
