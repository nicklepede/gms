package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import defpackage.dizb;
import defpackage.ehkj;
import defpackage.feen;
import defpackage.fehf;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BuyflowRefreshRequest extends BaseBuyflowLiteRequest {
    public static final Parcelable.Creator CREATOR = new dizb();

    public BuyflowRefreshRequest(Account account, ehkj ehkjVar, fehf fehfVar, List list) {
        super(account, (feen) ehkj.a.iB(7, null), ehkjVar, fehfVar, list);
    }

    public BuyflowRefreshRequest(Account account, byte[] bArr, fehf fehfVar, List list) {
        super(account, (feen) ehkj.a.iB(7, null), bArr, fehfVar, list);
    }
}
