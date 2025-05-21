package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.djbt;
import defpackage.favl;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UpstreamSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new djbt();

    public UpstreamSubmitRequest(Account account, favl favlVar) {
        super(account, (feen) favl.a.iB(7, null), favlVar);
    }

    public UpstreamSubmitRequest(Account account, byte[] bArr) {
        super(account, (feen) favl.a.iB(7, null), bArr);
    }
}
