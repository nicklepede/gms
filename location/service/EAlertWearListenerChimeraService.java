package com.google.android.gms.location.service;

import com.google.android.gms.wearable.internal.MessageEventParcelable;
import com.google.android.location.quake.ealert.ux.EAlertUxArgs;
import defpackage.atzb;
import defpackage.atzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.dmmv;
import defpackage.edds;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class EAlertWearListenerChimeraService extends dmmv {
    private static final ausn a = ausn.c("EAlert", auid.LOCATION, "EAlertListener");

    @Override // defpackage.dmmv, defpackage.dlwa
    public final void a(MessageEventParcelable messageEventParcelable) {
        ausn ausnVar = a;
        ((eluo) ausnVar.h()).x("message received");
        String str = messageEventParcelable.b;
        if (str.hashCode() != 1083064250 || !str.equals("/ealertlistener")) {
            ((eluo) ausnVar.h()).B("unrecognized path received: %s", str);
            return;
        }
        EAlertUxArgs eAlertUxArgs = (EAlertUxArgs) atzs.a(messageEventParcelable.c, EAlertUxArgs.CREATOR);
        atzb.s(eAlertUxArgs);
        startActivity(edds.f(eAlertUxArgs));
    }
}
