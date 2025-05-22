package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dllf;
import defpackage.ekql;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GenericSelectorInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dllf();

    public GenericSelectorInitializeRequest(Account account, ekql ekqlVar) {
        super(account, (fgtg) ekql.a.iQ(7, null), ekqlVar);
    }

    public GenericSelectorInitializeRequest(Account account, byte[] bArr) {
        super(account, (fgtg) ekql.a.iQ(7, null), bArr);
    }
}
