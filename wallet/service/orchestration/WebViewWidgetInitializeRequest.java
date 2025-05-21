package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.djbw;
import defpackage.favp;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WebViewWidgetInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new djbw();

    public WebViewWidgetInitializeRequest(Account account, favp favpVar) {
        super(account, (feen) favp.a.iB(7, null), favpVar);
    }

    public WebViewWidgetInitializeRequest(Account account, byte[] bArr) {
        super(account, (feen) favp.a.iB(7, null), bArr);
    }
}
