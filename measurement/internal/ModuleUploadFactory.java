package com.google.android.gms.measurement.internal;

import android.content.Context;
import defpackage.cdoj;
import defpackage.cdok;
import defpackage.cdol;
import defpackage.cdom;
import defpackage.cdov;
import defpackage.cdoy;
import defpackage.cdsr;
import defpackage.cduf;
import defpackage.cdvc;
import defpackage.cdvv;
import defpackage.cdvw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ModuleUploadFactory extends cdvw {
    public ModuleUploadFactory(Context context) {
        super(context);
    }

    @Override // defpackage.cdvw
    public final cdov a(cdvv cdvvVar) {
        return new cdoj(cdvvVar);
    }

    @Override // defpackage.cdvw
    public final cdsr b(cdvv cdvvVar) {
        return new cdok(cdvvVar);
    }

    @Override // defpackage.cdvw
    public final cduf c(cdvv cdvvVar) {
        return new cdol(cdvvVar);
    }

    @Override // defpackage.cdvw
    public final cdvc d(cdvv cdvvVar) {
        return new cdoy(cdvvVar);
    }

    @Override // defpackage.cdvw
    public final cdvv e() {
        return new cdom(this);
    }
}
