package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlnm;
import defpackage.fdkb;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class UpstreamSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlnm();

    public UpstreamSubmitRequest(Account account, fdkb fdkbVar) {
        super(account, (fgtg) fdkb.a.iQ(7, null), fdkbVar);
    }

    public UpstreamSubmitRequest(Account account, byte[] bArr) {
        super(account, (fgtg) fdkb.a.iQ(7, null), bArr);
    }
}
