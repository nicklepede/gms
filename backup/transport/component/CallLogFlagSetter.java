package com.google.android.gms.backup.transport.component;

import android.content.Intent;
import defpackage.ahpw;
import defpackage.ahwd;
import defpackage.anya;
import defpackage.asoe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CallLogFlagSetter extends anya {
    private static final ahwd a = new ahwd("CallLogFlagSetter");
    private final ahpw b = ahpw.a;

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        if (asoe.c(this)) {
            a.h("Not enabling call log backup; current device is a sidewinder device.", new Object[0]);
            return;
        }
        ahpw ahpwVar = this.b;
        if (ahpwVar.j(this)) {
            a.h("backup_enabled flag already enabled.", new Object[0]);
        } else if (!ahpwVar.l(this)) {
            a.h("Not enabling because user_full_data_backup_aware not set.", new Object[0]);
        } else {
            a.h("Enabling backup_enabled flag.", new Object[0]);
            ahpwVar.b(this, true);
        }
    }
}
