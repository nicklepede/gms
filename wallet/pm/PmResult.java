package com.google.android.gms.wallet.pm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.pm.SecurePaymentsPayload;
import defpackage.ditf;
import defpackage.ditg;
import defpackage.efdk;
import defpackage.ehiw;
import defpackage.faox;
import defpackage.feen;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PmResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ditf();
    public SecurePaymentsPayload a;
    public String b;
    public byte[] c;
    public String d;
    public faox e;
    public String f;
    public ehiw g;

    private PmResult() {
    }

    public static ditg a() {
        return new ditg(new PmResult());
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
        efdk.o(this.e, parcel);
        parcel.writeString(this.f);
        efdk.o(this.g, parcel);
    }

    public PmResult(Parcel parcel) {
        this.b = parcel.readString();
        this.c = parcel.createByteArray();
        this.a = (SecurePaymentsPayload) parcel.readParcelable(getClass().getClassLoader());
        this.d = parcel.readString();
        this.e = (faox) efdk.f(parcel, (feen) faox.a.iB(7, null));
        this.f = parcel.readString();
        this.g = (ehiw) efdk.f(parcel, (feen) ehiw.a.iB(7, null));
    }
}
