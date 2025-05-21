package com.google.android.gms.phonesky.recovery.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.phonesky.recovery.AppContextProvider;
import defpackage.asej;
import defpackage.asot;
import defpackage.cwhj;
import defpackage.cwhl;
import defpackage.cwhr;
import defpackage.ejhf;
import defpackage.ips;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class EmergencyPlayStoreInstallIntentOperation extends IntentOperation {
    public static final asot a = asot.b("EmergencyPlayStoreInstallIntentOperation", asej.PHONESKY_RECOVERY);
    public final Context b = AppContextProvider.a();

    public EmergencyPlayStoreInstallIntentOperation() {
        cwhr.a();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        new cwhl(this.b);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!Objects.equals(intent.getAction(), "com.google.android.gms.phonesky.recovery.ACTION")) {
            cwhj.a("Emergency Installer is triggered with an invalid action", new Object[0]);
        } else {
            int i = ips.a;
            ((ejhf) ((ejhf) a.j()).ah((char) 8784)).x("Emergency Play Store Install is only supported on Android V+");
        }
    }
}
