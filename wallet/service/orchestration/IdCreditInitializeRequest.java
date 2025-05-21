package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dizs;
import defpackage.eidn;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class IdCreditInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dizs();

    public IdCreditInitializeRequest(Account account, eidn eidnVar) {
        super(account, (feen) eidn.a.iB(7, null), eidnVar);
    }

    public IdCreditInitializeRequest(Account account, byte[] bArr) {
        super(account, (feen) eidn.a.iB(7, null), bArr);
    }
}
