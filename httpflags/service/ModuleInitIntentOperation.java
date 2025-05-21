package com.google.android.gms.httpflags.service;

import android.content.Intent;
import defpackage.anya;
import defpackage.blcl;
import defpackage.blcm;
import defpackage.blco;
import defpackage.foyc;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        fvbo.f(intent, "intent");
        try {
            if (foyc.a.a().e()) {
                int i = blcm.a;
                blcl.a(this);
            }
        } finally {
            blco.a(this);
        }
    }

    @Override // defpackage.anya
    protected final void j(Intent intent) {
        fvbo.f(intent, "intent");
        try {
            if (foyc.a.a().d()) {
                int i = blcm.a;
                blcl.a(this);
            }
        } finally {
            blco.a(this);
        }
    }
}
