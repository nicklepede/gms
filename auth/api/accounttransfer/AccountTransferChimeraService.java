package com.google.android.gms.auth.api.accounttransfer;

import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.atzs;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.xlf;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AccountTransferChimeraService extends bzot {
    public static final /* synthetic */ int a = 0;

    public AccountTransferChimeraService() {
        super(128, "com.google.android.gms.auth.api.accounttransfer.service.START", Collections.EMPTY_SET, 3, 9);
    }

    public static DeviceAuthInfo b(Bundle bundle) {
        return (DeviceAuthInfo) atzs.a(bundle.getByteArray("deviceAuth"), DeviceAuthInfo.CREATOR);
    }

    public static ArrayList c(Bundle bundle) {
        return bundle.getStringArrayList("accountTypes");
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new xlf(this, l(), getServiceRequest));
    }
}
