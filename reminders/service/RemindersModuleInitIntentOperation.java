package com.google.android.gms.reminders.service;

import android.content.Intent;
import defpackage.anya;
import defpackage.cxfl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class RemindersModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        boolean z = true;
        if ((i & 4) == 0 && (i & 8) == 0 && (i & 2) == 0) {
            z = false;
        }
        cxfl.a(this, z);
    }
}
