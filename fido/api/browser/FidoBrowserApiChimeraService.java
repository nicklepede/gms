package com.google.android.gms.fido.api.browser;

import com.google.android.gms.chimera.modules.fido.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import defpackage.ausn;
import defpackage.bdcr;
import defpackage.bdcx;
import defpackage.becj;
import defpackage.beov;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.ekvi;
import defpackage.elhz;
import defpackage.eluo;
import defpackage.emgt;
import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FidoBrowserApiChimeraService extends bzot {
    private static final elhz a = elhz.K("android.permission-group.LOCATION", "android.permission-group.STORAGE");
    private static final ausn b = beov.c("FidoBrowserApiChimeraService");

    public FidoBrowserApiChimeraService() {
        super(149, "com.google.android.gms.fido.fido2.privileged.START", a, 3, 9);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        if (!str.equals("com.google.android.gms")) {
            ekvi c = bdcx.c(str);
            if (!c.h()) {
                ((eluo) b.i()).B("Rejecting browser request from %s because of failure to obtain package signature", str);
            } else if (!bdcr.a(AppContextProvider.a(), str, (ByteBuffer) c.c())) {
                ((eluo) b.i()).P("Rejecting browser request from %s because the hash of the certificate (%s) is not recognised.", str, emgt.f.n(((ByteBuffer) c.c()).array()));
            }
            bzozVar.a(ErrorCode.ABORT_ERR.m, null);
            return;
        }
        bzozVar.c(new becj(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
