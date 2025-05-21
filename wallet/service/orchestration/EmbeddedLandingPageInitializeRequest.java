package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dizf;
import defpackage.fatw;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class EmbeddedLandingPageInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dizf();

    public EmbeddedLandingPageInitializeRequest(Account account, fatw fatwVar) {
        super(account, (feen) fatw.a.iB(7, null), fatwVar);
    }

    public EmbeddedLandingPageInitializeRequest(Account account, byte[] bArr) {
        super(account, (feen) fatw.a.iB(7, null), bArr);
    }
}
