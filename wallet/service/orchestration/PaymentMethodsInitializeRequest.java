package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.djbi;
import defpackage.eiep;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PaymentMethodsInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new djbi();

    public PaymentMethodsInitializeRequest(Account account, eiep eiepVar) {
        super(account, (feen) eiep.a.iB(7, null), eiepVar);
    }

    public PaymentMethodsInitializeRequest(Account account, byte[] bArr) {
        super(account, (feen) eiep.a.iB(7, null), bArr);
    }
}
