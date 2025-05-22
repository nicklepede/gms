package com.google.android.gms.phonesky.recovery.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.phonesky.recovery.AppContextProvider;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cyrg;
import defpackage.cyri;
import defpackage.cyro;
import defpackage.eluo;
import defpackage.iri;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class EmergencyPlayStoreInstallIntentOperation extends IntentOperation {
    public static final ausn a = ausn.b("EmergencyPlayStoreInstallIntentOperation", auid.PHONESKY_RECOVERY);
    public final Context b = AppContextProvider.a();

    public EmergencyPlayStoreInstallIntentOperation() {
        cyro.a();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        new cyri(this.b);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!Objects.equals(intent.getAction(), "com.google.android.gms.phonesky.recovery.ACTION")) {
            cyrg.a("Emergency Installer is triggered with an invalid action", new Object[0]);
        } else {
            int i = iri.a;
            ((eluo) ((eluo) a.j()).ai((char) 8782)).x("Emergency Play Store Install is only supported on Android V+");
        }
    }
}
