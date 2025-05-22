package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dllq;
import defpackage.ekrl;
import defpackage.fgtg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class InstrumentManagerSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dllq();

    public InstrumentManagerSubmitRequest(Account account, ekrl ekrlVar, List list) {
        super(account, (fgtg) ekrl.a.iQ(7, null), ekrlVar, list);
    }

    public InstrumentManagerSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (fgtg) ekrl.a.iQ(7, null), bArr, list);
    }
}
