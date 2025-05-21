package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dizd;
import defpackage.efdk;
import defpackage.ehkl;
import defpackage.ehla;
import defpackage.feen;
import defpackage.fehf;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BuyflowSubmitRequest extends BaseBuyflowLiteRequest {
    public static final Parcelable.Creator CREATOR = new dizd();
    public final byte[] d;
    public final ehla e;

    public BuyflowSubmitRequest(Account account, ehkl ehklVar, byte[] bArr, ehla ehlaVar, fehf fehfVar, List list) {
        super(account, (feen) ehkl.a.iB(7, null), ehklVar, fehfVar, list);
        this.d = bArr;
        this.e = ehlaVar;
    }

    @Override // com.google.android.gms.wallet.service.orchestration.BaseBuyflowLiteRequest, com.google.android.gms.wallet.service.GenericLiteProtoParcelable, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.d);
        efdk.o(this.e, parcel);
        super.writeToParcel(parcel, i);
    }

    public BuyflowSubmitRequest(Account account, byte[] bArr, byte[] bArr2, ehla ehlaVar, fehf fehfVar, List list) {
        super(account, (feen) ehkl.a.iB(7, null), bArr, fehfVar, list);
        this.d = bArr2;
        this.e = ehlaVar;
    }
}
