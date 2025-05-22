package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlnl;
import defpackage.fdjy;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UpstreamInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlnl();

    public UpstreamInitializeRequest(Account account, fdjy fdjyVar) {
        super(account, (fgtg) fdjy.a.iQ(7, null), fdjyVar);
    }

    public UpstreamInitializeRequest(Account account, byte[] bArr) {
        super(account, (fgtg) fdjy.a.iQ(7, null), bArr);
    }
}
