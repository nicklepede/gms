package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlko;
import defpackage.ejwr;
import defpackage.fgtg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class AddInstrumentSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlko();

    public AddInstrumentSubmitRequest(Account account, ejwr ejwrVar, List list) {
        super(account, (fgtg) ejwr.a.iQ(7, null), ejwrVar, list);
    }

    public AddInstrumentSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (fgtg) ejwr.a.iQ(7, null), bArr, list);
    }
}
