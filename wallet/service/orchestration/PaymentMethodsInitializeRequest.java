package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlnb;
import defpackage.ekrv;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PaymentMethodsInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlnb();

    public PaymentMethodsInitializeRequest(Account account, ekrv ekrvVar) {
        super(account, (fgtg) ekrv.a.iQ(7, null), ekrvVar);
    }

    public PaymentMethodsInitializeRequest(Account account, byte[] bArr) {
        super(account, (fgtg) ekrv.a.iQ(7, null), bArr);
    }
}
