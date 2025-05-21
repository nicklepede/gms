package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dizo;
import defpackage.faus;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GetInstrumentAvailabilityServerRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dizo();

    public GetInstrumentAvailabilityServerRequest(Account account, faus fausVar) {
        super(account, (feen) faus.a.iB(7, null), fausVar);
    }

    public GetInstrumentAvailabilityServerRequest(Account account, byte[] bArr) {
        super(account, (feen) faus.a.iB(7, null), bArr);
    }
}
