package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.dkfe;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class CertificateRequestInformation extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkfe();
    public String a;
    public byte[] b;

    public CertificateRequestInformation() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CertificateRequestInformation) {
            CertificateRequestInformation certificateRequestInformation = (CertificateRequestInformation) obj;
            if (atyq.b(this.a, certificateRequestInformation.a) && Arrays.equals(this.b, certificateRequestInformation.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dkfe.a(this, parcel);
    }

    public CertificateRequestInformation(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }
}
