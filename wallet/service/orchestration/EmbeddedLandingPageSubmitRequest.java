package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlkz;
import defpackage.fdip;
import defpackage.fgtg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class EmbeddedLandingPageSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlkz();

    public EmbeddedLandingPageSubmitRequest(Account account, fdip fdipVar, List list) {
        super(account, (fgtg) fdip.a.iQ(7, null), fdipVar, list);
    }

    public EmbeddedLandingPageSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (fgtg) fdip.a.iQ(7, null), bArr, list);
    }
}
