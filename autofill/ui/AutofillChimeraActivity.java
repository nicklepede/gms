package com.google.android.gms.autofill.ui;

import android.content.Intent;
import android.os.Bundle;
import defpackage.ailh;
import defpackage.ailm;
import defpackage.ailn;
import defpackage.ailo;
import defpackage.auid;
import defpackage.ausn;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AutofillChimeraActivity extends ailo {
    public static final ausn j = ausn.b("AutofillChimeraActivity", auid.AUTOFILL);
    static final ailn k = new ailm();
    private final ailn m;

    public AutofillChimeraActivity() {
        this.m = k;
    }

    @Override // defpackage.ailo
    protected final ailh a(Intent intent, Bundle bundle) {
        String action = intent.getAction();
        if (action != null) {
            return this.m.a(this, action, bundle, getActivityResultRegistry());
        }
        ((eluo) ((eluo) j.j()).ai((char) 1278)).x("Controller name is missing");
        return null;
    }

    AutofillChimeraActivity(ailn ailnVar) {
        this.m = ailnVar;
    }
}
