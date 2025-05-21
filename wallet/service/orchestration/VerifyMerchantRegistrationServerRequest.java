package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.djbv;
import defpackage.eiel;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class VerifyMerchantRegistrationServerRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new djbv();

    public VerifyMerchantRegistrationServerRequest(Account account, eiel eielVar) {
        super(account, (feen) eiel.a.iB(7, null), eielVar);
    }

    public VerifyMerchantRegistrationServerRequest(Account account, byte[] bArr) {
        super(account, (feen) eiel.a.iB(7, null), bArr);
    }
}
