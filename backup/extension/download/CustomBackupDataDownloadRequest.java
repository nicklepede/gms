package com.google.android.gms.backup.extension.download;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.akyd;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class CustomBackupDataDownloadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akyd();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}
