package com.google.android.gms.feedback;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.atzr;
import defpackage.bcpm;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class ServiceDumpRequest extends AbstractSafeParcelable {
    public static final bcpm CREATOR = new bcpm();
    public final String a;
    public final String b;
    public final String[] c;
    public final int d;
    public final boolean e;

    public ServiceDumpRequest(String str, String str2, String[] strArr, int i, boolean z) {
        this.a = (String) Objects.requireNonNull(str);
        this.b = str2 != null ? str2 : str;
        this.c = strArr;
        if (i != 2 && i != 1) {
            throw new IllegalArgumentException(a.j(i, "Unknown expected output format="));
        }
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ServiceDumpRequest serviceDumpRequest = (ServiceDumpRequest) obj;
            if (this.e == serviceDumpRequest.e && this.d == serviceDumpRequest.d && this.a.equals(serviceDumpRequest.a) && this.b.equals(serviceDumpRequest.b) && Arrays.equals(this.c, serviceDumpRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a, this.b, Boolean.valueOf(this.e), Integer.valueOf(this.d)) * 31) + Arrays.hashCode(this.c);
    }

    public final String toString() {
        return "ServiceDumpRequest{serviceDumpId='" + this.a + "',serviceName='" + this.b + "', dumpsysFlags=" + Arrays.toString(this.c) + ", expectedOutputFormat=" + this.d + ", showOutputToUser=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.w(parcel, 3, this.c, false);
        atzr.o(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.v(parcel, 6, this.b, false);
        atzr.c(parcel, a);
    }
}
