package com.google.android.gms.wallet.service.orchestration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.shared.service.ServerResponse;
import defpackage.dlkv;
import defpackage.dlpo;
import defpackage.ehqn;
import defpackage.fgvy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BuyflowResponse implements Parcelable, dlpo {
    public static final Parcelable.Creator CREATOR = new dlkv();
    public final ServerResponse a;
    public final fgvy b;
    public int c = 1;

    public BuyflowResponse(ServerResponse serverResponse, fgvy fgvyVar) {
        this.a = serverResponse;
        this.b = fgvyVar;
    }

    @Override // defpackage.dlpo
    public final boolean a() {
        return this.a.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ehqn.o(this.b, parcel);
        this.a.writeToParcel(parcel, i);
        int i2 = this.c;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i3);
    }
}
