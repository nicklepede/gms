package com.google.android.gms.wallet.service.orchestration;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.wallet.service.GenericLiteProtoParcelable;
import defpackage.efdk;
import defpackage.feeg;
import defpackage.feen;
import defpackage.fehf;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public abstract class BaseBuyflowLiteRequest extends GenericLiteProtoParcelable {
    private fehf d;

    public BaseBuyflowLiteRequest(Account account, feen feenVar, feeg feegVar, fehf fehfVar, List list) {
        super(account, feenVar, feegVar, list);
        this.d = fehfVar;
    }

    public final fehf c() {
        if (this.d == null) {
            this.d = fehf.a;
        }
        return this.d;
    }

    @Override // com.google.android.gms.wallet.service.GenericLiteProtoParcelable, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        fehf fehfVar = this.d;
        if (fehfVar != null) {
            efdk.o(fehfVar, parcel);
        }
        super.writeToParcel(parcel, i);
    }

    public BaseBuyflowLiteRequest(Account account, feen feenVar, byte[] bArr, fehf fehfVar, List list) {
        super(account, feenVar, bArr, list);
        this.d = fehfVar;
    }
}
