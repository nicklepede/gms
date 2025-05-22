package com.google.android.gms.autofill.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import defpackage.ailh;
import defpackage.ailn;
import defpackage.ailo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class AutofillSettingsChimeraActivity extends ailo {
    private final ailn j;

    public AutofillSettingsChimeraActivity() {
        this(AutofillChimeraActivity.k);
    }

    @Override // defpackage.ailo
    protected final ailh a(Intent intent, Bundle bundle) {
        ComponentName component = intent.getComponent();
        return (component == null || !component.getShortClassName().equals(".autofill.ui.AutofillManagePasswordsActivity")) ? this.j.a(this, "SETTINGS", bundle, getActivityResultRegistry()) : this.j.a(this, "MANAGE_PASSWORDS", bundle, getActivityResultRegistry());
    }

    public AutofillSettingsChimeraActivity(ailn ailnVar) {
        this.j = ailnVar;
    }
}
