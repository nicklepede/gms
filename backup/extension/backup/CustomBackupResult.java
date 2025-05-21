package com.google.android.gms.backup.extension.backup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aixd;
import defpackage.arwm;
import defpackage.arxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CustomBackupResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aixd();
    public final boolean a;
    public final String b;

    public CustomBackupResult(boolean z, String str) {
        arwm.s(str);
        if ((!str.isEmpty()) ^ z) {
            this.a = z;
            this.b = str;
        } else {
            throw new IllegalStateException("Either success or failure should be set. Successful=" + z + ", failureReason=" + str);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CustomBackupResult) {
            CustomBackupResult customBackupResult = (CustomBackupResult) obj;
            if (this.a == customBackupResult.a && this.b.equals(customBackupResult.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        return "CustomBackupResult{successful=" + this.a + ", failureReason=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.v(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}
