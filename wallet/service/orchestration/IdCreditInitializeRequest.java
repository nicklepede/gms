package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlll;
import defpackage.ekqt;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class IdCreditInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlll();

    public IdCreditInitializeRequest(Account account, ekqt ekqtVar) {
        super(account, (fgtg) ekqt.a.iQ(7, null), ekqtVar);
    }

    public IdCreditInitializeRequest(Account account, byte[] bArr) {
        super(account, (fgtg) ekqt.a.iQ(7, null), bArr);
    }
}
