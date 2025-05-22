package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlnc;
import defpackage.eksa;
import defpackage.fgtg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PaymentMethodsSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlnc();

    public PaymentMethodsSubmitRequest(Account account, eksa eksaVar, List list) {
        super(account, (fgtg) eksa.a.iQ(7, null), eksaVar, list);
    }

    public PaymentMethodsSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (fgtg) eksa.a.iQ(7, null), bArr, list);
    }
}
