package com.google.android.gms.autofill.ui;

import android.content.Intent;
import android.os.Bundle;
import defpackage.agkr;
import defpackage.agkw;
import defpackage.agkx;
import defpackage.agky;
import defpackage.asej;
import defpackage.asot;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AutofillChimeraActivity extends agky {
    public static final asot j = asot.b("AutofillChimeraActivity", asej.AUTOFILL);
    static final agkx k = new agkw();
    private final agkx m;

    public AutofillChimeraActivity() {
        this.m = k;
    }

    @Override // defpackage.agky
    protected final agkr a(Intent intent, Bundle bundle) {
        String action = intent.getAction();
        if (action != null) {
            return this.m.a(this, action, bundle, getActivityResultRegistry());
        }
        ((ejhf) ((ejhf) j.j()).ah((char) 1274)).x("Controller name is missing");
        return null;
    }

    AutofillChimeraActivity(agkx agkxVar) {
        this.m = agkxVar;
    }
}
