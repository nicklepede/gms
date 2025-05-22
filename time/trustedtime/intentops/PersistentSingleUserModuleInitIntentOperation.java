package com.google.android.gms.time.trustedtime.intentops;

import android.content.Intent;
import defpackage.apzs;
import defpackage.ausn;
import defpackage.disv;
import defpackage.ditn;
import defpackage.diud;
import defpackage.diuf;
import defpackage.diug;
import defpackage.diui;
import defpackage.dwzt;
import defpackage.dxfp;
import defpackage.dxfs;
import defpackage.eluo;
import defpackage.fviu;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class PersistentSingleUserModuleInitIntentOperation extends apzs {
    private static final dxfp a = new dxfs("PersistentSingleUserModuleInitIntentOperation");
    private final diuf b;
    private final diuf c;

    public PersistentSingleUserModuleInitIntentOperation() {
        this(diui.a, ditn.b);
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        ausn ausnVar = diud.a;
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (fviu.a.lK().o()) {
            ((eluo) ((eluo) diud.a.h()).ai((char) 11417)).B("Current Configuration %s", disv.a());
        }
        if (!((Boolean) this.b.b()).booleanValue()) {
            ausn ausnVar = diud.a;
            return;
        }
        if (!diug.b()) {
            ((eluo) ((eluo) diud.a.j()).ai(11415)).B("[%s] TrustedTime is not enabled, ignoring module init.", a);
            return;
        }
        boolean z = (i & 2) != 0;
        int i2 = i & 4;
        int i3 = i & 8;
        if (!z && i2 == 0 && i3 == 0) {
            ((eluo) ((eluo) diud.a.h()).ai((char) 11414)).x("Skip initializing when nothing is updated.");
        } else {
            ((eluo) ((eluo) diud.a.h()).ai((char) 11413)).x("Initializing single user components.");
            ((ditn) this.c.b()).c(new dwzt(true != z ? "ModuleOrContainerUpdated" : "BootComplete"));
        }
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        ausn ausnVar = diud.a;
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        ausn ausnVar = diud.a;
    }

    public PersistentSingleUserModuleInitIntentOperation(diuf diufVar, diuf diufVar2) {
        this.b = (diuf) Objects.requireNonNull(diufVar);
        this.c = (diuf) Objects.requireNonNull(diufVar2);
    }
}
