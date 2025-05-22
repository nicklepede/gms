package com.google.android.gms.kids.settings;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.auqz;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auua;
import defpackage.fsda;
import defpackage.fsdg;
import defpackage.fxxm;
import defpackage.fybh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class KidsSettingsModuleInitIntentOperation extends IntentOperation {
    private static final String a = auua.f("com.google.android.gms.kidssettings#com.google.android.gms");

    static {
        ausn.b("KidsSettingsModuleInitIntentOperation", auid.KIDS);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean x;
        fxxm.f(intent, "intent");
        auqz auqzVar = aura.a;
        if ((fxxm.n("com.google.android.gms.phenotype.COMMITTED", intent.getAction()) || fxxm.n(a, intent.getAction())) && !fxxm.n("com.google.android.gms.kidssettings#com.google.android.gms", intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            return;
        }
        if (fsda.a.lK().b()) {
            aura.M("com.google.android.gms.kids.settings.KidsSettingsActivityAliasSuw", 1);
        } else {
            aura.M("com.google.android.gms.kids.settings.KidsSettingsActivityAliasSuw", 2);
        }
        String action = intent.getAction();
        if (action != null) {
            x = fybh.x(action, "phenotype", false);
            if (x) {
                return;
            }
            fsdg fsdgVar = fsdg.a;
            if (fsdgVar.lK().a()) {
                return;
            }
            fsdgVar.lK().b();
        }
    }
}
