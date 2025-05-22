package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlnj;
import defpackage.fdjr;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TimelineViewInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlnj();

    public TimelineViewInitializeRequest(Account account, fdjr fdjrVar) {
        super(account, (fgtg) fdjr.a.iQ(7, null), fdjrVar);
    }

    public TimelineViewInitializeRequest(Account account, byte[] bArr) {
        super(account, (fgtg) fdjr.a.iQ(7, null), bArr);
    }
}
