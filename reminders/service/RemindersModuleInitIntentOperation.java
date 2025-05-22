package com.google.android.gms.reminders.service;

import android.content.Intent;
import defpackage.apzs;
import defpackage.czph;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RemindersModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        boolean z = true;
        if ((i & 4) == 0 && (i & 8) == 0 && (i & 2) == 0) {
            z = false;
        }
        czph.a(this, z);
    }
}
