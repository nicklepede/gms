package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dllg;
import defpackage.ekqr;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GenericSelectorSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dllg();

    public GenericSelectorSubmitRequest(Account account, ekqr ekqrVar) {
        super(account, (fgtg) ekqr.a.iQ(7, null), ekqrVar);
    }

    public GenericSelectorSubmitRequest(Account account, byte[] bArr) {
        super(account, (fgtg) ekqr.a.iQ(7, null), bArr);
    }
}
