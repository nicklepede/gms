package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlln;
import defpackage.ekra;
import defpackage.fgtg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class IdCreditSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlln();

    public IdCreditSubmitRequest(Account account, ekra ekraVar, List list) {
        super(account, (fgtg) ekra.a.iQ(7, null), ekraVar, list);
    }

    public IdCreditSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (fgtg) ekra.a.iQ(7, null), bArr, list);
    }
}
