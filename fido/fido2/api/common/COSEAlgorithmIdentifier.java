package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arwm;
import defpackage.bbrs;
import defpackage.bbrt;
import defpackage.bbss;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bbss();
    private final bbrt a;

    public COSEAlgorithmIdentifier(bbrt bbrtVar) {
        arwm.s(bbrtVar);
        this.a = bbrtVar;
    }

    public static COSEAlgorithmIdentifier b(int i) {
        return new COSEAlgorithmIdentifier(bbrs.a(i));
    }

    public final int a() {
        return this.a.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.a.a() == ((COSEAlgorithmIdentifier) obj).a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "COSEAlgorithmIdentifier{algorithm=" + this.a.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
