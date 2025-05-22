package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlkn;
import defpackage.ejwn;
import defpackage.fgtg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AddInstrumentInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlkn();

    public AddInstrumentInitializeRequest(Account account, ejwn ejwnVar) {
        super(account, (fgtg) ejwn.a.iQ(7, null), ejwnVar, (List) null);
    }

    public AddInstrumentInitializeRequest(Account account, byte[] bArr) {
        super(account, (fgtg) ejwn.a.iQ(7, null), bArr, (List) null);
    }
}
