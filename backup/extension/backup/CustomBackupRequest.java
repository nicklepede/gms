package com.google.android.gms.backup.extension.backup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.akxs;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class CustomBackupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akxs();
    public final int a;

    @Deprecated
    public final int b;
    public final boolean c;

    public CustomBackupRequest(int i, boolean z) {
        this.a = i;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CustomBackupRequest) {
            CustomBackupRequest customBackupRequest = (CustomBackupRequest) obj;
            if (this.a == customBackupRequest.a && this.c == customBackupRequest.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        return "CustomBackupRequest{networkPreference=" + this.a + ", userRequested=" + this.c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.o(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}
