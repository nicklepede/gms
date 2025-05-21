package com.google.android.gms.auth.api.accounttransfer;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.arxd;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.vpe;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AccountTransferChimeraService extends bxgd {
    public static final /* synthetic */ int a = 0;

    public AccountTransferChimeraService() {
        super(128, "com.google.android.gms.auth.api.accounttransfer.service.START", Collections.EMPTY_SET, 3, 9);
    }

    public static DeviceAuthInfo b(Bundle bundle) {
        return (DeviceAuthInfo) arxd.a(bundle.getByteArray("deviceAuth"), DeviceAuthInfo.CREATOR);
    }

    public static ArrayList c(Bundle bundle) {
        return bundle.getStringArrayList("accountTypes");
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new vpe(this, l(), getServiceRequest));
    }
}
