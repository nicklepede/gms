package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dizv;
import defpackage.eidy;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class InstrumentManagerInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dizv();

    public InstrumentManagerInitializeRequest(Account account, eidy eidyVar) {
        super(account, (feen) eidy.a.iB(7, null), eidyVar);
    }

    public InstrumentManagerInitializeRequest(Account account, byte[] bArr) {
        super(account, (feen) eidy.a.iB(7, null), bArr);
    }
}
