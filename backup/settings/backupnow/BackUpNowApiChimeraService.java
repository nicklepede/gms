package com.google.android.gms.backup.settings.backupnow;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aljg;
import defpackage.aljx;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.elhz;
import defpackage.fodd;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackUpNowApiChimeraService extends bzot {
    private final aljx a;

    public BackUpNowApiChimeraService() {
        super(175, "com.google.android.gms.backup.ACTION_BACKUP_NOW", Collections.EMPTY_SET, 0, 10, elhz.G(fodd.a.lK().z().b));
        this.a = new aljx();
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new aljg(this, l(), this.a, getServiceRequest.f, getServiceRequest.p));
    }
}
