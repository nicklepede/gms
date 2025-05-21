package com.google.android.gms.time.trustedtime.intentops;

import android.content.Intent;
import defpackage.anya;
import defpackage.asot;
import defpackage.dghq;
import defpackage.dgii;
import defpackage.dgiy;
import defpackage.dgja;
import defpackage.dgjb;
import defpackage.dgjd;
import defpackage.dupg;
import defpackage.duut;
import defpackage.duuw;
import defpackage.ejhf;
import defpackage.fsnk;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class PersistentSingleUserModuleInitIntentOperation extends anya {
    private static final duut a = new duuw("PersistentSingleUserModuleInitIntentOperation");
    private final dgja b;
    private final dgja c;

    public PersistentSingleUserModuleInitIntentOperation() {
        this(dgjd.a, dgii.b);
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        asot asotVar = dgiy.a;
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (fsnk.a.a().o()) {
            ((ejhf) ((ejhf) dgiy.a.h()).ah((char) 11414)).B("Current Configuration %s", dghq.a());
        }
        if (!((Boolean) this.b.b()).booleanValue()) {
            asot asotVar = dgiy.a;
            return;
        }
        if (!dgjb.b()) {
            ((ejhf) ((ejhf) dgiy.a.j()).ah(11412)).B("[%s] TrustedTime is not enabled, ignoring module init.", a);
            return;
        }
        boolean z = (i & 2) != 0;
        int i2 = i & 4;
        int i3 = i & 8;
        if (!z && i2 == 0 && i3 == 0) {
            ((ejhf) ((ejhf) dgiy.a.h()).ah((char) 11411)).x("Skip initializing when nothing is updated.");
        } else {
            ((ejhf) ((ejhf) dgiy.a.h()).ah((char) 11410)).x("Initializing single user components.");
            ((dgii) this.c.b()).c(new dupg(true != z ? "ModuleOrContainerUpdated" : "BootComplete"));
        }
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        asot asotVar = dgiy.a;
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        asot asotVar = dgiy.a;
    }

    public PersistentSingleUserModuleInitIntentOperation(dgja dgjaVar, dgja dgjaVar2) {
        this.b = (dgja) Objects.requireNonNull(dgjaVar);
        this.c = (dgja) Objects.requireNonNull(dgjaVar2);
    }
}
