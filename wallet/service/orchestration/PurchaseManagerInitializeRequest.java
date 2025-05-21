package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.djbk;
import defpackage.fauj;
import defpackage.feen;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PurchaseManagerInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new djbk();

    public PurchaseManagerInitializeRequest(Account account, fauj faujVar) {
        super(account, (feen) fauj.a.iB(7, null), faujVar, (List) null);
    }

    public PurchaseManagerInitializeRequest(Account account, byte[] bArr) {
        super(account, (feen) fauj.a.iB(7, null), bArr, (List) null);
    }
}
