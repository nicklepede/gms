package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlnp;
import defpackage.fdkf;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WebViewWidgetInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlnp();

    public WebViewWidgetInitializeRequest(Account account, fdkf fdkfVar) {
        super(account, (fgtg) fdkf.a.iQ(7, null), fdkfVar);
    }

    public WebViewWidgetInitializeRequest(Account account, byte[] bArr) {
        super(account, (fgtg) fdkf.a.iQ(7, null), bArr);
    }
}
