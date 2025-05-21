package com.google.android.gms.autofill.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import defpackage.agkr;
import defpackage.agkx;
import defpackage.agky;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AutofillSettingsChimeraActivity extends agky {
    private final agkx j;

    public AutofillSettingsChimeraActivity() {
        this(AutofillChimeraActivity.k);
    }

    @Override // defpackage.agky
    protected final agkr a(Intent intent, Bundle bundle) {
        ComponentName component = intent.getComponent();
        return (component == null || !component.getShortClassName().equals(".autofill.ui.AutofillManagePasswordsActivity")) ? this.j.a(this, "SETTINGS", bundle, getActivityResultRegistry()) : this.j.a(this, "MANAGE_PASSWORDS", bundle, getActivityResultRegistry());
    }

    public AutofillSettingsChimeraActivity(agkx agkxVar) {
        this.j = agkxVar;
    }
}
