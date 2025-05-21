package com.google.android.gms.fido.api.browser;

import com.google.android.gms.chimera.modules.fido.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import defpackage.asot;
import defpackage.bayt;
import defpackage.bayz;
import defpackage.bbyr;
import defpackage.bcni;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.eiid;
import defpackage.eiuu;
import defpackage.ejhf;
import defpackage.ejtk;
import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FidoBrowserApiChimeraService extends bxgd {
    private static final eiuu a = eiuu.K("android.permission-group.LOCATION", "android.permission-group.STORAGE");
    private static final asot b = bcni.c("FidoBrowserApiChimeraService");

    public FidoBrowserApiChimeraService() {
        super(149, "com.google.android.gms.fido.fido2.privileged.START", a, 3, 9);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        String str = getServiceRequest.f;
        if (!str.equals("com.google.android.gms")) {
            eiid c = bayz.c(str);
            if (!c.h()) {
                ((ejhf) b.i()).B("Rejecting browser request from %s because of failure to obtain package signature", str);
            } else if (!bayt.a(AppContextProvider.a(), str, (ByteBuffer) c.c())) {
                ((ejhf) b.i()).P("Rejecting browser request from %s because the hash of the certificate (%s) is not recognised.", str, ejtk.f.n(((ByteBuffer) c.c()).array()));
            }
            bxgjVar.a(ErrorCode.ABORT_ERR.m, null);
            return;
        }
        bxgjVar.c(new bbyr(l(), getServiceRequest.f, getServiceRequest.p));
    }
}
