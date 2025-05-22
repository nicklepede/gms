package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import defpackage.dlku;
import defpackage.ejxp;
import defpackage.fgtg;
import defpackage.fgvy;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BuyflowRefreshRequest extends BaseBuyflowLiteRequest {
    public static final Parcelable.Creator CREATOR = new dlku();

    public BuyflowRefreshRequest(Account account, ejxp ejxpVar, fgvy fgvyVar, List list) {
        super(account, (fgtg) ejxp.a.iQ(7, null), ejxpVar, fgvyVar, list);
    }

    public BuyflowRefreshRequest(Account account, byte[] bArr, fgvy fgvyVar, List list) {
        super(account, (fgtg) ejxp.a.iQ(7, null), bArr, fgvyVar, list);
    }
}
