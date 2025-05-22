package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.dlnk;
import defpackage.fdjv;
import defpackage.fgtg;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TimelineViewSubmitRequest extends GenericLiteProtoParcelable {
    public static final Parcelable.Creator CREATOR = new dlnk();

    public TimelineViewSubmitRequest(Account account, fdjv fdjvVar, List list) {
        super(account, (fgtg) fdjv.a.iQ(7, null), fdjvVar, list);
    }

    public TimelineViewSubmitRequest(Account account, byte[] bArr, List list) {
        super(account, (fgtg) fdjv.a.iQ(7, null), bArr, list);
    }
}
