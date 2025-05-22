package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dlkw;
import defpackage.ehqn;
import defpackage.ejxr;
import defpackage.ejyg;
import defpackage.fgtg;
import defpackage.fgvy;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BuyflowSubmitRequest extends BaseBuyflowLiteRequest {
    public static final Parcelable.Creator CREATOR = new dlkw();
    public final byte[] d;
    public final ejyg e;

    public BuyflowSubmitRequest(Account account, ejxr ejxrVar, byte[] bArr, ejyg ejygVar, fgvy fgvyVar, List list) {
        super(account, (fgtg) ejxr.a.iQ(7, null), ejxrVar, fgvyVar, list);
        this.d = bArr;
        this.e = ejygVar;
    }

    @Override // com.google.android.gms.wallet.service.orchestration.BaseBuyflowLiteRequest, com.google.android.gms.wallet.service.GenericLiteProtoParcelable, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.d);
        ehqn.o(this.e, parcel);
        super.writeToParcel(parcel, i);
    }

    public BuyflowSubmitRequest(Account account, byte[] bArr, byte[] bArr2, ejyg ejygVar, fgvy fgvyVar, List list) {
        super(account, (fgtg) ejxr.a.iQ(7, null), bArr, fgvyVar, list);
        this.d = bArr2;
        this.e = ejygVar;
    }
}
