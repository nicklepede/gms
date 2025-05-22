package com.google.android.gms.auth.api.credentials.manager.yolo;

import android.os.Bundle;
import android.os.IBinder;
import com.google.android.gms.auth.api.credentials.manager.yolo.CredentialsInternalChimeraService;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.ausn;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzps;
import defpackage.elpp;
import defpackage.zsi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class CredentialsInternalChimeraService extends bzot {
    public static final ausn a = zsi.a("CredentialsInternalChimeraService");

    public CredentialsInternalChimeraService() {
        super(179, "com.google.android.gms.auth.api.credentials.internal_service.START", elpp.a, 0, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        Bundle bundle = getServiceRequest.i;
        final String string = bundle == null ? null : bundle.getString("log_session_id");
        bzozVar.c(new bzps() { // from class: aanz
            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return new zsa(CredentialsInternalChimeraService.this, string);
            }
        });
    }
}
