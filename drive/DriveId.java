package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.axlp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class DriveId extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new axlp();
    final String a;
    final long b;
    final long c;
    final int d;
    volatile String e = null;

    public DriveId(String str, long j, long j2, int i) {
        this.a = str;
        boolean z = true;
        arwm.b(!"".equals(str));
        if (str == null && j == -1) {
            z = false;
            j = -1;
        }
        arwm.b(z);
        this.b = j;
        this.c = j2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj != null && obj.getClass() == DriveId.class) {
            DriveId driveId = (DriveId) obj;
            if (driveId.c != this.c) {
                return false;
            }
            long j = driveId.b;
            if (j == -1) {
                if (this.b == -1) {
                    String str2 = driveId.a;
                    arwm.s(str2);
                    return str2.equals(this.a);
                }
                j = -1;
            }
            String str3 = this.a;
            if (str3 != null && (str = driveId.a) != null) {
                return j == this.b && str.equals(str3);
            }
            if (j == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        if (j == -1) {
            String str = this.a;
            arwm.s(str);
            return str.hashCode();
        }
        return (this.c + String.valueOf(j)).hashCode();
    }

    public final String toString() {
        return super.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 2, str, false);
        arxc.q(parcel, 3, this.b);
        arxc.q(parcel, 4, this.c);
        arxc.o(parcel, 5, this.d);
        arxc.c(parcel, a);
    }
}
