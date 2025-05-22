package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlky;
import defpackage.fdil;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class EmbeddedLandingPageInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlky();

    public EmbeddedLandingPageInitializeRequest(Account account, fdil fdilVar) {
        super(account, (fgtg) fdil.a.iQ(7, null), fdilVar);
    }

    public EmbeddedLandingPageInitializeRequest(Account account, byte[] bArr) {
        super(account, (fgtg) fdil.a.iQ(7, null), bArr);
    }
}
