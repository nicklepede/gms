package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dizk;
import defpackage.faug;
import defpackage.feen;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class FixInstrumentSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dizk();

    public FixInstrumentSubmitRequest(Account account, faug faugVar, List list) {
        super(account, (feen) faug.a.iB(7, null), faugVar, list);
    }

    public FixInstrumentSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (feen) faug.a.iB(7, null), bArr, list);
    }
}
