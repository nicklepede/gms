package com.google.android.gms.backup.transport.component;

import android.content.Intent;
import defpackage.ajqm;
import defpackage.ajwt;
import defpackage.apzs;
import defpackage.aury;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CallLogFlagSetter extends apzs {
    private static final ajwt a = new ajwt("CallLogFlagSetter");
    private final ajqm b = ajqm.a;

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        if (aury.c(this)) {
            a.h("Not enabling call log backup; current device is a sidewinder device.", new Object[0]);
            return;
        }
        ajqm ajqmVar = this.b;
        if (ajqmVar.j(this)) {
            a.h("backup_enabled flag already enabled.", new Object[0]);
        } else if (!ajqmVar.l(this)) {
            a.h("Not enabling because user_full_data_backup_aware not set.", new Object[0]);
        } else {
            a.h("Enabling backup_enabled flag.", new Object[0]);
            ajqmVar.b(this, true);
        }
    }
}
