package com.google.android.gms.wallet.service.orchestration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import defpackage.dizc;
import defpackage.djdv;
import defpackage.efdk;
import defpackage.fehf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BuyflowResponse implements Parcelable, djdv {
    public static final Parcelable.Creator CREATOR = new dizc();
    public final ServerResponse a;
    public final fehf b;
    public int c = 1;

    public BuyflowResponse(ServerResponse serverResponse, fehf fehfVar) {
        this.a = serverResponse;
        this.b = fehfVar;
    }

    @Override // defpackage.djdv
    public final boolean a() {
        return this.a.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        efdk.o(this.b, parcel);
        this.a.writeToParcel(parcel, i);
        int i2 = this.c;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i3);
    }
}
