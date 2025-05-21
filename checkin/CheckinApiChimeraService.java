package com.google.android.gms.checkin;

import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.anpz;
import defpackage.antd;
import defpackage.arxo;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.ejdg;
import defpackage.fmdg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CheckinApiChimeraService extends bxgd {
    private static final arxo a = antd.a("CheckinApiChimeraService");
    private static final eiuu b = new ejdg("org.chromium.arc.gms");

    public CheckinApiChimeraService() {
        super(130, "com.google.android.gms.checkin.START", ejck.a, 1, true != fmdg.c() ? 9 : 0, b);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        a.h("onGetService", new Object[0]);
        bxgjVar.c(new anpz(this, l()));
    }
}
