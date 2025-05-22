package com.google.android.gms.wallet.service.orchestration;

import android.os.Parcelable;
import com.google.android.wallet.ui.tapandpay.TapAndPayConsumerVerificationResponse;
import defpackage.dlle;
import defpackage.dlpo;
import defpackage.fdec;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GcoreTapAndPayConsumerVerificationServerResponse extends TapAndPayConsumerVerificationResponse implements dlpo {
    public static final Parcelable.Creator CREATOR = new dlle();

    public GcoreTapAndPayConsumerVerificationServerResponse(fdec fdecVar, int i) {
        super(fdecVar, i);
    }

    @Override // defpackage.dlpo
    public final boolean a() {
        return false;
    }
}
