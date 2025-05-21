package com.google.android.gms.app.phone.settings.licenses;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.licenses.ChimeraLicenseSource;
import defpackage.eike;
import defpackage.tpx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class LicenseSourceWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new tpx();
    public final ChimeraLicenseSource a;
    public final String b;
    public final String c;
    public final String d;

    public LicenseSourceWrapper(ChimeraLicenseSource chimeraLicenseSource, String str) {
        this.a = chimeraLicenseSource;
        this.b = null;
        this.c = "Google Play services";
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
    }

    public LicenseSourceWrapper(String str, String str2, String str3) {
        this.a = null;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public LicenseSourceWrapper(Parcel parcel) {
        this.a = (ChimeraLicenseSource) parcel.readParcelable(ChimeraLicenseSource.class.getClassLoader());
        this.b = parcel.readString();
        String readString = parcel.readString();
        eike.e(readString);
        this.c = readString;
        this.d = parcel.readString();
    }
}
