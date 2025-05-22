package com.google.android.gms.httpflags.service;

import android.content.Intent;
import defpackage.apzs;
import defpackage.bnjd;
import defpackage.bnje;
import defpackage.bnjg;
import defpackage.frri;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        fxxm.f(intent, "intent");
        try {
            if (frri.a.lK().e()) {
                int i = bnje.a;
                bnjd.a(this);
            }
        } finally {
            bnjg.a(this);
        }
    }

    @Override // defpackage.apzs
    protected final void j(Intent intent) {
        fxxm.f(intent, "intent");
        try {
            if (frri.a.lK().d()) {
                int i = bnje.a;
                bnjd.a(this);
            }
        } finally {
            bnjg.a(this);
        }
    }
}
