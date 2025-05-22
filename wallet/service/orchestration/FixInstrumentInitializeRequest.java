package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dllc;
import defpackage.fdir;
import defpackage.fgtg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FixInstrumentInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dllc();

    public FixInstrumentInitializeRequest(Account account, fdir fdirVar) {
        super(account, (fgtg) fdir.a.iQ(7, null), fdirVar, (List) null);
    }

    public FixInstrumentInitializeRequest(Account account, byte[] bArr) {
        super(account, (fgtg) fdir.a.iQ(7, null), bArr, (List) null);
    }
}
