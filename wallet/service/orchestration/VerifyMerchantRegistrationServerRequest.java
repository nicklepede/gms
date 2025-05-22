package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlno;
import defpackage.ekrr;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class VerifyMerchantRegistrationServerRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlno();

    public VerifyMerchantRegistrationServerRequest(Account account, ekrr ekrrVar) {
        super(account, (fgtg) ekrr.a.iQ(7, null), ekrrVar);
    }

    public VerifyMerchantRegistrationServerRequest(Account account, byte[] bArr) {
        super(account, (fgtg) ekrr.a.iQ(7, null), bArr);
    }
}
