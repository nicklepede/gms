package com.google.android.gms.backup.extension.download;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aixn;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CustomBackupDataDownloadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aixn();
    public final int a;

    @Deprecated
    public final int b;

    public CustomBackupDataDownloadRequest(int i) {
        this.a = i;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof CustomBackupDataDownloadRequest) && this.a == ((CustomBackupDataDownloadRequest) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "CustomBackupDataDownloadRequest{networkPreference=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.o(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}
