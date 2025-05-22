package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlld;
import defpackage.fdiv;
import defpackage.fgtg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FixInstrumentSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlld();

    public FixInstrumentSubmitRequest(Account account, fdiv fdivVar, List list) {
        super(account, (fgtg) fdiv.a.iQ(7, null), fdivVar, list);
    }

    public FixInstrumentSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (fgtg) fdiv.a.iQ(7, null), bArr, list);
    }
}
