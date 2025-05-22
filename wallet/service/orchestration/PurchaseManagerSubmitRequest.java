package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlne;
import defpackage.fdjc;
import defpackage.fgtg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PurchaseManagerSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlne();

    public PurchaseManagerSubmitRequest(Account account, fdjc fdjcVar, List list) {
        super(account, (fgtg) fdjc.a.iQ(7, null), fdjcVar, list);
    }

    public PurchaseManagerSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (fgtg) fdjc.a.iQ(7, null), bArr, list);
    }
}
