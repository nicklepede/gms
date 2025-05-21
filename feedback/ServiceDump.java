package com.google.android.gms.feedback;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.balo;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ServiceDump extends AbstractSafeParcelable {
    public static final balo CREATOR = new balo();
    public final ServiceDumpRequest a;
    public final byte[] b;

    public ServiceDump(ServiceDumpRequest serviceDumpRequest, byte[] bArr) {
        this.a = (ServiceDumpRequest) Objects.requireNonNull(serviceDumpRequest);
        this.b = (byte[]) Objects.requireNonNull(bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ServiceDump serviceDump = (ServiceDump) obj;
            if (this.a.equals(serviceDump.a) && Arrays.equals(this.b, serviceDump.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String valueOf = String.valueOf(this.a);
        String arrays = Arrays.toString(bArr);
        if (arrays.length() > 20) {
            arrays = String.valueOf(arrays.substring(0, 17)).concat("...");
        }
        return "ServiceDump{serviceDumpRequest=" + valueOf + ", dumpOutput=\"" + String.format(arrays, new Object[0]) + "\"}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, this.a, i, false);
        arxc.i(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}
