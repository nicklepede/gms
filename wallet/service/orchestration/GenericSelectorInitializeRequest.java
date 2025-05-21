package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dizm;
import defpackage.eidf;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GenericSelectorInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dizm();

    public GenericSelectorInitializeRequest(Account account, eidf eidfVar) {
        super(account, (feen) eidf.a.iB(7, null), eidfVar);
    }

    public GenericSelectorInitializeRequest(Account account, byte[] bArr) {
        super(account, (feen) eidf.a.iB(7, null), bArr);
    }
}
