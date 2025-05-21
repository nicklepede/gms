package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.djbl;
import defpackage.faun;
import defpackage.feen;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PurchaseManagerSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new djbl();

    public PurchaseManagerSubmitRequest(Account account, faun faunVar, List list) {
        super(account, (feen) faun.a.iB(7, null), faunVar, list);
    }

    public PurchaseManagerSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (feen) faun.a.iB(7, null), bArr, list);
    }
}
