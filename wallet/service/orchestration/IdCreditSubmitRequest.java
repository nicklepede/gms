package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dizu;
import defpackage.eidu;
import defpackage.feen;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class IdCreditSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dizu();

    public IdCreditSubmitRequest(Account account, eidu eiduVar, List list) {
        super(account, (feen) eidu.a.iB(7, null), eiduVar, list);
    }

    public IdCreditSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (feen) eidu.a.iB(7, null), bArr, list);
    }
}
