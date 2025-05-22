package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlnd;
import defpackage.fdiy;
import defpackage.fgtg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PurchaseManagerInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlnd();

    public PurchaseManagerInitializeRequest(Account account, fdiy fdiyVar) {
        super(account, (fgtg) fdiy.a.iQ(7, null), fdiyVar, (List) null);
    }

    public PurchaseManagerInitializeRequest(Account account, byte[] bArr) {
        super(account, (fgtg) fdiy.a.iQ(7, null), bArr, (List) null);
    }
}
