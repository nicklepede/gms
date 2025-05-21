package com.google.android.gms.app.phone.settings.licenses;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.chimera.licenses.ChimeraLicense;
import com.google.android.chimera.licenses.License;
import defpackage.tqb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class LicenseWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR = new tqb();
    public final ChimeraLicense a;
    public final License b;
    public final String c;

    public LicenseWrapper(ChimeraLicense chimeraLicense) {
        this.a = chimeraLicense;
        this.b = null;
        this.c = null;
    }

    public final String a() {
        ChimeraLicense chimeraLicense = this.a;
        if (chimeraLicense != null) {
            return chimeraLicense.getLibraryName();
        }
        License license = this.b;
        if (license != null) {
            return license.a;
        }
        throw new AssertionError();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return a();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
    }

    public LicenseWrapper(License license, String str) {
        this.a = null;
        this.b = license;
        this.c = str;
    }

    public LicenseWrapper(Parcel parcel) {
        this.a = (ChimeraLicense) parcel.readParcelable(ChimeraLicense.class.getClassLoader());
        this.b = (License) parcel.readParcelable(License.class.getClassLoader());
        this.c = parcel.readString();
    }
}
