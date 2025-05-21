package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.djbs;
import defpackage.favi;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class UpstreamInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new djbs();

    public UpstreamInitializeRequest(Account account, favi faviVar) {
        super(account, (feen) favi.a.iB(7, null), faviVar);
    }

    public UpstreamInitializeRequest(Account account, byte[] bArr) {
        super(account, (feen) favi.a.iB(7, null), bArr);
    }
}
