package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.diyu;
import defpackage.ehjh;
import defpackage.feen;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AddInstrumentInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new diyu();

    public AddInstrumentInitializeRequest(Account account, ehjh ehjhVar) {
        super(account, (feen) ehjh.a.iB(7, null), ehjhVar, (List) null);
    }

    public AddInstrumentInitializeRequest(Account account, byte[] bArr) {
        super(account, (feen) ehjh.a.iB(7, null), bArr, (List) null);
    }
}
