package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dllo;
import defpackage.ekre;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class InstrumentManagerInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dllo();

    public InstrumentManagerInitializeRequest(Account account, ekre ekreVar) {
        super(account, (fgtg) ekre.a.iQ(7, null), ekreVar);
    }

    public InstrumentManagerInitializeRequest(Account account, byte[] bArr) {
        super(account, (fgtg) ekre.a.iQ(7, null), bArr);
    }
}
