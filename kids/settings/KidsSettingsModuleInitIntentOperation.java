package com.google.android.gms.kids.settings;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asnf;
import defpackage.asng;
import defpackage.asot;
import defpackage.asqg;
import defpackage.fpjk;
import defpackage.fpjq;
import defpackage.fvbo;
import defpackage.fvfj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class KidsSettingsModuleInitIntentOperation extends IntentOperation {
    private static final String a = asqg.f("com.google.android.gms.kidssettings#com.google.android.gms");

    static {
        asot.b("KidsSettingsModuleInitIntentOperation", asej.KIDS);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean x;
        fvbo.f(intent, "intent");
        asnf asnfVar = asng.a;
        if ((fvbo.n("com.google.android.gms.phenotype.COMMITTED", intent.getAction()) || fvbo.n(a, intent.getAction())) && !fvbo.n("com.google.android.gms.kidssettings#com.google.android.gms", intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            return;
        }
        if (fpjk.a.a().b()) {
            asng.M("com.google.android.gms.kids.settings.KidsSettingsActivityAliasSuw", 1);
        } else {
            asng.M("com.google.android.gms.kids.settings.KidsSettingsActivityAliasSuw", 2);
        }
        String action = intent.getAction();
        if (action != null) {
            x = fvfj.x(action, "phenotype", false);
            if (x || fpjq.a.a().a()) {
                return;
            }
            fpjq.a.a().b();
        }
    }
}
