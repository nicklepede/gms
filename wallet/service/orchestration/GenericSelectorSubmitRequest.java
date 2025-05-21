package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dizn;
import defpackage.eidl;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GenericSelectorSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dizn();

    public GenericSelectorSubmitRequest(Account account, eidl eidlVar) {
        super(account, (feen) eidl.a.iB(7, null), eidlVar);
    }

    public GenericSelectorSubmitRequest(Account account, byte[] bArr) {
        super(account, (feen) eidl.a.iB(7, null), bArr);
    }
}
