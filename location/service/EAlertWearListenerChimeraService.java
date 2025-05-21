package com.google.android.gms.location.service;

import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import defpackage.arwm;
import defpackage.arxd;
import defpackage.asej;
import defpackage.asot;
import defpackage.dkbc;
import defpackage.earf;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class EAlertWearListenerChimeraService extends dkbc {
    private static final asot a = asot.c("EAlert", asej.LOCATION, "EAlertListener");

    @Override // defpackage.dkbc, defpackage.djkh
    public final void a(MessageEventParcelable messageEventParcelable) {
        asot asotVar = a;
        ((ejhf) asotVar.h()).x("message received");
        String str = messageEventParcelable.b;
        if (str.hashCode() != 1083064250 || !str.equals("/ealertlistener")) {
            ((ejhf) asotVar.h()).B("unrecognized path received: %s", str);
            return;
        }
        EAlertUxArgs eAlertUxArgs = (EAlertUxArgs) arxd.a(messageEventParcelable.c, EAlertUxArgs.CREATOR);
        arwm.s(eAlertUxArgs);
        startActivity(earf.f(eAlertUxArgs));
    }
}
