package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzb;
import defpackage.bdvj;
import defpackage.bdvk;
import defpackage.bdwj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bdwj();
    private final bdvk a;

    public COSEAlgorithmIdentifier(bdvk bdvkVar) {
        atzb.s(bdvkVar);
        this.a = bdvkVar;
    }

    public static COSEAlgorithmIdentifier b(int i) {
        return new COSEAlgorithmIdentifier(bdvj.a(i));
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
