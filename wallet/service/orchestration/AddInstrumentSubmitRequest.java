package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.diyv;
import defpackage.ehjl;
import defpackage.feen;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class AddInstrumentSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new diyv();

    public AddInstrumentSubmitRequest(Account account, ehjl ehjlVar, List list) {
        super(account, (feen) ehjl.a.iB(7, null), ehjlVar, list);
    }

    public AddInstrumentSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (feen) ehjl.a.iB(7, null), bArr, list);
    }
}
