package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dllh;
import defpackage.fdjh;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GetInstrumentAvailabilityServerRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dllh();

    public GetInstrumentAvailabilityServerRequest(Account account, fdjh fdjhVar) {
        super(account, (fgtg) fdjh.a.iQ(7, null), fdjhVar);
    }

    public GetInstrumentAvailabilityServerRequest(Account account, byte[] bArr) {
        super(account, (fgtg) fdjh.a.iQ(7, null), bArr);
    }
}
