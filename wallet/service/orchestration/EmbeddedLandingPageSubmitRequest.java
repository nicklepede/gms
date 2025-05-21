package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dizg;
import defpackage.faua;
import defpackage.feen;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class EmbeddedLandingPageSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dizg();

    public EmbeddedLandingPageSubmitRequest(Account account, faua fauaVar, List list) {
        super(account, (feen) faua.a.iB(7, null), fauaVar, list);
    }

    public EmbeddedLandingPageSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (feen) faua.a.iB(7, null), bArr, list);
    }
}
