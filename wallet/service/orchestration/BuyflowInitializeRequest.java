package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import defpackage.diza;
import defpackage.ehjr;
import defpackage.feen;
import defpackage.fehf;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BuyflowInitializeRequest extends BaseBuyflowLiteRequest {
    public static final Parcelable.Creator CREATOR = new diza();

    public BuyflowInitializeRequest(Account account, ehjr ehjrVar, fehf fehfVar) {
        super(account, (feen) ehjr.a.iB(7, null), ehjrVar, fehfVar, (List) null);
    }

    public BuyflowInitializeRequest(Account account, byte[] bArr, fehf fehfVar) {
        super(account, (feen) ehjr.a.iB(7, null), bArr, fehfVar, (List) null);
    }
}
