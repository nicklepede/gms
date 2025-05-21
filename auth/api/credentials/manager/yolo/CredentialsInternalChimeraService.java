package com.google.android.gms.auth.api.credentials.manager.yolo;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.auth.api.credentials.manager.yolo.CredentialsInternalChimeraService;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.asot;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxhc;
import defpackage.ejck;
import defpackage.xul;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class CredentialsInternalChimeraService extends bxgd {
    public static final asot a = xul.a("CredentialsInternalChimeraService");

    public CredentialsInternalChimeraService() {
        super(179, "com.google.android.gms.auth.api.credentials.internal_service.START", ejck.a, 0, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        Bundle bundle = getServiceRequest.i;
        final String string = bundle == null ? null : bundle.getString("log_session_id");
        bxgjVar.c(new bxhc() { // from class: yqb
            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return new xud(CredentialsInternalChimeraService.this, string);
            }
        });
    }
}
