package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import defpackage.dlkt;
import defpackage.ejwx;
import defpackage.fgtg;
import defpackage.fgvy;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BuyflowInitializeRequest extends BaseBuyflowLiteRequest {
    public static final Parcelable.Creator CREATOR = new dlkt();

    public BuyflowInitializeRequest(Account account, ejwx ejwxVar, fgvy fgvyVar) {
        super(account, (fgtg) ejwx.a.iQ(7, null), ejwxVar, fgvyVar, (List) null);
    }

    public BuyflowInitializeRequest(Account account, byte[] bArr, fgvy fgvyVar) {
        super(account, (fgtg) ejwx.a.iQ(7, null), bArr, fgvyVar, (List) null);
    }
}
