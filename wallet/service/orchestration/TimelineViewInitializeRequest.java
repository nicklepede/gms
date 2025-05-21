package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.djbq;
import defpackage.favb;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TimelineViewInitializeRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new djbq();

    public TimelineViewInitializeRequest(Account account, favb favbVar) {
        super(account, (feen) favb.a.iB(7, null), favbVar);
    }

    public TimelineViewInitializeRequest(Account account, byte[] bArr) {
        super(account, (feen) favb.a.iB(7, null), bArr);
    }
}
