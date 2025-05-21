package com.google.android.gms.backup.settings.backupnow;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.ajio;
import defpackage.ajjf;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eiuu;
import defpackage.fllt;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackUpNowApiChimeraService extends bxgd {
    private final ajjf a;

    public BackUpNowApiChimeraService() {
        super(175, "com.google.android.gms.backup.ACTION_BACKUP_NOW", Collections.EMPTY_SET, 0, 10, eiuu.G(fllt.a.a().z().b));
        this.a = new ajjf();
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new ajio(this, l(), this.a, getServiceRequest.f, getServiceRequest.p));
    }
}
