package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.djbj;
import defpackage.eieu;
import defpackage.feen;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PaymentMethodsSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new djbj();

    public PaymentMethodsSubmitRequest(Account account, eieu eieuVar, List list) {
        super(account, (feen) eieu.a.iB(7, null), eieuVar, list);
    }

    public PaymentMethodsSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (feen) eieu.a.iB(7, null), bArr, list);
    }
}
