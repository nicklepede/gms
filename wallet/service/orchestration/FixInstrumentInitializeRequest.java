package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dizj;
import defpackage.fauc;
import defpackage.feen;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class FixInstrumentInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dizj();

    public FixInstrumentInitializeRequest(Account account, fauc faucVar) {
        super(account, (feen) fauc.a.iB(7, null), faucVar, (List) null);
    }

    public FixInstrumentInitializeRequest(Account account, byte[] bArr) {
        super(account, (feen) fauc.a.iB(7, null), bArr, (List) null);
    }
}
