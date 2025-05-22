package com.google.android.gms.wallet.pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsPayload;
import defpackage.dleq;
import defpackage.dler;
import defpackage.ehqn;
import defpackage.ejwc;
import defpackage.fddm;
import defpackage.fgtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PmResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dleq();
    public SecurePaymentsPayload a;
    public String b;
    public byte[] c;
    public String d;
    public fddm e;
    public String f;
    public ejwc g;

    private PmResult() {
    }

    public static dler a() {
        return new dler(new PmResult());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.d);
        ehqn.o(this.e, parcel);
        parcel.writeString(this.f);
        ehqn.o(this.g, parcel);
    }

    public PmResult(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.createByteArray();
        this.a = (SecurePaymentsPayload) parcel.readParcelable(getClass().getClassLoader());
        this.d = parcel.readString();
        this.e = (fddm) ehqn.f(parcel, (fgtg) fddm.a.iQ(7, null));
        this.f = parcel.readString();
        this.g = (ejwc) ehqn.f(parcel, (fgtg) ejwc.a.iQ(7, null));
    }
}
